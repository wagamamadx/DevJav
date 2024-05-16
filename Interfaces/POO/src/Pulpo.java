import Interfaces.Alimentable;
import Interfaces.Comunicable;

public class Pulpo extends CriaturasMarinas implements Comunicable,Alimentable{
    int cantTentaculos;

    public Pulpo(String nombre,int cantTentaculos){
        super(nombre);
        this.cantTentaculos = cantTentaculos;
    }

    @Override
    void nadar(){
        System.out.println(nombre + " esta nadando con sus "+ cantTentaculos +" tentaculos");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre+ "saluda con sus con sus "+ cantTentaculos+ " tentaculos");
    }

    @Override
    public void alimentar() {
        System.out.println("Le dimos de comer un pescado a "+nombre);
    }
}
