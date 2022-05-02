package org.tnmk.practicejmeter.pro00hsqlsimple.testinfra;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.tnmk.practicejmeter.pro00hsqlsimple.Pro00HsqlSimpleApplication;

@ActiveProfiles("test")
@SpringBootTest(classes = { Pro00HsqlSimpleApplication.class })
//@ContextConfiguration(initializers = DBContainerContextInitializer.class)
public abstract class BaseSpringTest_WithActualDb {
}
