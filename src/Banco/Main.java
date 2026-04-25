package Banco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crear las cuentas con los datos de prueba
        CuentaBancaria cuentaAna   = new CuentaAhorro  ("001-AHO", "Ana Pérez",    1200);
        CuentaBancaria cuentaLuis  = new CuentaCorriente("002-CTE", "Luis Gómez",    800);
        CuentaBancaria cuentaMaria = new CuentaInversion("003-INV", "María López",  7000);

        // Almacenar todas en la colección polimórfica
        List<CuentaBancaria> cuentas = new ArrayList<>();
        cuentas.add(cuentaAna);
        cuentas.add(cuentaLuis);
        cuentas.add(cuentaMaria);

        // Mostrar reporte de cada cuenta usando polimorfismo
        System.out.println("\n========================================");
        System.out.println("     REPORTE MENSUAL DEL BANCO          ");
        System.out.println("========================================");

        double totalIntereses = 0;

        for (CuentaBancaria cuenta : cuentas) {
            System.out.println(cuenta.toString());
            totalIntereses += cuenta.calcularInteresMensual(); // polimorfismo puro
        }

        System.out.println("\n========================================");
        System.out.printf("TOTAL INTERESES DEL BANCO: $%.2f%n", totalIntereses);
        System.out.println("========================================");
    }
}