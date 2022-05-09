package org.tnmk.practicejmeter.pro01zerocode.testinfra;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.tnmk.practicejmeter.pro01zerocode.Pro01ZerocodeApplication;

@ActiveProfiles("test")
@SpringBootTest(classes = { Pro01ZerocodeApplication.class })
//@ContextConfiguration(initializers = DBContainerContextInitializer.class)
public abstract class BaseSpringTest_WithActualDb {
}
