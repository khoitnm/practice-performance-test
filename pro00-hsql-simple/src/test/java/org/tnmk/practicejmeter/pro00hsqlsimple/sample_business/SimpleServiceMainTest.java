package org.tnmk.practicejmeter.pro00hsqlsimple.sample_business;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.tnmk.practicejmeter.pro00hsqlsimple.sample.entity.SimpleEntity;
import org.tnmk.practicejmeter.pro00hsqlsimple.sample.repository.SimpleRepository;
import org.tnmk.practicejmeter.pro00hsqlsimple.sample.story.SimpleService;
import org.tnmk.practicejmeter.pro00hsqlsimple.testinfra.BaseSpringTest_WithActualDb;

import java.util.Optional;
import java.util.UUID;

@Slf4j
public class SimpleServiceMainTest extends BaseSpringTest_WithActualDb {

  @Autowired
  private SimpleRepository simpleRepository;

  @Test
  public void test_when_everything_is_saved_successfully() {
    // Given
    SimpleEntity simpleEntity = new SimpleEntity("Name" + UUID.randomUUID());

    // When
    SimpleEntity result = simpleRepository.save(simpleEntity);

    // Then
    assertExist(result.getSampleEntityId(), true);
  }

  private void assertExist(long entityId, boolean expectExist) {
    Optional<SimpleEntity> sampleEntityOptional = simpleRepository.findById(entityId);

    Assertions.assertEquals(expectExist, sampleEntityOptional.isPresent());
    log.info("SampleEntity: " + sampleEntityOptional.get());

  }
}
