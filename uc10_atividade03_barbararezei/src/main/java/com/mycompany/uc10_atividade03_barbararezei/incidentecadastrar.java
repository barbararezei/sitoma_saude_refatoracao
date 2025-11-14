
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


public class incidentecadastrar {
    
     public boolean cadastrar(incidente i )
    {
    EntityManager manager = JPAUtil.conectar();
        
  /**
   * codigo mudado para teste 
   */
    
    try{
       manager.getTransaction().begin();
       manager.persist(i);
       manager.getTransaction().commit();
        return true;
    
   }catch(Exception e )
   {
       manager.getTransaction().rollback();
       return false;
   }finally
    {
        JPAUtil.desconectar();
    }
    }
     
     
    
     
    
}



