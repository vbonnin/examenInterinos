import java.util.ArrayList;

public class Main {
//    Método para adjudicar plazas
    public static void adjudicarPlazas (ArrayList<Plaza> listaPlazas, ArrayList<Persona> listaPersonas) {
        for (Plaza plaza: listaPlazas) {
            if (!plaza.isAdjudicada()) {
                if (plaza.getTipo() == 'D') {
                    Docente docente =  new Docente();
                    docente.setPuntos(-1);
                    for (Persona persona: listaPersonas) {
                        if (persona instanceof Docente) {
                            if(((Docente) persona).getPuntos() > docente.getPuntos()) {
                                docente = (Docente) persona;
                            }
                        }
                    }
                    if (docente.getPuntos() != -1) {
//                        Asignamos al docente la plaza
                        plaza.setPersona(docente);
//                        Marcamos como adjudicada pa plaza
                        plaza.setAdjudicada(true);
//                        Eliminamos la persona que ha recibido la plaza de la lista de personas
                        listaPersonas.remove(docente);
                    }
                } else {
                    Sanitario sanitario = new Sanitario();
                    sanitario.setDias(-1);
                    for (Persona persona: listaPersonas) {
                        if (persona instanceof Sanitario) {
                            if(((Sanitario) persona).getDias() > sanitario.getDias()) {
                                sanitario = (Sanitario) persona;
                            }
                        }
                    }
                    if (sanitario.getDias() != -1) {
//                        Asignamos la plaza al sanitario
                        plaza.setPersona(sanitario);
//                        Marcamos como adjudicada la plaza
                        plaza.setAdjudicada(true);
//                        Eliminamos la persona que ha recibido la plaza de la lista de personas
                        listaPersonas.remove(sanitario);
                    }
                }
            }
        }
    }

//    Método para mostrar las plazas adjudicadas
    public static void mostrarAdjudicaciones(ArrayList<Plaza> listaPlaza) {
        System.out.println("============================================\r\n"
                + "La última adjudicación de plazas ha producido\r\n"
                + "los siguientes resultados para DOCENTES\r\n"
                + "============================================\r\n"
                + "");
        for (Plaza plaza : listaPlaza) {
            if (plaza.getTipo() == 'D') {
                System.out.println(plaza.toString());
            }
        }

        System.out.println("=============================================\r\n"
                + "La última adjudicación de plazas ha producido\r\n"
                + "los siguientes resultados para SANITARIOS\r\n"
                + "=============================================\r\n"
                + "");
        for (Plaza plaza : listaPlaza) {
            if (plaza.getTipo() == 'S') {
                System.out.println(plaza.toString());
            }
        }
    }

//    Método para simular la adjudicación de plazas
public static void simularAdjuducacion(ArrayList<Plaza> listaPlazas, ArrayList<Persona> listaPersonas) {
    Plaza plazaMadrid = new Plaza("0", 'D');
    Plaza plazaBarcelona = new Plaza("1", 'S');
    Plaza plazaSevilla = new Plaza("2", 'D');
    Plaza plazaValencia = new Plaza("3", 'S');
    Plaza plazaBilbao = new Plaza("4", 'D');
    Plaza plazaMálaga = new Plaza("5", 'S');
    Plaza plazaGranada = new Plaza("6", 'D');
    Plaza plazaZaragoza = new Plaza("7", 'S');
    Plaza plazaMurcia = new Plaza("8", 'D');
    Plaza plazaVigo = new Plaza("9", 'S');

    listaPlazas.add(plazaMadrid);
    listaPlazas.add(plazaBarcelona);
    listaPlazas.add(plazaSevilla);
    listaPlazas.add(plazaValencia);
    listaPlazas.add(plazaBilbao);
    listaPlazas.add(plazaMálaga);
    listaPlazas.add(plazaGranada);
    listaPlazas.add(plazaZaragoza);
    listaPlazas.add(plazaMurcia);
    listaPlazas.add(plazaVigo);

    Docente docente1 = new Docente("Juan", "García", "López", "Doctor", (float) 2.4);
    Docente docente2 = new Docente("María", "Hernández", "Pérez", "Máster", (float) 3.2);
    Docente docente3 = new Docente("Pedro", "Sánchez", "González", "Grado", (float) 2.7);
    Sanitario sanitario1 = new Sanitario("Laura", "Martínez", "Gómez", "Grado", 13);
    Sanitario sanitario2 = new Sanitario("Javier", "Fernández", "Muñoz", "Máster", 7);
    Sanitario sanitario3 = new Sanitario("Ana", "Moreno", "Jiménez", "Doctor", 31);

    listaPersonas.add(docente1);
    listaPersonas.add(docente2);
    listaPersonas.add(docente3);
    listaPersonas.add(sanitario1);
    listaPersonas.add(sanitario2);
    listaPersonas.add(sanitario3);
}



    public static void main(String[] args) {
        ArrayList<Plaza> listaPlazas = new ArrayList<Plaza>();
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

        simularAdjuducacion(listaPlazas,listaPersonas);
        adjudicarPlazas(listaPlazas, listaPersonas);
        mostrarAdjudicaciones(listaPlazas);

    }
}