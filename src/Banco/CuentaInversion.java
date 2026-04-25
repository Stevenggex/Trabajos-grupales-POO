package Banco;

public class CuentaInversion extends CuentaBancaria {

    public CuentaInversion(String numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    // Tasa variable según el saldo
    private double getTasaAnual() {
        if (getSaldo() < 1000) {
            return 0.04;
        } else if (getSaldo() <= 5000) {
            return 0.05;
        } else {
            return 0.06;
        }
    }

    @Override
    public double calcularInteresMensual() {
        return getSaldo() * (getTasaAnual() / 12);
    }

    @Override
    public String toString() {
        double interes = calcularInteresMensual();
        double tasa = getTasaAnual() * 100;
        return "\n====== CUENTA DE INVERSIÓN ======\n" +
                super.toString() + "\n" +
                "Tasa anual aplicada: " + tasa + "%\n" +
                "Interés mensual: $" + String.format("%.2f", interes);
    }
}