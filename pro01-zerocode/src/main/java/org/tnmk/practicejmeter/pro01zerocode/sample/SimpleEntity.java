package org.tnmk.practicejmeter.pro01zerocode.sample;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "sample_entity", catalog = "sample_db")
public class SimpleEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "sample_entity_id")
  private Long sampleEntityId;

  private String name;

  public SimpleEntity(String name) {
    this.name = name;
  }

  public SimpleEntity() {

  }
}
