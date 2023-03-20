/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import Modelo.Cliente;
import Modelo.Producto;
import java.util.Iterator;
/**
 *
 * @author USER
 */
public class Compra {
    
    private String nombre;
    private int unidades;
    private String cliente;
    private double precio;
    private String confirmar;

    public Compra(String nombre, int unidades, String cliente, double precio) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.cliente = cliente;
        this.precio = precio;
    }
        
    private ArrayList<Producto> arrayproductos=new ArrayList();
    private Iterator<Producto> objiterador=arrayproductos.iterator();
    Producto objp = new Producto();

    public Compra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void agregar(String nombre, double precio, int existencia, String cliente){
        objp=new Producto(nombre,precio,existencia,cliente);
        arrayproductos.add(objp);
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Producto> getArrayproductos() {
        return arrayproductos;
    }

    public void setArrayproductos(ArrayList<Producto> arrayproductos) {
        this.arrayproductos = arrayproductos;
    }

    public Iterator<Producto> getObjiterador() {
        return objiterador;
    }

    public void setObjiterador(Iterator<Producto> objiterador) {
        this.objiterador = objiterador;
    }

    public Producto getObjp() {
        return objp;
    }

    public void setObjp(Producto objp) {
        this.objp = objp;
    }

    
    
    public String comprar(String nombre, int unidades,String cliente,double precio){
        
        
        int swit=0;
        while(objiterador.hasNext())
        {
            objp=objiterador.next();
            if(nombre.equals(objp.getNombre())){
                if (cliente.equals(objp.getCliente())){
                    objp.setExistencia(objp.getExistencia()-unidades);
                    if (objp.getExistencia()<0){
                        swit=1;                    
                    }
                    if (objp.getExistencia()==0){
                        arrayproductos.remove(objp);
                        swit=2;
                }
                }
            }
            else {
                confirmar="Ups, algo salio mal al momneto de realizar la compra";
            }
            switch(swit){
                case 1:
                    confirmar="No se puede comprar la cantidad de piezas solicitada";
                break;
                case 2:
                    confirmar="Compra exitosa";
                break;
            
            }
            
        }
        
        return confirmar;
    }
}
