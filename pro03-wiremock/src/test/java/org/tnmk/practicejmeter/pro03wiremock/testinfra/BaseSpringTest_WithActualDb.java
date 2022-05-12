package org.tnmk.practicejmeter.pro03wiremock.testinfra;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.tnmk.practicejmeter.pro03wiremock.Pro03WiremockApplication;

@ActiveProfiles("test")
@SpringBootTest(classes = { Pro03WiremockApplication.class })
//@ContextConfiguration(initializers = DBContainerContextInitializer.class)
public abstract class BaseSpringTest_WithActualDb {
}
