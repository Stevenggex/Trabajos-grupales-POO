package ec.gob.subsidio.modelo;

public class SolicitanteSubsidio {
    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    public SolicitanteSubsidio(String nombreCompleto, String cedula, double ingresosMensuales,
                               int cantidadVehiculos, boolean viveEnEcuador){
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.ingresosMensuales = ingresosMensuales;
        this.cantidadVehiculos = cantidadVehiculos;
        this.viveEnEcuador = viveEnEcuador;
    }

    @Override
    public String toString(){
        return "\n ====== DATOS SOLICITANTE =====\n" +
                "Nombre: " + nombreCompleto + "\n" +
                "Cedula: " + cedula + "\n" +
                "Ingresos mensuales: " + ingresosMensuales + "\n" +
                "Cantidad de vehiculos: " + cantidadVehiculos + "\n" +
                "Vive en Ecuador: " + viveEnEcuador;
    }
}
