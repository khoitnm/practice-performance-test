package org.tnmk.practicejmeter.pro03wiremock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.tnmk.practicejmeter.pro03wiremock.sample.SimpleEntity;
import org.tnmk.practicejmeter.pro03wiremock.sample.SimpleRepository;

import javax.transaction.Transactional;

@Transactional // Without this, the service cannot commit transaction, hence cannot create/update/delete items
@Service
public class SimpleService {
  @Autowired
  private SimpleRepository simpleRepository;

  @EventListener(ApplicationStartedEvent.class)
  public SimpleEntity createSample() {
    SimpleEntity simpleEntity = new SimpleEntity();
    simpleEntity.setName("AAA");
    simpleEntity = simpleRepository.save(simpleEntity);

    return simpleEntity;
  }
}
