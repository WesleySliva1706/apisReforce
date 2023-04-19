package br.com.fiap.apisReforce.repository;


import br.com.fiap.apisReforce.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	List<Aluno> findByNome(String alu);
	
	List<Aluno> findByMatricula(String matricula);

	List<Aluno> findByNomeAndMatricula(String nome, String matricula);
}
