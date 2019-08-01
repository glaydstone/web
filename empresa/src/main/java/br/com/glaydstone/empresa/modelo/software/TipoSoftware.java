/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glaydstone.empresa.modelo.software;

import com.xpert.i18n.I18N;

/**
 *
 * @author glaydstone
 */
public enum TipoSoftware {
    SO("tipoSoftware.so"),
    OFFICE("tipoSoftware.office"),
    UTILITARIO("tipoSoftware.utilitario");
    
    private String descricao;
    
    private TipoSoftware(String descricao){
        this.descricao = descricao;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return I18N.get(descricao);
    }
    
    
    
}
