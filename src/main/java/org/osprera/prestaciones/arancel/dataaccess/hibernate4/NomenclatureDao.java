package org.osprera.prestaciones.arancel.dataaccess.hibernate4;

import org.osprera.prestaciones.arancel.dataaccess.INomenclatureDao;
import org.osprera.prestaciones.arancel.entity.Nomenclature;
import org.springframework.stereotype.Repository;

/**
 * Created by Lucas on 27/06/2017.
 */
@Repository
public class NomenclatureDao extends AbstractHibernateDao<Nomenclature> implements INomenclatureDao{

    public NomenclatureDao(){
        setClazz(Nomenclature.class);
    }
}
