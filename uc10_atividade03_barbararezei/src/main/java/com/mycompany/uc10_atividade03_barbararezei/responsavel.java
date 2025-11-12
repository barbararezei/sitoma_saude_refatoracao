
package com.mycompany.uc10_atividade03_barbararezei;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.logging.Logger;


@Entity
@Table (name = "responsavel")
public class responsavel {
    
    
    @Id
    @Column(name = "id_responsavel")
    private int id_responsavel;
    private String nome;
    private int idpaciente;

    public responsavel() {
    }

    public responsavel(int id_responsavel, String nome, int idpaciente) {
        this.id_responsavel = id_responsavel;
        this.nome = nome;
        this.idpaciente = idpaciente;
    }
    

    public int getId_responsavel() {
        return id_responsavel;
    }

    public String getNome() {
        return nome;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setId_responsavel(int id_responsavel) {
        this.id_responsavel = id_responsavel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

  
    
    
     
    
}
