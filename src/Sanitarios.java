public class Sanitarios extends Persona{

//    Atributo
    private String especialidad;
    private int dias;

//    Constructores
    public Sanitarios() {
        super();
    }

    public Sanitarios (String nombre, String primerApellido, String segundoApellido, String especialidad, int dias) {
        super(nombre, primerApellido, segundoApellido);
        this.setEspecialidad(especialidad);
        this.setDias(dias);
    }

//    Getters y setters

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

//    Método toString


    @Override
    public String toString() {
        return super.toString() + "Sanitarios{" +
                "especialidad='" + especialidad + '\'' +
                ", dias=" + dias +
                "} ";
    }
}
