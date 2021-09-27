package DAO;

import ConexionDB.ConexionDB;




public class DAOUsuarios {
    
    private final ConexionDB con;
    private final String nombreTabla;
    //private final String[] columnas;
    
    public DAOUsuarios(){
        this.nombreTabla = "usuarios";
        con = new ConexionDB();
        //columnas = ["nombre","apellido","tipoUsuario","telefono","direccion","email","tipoDoxumento","numeroDocumento"];
    }
    
    public ArrayList<TOUsuarios> consultarUsuarios(){
        TOUsuarios usuario;
        ArrayList<TOUsuarios> usuarios = new ArrayList<>();
        
        try{
        ResultSet rs = con.consultar(nombreTabla);
        while (rs.next()) {
            usuario = new TOUsuarios();
            usuario.setApellido(rs.getString("apellidos"));
            usuario.setNombre(rs.getString("nombre"));
            usuario.setTipoDocumento(rs.getString("tipodocumento"));
            usuario.setNumeroDocumento(rs.getString("numerodocumento"));
            usuario.setIdUsuario(rs.getInt("idUsuario"));
            usuario.setTelefono(rs.getString("telefono"));
            usuario.setTipoUsuario(rs.getString("tipousuario"));
            usuario.setEmail(rs.getString("email"));
            usuario.setDirrecion(rs.getString("direccion"));
            
            usuarios.add(usuario);
        }   
        return usuarios;
           }catch(SQLException ex){
        
        System.out.println("Error en DAOUsuarios.consultarUsusarios "+ ex.getMessage());
            
        }
        return null; 
    }
    
    
    public int insertarUsuarios(TOUsuarios usuario){
           
        String[] valores = {usuario.getNombre(),usuario.getApellido(),usuario.getTipoUsuario(),usuario.getTelefono(),usuario.getDirrecion(),usuario.getEmail(),usuario.getTipoDocumento(),usuario.getNumeroDocumento()};
        try{
        return con.insertar(nombreTabla, valores);
        }catch(Exception ex){
        
        System.out.println("Error en DAOUsuarios.consultarUsusarios "+ ex.getMessage());
         return 0;   
        }
        
        }
        
    
    public boolean modificarUsuarios(TOUsuarios usuario){
           
        String[] valores = {usuario.getNombre(),usuario.getApellido(),usuario.getTipoUsuario(),usuario.getTelefono(),usuario.getDirrecion(),usuario.getEmail(),usuario.getTipoDocumento(),usuario.getNumeroDocumento()};
        try{
        return con.actualizar(nombreTabla, valores, usuario.getIdUsuario());
        }catch(Exception ex){
        
        System.out.println("Error en DAOUsuarios.consultarUsusarios "+ ex.getMessage());
         return false;   
        }
        
        }
        
    public boolean eliminarUsuarios(int id){
           
        //String[] valores = {usuario.getNombre(),usuario.getApellido(),usuario.getTipoUsuario(),usuario.getTelefono(),usuario.getDirrecion(),usuario.getEmail(),usuario.getTipoDocumento(),usuario.getNumeroDocumento()};
        try{
        return con.eliminar(nombreTabla,id);
        }catch(Exception ex){
        
        System.out.println("Error en DAOUsuarios.consultarUsusarios "+ ex.getMessage());
         return false;   
        }
        
        }
         
    
}
