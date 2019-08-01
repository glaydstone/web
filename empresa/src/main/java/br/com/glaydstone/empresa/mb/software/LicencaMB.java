package br.com.glaydstone.empresa.mb.software;

import br.com.glaydstone.empresa.bo.software.LicencaBO;
import br.com.glaydstone.empresa.dao.software.LicencaDAO;
import java.io.Serializable;
import com.xpert.core.crud.AbstractBaseBean;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.glaydstone.empresa.modelo.software.Licenca;
import java.util.List;



/**
 *
 * @author #Author
 */
@ManagedBean
@ViewScoped
public class LicencaMB extends AbstractBaseBean<Licenca> implements Serializable {

    @EJB
    private LicencaBO licencaBO;
    private LicencaDAO licencaDAO;
    private List<Licenca> licencas ;
    @Override
    public LicencaBO getBO() {
        return licencaBO;
    }

    @Override
    public String getDataModelOrder() {
        return "dataExpriracao";
    }

   
    

}
