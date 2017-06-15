package br.ufrpe.social_network.dao;



import br.ufrpe.social_network.negocio.beans.*;

public class PersonDAO {
    
	
	
	
    private Person[] persons;
    private int next;
    
    private static PersonDAO instance = null;
    
    private PersonDAO()
    {
    	this.persons = new Person[100];
    	this.next = 0;
    }
    
    //Singleton
    public static PersonDAO getInstance()
   	{
    	if(instance == null)
    		instance = new PersonDAO();
    	
    	return instance;
 	}
    
    private void duplicateRepository()//duplica o repositorio se ele estiver cheio
    {
    	Person[] newRepository = new Person[persons.length*2];
    	for (int i = 0; i < this.persons.length; i++) {
			newRepository[i] = persons[i];
		}
    	persons = newRepository;
    }
    
    public boolean insert(Person p) //insere o objeto no repositorio e se necessario duplica o mesmo
    {
    	
    	if(p != null){
    		this.persons[this.next++] = p;
    			if(next == this.persons.length){
    					this.duplicateRepository();
    	return true;
    		}
    	}
    	return false;
    }
    
  
    
    private int findIndex(long id)//procura o indice do objeto no repositorio
    {
    	int i = 0;
    	boolean find = false;
    			while(!find && i<this.next)
    			{
    				 if(id == this.persons[i].getId()){
    					find = true;
    				}else{
    					i++;
    				}
    			}
    			if(!find){
					return -1;
					
				}
    			return i;
    }
    
   
    
    public Person recover(long id)//retorna o objeto do repositorio
    {	
    		Person j = null;
    		if(this.findIndex(id) == -1){
    			return null;
    		}else{
    			
    		j = this.persons[this.findIndex(id)];
    		
    		}
    		   		
    		return j;
    	    }
    
    
    	public boolean remove(Person p)//remove o objeto do repositorio
    	{
    			if(p != null && this.findIndex(p.getId()) != -1){
    				this.persons[this.findIndex(p.getId())] = this.persons[this.next-1];
    				this.persons[this.next-1] = null;
    				this.next--;
    				return true;
    			}
    			return false;
    	}
    
    	
    	
    	public boolean upDate(Person newPerson)//muda algumas informações no objeto do repositorio
    	{
    				if(newPerson != null && this.recover(newPerson.getId()) != null)
    				{
    					Person p = this.recover(newPerson.getId());
    					p.setBirthDate(newPerson.getBirthDate());
    					p.setCountry(newPerson.getCountry());
    					p.setName(newPerson.getName());
    					return true;
    				}
    				return false;
    	}
    	
    	
	}	
    
    

