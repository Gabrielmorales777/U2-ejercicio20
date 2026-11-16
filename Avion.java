
public class Avion {

    private String codigoVuelo;
    private String aerolinea;
    private String estadoVuelo;

    public Avion(String codigoVuelo, String aerolinea) {
        this.codigoVuelo = codigoVuelo;
        this.aerolinea = aerolinea;
        this.estadoVuelo = "En vuelo";
    }

    public void cambiarEstado(String nuevoEstado) {
        estadoVuelo = nuevoEstado;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public String getEstadoVuelo() {
        return estadoVuelo;
    }

    public void mostrarInformacion() {
        System.out.println("Vuelo: " + codigoVuelo);
        System.out.println("Aerolinea: " + aerolinea);
        System.out.println("Estado: " + estadoVuelo);
    }
}
