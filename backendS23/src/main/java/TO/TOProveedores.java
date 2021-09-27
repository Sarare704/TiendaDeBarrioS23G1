
package TO;


public class TOProveedores extends TOUsuarios{

public int  idProveedores;
public String  nombreProveedor;
public String  nitProveedor;
public String  dirrecionProveedor;
public String  telProveedor;
public String  enailProveedor;
public int  idUsuariosProveedores;

    public TOProveedores() {
    }

    public TOProveedores(String nombreProveedor, String nitProveedor, int idUsuariosProveedores, String nombre, String apellido, String tipoUsuario, String numeroDocumento) {
        super(nombre, apellido, tipoUsuario, numeroDocumento);
        this.nombreProveedor = nombreProveedor;
        this.nitProveedor = nitProveedor;
        this.idUsuariosProveedores = idUsuariosProveedores;
    }

    public TOProveedores(String nombreProveedor, String nitProveedor, String dirrecionProveedor, String telProveedor, String enailProveedor, int idUsuariosProveedores, String nombre, String apellido, String tipoUsuario, String telefono, String dirrecion, String email, String tipoDocumento, String numeroDocumento) {
        super(nombre, apellido, tipoUsuario, telefono, dirrecion, email, tipoDocumento, numeroDocumento);
        this.nombreProveedor = nombreProveedor;
        this.nitProveedor = nitProveedor;
        this.dirrecionProveedor = dirrecionProveedor;
        this.telProveedor = telProveedor;
        this.enailProveedor = enailProveedor;
        this.idUsuariosProveedores = idUsuariosProveedores;
    }


    public int getIdProveedores() {
        return idProveedores;
    }

    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(String nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public String getDirrecionProveedor() {
        return dirrecionProveedor;
    }

    public void setDirrecionProveedor(String dirrecionProveedor) {
        this.dirrecionProveedor = dirrecionProveedor;
    }

    public String getTelProveedor() {
        return telProveedor;
    }

    public void setTelProveedor(String telProveedor) {
        this.telProveedor = telProveedor;
    }

    public String getEnailProveedor() {
        return enailProveedor;
    }

    public void setEnailProveedor(String enailProveedor) {
        this.enailProveedor = enailProveedor;
    }

    public int getIdUsuariosProveedores() {
        return idUsuariosProveedores;
    }

    public void setIdUsuariosProveedores(int idUsuariosProveedores) {
        this.idUsuariosProveedores = idUsuariosProveedores;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    
    
}
