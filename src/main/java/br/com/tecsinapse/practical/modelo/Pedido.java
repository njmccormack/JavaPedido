package br.com.tecsinapse.practical.modelo;

import java.util.List;

import com.google.common.collect.Lists;

public class Pedido {

	public Pedido(String cnpjCliente, String usuarioSolicitante,
			List<ItemPedido> itens) {
		super();
		this.cnpjCliente = cnpjCliente;
		this.usuarioSolicitante = usuarioSolicitante;
		this.itens = itens;
	}

	private String cnpjCliente;
	private String usuarioSolicitante;
	private List<ItemPedido> itens = Lists.newArrayList();

	public String getCnpjCliente() {
		return cnpjCliente;
	}

	public void setCnpjCliente(String cnpjCliente) {
		this.cnpjCliente = cnpjCliente;
	}

	public String getUsuarioSolicitante() {
		return usuarioSolicitante;
	}

	public void setUsuarioSolicitante(String usuarioSolicitante) {
		this.usuarioSolicitante = usuarioSolicitante;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

}
