public class Perro extends Animal{

    public Perro(String nombre,int edad){
        super(nombre,edad);
    }

    @Override
    public String hacerSonido(){
        return "GUAU";
    }

}
