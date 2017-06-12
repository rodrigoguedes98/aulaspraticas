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
    
    public static PersonDAO getInstance()
   	{
    	if(instance == null)
    		instance = new PersonDAO();
    	
    	return instance;
 	}
    
    private void duplicateRepository()//duplicate the repository if this is full
    {
    	Person[] newRepository = new Person[persons.length*2];
    	for (int i = 0; i < this.persons.length; i++) {
			newRepository[i] = persons[i];
		}
    	persons = newRepository;
    }
    
    public void insert(Person p) //insert a new person on repository
    {
    	this.persons[next++] = p;
    	
    	if(next == this.persons.length){
    		this.duplicateRepository();
    	}
    }
    
    public int findIndex(Person p)//find the index of the object on the array
    {
    	int i = 0;
    	boolean find = false;
    			while(!find && i<this.next)
    			{
    				if(i == this.next){
    					return -1;
    					
    				}else if(p.getId() == this.persons[i].getId()){
    					find = true;
    				}else{
    					i++;
    				}
    			}
    			return i;
    }
    
   
    
    public Person recover(Person p)//return the object of the array
    {	
    		Person j = null;
    		if(findIndex(p) == -1){
    			return null;
    		}else{
    			
    		j = this.persons[findIndex(p)];
    		
    		}
    		   		
    		return j;
    	    }
    
    
    	public void remove(Person p)//remove the object from the array
    	{
    			if(findIndex(p) != -1){
    				this.persons[findIndex(p)] = this.persons[this.next-1];
    				this.persons[this.next-1] = null;
    				this.next--;
    				System.out.println("Usuário removido!!");
    			}
    	}
    
    
    
    
    //TODO Implementar CRUD para classe básica Person usando array
    
    /*
     * Antes de implementar os métodos, pense bem na assinatura dos mesmos
     */
    
}
