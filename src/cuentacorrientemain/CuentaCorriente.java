/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacorrientemain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a20pelayoar
 */
public class CuentaCorriente extends Cuenta {
    private double saldoActual;
    List<Movimientos> movimientos;
    
    public CuentaCorriente(){
        
    }
    
    public CuentaCorriente(double saldoActual){
        this.saldoActual = saldoActual;
        movimientos = new ArrayList<>();
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public List getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList movimientos) {
        this.movimientos = movimientos;
    }

  
        

    
    
    public void addMovimientos(Movimientos movimiento){
        
        movimientos.add(movimiento);
    }
}
