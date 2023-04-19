package br.com.fiap.apisReforce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.apisReforce.model.Conteudo;
import br.com.fiap.apisReforce.repository.ConteudoRepository;

@RestController 
@RequestMapping("conteudo") 
public class ConteudoController {
	
	@Autowired
    private ConteudoRepository contR; 

   @GetMapping 
    public List<Conteudo> listar() { 
        return contR.findAll(); 
    } 
    
    @GetMapping("buscar/{codigo}") 
    public Conteudo buscar(@PathVariable int codigo) { 
        return contR.findById(codigo).get(); 
    } 
    
    @ResponseStatus(code = HttpStatus.CREATED) 
    @PostMapping("novo") 
    public Conteudo cadastrar(@RequestBody Conteudo cont) { 
        return contR.save(cont); 
    } 

    @PutMapping("atualizar/{id}") 
    public Conteudo atualizar(@RequestBody Conteudo cont, @PathVariable int id) { 
        cont.setCodigo(id); 
        return contR.save(cont); 
    } 
    
    @DeleteMapping("apagar/{id}") 
    public void remover(@PathVariable int id) { 
        contR.deleteById(id); 
    } 

    @GetMapping("pesquisa") 
    public List<Conteudo> buscar(@RequestParam(required = false) String nome) { 
        return  contR.findByNomeConteudo(nome); 
    } 
}
