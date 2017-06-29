package org.osprera.prestaciones.arancel.dataaccess.hibernate4;

import org.osprera.prestaciones.arancel.entity.Priceable;
import org.springframework.stereotype.Repository;

/**
 * Created by Lucas on 28/06/2017.
 */
@Repository
public class PriceableDao extends AbstractHibernateDao<Priceable> {

    public PriceableDao() {
        setClazz(Priceable.class);
    }
}
