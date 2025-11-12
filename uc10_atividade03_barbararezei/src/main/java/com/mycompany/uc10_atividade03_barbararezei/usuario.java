
package com.mycompany.uc10_atividade03_barbararezei;
import jakarta.persistence.Entity;
  import jakarta.persistence.GeneratedValue;
  import jakarta.persistence.GenerationType;
  import jakarta.persistence.Id;
  import java.time.LocalDate;

@Entity(name="usuario")
public class usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String login;
    private String senha;
    private String tipo;

    public usuario() {
    }

    public usuario(int id, String login, String senha, String tipo) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getTipo() {
        return tipo;
    }

   

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    
    
    
}
