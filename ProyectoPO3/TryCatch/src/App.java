import Exceptions.CalculadoraException;

public class App {
    public static void main(String[] args) throws Exception {
        
        int numero1 = 10;
        int numero2 = 0;
        int resultado;

        Calculadora calculadora = new Calculadora();

        try {
            resultado = calculadora.dividir(numero1,numero2);
            System.out.println("Sin Error detectado "+resultado);
        } catch (CalculadoraException e) {
            e.printStackTrace();
            System.out.println("Error detectado");
        } finally{
            System.out.println("Esto se imprime si el calculo es exitoso o no");
        }

    }
}
