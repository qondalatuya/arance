package org.osprera.prestaciones.arancel.bo;

import org.osprera.prestaciones.arancel.dataaccess.IPraxisDao;
import org.osprera.prestaciones.arancel.entity.Praxis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Lucas on 27/06/2017.
 */
@Service
public class PraxisBO {

    @Autowired
    IPraxisDao praxisDao;


    @Transactional
    public void save(Praxis praxis){
        praxisDao.save(praxis);
    }

    @Transactional
    public void update(Praxis praxis){
        praxisDao.update(praxis);
    }


}
