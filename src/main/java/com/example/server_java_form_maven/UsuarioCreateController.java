package com.example.server_java_form_maven;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://127.0.0.1:5501", allowCredentials = "true")
public class UsuarioCreateController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @PostMapping("/criarUsuario")
    public Map<String, String> criarUsuario(@RequestBody Map<String, String> usuario) {
        // Imprimir os dados do usuário no console
        System.out.println("Nome: " + usuario.get("nome"));
        System.out.println("Email: " + usuario.get("email"));
        System.out.println("Senha: " + usuario.get("senha"));

        // Criar um mapa para a resposta JSON
        Map<String, String> response = new HashMap<>();
        response.put("message", "Usuário criado com sucesso!");
        return response;
    }
}
