
package com.mycompany.uc10_atividade03_barbararezei;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "incidente")
public class incidente {
    
    @Id
    @Column(name = "idincidente")
    private int idincidente;
    private int idpaciente;
    private String data;
    private String hora;
    private String relato;
  

    public incidente() {
    }

    public incidente(int idincidente, int idpaciente, String data, String hora, String relato) {
        this.idincidente = idincidente;
        this.idpaciente = idpaciente;
        this.data = data;
        this.hora = hora;
        this.relato = relato;
        
    }

   

    public int getIdincidente() {
        return idincidente;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public String getRelato() {
        return relato;
    }

    public void setIdincidente(int idincidente) {
        this.idincidente = idincidente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setRelato(String relato) {
        this.relato = relato;
    }

    
    
    
    
}
