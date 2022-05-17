package org.tnmk.practicejmeter.pro0301wiremocksimpleapp.testinfra;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.tnmk.practicejmeter.pro0301wiremocksimpleapp.Pro0301WiremockSimpleAppApplication;

@ActiveProfiles("test")
@SpringBootTest(classes = { Pro0301WiremockSimpleAppApplication.class })
//@ContextConfiguration(initializers = DBContainerContextInitializer.class)
public abstract class BaseSpringTest_WithActualDb {
}
