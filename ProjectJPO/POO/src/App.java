public class App {
    public static void main(String[] args) throws Exception {

        // Persona persona1 = new Persona("Pedro","Pascal",33,"Actor",20,true);
        Persona persona2 = new Persona("Raul","Pezo",33);

        persona2.setNombre("Raul Abad");
        persona2.setApellido("Pezo Olivera");

        System.out.println(persona2.darNombreCompleto() + " tiene " + persona2.getEdad());


        // System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " años" + " Egresado de : "+ persona1.carrera.nombre);
        
        // Persona persona1 = new Persona();
        // Persona persona2 = new Persona();

        // Carrera carrera1 = new Carrera();
        // Carrera carrera2 = new Carrera();

        // persona1.nombre = "Raul";
        // persona1.apellido = "Alvarez";
        // persona1.edad = 53;
        // carrera1.nombre = "Ciencia de datos";

        // persona1.carrera = carrera1;

        // persona2.nombre = "Maria";
        // persona2.apellido = "Alvarez";
        // persona2.edad = 24;
        // carrera2.nombre = "Inteligencia Artificial";

        // persona2.carrera = carrera2;

        // String user1 = "Raul Pezo";

        // System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " años" + "Egresado de : "+ persona1.carrera.nombre);
        // System.out.println(persona2.darNombreCompleto() + " tiene " + persona2.edad + " años" + "Egresado de : "+ persona2.carrera.nombre);
        // // System.out.println(persona1.enviarSaludo(user1));
        // // System.out.println(persona2.enviarSaludo("Luke Skywalter"));

        Animal animalito = new Animal("Bandido", 12);
        Gato gatito = new Gato("Gatibula", 4);
        Perro perrito = new Perro("Manolo y Negro", 18);

        System.out.println("El animal descrito es :"+animalito.nombre+" Y tiene :"+animalito.edad+" Años. El sonido que emite es :"+animalito.hacerSonido()+ "Cantidad_animales Creador :"+Animal.getCantidadAnimales());
        System.out.println("El animal descrito es :"+gatito.nombre+" Y tiene :"+gatito.edad+" Años. El sonido que emite es :"+gatito.hacerSonido()+ "Cantidad_animales Creador :"+Animal.getCantidadAnimales());
        System.out.println("El animal descrito es :"+perrito.nombre+" Y tiene :"+perrito.edad+" Años. El sonido que emite es :"+perrito.hacerSonido()+ "Cantidad_animales Creador :"+Animal.getCantidadAnimales());
        System.out.println("El negocio donde atienden a los animalitos es : "+Veterinaria.getNombreVete());
    }
}