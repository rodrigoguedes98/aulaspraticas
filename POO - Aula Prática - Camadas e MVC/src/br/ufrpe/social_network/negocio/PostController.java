package br.ufrpe.social_network.negocio;



import java.util.ArrayList;

import br.ufrpe.social_network.dao.PostDAO;
import br.ufrpe.social_network.negocio.beans.*;

public class PostController {
    
    private PostDAO postsRepository;
    
    private static PostController instance;
    
    private PostController(){
    	postsRepository = PostDAO.getInstance();
    }
    
    public static PostController getInstance(){//Singleton
    	if(instance == null){
    		instance = new PostController();
    	}
    	return instance;
    }
    
    public void savePost(Post p)
    {
    	if(this.postsRepository.insert(p))
    	{
    		System.out.println("Post criado com sucesso!");
    	}else{
    		System.out.println("Erro ao criar o post!");
    	}
    }
    
    public Post findPost(long postId)
    {
    	return this.postsRepository.recover(postId);
    }
    
    public void deletePost(Post p)
    {
    	if(this.postsRepository.remove(p))
    	{
    		System.out.println("Post removido com sucesso!");
    	}else{
    		System.out.println("Erro ao remover o post!");
    	}
    }
    
    public void upDatePost(Post newPost)
    {
    	if(this.postsRepository.upDate(newPost)){
    		System.out.println("Post atualizado com sucesso!");
    	}else{
    		System.out.println("Erro ao remover o post");
    	}
    }
    
    public void imprimirPosts(){
    	postsRepository.imprimirPosts();
    }
    

//    public void imprimirPersonPost(Person p){
//    	PostController postsC = PostController.getInstance(); 
//    	
//    	for (int i = 0; i < postsC..; i++) {
//			
//		}
//    		posts.add(this.postsRepository.recover(p.getId()));
//		
//    			
//    	System.out.println();
//    }
//    
    //TODO Implementar método que lista todos os posts de uma determinada pessoa
    
    // TODO DESAFIO Implementar método que busque todos comentários que uma dada pessoa realizou em posts de terceiros
    // Para implementar este método, você deve fazer uma buscar em todos os 
    // comentários de todos os posts, verificando quem realizou aqueele comentário.
    // Lembre-se que é possível realizar comentários de comentários e busca 
    // precisaria ser feita em profundidade
}
