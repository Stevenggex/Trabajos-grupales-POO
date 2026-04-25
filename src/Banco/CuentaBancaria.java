package Banco;

public abstract class CuentaBancaria {
    private String numeroCuenta;
    private String titularCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titularCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.titularCuenta = titularCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }

    public String getTitularCuenta(){
        return titularCuenta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitularCuenta(String titularCuenta){
        this.titularCuenta = titularCuenta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double monto){
        if (monto <= 0){
            System.out.println("Error: No se aceptan depositos negativos.");
        } else {
            this.saldo += monto;
            System.out.println("EL monto de " + monto + " a sido depositado correctamente.");
        }
    }

    public void retirar(double monto){
        if (monto <= 0){
            System.out.println("Error: No se aceptan retiros negativos.");
        } else {
            this.saldo -= monto;
            System.out.println("Monto de " + monto + " retirado correctamente.");
        }
    }

    public abstract double calcularInteresMensual();

    @Override
    public String toString(){
        return "Numero de cuenta: " + numeroCuenta + "\n" +
                "Titular: " + titularCuenta + "\n" +
                "Saldo actual: $ " + saldo;

    }
}
