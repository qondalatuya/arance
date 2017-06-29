package org.osprera.prestaciones.arancel.dataaccess.hibernate4;

import org.osprera.prestaciones.arancel.entity.Tariff;
import org.springframework.stereotype.Repository;

/**
 * Created by Lucas on 28/06/2017.
 */
@Repository
public class TariffDao extends AbstractHibernateDao<Tariff> {

    public TariffDao() {
        this.setClazz(Tariff.class);
    }
}
