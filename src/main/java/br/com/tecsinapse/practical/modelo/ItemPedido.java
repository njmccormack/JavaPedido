package br.com.tecsinapse.practical.modelo;

public class ItemPedido {
	private String cnpjCliente;
	private String usuarioSolicitante;
	private String codigoItem;
	private int quantidade;

	public ItemPedido(String cnpjCliente, String usuarioSolicitante,
			String codigoItem, int quantidade) {
		super();
		this.cnpjCliente = cnpjCliente;
		this.usuarioSolicitante = usuarioSolicitante;
		this.codigoItem = codigoItem;
		this.quantidade = quantidade;
	}

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

	public String getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(String codigoItem) {
		this.codigoItem = codigoItem;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
