package br.ufrpe.social_network.dao;

import br.ufrpe.social_network.negocio.beans.*;
import java.util.ArrayList;
public class PostDAO {
    
	private ArrayList<Post> posts;
	
	
	private static PostDAO instance = null;
	
	private PostDAO(){
		this.posts = new ArrayList<>(); 
	
	}
	
	//Singleton
	
	public static PostDAO getInstance(){
		if(instance == null)
		{
			instance = new PostDAO();
		}
		return instance;
	}

		public void insert(Post p)
		{
			if(p != null)
			{
				posts.add(p);
			}
		}
		
		private int findIndex(long id)//find the index of the object on the array
	    {
	    	int i = 0;
	    	boolean find = false;
	    			while(!find && i <= this.posts.size())
	    			{
	    				if(id == this.posts.get(i).getId()){
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
		
		public Post recover(long id)
		{
			Post p = null;
			if(this.findIndex(id) != -1)
			{
				p = this.posts.get(this.findIndex(id));
			}
			return p;
		}
	
		public void remove(long id)
		{
			if(this.recover(id) != null)
			{
				posts.remove(this.recover(id));
				System.out.println("Post removido com sucesso!\n");
			}else
			{
				System.out.println("Post não existe\n");
			}
		}
		
		public void upDate(long id, String texto)
		{
			Post p = null;
			if(this.recover(id) != null)
			{
				p = this.recover(id);
			}
				p.setTexto(texto);
		}
	

    
}
