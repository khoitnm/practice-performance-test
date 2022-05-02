package org.tnmk.practicejmeter.pro00mysqlsimple.testinfra.dbtestcontainer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.invoke.MethodHandles;

public class DBContainerContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

  private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  public void initialize(final ConfigurableApplicationContext configurableApplicationContext) {
    logger.info("DBContainerTest"
        + "\nJdbcUrl:\t" + DBContainerStarter.DB_CONTAINER.getJdbcUrl()
        + "\nusername:\t" + DBContainerStarter.DB_CONTAINER.getUsername()
        + "\npassword:\t" + DBContainerStarter.DB_CONTAINER.getPassword());
    TestPropertyValues.of(
        "spring.datasource.url=" + DBContainerStarter.DB_CONTAINER.getJdbcUrl(),
        "spring.datasource.username=" + DBContainerStarter.DB_CONTAINER.getUsername(),
        "spring.datasource.password=" + DBContainerStarter.DB_CONTAINER.getPassword(),

        // The root username is hardcoded inside {@link MySQLContainer#MYSQL_ROOT_USER}
        "spring.sql.init.username=root",
        "spring.sql.init.password=" + DBContainerStarter.ROOT_PASSWORD
    ).applyTo(configurableApplicationContext.getEnvironment());
  }
}