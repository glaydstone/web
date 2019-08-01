package br.com.glaydstone.empresa.dao.email;

import com.xpert.persistence.dao.BaseDAO;
import br.com.glaydstone.empresa.modelo.email.ConfiguracaoEmail;
import javax.ejb.Local;

/**
 *
 * @author ayslan
 */
@Local
public interface ConfiguracaoEmailDAO extends BaseDAO<ConfiguracaoEmail> {
    
}
