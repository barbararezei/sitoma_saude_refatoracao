
package com.mycompany.uc10_atividade03_barbararezei;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.sql.SQLException;
import java.util.List;


public class usuarioJPA {
    
    public static usuario validarusuario(usuario u)
    {
        
        EntityManager manager = JPAUtil.conectar();
        
        try
        {
           
            Query consulta = manager.createQuery
        ("SELECT u FROM usuario u WHERE u.login = :login AND u.senha = :senha");
            consulta.setParameter("login", u.getLogin());
            consulta.setParameter("senha", u.getSenha());
            List<usuario> listausers = consulta.getResultList();
            if(!listausers.isEmpty())
            {
                return listausers.get(0);
            }
            
        }catch (Exception  se )
        {
            manager.getTransaction().rollback();
        }finally
        {
            JPAUtil.desconectar();
        }
        return null;
        
    }
    
    
    public static void cadastrar(usuario u) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            manager.persist(u);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }
    }
    
}
