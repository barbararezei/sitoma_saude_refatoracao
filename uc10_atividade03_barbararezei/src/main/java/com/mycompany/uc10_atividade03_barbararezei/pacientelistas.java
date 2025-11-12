
package com.mycompany.uc10_atividade03_barbararezei;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class pacientelistas {
     public static List<paciente> listar()
    {
        List<paciente> lista = new ArrayList<paciente>();
        EntityManager manager = JPAUtil.conectar();
        
        try
        {
            Query sql =  manager.createQuery("SELECT p FROM paciente p ");
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
    
    
    
    
       public static List<paciente> listarbusca(String busca)
    {
       
        EntityManager manager = JPAUtil.conectar();
        List pac= null;
        
        try
        {
            Query sql =  manager.createQuery("SELECT p FROM paciente p " +"WHERE (:nome is null OR p.nome LIKE :nome) ");
            sql.setParameter("nome",busca.isEmpty() ? null : "%" + busca + "%" );
            
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
