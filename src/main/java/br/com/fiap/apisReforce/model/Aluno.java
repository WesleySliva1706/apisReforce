package br.com.fiap.apisReforce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "aluno", sequenceName = "SQ_Aluno", allocationSize = 1)
public class Aluno {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aluno")
        @Column(name = "id_aluno")
        private Integer codigo;

        @Column(name = "nm_aluno", length = 40)
        private String nome;
        
        @Column(name = "nr_matricula", length = 40)
        private String matricula;

        @Column(name = "nr_telefone", length = 15)
        private String telefone;

        @Column(name = "email", length = 50)
        private String email;

        // criar getters e setters aqui.

        public int getCodigo() {
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


        public String getMatricula() {
            return matricula;
        }
        public void setMatricula(String matricula) {
            this.matricula = matricula;
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
