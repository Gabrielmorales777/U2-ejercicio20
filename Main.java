
public class Main {

    public static void main(String[] args) {


        TorreControl torre = new TorreControl();


        Avion avion1 = new Avion("AR101", "Aerolíneas Argentinas");
        Avion avion2 = new Avion("LA205", "LATAM");
        Avion avion3 = new Avion("IB310", "Iberia");


        torre.autorizarAterrizaje(avion1);


        torre.autorizarAterrizaje(avion2);


        torre.finalizarAterrizaje(avion1);


        torre.autorizarAterrizaje(avion3);


        System.out.println("\n--- ESTADOS FINALES ---");

        avion1.mostrarInformacion();
        avion2.mostrarInformacion();
        avion3.mostrarInformacion();
    }
}
