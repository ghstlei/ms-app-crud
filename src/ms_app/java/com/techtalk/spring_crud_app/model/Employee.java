package com.techtalk.spring_crud_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String clientId;
  private String name;
  private String email;
  private long nationalIdentity;
  private Date birthdate;
  private String jobPosition;
  private boolean activity;
  private BigDecimal salary;
  private String type;

}
