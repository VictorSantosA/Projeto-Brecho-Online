package brecho.br.edu.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;


@Controller
@RequestMapping(path = "principal")

public class MainViewController {
    
    @GetMapping ("/{id}")
    public String getHomePage (@PathVariable("id") String id, Model model){

        model.addAttribute("id", id);
        model.addAttribute("nomeProduto", "Computador") ;
        model.addAttribute("precoProduto", 2500.00);
        model.addAttribute( "descricaoProduto", "Computador de última geração");
        model.addAttribute("quantidadeEstoque", 10);
        model.addAttribute("categoriaProduto", "'Eletrônicos");
        return "index.html" ;
    }
    
    


}
