package modelo;


public class Cuenta 

{
    
        // 
        private int numeroCuenta;
        private double saldo;
        
        public Cuenta(int cuenta1, double inicial) 
        {
            numeroCuenta = cuenta1;
            saldo = inicial;
        } 
    
        public void depositar(double cantidad) {
            saldo = saldo + cantidad;
        } 
    
        public void retirar(double cantidad) {
            saldo = saldo - cantidad;
        } 
    
        public double saldo() {
            return saldo;
        }   
        
        
}

