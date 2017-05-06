package br.com.jorge.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.jorge.drogaria.domain.Fabricante;

public class FabricanteDAOTeste {
	@Test
	@Ignore
	public void salvar(){
		Fabricante fabricante = new Fabricante();
		fabricante.setDescricao("Merk");
		
		
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		fabricanteDAO.salvar(fabricante);
	}
	
	@Test
	public void listar(){
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		List<Fabricante> resultado = fabricanteDAO.listar();
		
		System.out.println("Total de Registros encontrados: " + resultado.size());
		for(Fabricante fabricante : resultado){
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
		}
	}
	
	@Test
	@Ignore
	public void buscar(){
		Long codigo = 7L;
		
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigo);
		
		if(fabricante == null){
			System.out.println("Nenhum Registro Encontrado");
		}else{
		System.out.println("Registro Encontrado:");
		System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
		
		}
		
	}
	
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 7L;
	
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigo);
		
		if(fabricante == null){
			System.out.println("Nenhum Registro Encontrado");
		}else{
			fabricanteDAO.excluir(fabricante);
		System.out.println("Registro Removido com sucesso");
		System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
		
		}
		
	}
	
	@Test
	@Ignore
	public void editar(){
		Long codigo = 6L;
		
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigo);
		
		if(fabricante == null){
			System.out.println("Nenhum Registro Encontrado");
		}else{
			
			System.out.println("Registro Editado com Sucesso");
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
			
			fabricante.setDescricao("Merk");
			
			fabricanteDAO.editar(fabricante);
			
			System.out.println("Registro Editado com Sucesso");
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
		
		}
		
		
	}
	
	
}
