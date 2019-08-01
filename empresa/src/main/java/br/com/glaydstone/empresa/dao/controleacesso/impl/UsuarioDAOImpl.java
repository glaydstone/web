package br.com.glaydstone.empresa.dao.controleacesso.impl;

import br.com.glaydstone.empresa.application.BaseDAOImpl;
import br.com.glaydstone.empresa.dao.controleacesso.UsuarioDAO;
import br.com.glaydstone.empresa.modelo.controleacesso.SituacaoUsuario;
import br.com.glaydstone.empresa.modelo.controleacesso.Usuario;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Ayslan
 */
@Stateless
public class UsuarioDAOImpl extends BaseDAOImpl<Usuario> implements UsuarioDAO {

    @Override
    public Class getEntityClass() {
        return Usuario.class;
    }

    @Override
    public List<Usuario> getUsuariosAtivos() {
        return list("situacaoUsuario", SituacaoUsuario.ATIVO, "nome");
    }
    
    
}
