package modelo;
public class Libreta_2022 
{
    
    
        // 
        private int numeroCuenta;
        private double saldo;
        
        public Libreta_2022(int cuenta3, double inicial) 
        {
            numeroCuenta = cuenta3;
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
