/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacorrientemain;

import java.util.ArrayList;

/**
 *
 * @author a20pelayoar
 */
public class CuentaCorriente extends Cuenta {
    private double saldoActual;
    static ArrayList movimientos;
    
    public CuentaCorriente(){
        
    }
    
    public CuentaCorriente(double saldoActual){
        this.saldoActual = saldoActual;
        movimientos = new ArrayList();
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public static ArrayList getMovimientos() {
        return movimientos;
    }

    public static void setMovimientos(ArrayList movimientos) {
        CuentaCorriente.movimientos = movimientos;
    }
        

    
    
    public static void addMovimientos(Movimientos movimiento){
        movimientos.add(movimiento);
    }
}
