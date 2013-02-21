package br.com.tecsinapse.practical.main;

import java.util.Collections;
import java.util.List;

import br.com.tecsinapse.practical.modelo.ItemPedido;
import br.com.tecsinapse.practical.modelo.Pedido;

/**
 * Você está recebendo um projeto que contém as classes ItemPedido e Pedido. Um
 * Pedido contém o cnpj do cliente, o usuário solicitante e uma lista de itens.
 * Um ItemPedido contém também o cnpj do cliente, o usuário solicitante, o
 * código do item e a quantidade solicitada. Você deve:
 * 
 * 1 - Criar um atributo chamado valorTotal, tanto na classe ItemPedido como na
 * classe Pedido. Utilize o tipo correto no atributo levando em conta que
 * trata-se de um valor monetário com duas casas decimais;
 * 
 * 2 - Criar um atributo chamado valorUnitario na classe ItemPedido, que deverá
 * ser calculado dividindo-se o valorTotal pela quantidade e arredondando-se em
 * duas casas decimais pelo padrão monetário de arredondamento (0-4 pra baixo,
 * 5-9 para cima). Escolha o tipo mais apropriado levando-se em conta que é um
 * valor monetário preciso;
 * 
 * 3 - Implementar o método gerarPedidosAgrupados(List<ItemPedido>) :
 * List<Pedido> na classe Main passada, levando em conta que deve ser gerado um
 * único pedido para cada par único de CNPJ de cliente e usuário solicitante.
 * Não devem haver dois itens no mesmo pedido com o mesmo código de item -
 * quando isso acontecer, deve-se somar as quantidades e o valor total, gerando
 * um único item consolidado.
 * 
 * Além dos critérios obrigatórios acima, serão dados pontos adicionais se a
 * ordem dos pedidos e dos itens for mantida durante o processo.
 * 
 * Sugira também (sem alterar o código) como o modelo poderia ser melhorado
 * usando apenas classes do Java SE 7 para que ficasse mais correto.
 * 
 * Não é permitido alterar a assinatura de nenhum método público exposto nas
 * classes, inclusive os construtores padrões. Pode-se adicionar outros métodos
 * além dos requeridos acima para facilitar a implementação.
 * 
 * Nossa suite de teste contém um numero indeterminado de itens e esperasse que
 * a solução projetada possa atender de modo performático.
 * 
 * @author TecSinapse
 * 
 */
public class Main {
	public static List<Pedido> gerarPedidosAgrupados(List<ItemPedido> itens) {
		// TODO Implementar!
		return Collections.emptyList();
	}
}
