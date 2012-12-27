package br.com.tecsinapse.practical.teste;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.Lists;

import br.com.tecsinapse.practical.main.Main;
import br.com.tecsinapse.practical.modelo.ItemPedido;
import br.com.tecsinapse.practical.modelo.Pedido;

public class Teste {

	@DataProvider(name = "itens", parallel = true)
	public Object[][] itens() {
		return new Object[][] {
				{
						Lists.newArrayList(new ItemPedido("1", "1", "1", 1),
								new ItemPedido("1", "1", "1", 1)),
						Lists.newArrayList(new Pedido("1", "1", null)) },
				{ Lists.newArrayList(), Lists.newArrayList() } };
	}

	@Test(dataProvider = "itens")
	public void gerarPedidosAgrupados(List<ItemPedido> itens,
			List<Pedido> pedidosEsperados) {
		List<Pedido> pedidos = Main.gerarPedidosAgrupados(itens);

		Assert.assertEquals(pedidos.size(), itens.size());

	}
}
