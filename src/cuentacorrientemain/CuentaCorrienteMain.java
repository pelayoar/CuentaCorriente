/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacorrientemain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

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
        
        cliente1.addCuenta(cuenta1);
        cuenta1.addClient(cliente1);
        
        cuentaCorriente1.addMovimientos(movimiento1);
        
        
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("ficheroPrueba.dat")));
            
            oos.writeObject(cuenta1.getClientes());
            oos.flush();
            oos.close();
            System.out.println("Guardado correctamente");
            
        }catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        
        
    }


    
}
