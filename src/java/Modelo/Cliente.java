/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class Cliente {
    
    private String cnombre;
    private double telefono;
    private String correo;
    private String confirmar;
    ArrayList<Producto> arrayproductos=new ArrayList();
    Iterator<Producto> objiterador=arrayproductos.iterator();
    
    Producto objp;
    
    ArrayList<Producto> obj = new ArrayList();
    
    
    public Cliente() {
    }
    
    
    
    public Cliente(String nombre, double telefono, String correo) {
        this.cnombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCNombre() {
        return cnombre;
    }

    public void csetNombre(String nombre) {
        this.cnombre = nombre;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }
    
    public void agregar(String nombre, double precio, int existencia, String cliente){
        objp=new Producto(nombre,precio,existencia,cliente);
        arrayproductos.add(objp);
    }
    
    public String comprar(String nombre, int unidades, String cliente,double precio ){
        objp=new Producto(nombre,precio,unidades,cliente);
        
        int swit=0;
        while(objiterador.hasNext()){
            objp=objiterador.next();
            if(nombre.equals(objp.getNombre())){
                if (cliente.equals(objp.getCliente())){
                    objp.setExistencia(objp.getExistencia()-unidades);
                    if (objp.getExistencia()<0){
                        confirmar="No se puede comprar la cantidad de piezas solicitada";                    
                    }
                    if (objp.getExistencia()==0){
                        arrayproductos.remove(objp);
                        confirmar="Compra exitosa";
                    }
                    else{
                        confirmar="Compra exitosa";
                    }
                }
                else{
                    confirmar="Ups, algo salio mal al momneto de realizar la compra";
                }
            }
            else {
                confirmar="Ups, algo salio mal al momneto de realizar la compra";
            }
            }      
        
        return confirmar;
    }
            
}
