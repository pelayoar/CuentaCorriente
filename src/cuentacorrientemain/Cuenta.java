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
public class Cuenta {

    private String numero;
    private String sucursal;
    static ArrayList clientes;
    
    public Cuenta(){
        
    }

    public Cuenta(String numero, String sucursal) {

        this.numero = numero;
        this.sucursal = sucursal;
        clientes = new ArrayList();

    }

    //GETTER AND SETTER
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public ArrayList getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList clientes) {
        this.clientes = clientes;
    }

    
    //METODOS
    
    public static void addClient(Cliente cliente) {
        clientes.add(cliente);
    }

    
    
    
}
