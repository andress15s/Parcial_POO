package ejecutable;

import modelo.*;

public class Test 
{
   
    public static void main(String[] args) 
    {

        
        double totalCuenta;

        // Creamos laa cuentas

        Cuenta cuenta1;
        cuenta1 = new Cuenta(11111, 2000000);

        Cuenta_Ahorro cuenta2;
        cuenta2 = new Cuenta_Ahorro(12345, 30000000);

        Libreta_2022 cuenta3;
        cuenta3 = new Libreta_2022(12543, 50000000);






        // Consultar saldo
        totalCuenta = cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + cuenta1 +   " $ " + totalCuenta );

        // consignar
        int cantidad = 350000;
        System.out.println("Se ingresan en la cuenta: " +  " $ "  + cantidad );
        cuenta1.depositar(cantidad);

        // saber el saldo
        totalCuenta = cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " +  " $" + totalCuenta );  

        System.out.println("---------------------------------------------------");

        //---------------------------------------------------------------------
        //cuenta ahorros

        // Consultar saldo
         totalCuenta = cuenta2.saldo();
         System.out.println("Total actual en la cuenta ahorros: " + cuenta2 +  " $ " + totalCuenta );
    
    
        // consignar
        int cantidad2 = 800000;
        System.out.println("Se ingresan en la cuenta ahorros: " +  " $ "  + cantidad2 );
        cuenta2.depositar(cantidad2);

    
        // saber el saldo
        totalCuenta = cuenta2.saldo();
        System.out.println("Total actual en la cuenta ahorros: " +  " $" + totalCuenta );    
            
        System.out.println("-----------------------------------------------------------");
        //---------------------------------------------------------------------
        //libreta_2022

        // Consultar saldo
        totalCuenta = cuenta3.saldo();
        System.out.println("Total actual en la cuenta libreta 2022: " + cuenta3 +  " $ " + totalCuenta );

       // consignar
       int ingreso3 = 950000;
       System.out.println("Se ingresan en la cuenta libreta 2022: " +  " $ "  + ingreso2 );
       cuenta2.depositar(ingreso3);
   
       // saber el saldo
       totalCuenta = cuenta3.saldo();
       System.out.println("Total actual en la cuenta libreta 2022: " +  " $" + totalCuenta ); 

       System.out.println("------------------------------------------------------------------");


        
    }
    
}