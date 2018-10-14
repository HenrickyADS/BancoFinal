package connection;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Ramos
 */
public class ConnectyFactory {
    
   private static final String DRIVER ="com.mysql.jdbc.Driver";
   private static final String URL ="jdbc:mysql://localhost:3306/dbBanco";
   private static final String USER ="root";
   private static final String PASS ="123456";
   
   public static Connection getConnection(){
       try {
           Class.forName(DRIVER);
           return DriverManager.getConnection(URL, USER, PASS);
       } catch (SQLException | ClassNotFoundException ex) {
           throw new RuntimeException("Erro na conexão: " + ex.getMessage());
       }
    }
    
    public static void closeConection(Connection con){
        if (con != null) {
            try {
                con.close();
            } catch (Exception ex) {
                throw new RuntimeException("Erro na conexão: " + ex);
            }
            
        }
    
    }
    
    public static void closeConection(Connection con, PreparedStatement stmt){
        if (con != null && stmt != null) {
            try {
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                throw new RuntimeException("Erro na conexão: " + ex);
            }
            
        }
    
    }        
    public static void closeConection(Connection con, PreparedStatement stmt, ResultSet rs){
        if (con != null && stmt != null && rs != null) {
            try {
                rs.close();
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                throw new RuntimeException("Erro na conexão: " + ex);
            }
            
        }
    
    }
}