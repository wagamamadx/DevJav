import Interfaces.Alimentable;
import Interfaces.Comunicable;

public class Delfin extends CriaturasMarinas implements Comunicable,Alimentable{

    public Delfin(String nombre){
        super(nombre);
    }

    @Override
    void nadar() {
        System.out.println(nombre + " esta nadando con su cola");   
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre+ "saluda con sus con su chillido");
    }

    @Override
    public void alimentar() {
        System.out.println("Le dimos de comer una galleta a "+nombre);
    }
}
