package org.tnmk.practicejmeter.pro0301wiremocksimpleapp.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.tnmk.practicejmeter.pro0301wiremocksimpleapp.testinfra.BaseSpringTest_WithActualDb;

public class ExternalServiceTest extends BaseSpringTest_WithActualDb {

  @Autowired
  private ExternalService externalService;

  @Test
  public void test() {
    SimpleEntity entity = externalService.findByName("Name");
    Assertions.assertNotNull(entity);
  }

}
