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
public class Cliente extends Cuenta{
    private String dni;
    private String nombre;
    private String direccion;
    List<Cuenta> cuentas;
    
    
   
    
    public Cliente(String dni, String nombre, String direccion){
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        cuentas = new ArrayList();
    }

    
    //GETTER AND SETTER
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList cuentas) {
        this.cuentas = cuentas;
    }

   
    
    
    
    
    
    public void addCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
    }
}
