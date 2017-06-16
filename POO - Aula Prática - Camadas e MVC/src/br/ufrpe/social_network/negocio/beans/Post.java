package br.ufrpe.social_network.negocio.beans;

import java.util.ArrayList;

public class Post {
	
	private static long nextId = 1;
	    
    private long id;
    private String texto;
    private Person author;
    private ArrayList<Post> comments;

    public Post(String texto, Person author) {
        this.texto = texto;
        this.author = author;
        this.comments = new ArrayList<Post>();
        this.id = nextId++;
    }
    
    public Post() {
        this(null, null);
    }

   
    
    public void addComment(Post comment) {
        if (comment != null) {
            this.comments.add(comment);
        }
    }
   
    	
    
    public long getId() {
		return id;
	}

	
	public String getTexto() {
		return texto;
	}

	public Person getAuthor() {
		return author;
	}

	

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	
	public void removeComment(Long id) {
       
		for(int i = 0; i < this.comments.size(); i++)
		{
			Post p = this.comments.get(i);
			if(p.getId() == id)
			{
				this.comments.remove(p);
			}
		}
    }
    
    @Override
    public String toString() {
        String resultado = "";
        resultado += author.getName() + ":\n";
        resultado +="\n\t\t";
        resultado += this.getTexto() + "\n";
        resultado += "\t";
        
        
        	for(int i = 0; i < this.comments.size();i++)
        	{
        		
        		Post p = this.comments.get(i);
        		resultado += "\t" + p.toString();
        	}
        
        return resultado;
    }
}
