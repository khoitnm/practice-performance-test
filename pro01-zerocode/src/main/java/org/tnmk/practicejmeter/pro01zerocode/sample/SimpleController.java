package org.tnmk.practicejmeter.pro01zerocode.sample;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SimpleController {

  private final SimpleRepository simpleRepository;

  @GetMapping("/api/v1/pro01-zerocode/simple-entities/all")
  public List<SimpleEntity> findAll() {
    return simpleRepository.findAll();
  }
}
