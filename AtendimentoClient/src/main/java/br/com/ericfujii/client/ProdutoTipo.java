package br.com.ericfujii.client;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProdutoTipo {

	@XmlElement(name="id")
	private Integer id;
	
	@XmlElement(name="nome")
	private String nome;
	
	@XmlElement(name="bebida")
	private Boolean bebida;
	
	@XmlElement(name="situacao")
	private ESituacao situacao = ESituacao.ATIVO;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ESituacao getSituacao() {
		return situacao;
	}
	public void setSituacao(ESituacao situacao) {
		this.situacao = situacao;
	}
	public Boolean getBebida() {
		return bebida;
	}
	public void setBebida(Boolean bebida) {
		this.bebida = bebida;
	}
}
