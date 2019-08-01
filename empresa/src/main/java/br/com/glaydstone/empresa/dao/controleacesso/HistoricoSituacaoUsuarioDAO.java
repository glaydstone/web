package br.com.glaydstone.empresa.dao.controleacesso;

import com.xpert.persistence.dao.BaseDAO;
import br.com.glaydstone.empresa.modelo.controleacesso.HistoricoSituacaoUsuario;
import javax.ejb.Local;

/**
 *
 * @author ayslan
 */
@Local
public interface HistoricoSituacaoUsuarioDAO extends BaseDAO<HistoricoSituacaoUsuario> {
    
}
