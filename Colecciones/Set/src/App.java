// import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
// import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Party heroes");

        // Set<String> superheroes = new HashSet<>(); orden de guardado aleatorio y no permite registros duplicados;
        // Set<String> superheroes = new TreeSet<>(); orden alfabetico y no permite registros duplicados

        Set<String> superheroes = new LinkedHashSet<>(); // orden segun se registra y no permite registros duplicados

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

        superheroes.remove("Hulk");

        if (!superheroes.contains("Hulk")) {
            System.out.println("Hulk salio a vomitar");
        }

        superheroes.add("Superman");
        superheroes.add("Superman");
        superheroes.add("Superman");

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
