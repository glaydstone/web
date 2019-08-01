package br.com.glaydstone.empresa.dao.controleacesso.impl;

import br.com.glaydstone.empresa.application.BaseDAOImpl;
import br.com.glaydstone.empresa.dao.controleacesso.PerfilDAO;
import br.com.glaydstone.empresa.modelo.controleacesso.Perfil;
import br.com.glaydstone.empresa.modelo.controleacesso.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author Ayslan
 */
@Stateless
public class PerfilDAOImpl extends BaseDAOImpl<Perfil> implements PerfilDAO {

    @Override
    public Class getEntityClass() {
        return Perfil.class;
    }

    @Override
    public List<Perfil> getPerfis(Usuario usuario) {

        String queryString = "SELECT perfis FROM " + Usuario.class.getName() + " u WHERE u =?1 ";
        Query query = getEntityManager().createQuery(queryString);
        query.setParameter(1, usuario);

        return query.getResultList();

    }
}
