package br.com.caelum.livraria.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.caelum.livraria.dao.AutorDao;
import br.com.caelum.livraria.modelo.Autor;

@Stateless
public class AutorService {
	
	@Inject
	private AutorDao dao;
	
	public void adicionar(Autor autor) {
		dao.salva(autor);
	}
	
	public List<Autor> buscarTodos(){
		return dao.todosAutores();
	}
}
