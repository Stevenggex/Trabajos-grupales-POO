package ec.gob.subsidio.modelo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su cedula: ");
        String cedula = sc.nextLine();

        System.out.println("Ingrese sus ingresos mensuales: ");
        double ingresos = sc.nextDouble();

        System.out.println("Ingrese la cantidad de vehiculos: ");
        int vehiculosCant = sc.nextInt();

        System.out.println("¿Vives en Ecuador?: ");
        boolean vive = sc.nextBoolean();

        SolicitanteSubsidio sol = new SolicitanteSubsidio(nombre, cedula, ingresos, vehiculosCant, vive);
        System.out.println(sol.toString());
        System.out.println("\n--- DATOS ---");
        System.out.println(sol);
        System.out.println("\n--- RESULTADO ---");
        s.generarResultado();
        System.out.println("\nConsumo mensual base: " + s.calcularConsumoMensual() + " galones");
        System.out.println("Consumo con extra: " + s.calcularConsumoMensual(200) + " galones");


    }



}
