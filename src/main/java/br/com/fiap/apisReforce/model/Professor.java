package br.com.fiap.apisReforce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "profs", sequenceName = "SQ_Professor", allocationSize = 1)
public class Professor {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profs")
    @Column(name = "id_prof")
    private Integer codigo;

    @Column(name = "nm_professor", length = 40)
    private String nome;

    @Column(name = "nm_curso", length = 15)
    private String curso;

    @Column(name = "nr_telefone", length = 15)
    private String telefone;

    @Column(name = "email", length = 50)
    private String email;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
}
