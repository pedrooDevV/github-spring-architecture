package io.github.pedro.jogos.play.todos;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public TodoEntity save(TodoEntity newTodo){
        return todoRepository.save(newTodo);
    }

    public void updateSatus(TodoEntity todo){
         todoRepository.save(todo);
    }

    public TodoEntity findById(Integer id){
        return todoRepository.findById(id).orElse(null);
   }

}
