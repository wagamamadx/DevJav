// import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
// import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Map<String, Double> inventario = new HashMap<>(); // No aplica ordenamiento y no permite duplicados x llave
        // Map<String, Double> inventario = new TreeMap<>(); // Aplica ordenamiento alfabetico por llave y no permite duplicados x llave
        Map<String, Double> inventario = new LinkedHashMap<>(); // Aplica ordenamiento alfabetico por llave y no permite duplicados x llave


        inventario.put("Banana", 1.89);
        inventario.put("Tomate", 1.75);
        inventario.put("Palta", 1.20);
        inventario.put("Fresa", 1.66);
        inventario.put("Mango", 1.11);

        System.out.println("Inventarios Fruta");

        System.out.println("Inventarios Fruta :"+inventario.keySet());

        for (String fruta : inventario.keySet()) {
            System.out.println(fruta + " : $" + inventario.get(fruta));
        }

        String frutaBuscada = "Tomate";
        System.out.println("Fruta buscada : "+frutaBuscada);

        if(inventario.containsKey(frutaBuscada)){
            System.out.println(frutaBuscada+ " esta en el inventario y cuesta " +inventario.get(frutaBuscada));
        }else{
            System.out.println("Lamentablemente nos quedamos sin "+frutaBuscada);
        }

        String sinStock = "Banana";
        inventario.remove(sinStock);

        System.out.println("Nos hemos quedado sin stock de "+sinStock);

        System.out.println("Inventario Fruta_v2");
        for (String fruta : inventario.keySet()) {
            System.out.println(fruta+ ":$ "+inventario.get(fruta));
            
        }
        System.out.println("La cantidad de frutas es : "+inventario.size());


    }
}