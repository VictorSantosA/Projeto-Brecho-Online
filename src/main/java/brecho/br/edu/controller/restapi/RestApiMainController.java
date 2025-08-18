package brecho.br.edu.controller.restapi;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
@RequestMapping(path = "/api/v1")

public class RestApiMainController {
    
    @GetMapping ("/{id}")
    public ResponseEntity<String> getApiHome() {
        return ResponseEntity.ok("Em implementação");
    }

}