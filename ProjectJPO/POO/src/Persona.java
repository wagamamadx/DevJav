public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    // Carrera carrera;


    // Constructor 

    public Persona(String nombre,String apellido,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad; 
    }

    
    
    // public Persona(String nombre,String apellido,int edad,String nombreCarrera,int duracionCarrera, boolean estaCursando){
    //     carrera = new Carrera(nombreCarrera,duracionCarrera,estaCursando);
    //     this.nombre = nombre;
    //     this.apellido = apellido;
    //     this.edad = edad;
    //     carrera.nombre = nombreCarrera;
    // }

    // public Persona(String nombre,String apellido,int edad,String nombreCarrera){
    //     carrera = new Carrera(nombreCarrera);
    //     this.nombre = nombre;
    //     this.apellido = apellido;
    //     this.edad = edad;
    //     carrera.nombre = nombreCarrera;
    // }

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getApellido() {
        return apellido;
    }



    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }



    public String darNombreCompleto(){
        return getApellido()+", "+getNombre();
    }

    public String enviarSaludo(String saludado){
        if(edad > 40){return "Buenos dias, querido "+saludado;}
        return "Hola, como estas "+saludado;
    }

}
