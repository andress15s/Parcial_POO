package modelo;


public class Cuenta 

{
    
        // 
        private int numeroCuenta;
        private int saldo;
        
        public Cuenta(int cuenta1, int inicial) 
        {
            numeroCuenta = cuenta1;
            saldo = inicial;
        } 
    
        public void depositar(int cantidad)
         {
            saldo = saldo + cantidad;
        } 
    
        public void retirar(int cantidad) {
            saldo = saldo - cantidad;
        } 
    
        public int saldo() {
            return saldo;
        }   
        
        
}

