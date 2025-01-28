package io.github.pedro.jogos.play.todos;

import jakarta.persistence.PostUpdate;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @PostMapping
    public TodoEntity save(@RequestBody TodoEntity newTodo) {
         return this.service.save(newTodo);
    }
    @PutMapping("{id}")
    public void update(@PathVariable("id") Integer id,
                             @RequestBody TodoEntity todo) {
        todo.setId(id);
        service.updateSatus(todo);
    }
    @GetMapping("{id}")
    public TodoEntity findByid(@PathVariable("id") Integer id){
        return service.findById(id);
    }
}
