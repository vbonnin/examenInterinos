public class Docente extends Persona{

//    Atributo
    private String titulacion;
    private double puntos;

//    Constructores
    public Docente() {
        super();
    }

    public Docente(String nombre, String primerApellido, String segundoApellido, String titulacion, double puntos) {
        super(nombre, primerApellido, segundoApellido);
        this.setTitulacion(titulacion);
        this.setPuntos(puntos);
    }

//    Getters y setters
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion= titulacion;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

//    Método toString


    @Override
    public String toString() {
        return super.toString() + "Docentes{" +
                "titulacion='" + titulacion + '\'' +
                ", puntos=" + puntos +
                "} ";
    }
}
