package org.tnmk.practicejmeter.pro0301wiremocksimpleapp.simple;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ExternalService {
  private final String serviceHost = "http://localhost:8081";
  private final RestTemplate restTemplate;

  public SimpleEntity findByName(String name) {
    String url = serviceHost + "/api/entity?name=" + name;
//    try {
      ResponseEntity<SimpleEntity> response = restTemplate.getForEntity(url, SimpleEntity.class);
      return response.getBody();
//    } catch (Exception ex) {
//
//    }
  }
}
