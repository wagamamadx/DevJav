package Exceptions;

public class CalculadoraException extends Exception{

    private String descripcion;

    public CalculadoraException(String descripcion) {
        setMensaje(descripcion);
    }

    @Override
    public String getMessage(){
        return getMensaje();
    }

    public String getMensaje() {
        return descripcion;
    }

    public void setMensaje(String descripcion) {
        this.descripcion = descripcion;
    }

}
