package org.tnmk.practicejmeter.pro00hsqlsimple.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.tnmk.practicejmeter.pro00hsqlsimple.sample.entity.SimpleEntity;

import javax.transaction.Transactional;

public interface SimpleRepository extends JpaRepository<SimpleEntity, Long> {
  @Modifying
  @Transactional
  void deleteByName(String name);
}
