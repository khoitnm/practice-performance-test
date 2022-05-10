package org.tnmk.practicejmeter.pro02springgatling.simple;

import io.gatling.core.scenario.Simulation;
import io.gatling.core.structure.ScenarioBuilder;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.core.Predef.atOnceUsers;
import static io.gatling.core.Predef.scenario;
import static io.gatling.javaapi.http.HttpDsl.http;

public class SimpleController_PerformanceTest extends Simulation {

  public void test() {
    HttpProtocolBuilder httpProtocol = http
        .baseUrl("http://localhost:8080")
        .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
        .doNotTrackHeader("1")
        .acceptLanguageHeader("en-US,en;q=0.5")
        .acceptEncodingHeader("gzip, deflate")
        .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0");

    ScenarioBuilder scn = ((ScenarioBuilder) scenario("Scenario Name"))
        .exec(() -> {
          http("random_request")
              .get("/random");
            }
        );

    setUp(scn.inject(atOnceUsers(300)).protocols(httpProtocol));
  }
}