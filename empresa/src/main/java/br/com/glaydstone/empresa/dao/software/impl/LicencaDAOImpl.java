package br.com.glaydstone.empresa.dao.software.impl;

import br.com.glaydstone.empresa.application.BaseDAOImpl;
import br.com.glaydstone.empresa.dao.software.LicencaDAO;
import br.com.glaydstone.empresa.modelo.software.Licenca;
import javax.ejb.Stateless;

/**
 *
 * @author #Author
 */
@Stateless
public class LicencaDAOImpl extends BaseDAOImpl<Licenca> implements LicencaDAO {

    @Override
    public Class getEntityClass() {
        return Licenca.class;
    }

}
