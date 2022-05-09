package org.tnmk.practicejmeter.pro02springgatling.sample;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SimpleController {

  private final SimpleRepository simpleRepository;

  @GetMapping("/api/v1/pro02-spring-gatling/simple-entities/all")
  public List<SimpleEntity> findAll() {
    return simpleRepository.findAll();
  }
}
