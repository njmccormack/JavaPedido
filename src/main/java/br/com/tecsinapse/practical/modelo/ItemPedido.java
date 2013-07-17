package br.com.tecsinapse.practical.modelo;

public class ItemPedido {
	private String cnpjCliente;
	private String usuarioSolicitante;
	private String codigoItem;
	private int quantidade;
	private double valorTotal;
	
	public String getCnpjCliente() {
		//dados de teste
		//cnpjCliente = "123456789";
		return cnpjCliente;
	}

	public void setCnpjCliente(String cnpjCliente) {
		this.cnpjCliente = cnpjCliente;
	}

	public String getUsuarioSolicitante() {
		//dados de teste
		//usuarioSolicitante="solicitante1";
		return usuarioSolicitante;
	}

	public void setUsuarioSolicitante(String usuarioSolicitante) {
		this.usuarioSolicitante = usuarioSolicitante;
	}

	public String getCodigoItem() {
		//dados de teste
		//codigoItem="iten1";
		return codigoItem;
	}

	public void setCodigoItem(String codigoItem) {
		this.codigoItem = codigoItem;
	}

	public int getQuantidade() {
		//dados de teste
		//quantidade=2;
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValorTotal() {
		//valorTotal=10.00;
		//format currency
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public double calcValorUnitario() {
		valorTotal=getValorTotal();
		quantidade=getQuantidade();
		double valorUnitario;
		valorUnitario=valorTotal/quantidade;
		//System.out.println("valorTotal="+valorTotal);
		//System.out.println("quantidade="+quantidade);
		//format currency
		return Math.round(valorUnitario);
		
	}
	
//Criar uma propriedade JavaBean chamada valorUnitario na classe 
// * ItemPedido, que deverá ser calculada dividindo-se o valorTotal pela 
//* quantidade e arredondando-se em duas casas decimais pelo padrão monetário de 
// * arredondamento (0-4 pra baixo, 5-9 para cima). Escolha o tipo do Java SE mais
// * apropriado levando-se em conta que é um valor monetário preciso;
//
}
