package br.com.glaydstone.empresa.dao.exemplo;

import com.xpert.persistence.dao.BaseDAO;
import br.com.glaydstone.empresa.modelo.exemplo.PessoaExemplo;
import javax.ejb.Local;

/**
 *
 * @author ayslan
 */
@Local
public interface PessoaExemploDAO extends BaseDAO<PessoaExemplo> {
    
}
