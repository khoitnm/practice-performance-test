package org.tnmk.practicejmeter.pro01zerocode.simple;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "sample_entity", catalog = "sample_db")
@NoArgsConstructor
public class SimpleEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Long id;

  private String name;

  public SimpleEntity(String name) {
    this.name = name;
  }
}
