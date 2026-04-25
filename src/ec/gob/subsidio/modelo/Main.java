package ec.gob.subsidio.modelo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SolicitanteSubsidio.mostrarReglasSubsidio();

        System.out.print("Ingrese nombre completo: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese cédula: ");
        String cedula = sc.nextLine();

        System.out.print("Ingrese ingresos mensuales: ");
        double ingresos = sc.nextDouble();

        System.out.print("Ingrese cantidad de vehículos: ");
        int vehiculos = sc.nextInt();

        System.out.print("¿Vive en Ecuador? (true/false): ");
        boolean viveEnEcuador = sc.nextBoolean();

        SolicitanteSubsidio solicitante = new SolicitanteSubsidio(
                nombre, cedula, ingresos, vehiculos, viveEnEcuador
        );

        System.out.println(solicitante.toString());

        solicitante.generarResultado();

        double consumoBase = solicitante.calcularConsumoMensual();
        System.out.println("\nConsumo mensual (sin km extra): " + consumoBase + " galones");

        System.out.print("\nIngrese kilómetros extra recorridos este mes: ");
        double kmExtra = sc.nextDouble();

        double consumoExtra = solicitante.calcularConsumoMensual(kmExtra);
        System.out.println("Consumo mensual (con " + kmExtra + " km extra): " + consumoExtra + " galones");

        sc.close();
    }
}
