
package parcial;

import java.util.*;

public class Person {
    private String name;
    private String id;
    private ArrayList<Pet> pets = new ArrayList<Pet>();

    public Person(String name, String id, Pet pets) {
        this.name = name;
        this.id = id;
    }
    
    
    
    public void showPets(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
    
    
}
