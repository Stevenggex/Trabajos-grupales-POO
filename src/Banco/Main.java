package banco;

import banco.modelo.*;

public class Main {

    public static void main(String[] args) {
        CuentaAhorros ahorro = new CuentaAhorros("001", "Ana Pérez", 1200);
        CuentaCorriente corriente = new CuentaCorriente("002", "Luis Gómez", 800);
        CuentaInversion inversion = new CuentaInversion("003", "María López", 7000);

        double totalIntereses = 0;

        System.out.println("===== REPORTE BANCARIO =====");
        ahorro.mostrarDatos();
        double interesAhorro = ahorro.calcularInteresMensual();
        System.out.println("Interés mensual: $" + interesAhorro);
        System.out.println("Saldo actualizado: $" + ahorro.getSaldo());
        System.out.println("----------------------------");
        totalIntereses += interesAhorro;
        corriente.mostrarDatos();
        double interesCorriente = corriente.calcularInteresMensual();
        System.out.println("Interés mensual: $" + interesCorriente);
        System.out.println("Saldo actualizado: $" + corriente.getSaldo());
        System.out.println("----------------------------");
        totalIntereses += interesCorriente;
        inversion.mostrarDatos();
        double interesInversion = inversion.calcularInteresMensual();
        System.out.println("Interés mensual: $" + interesInversion);
        System.out.println("Saldo actualizado: $" + inversion.getSaldo());
        System.out.println("----------------------------");
        totalIntereses += interesInversion;

        // 🔹 Total
        System.out.println("TOTAL INTERESES DEL BANCO: $" + totalIntereses);
    }
}