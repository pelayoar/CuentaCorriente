/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacorrientemain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

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

        CuentaCorrienteMain.generarMenu();

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("ficheroPrueba.dat")));

            oos.writeObject(cuenta1.getClientes());
            oos.flush();
            oos.close();
            System.out.println("Guardado correctamente");

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        ArrayList arraylist2 = new ArrayList();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ficheroPrueba.dat"));
            arraylist2 = (ArrayList<Object>) ois.readObject();
            for (int i = 0; i < arraylist2.size(); i++) {
                System.out.println(arraylist2.get(i).getClass());
            }
            ois.close();

        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }

    }

    public static void generarMenu() {
        Scanner scan = new Scanner(System.in);

        byte opcion1 = -2;
        do {
            System.out.println("Seleccione opción:");
            System.out.println("\t1. VISUALIZAR TODOS LOS CLIENTES DE UNA CUENTA");
            System.out.println("\t2. VISUALIZAR TODAS LAS CUENTAS DE UN CLIENTE");
            System.out.println("\t3. VISUALIZAR TODOS LOS MOVIMIENTOS DE UNA CUENTA");

            opcion1 = scan.nextByte();
            scan.nextLine();

            switch (opcion1) {
                case 1:
                    CuentaCorrienteMain.menu1();
                    break;
                case 2:
                    CuentaCorrienteMain.menu2();
                    break;
                case 3:
                    CuentaCorrienteMain.menu3();
                    break;
            }

        } while (opcion1 != 0);
    }

    public static void menu1() {
        for (int i = 0; i < Cuenta.clientes.size(); i++) {
            System.out.println(Cuenta.clientes.get(i).getNombre());
        }
    }

    public static void menu2() {
        for (int i = 0; i < Cliente.cuentas.size(); i++) {
            System.out.println(Cliente.cuentas.get(i).getNumero());
        }

    }

    public static void menu3() {
        for (int i = 0; i < CuentaCorriente.movimientos.size(); i++) {
            System.out.println(CuentaCorriente.movimientos.get(i).getMovimientos().toString());
        }

    }
}
