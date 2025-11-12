
package com.mycompany.uc10_atividade03_barbararezei;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;


public class incidentelistas {
     public static List<incidente> listar()
    {
        List<incidente> lista = new ArrayList<incidente>();
        EntityManager manager = JPAUtil.conectar();
        
        try
        {
            Query sql =  manager.createQuery("SELECT i FROM incidente i  ");
            lista = sql.getResultList();
            
        }catch(Exception e)
        {
            manager.getTransaction().rollback();
            
        }finally
        {
            JPAUtil.desconectar();
        }
        return lista;
        
    }
        
        
            
            
      
     
     
       public static List<incidente> listarbusca(String busca)
    {
       EntityManager manager = JPAUtil.conectar();
        List pac= null;
        
        try
        {
            Query sql =  manager.createQuery("SELECT i FROM incidente i " +"WHERE (:data is null OR i.data LIKE :data) ");
            sql.setParameter("data",busca.isEmpty() ? null : "%" + busca + "%" );
            
            pac = sql.getResultList();
        }catch(Exception e)
        {
            manager.getTransaction().rollback();
            
        }finally
        {
            JPAUtil.desconectar();
        }
        return pac;
        
    }
    
}
