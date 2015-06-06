package br.com.ericfujii.client;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Pedido {
	
	@XmlElement(name = "id")
	private Integer id;
	
	@XmlElement(name = "cliente")
	private String cliente;
	
	@XmlElement(name = "tipo_pedido")
	private ETipoPedido tipoPedido;
	
	@XmlElement(name = "usuario")
	private Usuario usuario;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public ETipoPedido getTipoPedido() {
		return tipoPedido;
	}
	public void setTipoPedido(ETipoPedido tipoPedido) {
		this.tipoPedido = tipoPedido;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
