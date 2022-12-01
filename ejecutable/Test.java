package ejecutable;

import modelo.*;

public class Test 
{
   
    public static void main(String[] args) 
    {

        
        double totalCuenta;

        // Creamos laa cuentas

        Cuenta cuenta1;
        Cuenta1 = new cuenta1(11111, 200000);

        Cuenta_Ahorro cuenta2;
        cuenta2 = new cuenta2(12345, 3000000);

        Libreta_2022 cuenta3;
        cuenta3 = new cuenta3(12543, 5000000);






        // Consultar saldo
        totalCuenta = cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " +  " $ " + totalCuenta );

        //saber el interes

        totalCuenta = cuenta2.interes();



        // consignar
        double ingreso = 350.250;
        System.out.println("Se ingresan en la cuenta: " +  " $ "  + ingreso );
        Cuenta1.depositar(ingreso);
        
        System.out.println("     ");

        // saber el saldo
        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " +  " $" + totalCuenta );        
        
    }
    
}