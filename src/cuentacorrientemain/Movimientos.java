/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacorrientemain;

import java.time.LocalDate;
import java.time.LocalTime;


/**
 *
 * @author a20pelayoar
 */
public class Movimientos extends CuentaCorriente {
    private String numeroCta;
    private LocalDate fechaOperacion;
    private LocalTime hora;
    private float cantidad;
    private double saldoActual;
    
    
    public Movimientos(String numeroCta, float cantidad, CuentaCorriente cuenta){
        this.numeroCta = numeroCta;
        this.cantidad = cantidad;
        fechaOperacion = LocalDate.now();
        hora = LocalTime.now();
        saldoActual = cuenta.getSaldoActual();
        
      
        
    }
    
    
    
  
    
}
