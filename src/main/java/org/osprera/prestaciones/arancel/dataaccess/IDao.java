package org.osprera.prestaciones.arancel.dataaccess;

public interface IDao<K>{
  
  void save(K k);
  void delete (K k);
  K update (K k);
  K getById(long id);
  
}
