package br.com.fiap.apisReforce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "conteudo", sequenceName = "SQ_Conteudo", allocationSize = 1)
public class Conteudo {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "conteudo")
    @Column(name = "id_conteudo")
    private Integer codigo;

    @Column(name = "nm_conteudo", length = 40)
    private String nomeConteudo;

    @Column(name = "ds_conteudo", length = 200)
    private String descricao;

    @Column(name = "txt_conteudo", length = 200)
    private String txtConteudo;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNomeConteudo() {
		return nomeConteudo;
	}

	public void setNomeConteudo(String nomeConteudo) {
		this.nomeConteudo = nomeConteudo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTxtConteudo() {
		return txtConteudo;
	}

	public void setTxtConteudo(String txtConteudo) {
		this.txtConteudo = txtConteudo;
	}
    
    
}
