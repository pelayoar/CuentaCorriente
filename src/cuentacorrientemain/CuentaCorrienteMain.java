/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacorrientemain;

/**
 *
 * @author a20pelayoar
 */
public class CuentaCorrienteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("1234 5678 9123 4567", "Gran Via");
        Cliente cliente1 = new Cliente("48738593P", "Juan José", "Gran Vía, 24");
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(100.0);
        Movimientos movimiento1 = new Movimientos("1234 5678 9123 4567", 100.0f, cuentaCorriente1);
        
        cuenta1.addClient(cliente1);

    }


    
}
