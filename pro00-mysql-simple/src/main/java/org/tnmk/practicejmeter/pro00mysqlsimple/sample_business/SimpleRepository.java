package org.tnmk.practicejmeter.pro00mysqlsimple.sample_business;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SimpleRepository extends JpaRepository<SimpleEntity, Long> {
}
