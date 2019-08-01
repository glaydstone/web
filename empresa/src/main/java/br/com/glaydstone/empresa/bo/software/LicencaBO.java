package br.com.glaydstone.empresa.bo.software;

import com.xpert.core.crud.AbstractBusinessObject;
import br.com.glaydstone.empresa.dao.software.LicencaDAO;
import com.xpert.core.validation.UniqueField;
import com.xpert.core.exception.BusinessException;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import br.com.glaydstone.empresa.modelo.software.Licenca;

/**
 *
 * @author #Author
 */
@Stateless
public class LicencaBO extends AbstractBusinessObject<Licenca> {

    @EJB
    private LicencaDAO licencaDAO;
    
    @Override
    public LicencaDAO getDAO() {
        return licencaDAO;
    }

    @Override
    public List<UniqueField> getUniqueFields() {
        return null;
    }

    @Override
    public void validate(Licenca licenca) throws BusinessException {
    }

    @Override
    public boolean isAudit() {
        return true;
    }

}
