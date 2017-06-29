package org.osprera.prestaciones.arancel.bo;

import org.osprera.prestaciones.arancel.dataaccess.IProviderDao;
import org.osprera.prestaciones.arancel.entity.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Lucas on 28/06/2017.
 */

@Service
public class ProviderBO {
    @Autowired
    IProviderDao providerDao;

    @Transactional
    public void save(Provider provider){
        providerDao.save(provider);
    }

}
