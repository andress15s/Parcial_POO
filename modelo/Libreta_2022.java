package modelo;
public class Libreta_2022 
{
    
    
        // 
        private int numeroCuenta;
        private int saldo;
        public int interes;
        

        
        public Libreta_2022(int cuenta3, int inicial) 
        {
            numeroCuenta = cuenta3;
            saldo = inicial;
        } 
    
        public void depositar(int cantidad3) 
        {
            saldo = saldo + cantidad3;
        } 
    
        public void retirar(int cantidad3)
        {
            saldo = (int) (saldo - cantidad3 - (0.02*cantidad3));
            
        } 

        public int saldo() {
            return saldo;
        }  
        
        public int interes ()
        {
          return interes =  (int) (saldo + (0.08*saldo));
        }
        


















    
}
