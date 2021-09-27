/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TO;

/**
 *
 * @author DIEGO
 */
public class TOProductosTransaccion {
    
public int idProductosTransaccion;
public int  cantidaVendida;
public Double  valorBruto;
public Double  valorNeto;
public Double  iva;
public int idProductosTransaccionfk;
public int idTransaccionProductosTransaccion;

    public TOProductosTransaccion() {
    }

    public int getIdProductosTransaccion() {
        return idProductosTransaccion;
    }

    public void setIdProductosTransaccion(int idProductosTransaccion) {
        this.idProductosTransaccion = idProductosTransaccion;
    }

    public int getCantidaVendida() {
        return cantidaVendida;
    }

    public void setCantidaVendida(int cantidaVendida) {
        this.cantidaVendida = cantidaVendida;
    }

    public Double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(Double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public Double getValorNeto() {
        return valorNeto;
    }

    public void setValorNeto(Double valorNeto) {
        this.valorNeto = valorNeto;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public int getIdProductosTransaccionfk() {
        return idProductosTransaccionfk;
    }

    public void setIdProductosTransaccionfk(int idProductosTransaccionfk) {
        this.idProductosTransaccionfk = idProductosTransaccionfk;
    }

    public int getIdTransaccionProductosTransaccion() {
        return idTransaccionProductosTransaccion;
    }

    public void setIdTransaccionProductosTransaccion(int idTransaccionProductosTransaccion) {
        this.idTransaccionProductosTransaccion = idTransaccionProductosTransaccion;
    }



    
}
