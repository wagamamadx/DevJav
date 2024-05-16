public class App {
    public static void main(String[] args) throws Exception {
        
        Delfin delfin = new Delfin("Carmelo");
        Pulpo pulpo = new Pulpo("Mariano", 12);

        delfin.nadar();
        delfin.comunicarse();
        delfin.alimentar();
        System.out.println("::::::::::::::");
        pulpo.nadar();
        pulpo.comunicarse();
        pulpo.alimentar();


    }
}