package org.osprera.prestaciones.arancel.bo;

import org.osprera.prestaciones.arancel.dataaccess.INomenclatureDao;
import org.osprera.prestaciones.arancel.entity.Nomenclature;
import org.osprera.prestaciones.arancel.entity.Praxis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Lucas on 27/06/2017.
 */
@Service
public class NomenclatureBO {

    @Autowired
    INomenclatureDao nomenclatureDao;

    @Transactional
    public void save(Nomenclature nomenclature){
        nomenclatureDao.save(nomenclature);
    }

    @Transactional
    public void addPraxis(Praxis praxis,Nomenclature nomenclature){

    }
}
