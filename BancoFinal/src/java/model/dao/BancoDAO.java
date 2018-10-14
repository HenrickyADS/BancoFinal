package model.dao;

import javax.jms.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Banco;


public class BancoDAO {
    
    public void create(Banco b){
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
    

        
        try {
stmt = (PreparedStatement) (PreparedStatment) con.prepareStatement("INSERT INTO contacorrente (cod_idContaCorrente, NumeroConta, CPF_Titular)VALUES(?,?,?) ");
stmt.setInt(1, b.getcod_idContaCorrente());
stmt.setInt(2, b.NumeroConta());
stmt.setInt(3, b.CPF_Titular());

stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar");
        }
            Logger.getLogger(BancoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
         
                        
        
        
    }

    private static class PreparedStatment {

        public PreparedStatment() {
        }
    }
    
}
