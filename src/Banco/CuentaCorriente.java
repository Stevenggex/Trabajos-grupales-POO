package Banco;

public class CuentaCorriente extends CuentaBancaria{
    private static final double LIMITE_SOBREGIRO = 500;

    public CuentaCorriente(String numeroCuenta, String titularCuenta, double saldo){
        super(numeroCuenta, titularCuenta, saldo);
    }

    @Override
    public void retirar(double monto){
        if (monto <=0){
            System.out.println("Error: El monto de retiro debe ser mayor a 0.");
        } else if (monto > getSaldo() + LIMITE_SOBREGIRO) {
            System.out.println("Retiro rechazado, has superado el limite del sobregiro de retiros.");
        } else {
            setSaldo(getSaldo() - monto);
            System.out.println("Retiro monto: $ " + monto + " realizado correctamente.");
        }
    }

    @Override
    public double calcularInteresMensual(){
        return 0;
    }

    @Override
    public String toString(){
        return "\n====== CUENTA CORRIENTE ======\n" +
                super.toString() + "\n" +
                "Sobregiro permitido: $" + LIMITE_SOBREGIRO + "\n" +
                "Interés mensual: $0.00 (no se genera intereses)";
    }
}
