package TO;

import java.sql.Date;


public class TOTransaccion {
    
public int idTransaccion;
public Date  fecha;
public String  tipoTransaccion;
public int idProveedoresTransaccion;
public int idVendedoresTransaccion;
public int idClientesTransaccion;

    public TOTransaccion() {
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public int getIdProveedoresTransaccion() {
        return idProveedoresTransaccion;
    }

    public void setIdProveedoresTransaccion(int idProveedoresTransaccion) {
        this.idProveedoresTransaccion = idProveedoresTransaccion;
    }

    public int getIdVendedoresTransaccion() {
        return idVendedoresTransaccion;
    }

    public void setIdVendedoresTransaccion(int idVendedoresTransaccion) {
        this.idVendedoresTransaccion = idVendedoresTransaccion;
    }

    public int getIdClientesTransaccion() {
        return idClientesTransaccion;
    }

    public void setIdClientesTransaccion(int idClientesTransaccion) {
        this.idClientesTransaccion = idClientesTransaccion;
    }


    
    
}
