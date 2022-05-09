package org.tnmk.practicejmeter.pro02springgatling.simple;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.tnmk.practicejmeter.pro02springgatling.testinfra.BaseSpring_IntegrationTest_WithActualDb;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class SimpleController_IntegrationTest extends BaseSpring_IntegrationTest_WithActualDb {
  @Autowired
  private MockMvc mvc;

  @Test
  public void test() throws Exception {
    MvcResult mvcResult = mvc
        //when
        .perform(get("/api/v1/pro01-zerocode/simple-entities/all")
            .contentType(MediaType.APPLICATION_JSON)
        )

        //then
        .andExpect(status().is2xxSuccessful()).andReturn();
  }
}
