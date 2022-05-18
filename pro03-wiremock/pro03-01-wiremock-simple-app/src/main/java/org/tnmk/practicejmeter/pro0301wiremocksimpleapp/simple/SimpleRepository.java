package org.tnmk.practicejmeter.pro0301wiremocksimpleapp.simple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;

public interface SimpleRepository extends JpaRepository<SimpleEntity, Long> {
  @Modifying
  @Transactional
  void deleteByName(String name);
}
