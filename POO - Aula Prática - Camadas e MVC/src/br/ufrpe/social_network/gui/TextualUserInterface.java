package br.ufrpe.social_network.gui;

import java.time.LocalDate;

import br.ufrpe.social_network.negocio.Fachada;
import br.ufrpe.social_network.negocio.beans.Person;
import br.ufrpe.social_network.negocio.beans.Post;

public class TextualUserInterface {
    
    public void showUserInterface() {
        
    	Fachada f = Fachada.getInstance();
    	
    	Person pe1 = new Person("Joana", "Yugoslava", LocalDate.of(1997, 2, 25));
    	Person pe2 = new Person("Pedro", "Grécia", LocalDate.of(1987, 9, 10));
    	Person pe3 = new Person("Tuminos", "Bósnia", LocalDate.of(2006, 5, 30));
    	Person pe4 = new Person("Rogério", "China", LocalDate.of(1996, 2, 15));
    	
    	f.savePerson(pe1);
    	f.savePerson(pe2);
    	f.savePerson(pe3);
    	f.savePerson(pe4);
    	
    	f.deletePerson(pe3);
    	
    	pe2.setName("Hugo");
    	f.upDatePerson(pe2);
    	
    	System.out.println(f.findPerson(4));
    	
    	
    	Post po1 = new Post("Oi", pe1);
    	
    	Post po2 = new Post("Bom dia", pe1);
    	Post po3 = new Post("Boa tarde", pe1);
    	Post po4 = new Post("Boa noite", pe1);
    	Post po5 = new Post("Mamamia", pe1);
    	Post po6 = new Post("Hoje é sexta bora tomar uma", pe2);
    	Post po7 = new Post("uashfausfas", pe2);
    	Post po8 = new Post("aedfasdgya", pe2);
    	Post po9 = new Post("aggagage", pe2);
    	Post po10 = new Post("astiuagsdfa", pe2);
    	Post po11 = new Post("asdgkjasias", pe4);
    	Post po12 = new Post("Eu conheci um cara chamado Gustavo", pe4);
    	Post po13 = new Post("Ele não da curvas com o carro", pe4);
    	Post po14 = new Post("Passa cortando", pe4);
    	Post po15 = new Post("Gustavo é um doido", pe4);
    	//comentarios abaixo
    	Post po16 = new Post("Gustavo é um doido", pe1);
    	Post po17 = new Post("Gustavo é um doido", pe1);
    	Post po18 = new Post("Gustavo é um doido", pe2);
    	Post po19 = new Post("Gustavo é um doido", pe2);
    	Post po20 = new Post("Gustavo é um doido", pe4);
    	Post po21 = new Post("Gustavo é um doido", pe4);
    	Post po22 = new Post("Gustavo é um doido", pe1);
    	Post po23 = new Post("Gustavo é um doido", pe1);
    	Post po24 = new Post("Gustavo é um doido", pe2);
    	Post po25 = new Post("Gustavo é um doido", pe2);
    	Post po26 = new Post("Gustavo é um doido", pe4);
    	Post po27 = new Post("Gustavo é um doido", pe4);
    	Post po28 = new Post("Gustavo é um doido", pe1);
    	Post po29 = new Post("Gustavo é um doido", pe1);
    	Post po30 = new Post("Gustavo é um doido", pe2);
    	Post po31 = new Post("Gustavo é um doido", pe2);
    	Post po32 = new Post("Gustavo é um doido", pe4);
    	Post po33 = new Post("Gustavo é um doido", pe4);
    	Post po34 = new Post("Gustavo é um doido", pe1);
    	Post po35 = new Post("Gustavo é um doido", pe1);
    	Post po36 = new Post("Gustavo é um doido", pe2);
    	Post po37 = new Post("Gustavo é um doido", pe2);
    	Post po38 = new Post("Gustavo é um doido", pe4);
    	Post po39 = new Post("Gustavo é um doido", pe4);
    	Post po40 = new Post("Gustavo é um doido", pe1);
    	Post po41 = new Post("Gustavo é um doido", pe1);
    	Post po42 = new Post("Gustavo é um doido", pe2);
    	Post po43 = new Post("Gustavo é um doido", pe2);
    	Post po44 = new Post("Gustavo é um doido", pe4);
    	Post po45 = new Post("Gustavo é um doido", pe4);
    	Post po46 = new Post("Gustavo é um doido", pe1);
    	Post po47 = new Post("Gustavo é um doido", pe1);
    	Post po48 = new Post("Gustavo é um doido", pe2);
    	Post po49 = new Post("Gustavo é um doido", pe2);
    	Post po50 = new Post("Gustavo é um doido", pe4);
    	Post po51 = new Post("Gustavo é um doido", pe4);
    	Post po52 = new Post("Gustavo é um doido", pe1);
    	Post po53 = new Post("Gustavo é um doido", pe1);
    	Post po54 = new Post("Gustavo é um doido", pe2);
    	Post po55 = new Post("Gustavo é um doido", pe2);
    	Post po56 = new Post("Gustavo é um doido", pe4);
    	Post po57 = new Post("Gustavo é um doido", pe4);
    	Post po58 = new Post("Gustavo é um doido", pe1);
    	Post po59 = new Post("Gustavo é um doido", pe1);
    	
    	
    	po1.addComment(po18);
    	po1.addComment(po19);
    	po2.addComment(po58);
    	po2.addComment(po55);
    	po3.addComment(po35);
    	po3.addComment(po16);
    	po4.addComment(po53);
    	po4.addComment(po39);
    	
    	f.savePost(po1);
    	f.savePost(po2);
    	f.savePost(po3);
    	f.savePost(po4);
    	f.savePost(po5);
    	f.savePost(po6);
    	f.savePost(po7);
    	f.savePost(po8);
    	f.savePost(po9);
    	f.savePost(po10);
    	f.savePost(po11);
    	f.savePost(po12);
    	f.savePost(po13);
    	f.savePost(po14);
    	f.savePost(po15);
    	
    	
    	f.imprimirPosts();
    	
//    	f.savePerson(pe1);
//    	f.savePost(po1);
//    	f.imprimirPosts();
//    	
//    	po1.setTexto("Gustavo é um doido varrido!");
//    	
//    	f.upDatePost(po1);
//    	
//    	System.out.println(f.findPost(1));
//    	    	
//    	
//    	f.deletePost(po1);
//    	
//    	f.imprimirPosts();
//    	
    	
    	
        /*
        
        1.  Crie quatro pessoas e salve-as
        2.  Apague uma das pessoas
        3.  Atualize o nome de uma das pessoas
        4.  Busque por um objeto do tipo pessoa que tenha um ID qualquer.
        5.  Crie 15 posts aleatórios, 5 para cada uma das pessoas criadas anteriormente
        6.  Crie 2 comentários de resposta de uma das pessoas em cada um dos posts de outra pessoa
        7.  Liste todos os posts de todas as pessoas
        8.  (DESAFIO) Liste somente os comentários que cada uma das pessoas fez em outros posts de outras pessoas

        */
        
    }

}
