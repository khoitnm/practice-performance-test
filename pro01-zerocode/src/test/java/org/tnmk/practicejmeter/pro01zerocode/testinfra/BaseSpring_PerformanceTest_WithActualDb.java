package org.tnmk.practicejmeter.pro01zerocode.testinfra;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.tnmk.practicejmeter.pro01zerocode.Pro01ZerocodeApplication;

@ActiveProfiles("performancetest")
@AutoConfigureMockMvc
@SpringBootTest(classes = { Pro01ZerocodeApplication.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class BaseSpring_PerformanceTest_WithActualDb {
}
