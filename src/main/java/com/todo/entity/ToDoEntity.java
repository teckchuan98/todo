package com.todo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name="to_do", schema="todo")
@Getter
@Setter
public class ToDoEntity implements Serializable {
    @Id
    @Column(name="Id")
    private int id;
    @Column(name="Task")
    private String task;
    @Column(name="Status")
    private String status;
}
