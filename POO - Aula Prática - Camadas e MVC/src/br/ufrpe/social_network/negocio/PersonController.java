package br.ufrpe.social_network.negocio;

import br.ufrpe.social_network.dao.PersonDAO;
import br.ufrpe.social_network.negocio.beans.Person;

public class PersonController {
    
    private PersonDAO personsRepository;
    private static PersonController instance;
    
    private PersonController() {
        personsRepository = PersonDAO.getInstance();
    }

    public static PersonController getInstance() {
        if (instance == null) {
            instance = new PersonController();
        }
        return instance;
    }
    
        
    public void savePerson(Person p) {
    	if(personsRepository.insert(p)){
    		System.out.println("Usuário criado com sucesso!");
    	}else{
    		System.out.println("Usuário não pode ser criado!");
    	}
    }
    
    public Person find(long personId) {
    	 return personsRepository.recover(personId);
    }
    
    public void update(Person newPerson) {
    	if(personsRepository.upDate(newPerson)){
    		System.out.println("Usuário atualizado com sucesso!");
    	}else{
    		System.out.println("Usuário não existe!");
    	}
    }
    
    public void delete(Person p) {
    	if(personsRepository.remove(p)){
    		System.out.println("Usuário deletado com sucesso!");
    	}else{
    		System.out.println("Usuário não existe!");
    	}
    }
}
