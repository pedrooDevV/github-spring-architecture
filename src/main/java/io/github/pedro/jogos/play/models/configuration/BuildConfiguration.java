package io.github.pedro.jogos.play.models.configuration;

import io.github.pedro.jogos.play.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BuildConfiguration {
    @Bean
    @Primary
    public Console consolePc() {
        var console = new Console();
        console.setConsoleType(ConsoleType.PC);
        console.setCore("i9 10300");
        console.setMemory("16GB DDR4");
        console.setManufacturer(Manufacturer.PICHAU);
        return console;
    }
    @Bean
    public Console consoleSony() {
        var console = new Console();
        console.setConsoleType(ConsoleType.PS4);
        console.setCore("AMD unique chip");
        console.setMemory("8GB DDR5");
        console.setManufacturer(Manufacturer.SONY);
        return console;
    }
    @Bean
    public Console consoleX() {
        var console = new Console();
        console.setConsoleType(ConsoleType.XBOX_360);
        console.setCore("AMD unique chip");
        console.setMemory("8GB DDR5");
        console.setManufacturer(Manufacturer.MICROSOFT);
        return console;
    }

}
