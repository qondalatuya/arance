package org.osprera.prestaciones.arancel.test;

import org.osprera.prestaciones.arancel.bo.NomenclatureBO;
import org.osprera.prestaciones.arancel.bo.PraxisBO;
import org.osprera.prestaciones.arancel.entity.Nomenclature;
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
        NomenclatureBO nomenclatureBO = (NomenclatureBO) context.getBean("nomenclatureBO");

        Nomenclature nomenclature = new Nomenclature();
        nomenclature.setName("ACLYSA");


        Praxis pra = new Praxis();
        pra.setCode(420101);
        pra.setName("Consulta");
        pradao.save(pra);

        //hay que ver la forma correcta de inicializar la coleccion
        nomenclature.getPraxises().add(pra);

        nomenclatureBO.save(nomenclature);






    }
}
