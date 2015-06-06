package br.com.ericfujii.client;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemPedido {

	@XmlElement(name = "id")
	private Integer id;
	
	@XmlElement(name = "produto")
	private Produto produto;
	
	@XmlElement(name = "pedido")
	private Pedido pedido;
	
	@XmlElement(name = "quantidade_mesa")
	private Integer quantidadeMesa = 0;
	
	@XmlElement(name = "viagem")
	private Boolean viagem = false;
	
	@XmlElement(name = "quantidadeViagem")
	private Integer quantidadeViagem = 0;
	
	@XmlElement(name = "observacao")
	private String observacao;
	
	@XmlElement(name = "situacao_pedido")
	private ESituacaoPedido situacaoPedido;
	
	@XmlElement(name = "data_hora_ultima_situacao")
	private Calendar dataHotaUltimaSituacao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Integer getQuantidadeMesa() {
		return quantidadeMesa;
	}
	public void setQuantidadeMesa(Integer quantidadeMesa) {
		this.quantidadeMesa = quantidadeMesa;
	}
	public Integer getQuantidadeViagem() {
		return quantidadeViagem;
	}
	public void setQuantidadeViagem(Integer quantidadeViagem) {
		this.quantidadeViagem = quantidadeViagem;
	}
	public Boolean getViagem() {
		return viagem;
	}
	public void setViagem(Boolean viagem) {
		this.viagem = viagem;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public ESituacaoPedido getSituacaoPedido() {
		return situacaoPedido;
	}
	public void setSituacaoPedido(ESituacaoPedido situacaoPedido) {
		this.situacaoPedido = situacaoPedido;
	}
	public Calendar getDataHotaUltimaSituacao() {
		return dataHotaUltimaSituacao;
	}
	public void setDataHotaUltimaSituacao(Calendar dataHotaUltimaSituacao) {
		this.dataHotaUltimaSituacao = dataHotaUltimaSituacao;
	}
}
