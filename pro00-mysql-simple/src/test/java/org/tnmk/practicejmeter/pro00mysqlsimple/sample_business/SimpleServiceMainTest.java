package org.tnmk.practicejmeter.pro00mysqlsimple.sample_business;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.tnmk.practicejmeter.pro00mysqlsimple.testinfra.BaseSpringTest_WithTestContainer;

import java.util.Optional;
import java.util.UUID;

@Slf4j
public class SimpleServiceMainTest extends BaseSpringTest_WithTestContainer {
  @Autowired
  private SimpleService simpleServiceMain;

  @Autowired
  private SimpleRepository simpleRepository;

  @Test
  public void test_when_everything_is_saved_successfully() {
    // Given
    SimpleEntity simpleEntity = new SimpleEntity("Name" + UUID.randomUUID());

    // When
    SimpleEntity result = simpleServiceMain.saveEntities(simpleEntity);

    // Then
    assertExist(result.getId(), true);
  }

  private void assertExist(long entityId, boolean expectExist) {
    Optional<SimpleEntity> sampleEntityOptional = simpleRepository.findById(entityId);

    Assertions.assertEquals(expectExist, sampleEntityOptional.isPresent());
    log.info("SampleEntity: " + sampleEntityOptional.get());

  }
}
