package br.com.jorge.drogaria.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.jorge.drogaria.domain.Produto;
import br.com.jorge.drogaria.domain.Fabricante;
import br.com.jorge.drogaria.domain.Fabricante;

public class ProdutoDAOTeste {
	
	@Test
	@Ignore
	public void salvar(){
		FabricanteDAO  fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(new Long("5"));
		
		Produto produto = new Produto();
		produto.setDescricao("Doril");
		produto.setFabricante(fabricante);
		produto.setPreco(new BigDecimal("2.25"));
		produto.setQuantidade(new Short("25"));
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);
		
		System.out.println("Produto Salvo com Sucesso");
	}
	
	@Test
	@Ignore
	public void listar(){
		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produto> resultado = produtoDAO.listar();

		for (Produto Produto : resultado) {
			
			System.out.println("Código do Produto: " + Produto.getCodigo());
			System.out.println("Descrição do Produto: " + Produto.getDescricao());
			System.out.println("Preço: " + Produto.getPreco());
			System.out.println("Quantidade:" + Produto.getQuantidade());
			System.out.println("Fabricante:" + Produto.getFabricante().getDescricao());
			//System.out.println();
		}
	}
	
	@Test
	@Ignore
	public void buscar(){
		Long codigo = 11L;
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);
		
		System.out.println("Produto Buscado");
		System.out.println("Código do Produto: " + produto.getCodigo());
		System.out.println("Descrição: " + produto.getDescricao());
		System.out.println("Preço: " + produto.getPreco());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Fabricante: " + produto.getFabricante().getDescricao());
	}
	
	@Test
	
	public void excluir(){
		Long codigo = 12L;
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);
		
		produtoDAO.excluir(produto);
		
		System.out.println("Produto Removida:");
		System.out.println("Código: " + produto.getCodigo());
		System.out.println("Descrição: " + produto.getDescricao());
		System.out.println("Preço: " + produto.getPreco());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Fabricante: " + produto.getFabricante().getDescricao());
	}
	
	@Test
	@Ignore
	public void editar(){
		Long codigoProduto = 12L;
		Long codigoFabricante = 5L;
		
		FabricanteDAO FabricanteDAO = new FabricanteDAO();
		Fabricante Fabricante = FabricanteDAO.buscar(codigoFabricante);
		
		System.out.println("Código do Fabricante: " + Fabricante.getCodigo());
		System.out.println("Sigla do Fabricante: " + Fabricante.getDescricao());
		
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigoProduto);
		
		System.out.println("Produto a ser editado:");
		System.out.println("Código da Produto: " + produto.getCodigo());
		System.out.println("Nome da Produto: " + produto.getDescricao());
		System.out.println("Código do Fabricante: " + produto.getPreco());
		System.out.println("Sigla do Fabricante: " + produto.getQuantidade());
		System.out.println("Nome do Fabricante: " + produto.getFabricante().getDescricao());
		
		produto.setDescricao("Maracujina");
		produto.setFabricante(Fabricante);
		
		produtoDAO.editar(produto);
		
		System.out.println("Produto editada:");
		System.out.println("Código da Produto: " + produto.getCodigo());
		System.out.println("Nome da Produto: " + produto.getDescricao());
		System.out.println("Código do Fabricante: " + produto.getPreco());
		System.out.println("Sigla do Fabricante: " + produto.getQuantidade());
		System.out.println("Nome do Fabricante: " + produto.getFabricante().getDescricao());
	}
}
	
	


