package org.osprera.prestaciones.arancel.dataaccess.hibernate4;

import org.osprera.prestaciones.arancel.dataaccess.IPraxisDao;
import org.osprera.prestaciones.arancel.entity.Praxis;
import org.springframework.stereotype.Repository;

/**
 * Created by Lucas on 27/06/2017.
 */

@Repository
public class PraxisDao extends AbstractHibernateDao<Praxis> implements IPraxisDao{

    public PraxisDao(){
        setClazz(Praxis.class);

    }
}
