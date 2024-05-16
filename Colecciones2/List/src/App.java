// import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
// import java.util.Vector;


public class App {
    public static void main(String[] args) throws Exception {
         System.out.println("Welcome to Party heroes");

        // List<String> superheroes = new ArrayList<>(); // Permite duplicados, pero se encuentra ordenado por indices en el orden de agregaccion
        // List<String> superheroes = new Vector<>(); // Permite duplicados, pero se encuentra ordenado por indices en el orden de agregaccion
        List<String> superheroes = new LinkedList<>(); // Permite duplicados, pero se encuentra ordenado por indices en el orden de agregaccion

        superheroes.add("Spiderman");
        superheroes.add("Batman");
        superheroes.add("CatWoman");
        superheroes.add("Hulk");
        superheroes.add("Wonder woman");
        superheroes.add("Superman");

        superheroes.add("Ironman");


        if (superheroes.contains("Spiderman")) {
            System.out.println("Spiderman la esta pasando bomba");            
        }

        System.out.println("Superhero ebrio es "+superheroes.get(0));        
        superheroes.set(6,"Tony Stark");
        System.out.println("Ironman se saca el traje dejando su verdadera identidad : "+superheroes.get(6));
        
        superheroes.remove(3);

        if (!superheroes.contains("Hulk")) {
            System.out.println("Hulk salio a vomitar");
        }
        
        superheroes.add("Ironman");
        superheroes.add("Ironman");
        superheroes.add("Ironman");

        if (superheroes.isEmpty()) {
            System.out.println("La fiesta ha terminado");
        }else{
            System.out.println("La fiesta continua aun hay " +superheroes.size()+" superheroes");
            System.out.println("Quien esta en la fiesta aun?");
            for (String superh : superheroes) {
                System.out.println(superh);
            }
        }
    }
}
