
public class TorreControl {

    private boolean pistaLibre;

    public TorreControl() {
        pistaLibre = true;
    }

    public void autorizarAterrizaje(Avion avion) {

        System.out.println("\nSolicitud de aterrizaje del vuelo: "
                + avion.getCodigoVuelo());

        if (pistaLibre) {

            System.out.println("Pista disponible. Aterrizaje autorizado.");

            pistaLibre = false;
            avion.cambiarEstado("Aterrizando");

        } else {

            System.out.println("Pista ocupada. Aterrizaje denegado.");

        }
    }

    // Método que finaliza el aterrizaje y libera la pista
    public void finalizarAterrizaje(Avion avion) {

        if (avion.getEstadoVuelo().equals("Aterrizando")) {

            avion.cambiarEstado("En tierra");
            pistaLibre = true;

            System.out.println("\nEl vuelo "
                    + avion.getCodigoVuelo()
                    + " ha aterrizado correctamente.");

            System.out.println("La pista vuelve a estar disponible.");
        }
    }
}
