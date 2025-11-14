
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
    
    
     public  boolean cadastrar(paciente p )
    {
    EntityManager manager = JPAUtil.conectar();
    /**
     * codigo alterado para etapa de testes 
     */
        
  
    
    try{
       manager.getTransaction().begin();
       manager.persist(p);
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
