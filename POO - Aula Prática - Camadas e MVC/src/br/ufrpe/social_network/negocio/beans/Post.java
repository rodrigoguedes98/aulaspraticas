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
        this.comments = new ArrayList<>();
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

	
	private int findLastIndex()
	{
		boolean find = false;
		int i = 0;
		while(!find)
		{
			i++;
			if(this.comments.get(i) == null){
				find = true;
				
			}
		}
		return i-1;
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
        resultado += author.getName() + "\n";
        resultado += this.getTexto() + "\n";
        resultado += "\t";
        if(this.findLastIndex() != -1)
        {
        	for(int i = 0; i <= this.findLastIndex();i++)
        	{
        		
        		Post p = this.comments.get(i);
        		resultado += p.toString();
        	}
        }
        return resultado;
    }
}
