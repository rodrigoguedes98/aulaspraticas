package br.ufrpe.social_network.dao;
import java.time.LocalDate;
import java.util.Scanner;

import br.ufrpe.social_network.negocio.beans.*;

public class PersonDAO {
    
	Scanner tec = new Scanner(System.in);
	
	
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
    
    public void insert() //insert a new person on repository
    {
    	
    	System.out.println("\nNome: ");
		String name = (tec.nextLine());
		tec.nextLine();
		int dia, mes, ano;
		System.out.println("\nData de nascimento: ");
		
		
			System.out.println("ano: ");
			ano = tec.nextInt();
			
			System.out.println("mês");
			mes = tec.nextInt();
			
			System.out.println("dia");
			dia = tec.nextInt();
		LocalDate data = LocalDate.of(ano, mes, dia);
		System.out.println("\nPaís: ");
		String country = (tec.nextLine());
    	
		Person p = new Person(name, country, data);
		
    	
    	this.persons[next++] = p;
    	
    	if(next == this.persons.length){
    		this.duplicateRepository();
    	}
    }
    
    public void insert(Person p)
    {
    	if(p != null){
    	this.persons[next++] = p;
    	if(next == this.persons.length){
    		this.duplicateRepository();
    		}
    	}
    }
    
    private int findIndex(int id)//find the index of the object on the array
    {
    	int i = 0;
    	boolean find = false;
    			while(!find && i<this.next)
    			{
    				if(i == this.next){
    					return -1;
    					
    				}else if(id == this.persons[i].getId()){
    					find = true;
    				}else{
    					i++;
    				}
    			}
    			return i;
    }
    
   
    
    public Person recover(int id)//return the object of the array
    {	
    		Person j = null;
    		if(this.findIndex(id) == -1){
    			return null;
    		}else{
    			
    		j = this.persons[this.findIndex(id)];
    		
    		}
    		   		
    		return j;
    	    }
    
    
    	public void remove(int id)//remove the object from the array
    	{
    			if(this.findIndex(id) != -1){
    				this.persons[this.findIndex(id)] = this.persons[this.next-1];
    				this.persons[this.next-1] = null;
    				this.next--;
    				System.out.println("Usuário removido!");
    			}else{
    				System.out.println("Usuário inexistente!");
    			}
    	}
    
    	
    	
    	public void upDate(int id)// changes some informations about a user picking your Id.
    	{
    		Person p = recover(id);
    		System.out.println("\nNome: ");
    		p.setName(tec.nextLine());
    		tec.nextLine();
    		int dia, mes, ano;
    		System.out.println("\nData de nascimento: ");
    		
    		
    			System.out.println("ano: ");
    			ano = tec.nextInt();
    			
    			System.out.println("mês");
    			mes = tec.nextInt();
    			
    			System.out.println("dia");
    			dia = tec.nextInt();
    		LocalDate data = LocalDate.of(ano, mes, dia);
    		p.setBirthDate(data);
    		System.out.println("\nPaís: ");
    		p.setCountry(tec.nextLine());
    	}
    
    
}
