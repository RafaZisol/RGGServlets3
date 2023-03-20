/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Producto extends Cliente {
    private String nombre;
    private double precio;
    private int existencia;
    private String cliente;

    Cliente objc;
    ArrayList<Cliente> arraycliente=new ArrayList();
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public Producto() {
    }

    public Producto(String nombre, double precio, int existencia, String cliente) {
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
        this.cliente= cliente;
    }
    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
    public void agregarclient(String nombre, double telefono, String correo){
        objc=new Cliente(nombre,telefono,correo);
        arraycliente.add(objc);    
    }
    
    
}
