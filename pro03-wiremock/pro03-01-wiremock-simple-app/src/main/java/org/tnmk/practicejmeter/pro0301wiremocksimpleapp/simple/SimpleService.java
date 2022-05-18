package org.tnmk.practicejmeter.pro0301wiremocksimpleapp.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional // Without this, the service cannot commit transaction, hence cannot create/update/delete items
@Service
public class SimpleService {
  @Autowired
  private SimpleRepository simpleRepository;

  public SimpleEntity createSample() {
    SimpleEntity simpleEntity = new SimpleEntity();
    simpleEntity.setName("AAA");
    simpleEntity = simpleRepository.save(simpleEntity);

    return simpleEntity;
  }
}
