
package com.mycompany.uc10_atividade03_barbararezei;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*excluir tudoooooo */

public class conecaobuscarid {
    
    private Connection conexao;

    public Connection getConexao() {
        return conexao;
    }
    
    public void conectar()  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //"localhost/[nome_do_banco]", "[nome_do_usuario]", "[senha_do_usuario]"
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/sintomasaude","root","Gideon69*");
            System.out.println("SUCESSO DE CONEXÃO!");
        }catch (ClassNotFoundException cn) {
            System.out.println("Falha ao conectar com o banco " + cn);
        }catch (SQLException sql) {
            System.out.println("Erro de SQL: " + sql);
        }
    }
    
    public void desconectar(){
        try {
            if(conexao != null && !conexao.isClosed()) {
                conexao.close();
                System.out.println("DESCONECTADO!");
            }
        }catch(SQLException se) {
            System.out.println("Problema ao desconectar do banco: " + se);
        }
    }
    
}
