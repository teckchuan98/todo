package com.todo.controller;

import com.todo.service.ToDoService;
import com.todo.entity.ToDoEntity;
import com.todo.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoController {
    @Autowired
    ToDoService toDoService;

    @PostMapping("/add")
    public void addToDo(@RequestBody ToDo todo){
        toDoService.insertToDo(todo);
    }

    @PostMapping("/delete")
    public void deleteToDo(@RequestParam int id){
        toDoService.deleteToDo(id);
    }

    @PostMapping("/markCompleted")
    public ToDoEntity markCompleted(@RequestParam int id){
        return toDoService.markCompleted(id);
    }

    @GetMapping("/getAllToDos")
    public List<ToDoEntity> getToDos(){
        return toDoService.getAllToDos();
    }

}
