/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacorrientemain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;


/**
 *
 * @author a20pelayoar
 */
public class Movimientos extends CuentaCorriente implements Serializable{
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
        
        cuenta.setSaldoActual(saldoActual + cantidad);
        
    }
    
    
    public Date fechaHoy(){
      Date fechaHoy = new Date(new java.util.Date().getTime());
      Date hora = new Date(fechaHoy.getTime());
      
      return fechaHoy;
        
        
    }
  
    
}
