package org.tnmk.practicejmeter.pro0301wiremocksimpleapp.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.tnmk.practicejmeter.pro0301wiremocksimpleapp.testinfra.BaseSpringTest_WithActualDb;

/**
 * Before running this test case, we have to start the WireMock Docker first:
 * .\pro03-wiremock\pro03-02-wiremock-server\start-wiremock-docker.bat
 *
 */
public class ExternalServiceTest extends BaseSpringTest_WithActualDb {

  @Autowired
  private ExternalService externalService;

  @Test
  public void test() {
    SimpleEntity entity = externalService.findByName("Name");
    Assertions.assertNotNull(entity);
  }

}
