public class Plaza {

//    Atributos
    private String id;
    private char tipo;
    private boolean adjudicada;
    private Persona persona;

//    Constructores
    public Plaza() {

    }

    public Plaza(String id, char tipo) {
        this.setId(id);
        this.setTipo(tipo);
        this.setAdjudicada(false);
        this.setPersona(null);
    }

//    Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id= id;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public boolean isAdjudicada() {
        return adjudicada;
    }

    public void setAdjudicada(boolean adjudicada) {
        this.adjudicada= adjudicada;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }



//    Método toString()
@Override
public String toString() {
    String texto =
            "------------------------------------\n"
                    + "ID Plaza "+this.getId()+"\n"
                    + "Tipo: "+this.getTipo()+"\n";
    if (this.isAdjudicada()) {
        texto=texto+
                "Adjudicada: ADJUDICADA\n"
                + "ID: "+this.getPersona().getId()+"\n"
                + "Nombre: "+this.getPersona().getNombre()+"\n"
                + "Apellido1: "+this.getPersona().getPrimerApellido()+"\n"
                + "Apellido2: "+this.getPersona().getSegundoApellido()+"\n"
        ;
        if (this.getTipo()=='D') {
            texto=texto
                    +"Titulacion: "+((Docente)this.getPersona()).getTitulacion()+"\n"
                    + "Puntos: "+((Docente)this.getPersona()).getPuntos()+"\n"
            ;
        }else {
            texto=texto
                    +"Especialidad: "+((Sanitario)this.getPersona()).getEspecialidad()+"\n"
                    + "Dias: "+((Sanitario)this.getPersona()).getDias()+"\n"
            ;
        }
    }else {
        texto=texto+
                "Adjudicada: NO ADJUDICADA\n";
    }

    return texto;
}
}
