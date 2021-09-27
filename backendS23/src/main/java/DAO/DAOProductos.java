/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Eidy
 */
public class DAOProductos {
 
  private String  idproducto;
  private int existencia;
  private int precioCompra;
  private int precioVenta;
  private String descripcion;
  private double ivaActual;

    public DAOProductos() {
    }

    public DAOProductos(int existencia, int precioCompra) {
        this.existencia = existencia;
        this.precioCompra = precioCompra;
    }

    public DAOProductos(int existencia, int precioCompra, int precioVenta, String descripcion, double ivaActual) {
        this.existencia = existencia;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.descripcion = descripcion;
        this.ivaActual = ivaActual;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public int getExistencia() {
        return existencia;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getIvaActual() {
        return ivaActual;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIvaActual(double ivaActual) {
        this.ivaActual = ivaActual;
    }
  
  
}
