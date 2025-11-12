
package com.mycompany.uc10_atividade03_barbararezei;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class pacientebuscarid {
    
     public int buscarIdPorNome(String nome) {
        String sql = "SELECT idpaciente FROM paciente WHERE nome = ?";
        int idpaciente = -1;
        
        try {
            
            JPAUtil jpa = new JPAUtil();
            jpa.conectarespecial();
            
            PreparedStatement stmt = jpa.getConexao().prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()) {
                idpaciente = rs.getInt("idpaciente");
            }
        }catch (SQLException se) {
            System.err.println("Erro ao buscar o idpaciente do paciente: " + se.getMessage());
        }
        return idpaciente;
    }
}
