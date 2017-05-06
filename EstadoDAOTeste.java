package br.com.jorge.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.jorge.drogaria.domain.Estado;

public class EstadoDAOTeste {
	
	@Test
	@Ignore
	public void salvar(){
		Estado estado = new Estado();
		estado.setNome("Espírito Santo");
		estado.setSigla("ES");
		
		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);
	}
	
	@Test
	@Ignore
	public void listar(){
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> resultado = estadoDAO.listar();
		
		System.out.println("Total de Registros encontrados: " + resultado.size());
		for(Estado estado : resultado){
			System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
		}
	}
	
	@Test
	@Ignore
	public void buscar(){
		Long codigo = 5L;
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		
		if(estado == null){
			System.out.println("Nenhum Registro Encontrado");
		}else{
		System.out.println("Registro Encontrado:");
		System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
		
		}
		
	}
	
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 5L;
	
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		
		if(estado == null){
			System.out.println("Nenhum Registro Encontrado");
		}else{
			estadoDAO.excluir(estado);
		System.out.println("Registro Removido com sucesso");
		System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
		
		}
		
	}
	
	@Test
	
	public void editar(){
		Long codigo = 6L;
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		
		if(estado == null){
			System.out.println("Nenhum Registro Encontrado");
		}else{
			
			System.out.println("Registro Editado com Sucesso");
			System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
			
			estado.setNome("Bahia");
			estado.setSigla("BA");
			estadoDAO.editar(estado);
			
			System.out.println("Registro Editado com Sucesso");
			System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
		
		}
		
		
	}
	
	

}
