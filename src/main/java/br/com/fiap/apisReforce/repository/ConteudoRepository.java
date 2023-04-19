package br.com.fiap.apisReforce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.apisReforce.model.Conteudo;

@Repository
public interface ConteudoRepository extends JpaRepository<Conteudo, Integer> {
    List<Conteudo> findByNomeConteudo(String cont);
}