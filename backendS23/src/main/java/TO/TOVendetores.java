
package TO;

import java.sql.Date;


public class TOVendetores extends TOUsuarios {
    
public int  idEmpleado;
public Double  salarioMensual;
public Date  ingreso;
public String  cargo;
public String  tipoContrato;
public String  contraseña;
public int  idUsuariosVendedores;

    public TOVendetores() {
    }

    public TOVendetores(Double salarioMensual, Date ingreso, String cargo, String tipoContrato, String contraseña, int idUsuariosVendedores, String nombre, String apellido, String tipoUsuario, String numeroDocumento) {
        super(nombre, apellido, tipoUsuario, numeroDocumento);
        this.salarioMensual = salarioMensual;
        this.ingreso = ingreso;
        this.cargo = cargo;
        this.tipoContrato = tipoContrato;
        this.contraseña = contraseña;
        this.idUsuariosVendedores = idUsuariosVendedores;
    }

    public TOVendetores(Double salarioMensual, Date ingreso, String cargo, String tipoContrato, String contraseña, int idUsuariosVendedores, String nombre, String apellido, String tipoUsuario, String telefono, String dirrecion, String email, String tipoDocumento, String numeroDocumento) {
        super(nombre, apellido, tipoUsuario, telefono, dirrecion, email, tipoDocumento, numeroDocumento);
        this.salarioMensual = salarioMensual;
        this.ingreso = ingreso;
        this.cargo = cargo;
        this.tipoContrato = tipoContrato;
        this.contraseña = contraseña;
        this.idUsuariosVendedores = idUsuariosVendedores;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(Double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getIdUsuariosVendedores() {
        return idUsuariosVendedores;
    }

    public void setIdUsuariosVendedores(int idUsuariosVendedores) {
        this.idUsuariosVendedores = idUsuariosVendedores;
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
