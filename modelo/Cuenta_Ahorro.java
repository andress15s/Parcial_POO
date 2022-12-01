package modelo;

public class Cuenta_Ahorro 
{
    
    
        // 
        private int numeroCuenta;
        private int saldo;
        public int interes;
        
        public Cuenta_Ahorro(int cuenta2, int inicial) 
        {
            numeroCuenta = cuenta2;
            saldo = inicial;
        } 
    
        public void depositar(int cantidad2) {
            saldo = saldo + cantidad2 ;
        } 
    
        public void retirar(int cantidad2) {
            saldo = saldo - cantidad2 ;
        } 

        public int saldo() {
            return saldo;
        }
        
        public int interes ()
        {
          return interes = (int) (saldo + (0.04*saldo));
        }
}
