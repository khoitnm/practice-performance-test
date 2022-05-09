package org.tnmk.practicejmeter.pro01zerocode.sample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.tnmk.practicejmeter.pro01zerocode.sample.SimpleEntity;

import javax.transaction.Transactional;

public interface SimpleRepository extends JpaRepository<SimpleEntity, Long> {
  @Modifying
  @Transactional
  void deleteByName(String name);
}
