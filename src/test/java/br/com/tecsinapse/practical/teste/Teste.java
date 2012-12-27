package br.com.tecsinapse.practical.teste;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import br.com.tecsinapse.practical.main.Main;
import br.com.tecsinapse.practical.modelo.ItemPedido;
import br.com.tecsinapse.practical.modelo.Pedido;

import com.google.common.collect.Lists;

public class Teste {

	@DataProvider(name = "itens", parallel = true)
	public Object[][] itens() {
		ItemPedido ip1 = new ItemPedido();
		ip1.setCnpjCliente("1");
		ip1.setCodigoItem("1");
		ip1.setQuantidade(1);
		ip1.setUsuarioSolicitante("1");
		ItemPedido ip2 = new ItemPedido();
		ip2.setCnpjCliente("2");
		ip2.setCodigoItem("2");
		ip2.setQuantidade(2);
		ip2.setUsuarioSolicitante("2");
		ItemPedido ip3 = new ItemPedido();
		ip3.setCnpjCliente("1");
		ip3.setCodigoItem("3");
		ip3.setQuantidade(3);
		ip3.setUsuarioSolicitante("1");

		Pedido p1 = new Pedido();
		p1.setCnpjCliente("1");
		p1.setUsuarioSolicitante("1");
		p1.getItens().add(ip1);
		p1.getItens().add(ip3);

		Pedido p2 = new Pedido();
		p2.setCnpjCliente("2");
		p2.setUsuarioSolicitante("2");
		p2.getItens().add(ip2);
		return new Object[][] {
				{ Lists.newArrayList(ip1, ip2), Lists.newArrayList(p1, p2) },
				{ Lists.newArrayList(), Lists.newArrayList() } };
	}

	@Test(dataProvider = "itens")
	public void gerarPedidosAgrupados(List<ItemPedido> itens,
			List<Pedido> pedidosEsperados) {
		List<Pedido> pedidos = Main.gerarPedidosAgrupados(itens);

		Assert.assertEquals(pedidos.size(), itens.size(),
				"número diferente de pedidos");

		for (Pedido pEsperado : pedidosEsperados) {
			boolean achouPedidoEsperado = false;
			for (Pedido p : pedidos) {
				if (pEsperado.getCnpjCliente().equals(p.getCnpjCliente())
						&& pEsperado.getUsuarioSolicitante().equals(
								p.getUsuarioSolicitante())) {

					for (ItemPedido ipEsperado : pEsperado.getItens()) {
						boolean achouItemPedidoEsperado = false;
						for (ItemPedido ip : p.getItens()) {
							if (ipEsperado.getCnpjCliente().equals(
									ip.getCnpjCliente())
									&& ipEsperado.getCodigoItem().equals(
											ip.getCodigoItem())
									&& ipEsperado.getUsuarioSolicitante()
											.equals(ip.getUsuarioSolicitante())
									&& ipEsperado.getQuantidade() == ip
											.getQuantidade()) {
								Assert.assertFalse(
										achouItemPedidoEsperado,
										"achou 2 vezes o item: "
												+ ipEsperado.getCodigoItem());
								achouItemPedidoEsperado = true;
							}
						}
						if (achouItemPedidoEsperado)
							break;

					}

					Assert.assertFalse(
							achouPedidoEsperado,
							"achou 2 vezes o pedido do cnpj: "
									+ pEsperado.getCnpjCliente()
									+ " e usuario: "
									+ pEsperado.getUsuarioSolicitante());
					achouPedidoEsperado = true;
				}

				if (achouPedidoEsperado)
					break;
			}
		}

	}
}
