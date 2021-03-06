package br.ufrpe.social_network.negocio.beans;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private static long nextId = 1;
    
    private long id;
    private String name;
    private String country;
    private LocalDate birthDate;
    private int idade;
    
    public Person(String name, String country, LocalDate birthDate) {
        // auto-generated ID
        this.id = nextId;
        nextId++;
        
        this.name = name;
        this.country = country;
        this.birthDate = birthDate;
        this.idade = Period.between(this.birthDate, LocalDate.now()).getYears();
    }
    
    public Person() {
        this(null, null, null);
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the birthDate
     */
    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the id
     */
    public long getId() {
        return this.id;
    }
    
    public int getIdade(){
    	return this.idade;
    }
    
    @Override
    public String toString() {
    	String resultado = "";
    	resultado += "Nome: " + this.getName();
    	resultado += "\nIdade: " + this.getIdade() + " anos";
    	resultado += "\nPaís: " + this.getCountry();
    	
    	
        return resultado;
    }
}
