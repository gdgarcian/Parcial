package parcial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Starter {
    
    private ArrayList<Person> person = new ArrayList<Person>();
       
    public static void readPets(){
        String nombre;
    
        File file = new File("Petss.txt");
        for (int i = 0; i < file.length(); i++) {
            try{
            file.deleteOnExit();
            System.out.println(file.delete());
            }catch(Exception e){
                System.out.println("Eliminado con éxito");
            }

        }
    }
    public void manageVet(Vet v, String action){
        
    }
    
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
      String cadena;
      FileReader f = new FileReader("Petss.txt");
      BufferedReader b = new BufferedReader(f);
      while((cadena = b.readLine())!=null) {
          System.out.println(cadena);
      }
      b.close();     
    }
    /*
    File file = new File("Pets.txt");
        System.out.println(file.canRead());
        muestraContenido("pets.txt");
    */
    
    public static void menu(){        
        System.out.println("Bienvenido a Veterinaria. Escoga una opción");
        System.out.println("1) Remover Mascota a partir del ID");
        System.out.println("2) Listar mascotas y personas con la ID de la persona");
        System.out.println("3) Listar las mascotas de acuerdo al tipo");
        System.out.println("4) Eliminar todo y salir (opcional)");
        System.out.println("5) Salir");
        System.out.println("");
    }
    
    public void añadir(){
        Scanner f = new Scanner(System.in);
        for(Person p : person){
            person.add(p);
            
        }
    }
    public void listarMasco(Pet s){
        
    }
    
    public static void main(String[] args) throws IOException {
        Dog pt1 = new Dog("dog1 ", "nana ", "dorado ", "shitzu");
        
        Person p1 = new Person("Andres", "1203323591", pt1);
        
        
        int seleccion;
        Scanner entrada = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        
        while(true){
            menu();            
            seleccion = entrada.nextInt();
            switch(seleccion){
                case 1:
                    break;
                case 2:
                    muestraContenido("petss.txt");
                    break;
                case 3:
                    
                    break;
                case 4:
                    readPets();
                    System.out.println("Eliminado con éxito");
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar Veterinaria");
                    System.exit(0);
                    break;
            }
        }        
    }
}    
