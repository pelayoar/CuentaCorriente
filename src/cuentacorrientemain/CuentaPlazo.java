/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacorrientemain;

import java.util.Date;

/**
 *
 * @author a20pelayoar
 */
public class CuentaPlazo {
    private float intereses;
    private Date fechaVencimiento;
    private long depositoPlazo;
    
    
    public CuentaPlazo(float intereses, Date fechaVencimiento, long depositoPlazo){
        this.intereses = intereses;
        this.fechaVencimiento = fechaVencimiento;
        this.depositoPlazo = depositoPlazo;     
        
        
    }

    public float getIntereses() {
        return intereses;
    }

    public void setIntereses(float intereses) {
        this.intereses = intereses;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public long getDepositoPlazo() {
        return depositoPlazo;
    }

    public void setDepositoPlazo(long depositoPlazo) {
        this.depositoPlazo = depositoPlazo;
    }
    
    
    
    
    
    
}
