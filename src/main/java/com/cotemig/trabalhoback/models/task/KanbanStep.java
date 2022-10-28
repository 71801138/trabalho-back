package com.cotemig.trabalhoback.models.task;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "kanban_steps")
public class KanbanStep {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;

  public KanbanStep() { }

  public KanbanStep(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "KanbanStep{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}
