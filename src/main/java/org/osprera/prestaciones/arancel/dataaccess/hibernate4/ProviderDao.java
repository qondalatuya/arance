package org.osprera.prestaciones.arancel.dataaccess.hibernate4;

import org.osprera.prestaciones.arancel.entity.Provider;
import org.springframework.stereotype.Repository;

/**
 * Created by Lucas on 28/06/2017.
 */
@Repository
public class ProviderDao extends AbstractHibernateDao<Provider>{

    public ProviderDao(){
        this.setClazz(Provider.class);
    }
}
