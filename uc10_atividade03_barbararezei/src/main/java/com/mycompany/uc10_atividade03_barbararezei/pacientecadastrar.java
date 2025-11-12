
package com.mycompany.uc10_atividade03_barbararezei;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class pacientecadastrar {
    
    
     public static void cadastrar(paciente p )
    {
    EntityManager manager = JPAUtil.conectar();
        
  
    
    try{
       manager.getTransaction().begin();
       manager.persist(p);
       manager.getTransaction().commit();
    
   }catch(Exception e )
   {
       manager.getTransaction().rollback();
   }finally
    {
        JPAUtil.desconectar();
    }
    }
     
    
    
}
