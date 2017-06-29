package org.osprera.prestaciones.arancel.dataaccess.hibernate4;

import org.osprera.prestaciones.arancel.entity.NomenclatedPraxis;
import org.springframework.stereotype.Repository;

/**
 * Created by Lucas on 28/06/2017.
 */
@Repository
public class NomenclatedPraxisDao extends AbstractHibernateDao<NomenclatedPraxis> {
    public NomenclatedPraxisDao() {
        this.setClazz(NomenclatedPraxis.class);
    }
}
