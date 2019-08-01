package br.com.glaydstone.empresa.dao.controleacesso.impl;

import br.com.glaydstone.empresa.application.BaseDAOImpl;
import br.com.glaydstone.empresa.dao.controleacesso.HistoricoSituacaoUsuarioDAO;
import br.com.glaydstone.empresa.modelo.controleacesso.HistoricoSituacaoUsuario;
import javax.ejb.Stateless;

/**
 *
 * @author ayslan
 */
@Stateless
public class HistoricoSituacaoUsuarioDAOImpl extends BaseDAOImpl<HistoricoSituacaoUsuario> implements HistoricoSituacaoUsuarioDAO {

    @Override
    public Class getEntityClass() {
        return HistoricoSituacaoUsuario.class;
    }
}
