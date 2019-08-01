package br.com.glaydstone.empresa.dao.email.impl;

import br.com.glaydstone.empresa.application.BaseDAOImpl;
import br.com.glaydstone.empresa.dao.email.ConfiguracaoEmailDAO;
import br.com.glaydstone.empresa.modelo.email.ConfiguracaoEmail;
import javax.ejb.Stateless;

/**
 *
 * @author ayslan
 */
@Stateless
public class ConfiguracaoEmailDAOImpl extends BaseDAOImpl<ConfiguracaoEmail> implements ConfiguracaoEmailDAO {

    @Override
    public Class getEntityClass() {
        return ConfiguracaoEmail.class;
    }
}
