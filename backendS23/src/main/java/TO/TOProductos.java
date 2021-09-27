
package TO;


public class TOProductos {

public int  idUsuario;
public int  existencia;
public int precioCompra;
public int PrecioVenta;
public String  descripcion;
public Double  ivaActual;

    public TOProductos() {
    }

    public TOProductos(int existencia, int precioCompra) {
        this.existencia = existencia;
        this.precioCompra = precioCompra;
    }

    public TOProductos(int existencia, int precioCompra, int PrecioVenta, String descripcion, Double ivaActual) {
        this.existencia = existencia;
        this.precioCompra = precioCompra;
        this.PrecioVenta = PrecioVenta;
        this.descripcion = descripcion;
        this.ivaActual = ivaActual;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(int PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getIvaActual() {
        return ivaActual;
    }

    public void setIvaActual(Double ivaActual) {
        this.ivaActual = ivaActual;
    }



    
    
}
