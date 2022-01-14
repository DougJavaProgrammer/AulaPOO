import java.math.BigDecimal;

public class ExecutarTeste {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Módulo Orientação Objeto");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		produto2.setNome("Módulo de Sprng Boot API REST");
		produto2.setId(2L);
		produto2.setValor(BigDecimal.valueOf(300));
		
		Produto produto3 = new Produto();
		produto3.setNome("Módulo de Angular 8");
		produto3.setId(3L);
		produto3.setValor(BigDecimal.valueOf(100));
		
		Produto produto4 = new Produto();
		produto4.setNome("Módulo de Hibernate");
		produto4.setId(4L);
		produto4.setValor(BigDecimal.valueOf(100));
			
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Formação Java");
		venda.setEndereçoEntrega("Entrega por e-mail");
		venda.setId(10L);
		venda.setNomeCliente("Douglas Oliveira");
		//venda.setValorTotal(BigDecimal.valueOf(197));
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2); /*desta forma não é possível fazer validações*/
		venda.addProduto(produto3); /*desta forma é possível fazer validações*/
		venda.addProduto(produto4);
		
		System.out.println("Descrição da Venda " + venda.getDescricaoVenda());
		System.out.println("Total da Venda " + venda.totalVenda());
		
		
		/*for (Produto produto : venda.getListaProdutos()) {
			System.out.println("Descrição Produto " + produto);
		
		}
		
		System.out.println("Descrição Venda: " + venda);*/
	}

}
