package API_Rest.minha_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "API funcionando! 🚀";
    
}
}