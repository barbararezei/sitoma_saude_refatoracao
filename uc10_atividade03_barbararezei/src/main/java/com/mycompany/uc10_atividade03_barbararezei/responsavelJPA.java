
package com.mycompany.uc10_atividade03_barbararezei;

import jakarta.persistence.EntityManager;


public class responsavelJPA {
    
    
     public static void cadastrar(responsavel r )
    {
    EntityManager manager = JPAUtil.conectar();
        
  
    
    try{
       manager.getTransaction().begin();
       manager.persist(r);
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
