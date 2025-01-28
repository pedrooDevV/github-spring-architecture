package io.github.pedro.jogos.play.models.api;

import io.github.pedro.jogos.play.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class TestController {
    @Autowired
    @Sony
    private Console console;

    @PostMapping
    public GameStatus startGame(@RequestBody Key key) {
        var game = new LegueOfLegends(console);
        return game.initialize(key);
    }
}
