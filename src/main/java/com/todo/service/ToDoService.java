package com.todo.service;

import com.todo.entity.ToDoEntity;
import com.todo.model.ToDo;
import com.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoService {
    @Autowired
    ToDoRepository toDoRepository;

    public void insertToDo(ToDo todo){
        ToDoEntity toDoEntity = new ToDoEntity();
        toDoEntity.setId(todo.getId());
        toDoEntity.setTask(todo.getTask());
        toDoEntity.setStatus(todo.getStatus());
        toDoRepository.save(toDoEntity);
    }

    public void deleteToDo(int id){
        toDoRepository.deleteById(id);
    }

    public List<ToDoEntity> getAllToDos(){
        return toDoRepository.findAll();
    }

    public ToDoEntity markCompleted(int id){
        Optional<ToDoEntity> entity = toDoRepository.findById(id);
        if (entity.isPresent()){
            entity.get().setStatus("Completed");
            toDoRepository.save(entity.get());
            return entity.get();
        }
        return new ToDoEntity();
    }

}
