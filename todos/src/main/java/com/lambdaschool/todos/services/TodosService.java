package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todo;

public interface TodosService
{
    Todo save(Todo todo);
    void markComplete(long todoid);
}
