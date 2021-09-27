package ConexionDB;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConexionDB {

    private String DB_driver;
    private String url;
    private String db;
    private String host;
    private String username;
    private String password;
    private Connection con;
    private Statement stmt;
    private ResultSet rs;

    public ConexionDB() {

        DB_driver = "com.mysql.jdbc.Driver";
        db = "mitienda";//aca va el nombre de mi base de datos
        host = "localhost:3306"; //aca va mi puerto de la BD 3306
        username = "root";
        password = "Eidy.98#";
        url = "jdbc:mysql://" + host + "/" + db;

        try {
            Class.forName(DB_driver);
        } catch (ClassNotFoundException ex) {

            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection(url, username, password);
            con.setTransactionIsolation(8);
            System.out.println("BD conectada");

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Connection getConnection() {
        try {
            con.setAutoCommit(true);
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void closeConnection(Connection con) {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean commitDB() {
        try {
            con.commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean rollbackDB() {
        try {
            con.rollback();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public ResultSet consultar(String nombreTabla) {
        String query = "SELECT *FROM" + nombreTabla;

        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ResultSet consultarVista(String nombreTabla) {
        String query = "SELECT *FROM vista" + nombreTabla;

        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet consultarXID(String nombreTabla, int id) {
        String query = "SELECT *FROM" + nombreTabla + "WHERE id" + nombreTabla + " = " + id;

        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet consultarWhere(String nombreTabla, String condiciones) {
        String query = "SELECT *FROM" + nombreTabla + "WHERE " + condiciones;

        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int insertar(String nombreTabla, String[] columnas, String[] valores) {
        StringBuilder query = new StringBuilder("INSERT INTO");
        query.append(nombreTabla);
        query.append(" (");
        for (int i = 0;i < columnas.length;i++){
            query.append(columnas[i]);
            if (i!=(columnas.length-1))
                query.append(", ");
            
        }
        query.append(") VALUES (" );
        for (int i = 0;i < valores.length;i++){
            query.append(valores[i]);
            if (i!=(valores.length-1))
                query.append(", ");
            
        }
        query.append(" )");
       
        try {

            stmt = con.createStatement();
            rs= stmt.executeQuery(query.toString());
            
            return rs.getInt("id"+ nombreTabla);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }

    }
    
    
public boolean actualizar(String nombreTabla, String[] columnas, String[] valores,int id) {
        StringBuilder query = new StringBuilder("UPDATE");
        query.append(nombreTabla);
        query.append(" (");
        for (int i = 0;i < columnas.length;i++){
            query.append(columnas[i]);
            if (i!=(columnas.length-1))
                query.append(", ");
            
        }
        query.append(") VALUES (" );
        for (int i = 0;i < valores.length;i++){
            query.append(valores[i]);
            if (i!=(valores.length-1))
                query.append(", ");
            
        }
        query.append(" )");
       
        try {

            stmt = con.createStatement();
            stmt.execute(query.toString());
            return true;
            //return rs.getInt("id"+ nombreTabla);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }    
public boolean eliminar(String nombreTabla,int id) {
        StringBuilder query = new StringBuilder("DELETE FROM ");
        query.append(nombreTabla);
        query.append("WHERE id");
        query.append(nombreTabla);
        query.append("=");
        query.append(id);
        try {

            stmt = con.createStatement();
            return stmt.execute(query.toString());

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    } 
}
