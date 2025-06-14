package br.com.consultdg.teste.api;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class UsuarioController {
    private final String message = "Hello, %s";

    @GetMapping("app/user")
    public String greet(@RequestParam(name = "name", defaultValue = "World") String name) {
        return String.format(message, name);
    }

}
