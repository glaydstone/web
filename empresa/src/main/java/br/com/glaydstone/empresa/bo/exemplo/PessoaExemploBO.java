package br.com.glaydstone.empresa.bo.exemplo;

import com.xpert.core.crud.AbstractBusinessObject;
import br.com.glaydstone.empresa.dao.exemplo.PessoaExemploDAO;
import com.xpert.core.validation.UniqueField;
import com.xpert.core.exception.BusinessException;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import br.com.glaydstone.empresa.modelo.exemplo.PessoaExemplo;

/**
 *
 * @author ayslan
 */
@Stateless
public class PessoaExemploBO extends AbstractBusinessObject<PessoaExemplo> {

    @EJB
    private PessoaExemploDAO pessoaExemploDAO;
    
    @Override
    public PessoaExemploDAO getDAO() {
        return pessoaExemploDAO;
    }

    @Override
    public List<UniqueField> getUniqueFields() {
        return null;
    }

    @Override
    public void validate(PessoaExemplo pessoaExemplo) throws BusinessException {
    }

    @Override
    public boolean isAudit() {
        return true;
    }

}
