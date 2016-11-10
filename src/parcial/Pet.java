
package parcial;


public abstract class Pet {
    private String id;
    private String name;
    private String hairColor;

    public Pet(String id, String name, String hairColor) {
        this.id = id;
        this.name = name;
        this.hairColor = hairColor;
    }
    
    
    
    public String sound(){
        return "";
    }

    

    
    
}
