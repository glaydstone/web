package br.com.glaydstone.empresa.mb.controleacesso;


import br.com.glaydstone.empresa.bo.controleacesso.AcessoSistemaBO;
import br.com.glaydstone.empresa.modelo.controleacesso.AcessoSistema;
import br.com.glaydstone.empresa.util.SessaoUtils;
import java.io.Serializable;
import com.xpert.core.crud.AbstractBaseBean;
import com.xpert.core.crud.AbstractBusinessObject;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.xpert.persistence.query.Restriction;
import com.xpert.persistence.query.Restrictions;
import java.util.List;

/**
 *
 * @author ayslan
 */
@ManagedBean
@ViewScoped
public class AcessoSistemaUsuarioMB extends AbstractBaseBean<AcessoSistema> implements Serializable {

    @EJB
    private AcessoSistemaBO acessoSistemaBO;

    @Override
    public AbstractBusinessObject getBO() {
        return acessoSistemaBO;
    }

    @Override
    public String getDataModelOrder() {
        return "id DESC";
    }

    @Override
    public List<Restriction> getDataModelRestrictions() {
        return new Restrictions().add("usuario", SessaoUtils.getUser());
    }
    
    
}
