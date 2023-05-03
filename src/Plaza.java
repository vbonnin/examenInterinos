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
    return  "ID Plaza: " + this.getId()
            + "\nTipo de plaza: " + this.getTipo()
            + "\nAdjudicada: " + (this.isAdjudicada() ? "ADJUDICADA\n"
            + "Persona adjudicada:\n" + this.getPersona() : "NO ADJUDICADA")
            + "\n------------------------------------\n";
}


}
