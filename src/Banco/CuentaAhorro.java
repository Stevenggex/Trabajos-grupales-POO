package Banco;

public class CuentaAhorro extends CuentaBancaria {
    private static final double TASA_ANUAL = 0.03;

    public CuentaAhorro(String numeroCuenta, String titularCuenta, double saldo){
        super(numeroCuenta, titularCuenta, saldo);
    }

    @Override
    public double calcularInteresMensual(){
        return getSaldo() * (TASA_ANUAL / 12);
    }

    @Override
    public String toString() {
        double interes = calcularInteresMensual();
        return "\n====== CUENTA DE AHORROS ======\n" +
                super.toString() + "\n" +
                "Interés mensual: $" + String.format("%.2f", interes);
    }
}
