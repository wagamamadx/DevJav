package Exceptions;

public class DividirPorCeroExcepcion extends Exception{

    @Override
    public String getMessage(){
        return "No se puede dividir por cero";
    }
}
