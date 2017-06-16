package br.ufrpe.social_network.dao;

import br.ufrpe.social_network.negocio.beans.*;
import java.util.ArrayList;
public class PostDAO {
    
	private ArrayList<Post> posts;
	
	
	private static PostDAO instance = null;
	
	private PostDAO(){
		this.posts = new ArrayList<Post>(); 
	
	}
	
	//Singleton
	
	public static PostDAO getInstance(){
		if(instance == null)
		{
			instance = new PostDAO();
		}
		return instance;
	}

		public boolean insert(Post p)
		{
			if(p != null)
			{
				posts.add(p);
				return true;
			}
			return false;
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
		
		public Post recover(long postId)
		{
			Post p = null;
			if(this.findIndex(postId) != -1)
			{
				p = this.posts.get(this.findIndex(postId));
			}
			return p;
		}
	
		public boolean remove(Post p)
		{
			if(p != null && this.recover(p.getId()) != null)
			{
				this.posts.remove(this.recover(p.getId()));
				return true;
			}
			return false;
		}
		
		public boolean upDate(Post newPost)
		{
			
			if(this.recover(newPost.getId()) != null && newPost != null)
			{
				this.remove(this.recover(newPost.getId()));
				this.insert(newPost);
				return true;
			}
			return false;
		}
	
		public void imprimirPosts(){
			for (int i = 0; i < this.posts.size(); i++) {
				System.out.println(this.posts.get(i));
			}
		}
    
}
