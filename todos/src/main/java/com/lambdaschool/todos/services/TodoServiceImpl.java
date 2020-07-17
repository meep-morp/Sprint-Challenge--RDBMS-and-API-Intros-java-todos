package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todo;
import com.lambdaschool.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "todosService")
public class TodoServiceImpl implements TodosService{

    @Autowired
    TodoRepository todorepo;

    @Override
    public Todo save(Todo todo) {
       return todorepo.save(todo);
    }

    @Override
    public void markComplete(long todoid) {
     Todo todo = todorepo.findById(todoid)
             .orElseThrow(() -> new EntityNotFoundException(String.format("Todo %s not found.", todoid)));

     todo.setCompleted(true);
    }
}
