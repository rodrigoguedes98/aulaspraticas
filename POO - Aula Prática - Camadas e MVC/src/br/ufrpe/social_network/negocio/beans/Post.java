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

	public void setId(long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public Person getAuthor() {
		return author;
	}

	public ArrayList<Post> getComments() {
		return comments;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	public void setComments(ArrayList<Post> comments) {
		this.comments = comments;
	}

	public void removeComment(Long id) {
        // TODO remover comentário da lista de comentários se ele existir. 
        // Você deve varrer a lista inteira verificando se há algum 
        // comentário com o ID informado como parâmetro e então removê-lo
		
    }
    
    @Override
    public String toString() {
        // TODO Implementar método toString da classe Post
        return "Coloque sua implementação aqui";
    }
}
