package br.com.fiap.apisReforce.controller;

import br.com.fiap.apisReforce.model.Aluno;
import br.com.fiap.apisReforce.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("aluno")
public class AlunoController {

        @Autowired
        private AlunoRepository aluR;

        @GetMapping
        public List<Aluno> listar() {
            return aluR.findAll();
        }
        @GetMapping("buscar/{codigo}")
        public Aluno buscar(@PathVariable int codigo) {
            return aluR.findById(codigo).get();
        }
        @ResponseStatus(code = HttpStatus.CREATED)
        @PostMapping("novo")
        public Aluno cadastrar(@RequestBody Aluno aluno) {
            return aluR.save(aluno);
        }
        @PutMapping("atualizar/{id}")
        public Aluno atualizar(@RequestBody Aluno aluno, @PathVariable int id) {
            aluno.setCodigo(id);
            return aluR.save(aluno);
        }
        @DeleteMapping("apagar/{codigo}")
        public void remover(@PathVariable int codigo) {
            aluR.deleteById(codigo);
        }
        @GetMapping("pesquisa")
        public List<Aluno> buscar(@RequestParam(required = false) String nome, @RequestParam(defaultValue = "false") String matricula) {
            return nome != null ? aluR.findByNomeAndMatricula(nome, matricula) : aluR.findByMatricula(matricula);
        }
}
