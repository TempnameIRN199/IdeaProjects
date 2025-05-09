package org.example.sportshop;

import java.awt.Desktop;
import java.net.URI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SportShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportShopApplication.class, args);
    }

    @Bean
    public CommandLineRunner openBrowser() {
        return args -> {
            Thread.sleep(3000);
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(new URI("http://localhost:8080"));
            }
        };
    }
}