package br.ufrpe.social_network.negocio;

import br.ufrpe.social_network.negocio.beans.Person;
import br.ufrpe.social_network.negocio.beans.Post;

public class Fachada {
    
	PostController postController;
	PersonController personController;
	
	//Singleton
	public static Fachada instance;
	
	private Fachada(){
		postController = PostController.getInstance();
		personController = PersonController.getInstance();
	}
	
	public static Fachada getInstance(){
		if(instance == null){
			instance = new Fachada();
		}
			return instance;
		
	}

	public void savePost(Post p) {
		postController.savePost(p);
	}

	public Post findPost(long postId) {
		return postController.findPost(postId);
	}

	public void deletePost(Post p) {
		postController.deletePost(p);
	}

	public void upDatePost(Post newPost) {
		postController.upDatePost(newPost);
	}

	public void savePerson(Person p) {
		personController.savePerson(p);
	}

	public Person findPerson(long personId) {
		return personController.findPerson(personId);
	}

	public void upDatePerson(Person newPerson) {
		personController.upDatePerson(newPerson);
	}

	public void imprimirPosts() {
		postController.imprimirPosts();
	}

	public void deletePerson(Person p) {
		personController.deletePerson(p);
	}
			    
}
