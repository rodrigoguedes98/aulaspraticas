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
    	
    	if(next == persons.length){
    		this.duplicateRepository();
    	}
    }
    
    
    //TODO Implementar CRUD para classe básica Person usando array
    
    /*
     * Antes de implementar os métodos, pense bem na assinatura dos mesmos
     */
    
}
