
package com.mycompany.uc10_atividade03_barbararezei;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JPAUtil {
    
    private static String PERSISTENCE_UNIT = "sintomasaude-pu";
    
    private static EntityManager gerente;
    private static EntityManagerFactory fabrica;
    
     private Connection conexao;

    public Connection getConexao() {
        return conexao;
    }
    
    public static EntityManager conectar()
    {
    
    if(fabrica == null || !fabrica.isOpen()) 
    {
    fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
    }
    
    if(gerente == null || !gerente.isOpen())
    {
        
      gerente = fabrica.createEntityManager();
    
    }
   
    return gerente;
   }
    
     public void conectarespecial()  {
         
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
    
    
    
    
    public static void desconectar()
    {
          if(gerente.isOpen() && gerente != null)
          {
              gerente.close();
              fabrica.close();
          }
   
    
    }
}
