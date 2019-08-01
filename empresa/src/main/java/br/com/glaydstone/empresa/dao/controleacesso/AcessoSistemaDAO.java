package br.com.glaydstone.empresa.dao.controleacesso;

import com.xpert.persistence.dao.BaseDAO;
import br.com.glaydstone.empresa.modelo.controleacesso.AcessoSistema;
import javax.ejb.Local;

/**
 *
 * @author ayslan
 */
@Local
public interface AcessoSistemaDAO extends BaseDAO<AcessoSistema> {
    
}
