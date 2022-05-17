package org.tnmk.practicejmeter.pro0301wiremocksimpleapp.sample;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SimpleController {

  private final SimpleRepository simpleRepository;

  @GetMapping("/api/v1/pro03-01-wiremock-simple-app/simple-entities/all")
  public List<SimpleEntity> findAll() {
    return simpleRepository.findAll();
  }
}
