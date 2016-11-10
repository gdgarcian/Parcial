
package parcial;


public class Dog extends Pet{
    private String breed;

    public Dog(String id, String name, String hairColor, String breed) {
        super(id, name, hairColor);
        this.breed = breed;
    }
    
    public String sound(){
        return "guau";
    }
    
}
