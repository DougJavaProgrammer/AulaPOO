import java.math.BigDecimal;

public class ExecutarTeste {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("M�dulo Orienta��o Objeto");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		produto2.setNome("M�dulo de Sprng Boot API REST");
		produto2.setId(2L);
		produto2.setValor(BigDecimal.valueOf(300));
		
		Produto produto3 = new Produto();
		produto3.setNome("M�dulo de Angular 8");
		produto3.setId(3L);
		produto3.setValor(BigDecimal.valueOf(100));
		
		Produto produto4 = new Produto();
		produto4.setNome("M�dulo de Hibernate");
		produto4.setId(4L);
		produto4.setValor(BigDecimal.valueOf(100));
			
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Forma��o Java");
		venda.setEndere�oEntrega("Entrega por e-mail");
		venda.setId(10L);
		venda.setNomeCliente("Douglas Oliveira");
		//venda.setValorTotal(BigDecimal.valueOf(197));
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2); /*desta forma n�o � poss�vel fazer valida��es*/
		venda.addProduto(produto3); /*desta forma � poss�vel fazer valida��es*/
		venda.addProduto(produto4);
		
		System.out.println("Descri��o da Venda " + venda.getDescricaoVenda());
		System.out.println("Total da Venda " + venda.totalVenda());
		
		
		/*for (Produto produto : venda.getListaProdutos()) {
			System.out.println("Descri��o Produto " + produto);
		
		}
		
		System.out.println("Descri��o Venda: " + venda);*/
	}

}
