package org.tnmk.practicejmeter.pro02springgatling.testinfra;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.tnmk.practicejmeter.pro02springgatling.Pro02SpringGatlingApplication;

@ActiveProfiles("test")
@SpringBootTest(classes = { Pro02SpringGatlingApplication.class })
//@ContextConfiguration(initializers = DBContainerContextInitializer.class)
public abstract class BaseSpringTest_WithActualDb {
}
