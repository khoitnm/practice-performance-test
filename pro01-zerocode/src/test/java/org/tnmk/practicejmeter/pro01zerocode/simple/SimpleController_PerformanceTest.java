package org.tnmk.practicejmeter.pro01zerocode.simple;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.tnmk.practicejmeter.pro01zerocode.simple.testdata.SimpleEntityFactory;
import org.tnmk.practicejmeter.pro01zerocode.testinfra.BaseSpring_PerformanceTest_WithActualDb;

import java.util.List;

import static org.mockito.Mockito.when;

/**
 * This file will demonstrate how we can do performance test for our Rest API with some mock logic.
 *
 * Note: all example code with ZeroCode TDD are using JUnit 4 instead of JUnit 5.
 * And we also have to use {@link RunWith} annotation from JUnit 4, too!
 */
@RunWith(ZeroCodeUnitRunner.class)
public class SimpleController_PerformanceTest extends BaseSpring_PerformanceTest_WithActualDb {

  @MockBean
  private SimpleRepository simpleRepository;

  @Test
  @Scenario("testcases/simple/simple__when_find-all-entities__then_success.json")
  public void test() throws Exception {
    // GIVEN
    List<SimpleEntity> mockedSimpleEntitiesInDB = SimpleEntityFactory.createEntities(2);
    when(simpleRepository.findAll()).thenReturn(mockedSimpleEntitiesInDB);

    //    // WHEN
    //    MvcResult mvcResult = mvc
    //        //when
    //        .perform(get("/api/v1/pro01-zerocode/simple-entities/all")
    //            .contentType(MediaType.APPLICATION_JSON)
    //        )
    //
    //        //then
    //        .andExpect(status().is2xxSuccessful()).andReturn();
  }
}
