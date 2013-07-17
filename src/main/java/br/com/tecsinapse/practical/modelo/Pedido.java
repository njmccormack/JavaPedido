package br.com.tecsinapse.practical.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private String cnpjCliente;
	private String usuarioSolicitante;
	private List<ItemPedido> itens = new ArrayList<>();
	private String valorTotal;

	public String getCnpjCliente() {
		//dados de teste
		cnpjCliente = "123456789";
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
	
	public String getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}


}
