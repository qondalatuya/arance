package org.osprera.prestaciones.arancel.test;

import org.osprera.prestaciones.arancel.dataaccess.PraxisBO;
import org.osprera.prestaciones.arancel.dataaccess.hibernate4.PraxisDao;
import org.osprera.prestaciones.arancel.entity.Praxis;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 d
 */
public class SpringSimpleTest {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        PraxisBO pradao = (PraxisBO) context.getBean("praxisBO");
        Praxis pra = new Praxis();

        pra.setCode(420101);
        pra.setName("Consulta");
        pradao.save(pra);

    }
}
