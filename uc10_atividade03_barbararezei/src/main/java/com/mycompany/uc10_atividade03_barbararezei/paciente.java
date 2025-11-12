
package com.mycompany.uc10_atividade03_barbararezei;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "paciente")
public class paciente {
    
    @Id
    @Column(name = "idpaciente")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     private int idpaciente;
    private String nome;
    private String idade; 
    private String condicao; 
    private String remedio;
    private String infremedio;

    public paciente() {
    }

    public paciente(int idpaciente, String nome, String idade, String condicao, String remedio, String infremedio) {
        this.idpaciente = idpaciente;
        this.nome = nome;
        this.idade = idade;
        this.condicao = condicao;
        this.remedio = remedio;
        this.infremedio = infremedio;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public String getCondicao() {
        return condicao;
    }

    public String getRemedio() {
        return remedio;
    }

    public String getInfremedio() {
        return infremedio;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public void setRemedio(String remedio) {
        this.remedio = remedio;
    }

    public void setInfremedio(String infremedio) {
        this.infremedio = infremedio;
    }
    
    
    
}
