package io.github.pedro.jogos.play;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class PlayApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(PlayApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }





}
