package com.todo.model;

import lombok.Data;

@Data
public class ToDo {
    private int id;
    private String task;
    private String status;
}
