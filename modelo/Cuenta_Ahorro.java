package modelo;

public class Cuenta_Ahorro 
{
    
    
        // 
        private int numeroCuenta;
        private double saldo;
        private double interes;
        
        public Cuenta_Ahorro(int cuenta2, double inicial) 
        {
            numeroCuenta = cuenta2;
            saldo = inicial;
        } 
    
        public void depositar(double cantidad) {
            saldo = saldo + cantidad;
        } 
    
        public void retirar(double cantidad) {
            saldo = saldo - cantidad;
        } 

        public double interes ()
        {
          interes =  (0.04*saldo);
          
        }

        public double saldo() {
            return saldo;
        }
           
}
