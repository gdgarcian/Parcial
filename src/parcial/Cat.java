
package parcial;


public class Cat extends Pet {
    boolean isHunter;

    public Cat(String id, String name, String hairColor) {
        super(id, name, hairColor);
    }
    
    public String sound(){
        return "miau";
    }
    
}
