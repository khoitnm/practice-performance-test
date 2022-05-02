package org.tnmk.practicejmeter.pro00mysqlsimple.testinfra;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.tnmk.practicejmeter.pro00mysqlsimple.testinfra.dbtestcontainer.DBContainerContextInitializer;
import org.tnmk.practicejmeter.pro00mysqlsimple.Pro00MysqlSimpleApplication;

@ActiveProfiles("testcontainer")
@SpringBootTest(classes = { Pro00MysqlSimpleApplication.class })
@ContextConfiguration(initializers = DBContainerContextInitializer.class)
public abstract class BaseSpringTest_WithTestContainer {
}
