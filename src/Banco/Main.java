package banco;

import banco.modelo.*;

public class Main {

    public static void main(String[] args) {
        CuentaAhorros ahorro = new CuentaAhorros("001", "Ana Pérez", 1200);
        CuentaCorriente corriente = new CuentaCorriente("002", "Luis Gómez", 800);
        CuentaInversion inversion = new CuentaInversion("003", "María López", 7000);

        double totalIntereses = 0;
        ahorro.mostrarDatos();
        double interesAhorro = ahorro.calcularInteresMensual();
        System.out.println("Interés mensual: " + interesAhorro);
        System.out.println("Saldo actualizado: " + ahorro.getSaldo());
        totalIntereses += interesAhorro;
        corriente.mostrarDatos();
        double interesCorriente = corriente.calcularInteresMensual();
        System.out.println("Interés mensual: " + interesCorriente);
        System.out.println("Saldo actualizado: " + corriente.getSaldo());
        totalIntereses += interesCorriente;
        inversion.mostrarDatos();
        double interesInversion = inversion.calcularInteresMensual();
        System.out.println("Interés mensual: " + interesInversion);
        System.out.println("Saldo actualizado: " + inversion.getSaldo());
        totalIntereses += interesInversion;
        System.out.println("TOTAL INTERESES DEL BANCO:" + totalIntereses);
    }
}
