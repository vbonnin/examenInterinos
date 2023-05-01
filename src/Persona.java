public abstract class Persona {

//    Atributos
    private int id;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private static int contador=0;

//    Constructores
    public Persona(){

    }

    public Persona(String nombre, String primerApellido, String segundoApellido) {
        this.setId();
        this.setNombre(nombre);
        this.setPrimerApellido(primerApellido);
        this.setSegundoApellido(segundoApellido);
    }
//    Getters y setters

    public int getId() {
        return id;
    }

    public void setId() {
        contador++;
        this.id=contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido= primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public static int getContador() {
        return contador;
    }


//    Método toString


    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                '}';
    }
}
