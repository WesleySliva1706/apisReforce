package br.com.fiap.apisReforce.controller;

import br.com.fiap.apisReforce.model.Professor;
import br.com.fiap.apisReforce.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("professor")
public class ProfessorController {
    @Autowired
    private ProfessorRepository profR;
    @GetMapping
    public List<Professor> listar() {
        return profR.findAll();
    }
    @GetMapping("buscar/{codigo}")
    public Professor buscar(@PathVariable int codigo) {
        return profR.findById(codigo).get();
    }
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping("novo")
    public Professor cadastrar(@RequestBody Professor professor) {
        return profR.save(professor);
    }
    @PutMapping("atualizar/{id}")
    public Professor atualizar(@RequestBody Professor professor, @PathVariable int id) {
        professor.setCodigo(id);
        return profR.save(professor);
    }
    @DeleteMapping("apagar/{codigo}")
    public void remover(@PathVariable int codigo) {
        profR.deleteById(codigo);
    }
    @GetMapping("pesquisa")
    public List<Professor> buscar(@RequestParam(required = false)String nome, @RequestParam(defaultValue = "false") String curso) {
        return nome != null ? profR.findByNomeAndCurso(nome, curso) : profR.findByCurso(curso);
    }
}

