/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glaydstone.empresa.modelo.software;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author glaydstone
 */
@Entity
public class Licenca implements Serializable{
    @Id
    @SequenceGenerator(name = "Licenca",allocationSize = 1,sequenceName = "licenca_id_seq")
    @GeneratedValue(generator = "Licenca")
    private Long id;
    
    @NotBlank
    private String nomeSoftware;
    
    @Column(length = 50)
    @Enumerated(EnumType.STRING)
    private TipoSoftware tipoSoftware;
    
    @NotBlank
    private String serial;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataExpriracao;

    
    
    @Override
    public String toString() {
        return nomeSoftware ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Licenca other = (Licenca) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nomeSoftware
     */
    public String getNomeSoftware() {
        return nomeSoftware;
    }

    /**
     * @param nomeSoftware the nomeSoftware to set
     */
    public void setNomeSoftware(String nomeSoftware) {
        this.nomeSoftware = nomeSoftware;
    }

    /**
     * @return the tipoSoftware
     */
    public TipoSoftware getTipoSoftware() {
        return tipoSoftware;
    }

    /**
     * @param tipoSoftware the tipoSoftware to set
     */
    public void setTipoSoftware(TipoSoftware tipoSoftware) {
        this.tipoSoftware = tipoSoftware;
    }

    /**
     * @return the serial
     */
    public String getSerial() {
        return serial;
    }

    /**
     * @param serial the serial to set
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * @return the dataExpriracao
     */
    public Date getDataExpriracao() {
        return dataExpriracao;
    }

    /**
     * @param dataExpriracao the dataExpriracao to set
     */
    public void setDataExpriracao(Date dataExpriracao) {
        this.dataExpriracao = dataExpriracao;
    }

  

    
    
    
    
}
