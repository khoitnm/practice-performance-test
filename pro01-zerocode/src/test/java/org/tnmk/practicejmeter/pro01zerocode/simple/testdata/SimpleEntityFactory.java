package org.tnmk.practicejmeter.pro01zerocode.simple.testdata;

import org.tnmk.practicejmeter.pro01zerocode.simple.SimpleEntity;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleEntityFactory {

  public static List<SimpleEntity> createEntities(int entitiesCount) {
    return IntStream.range(0, entitiesCount)
        .mapToObj(i -> createEntity(i))
        .collect(Collectors.toList());
  }

  private static SimpleEntity createEntity(long id) {
    SimpleEntity simpleEntity = new SimpleEntity();
    simpleEntity.setId(id);
    simpleEntity.setName("MockSimple"+id);
    return simpleEntity;
  }
}
