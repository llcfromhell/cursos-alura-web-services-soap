package br.com.caelum.soap.estoque.client.test;

import br.com.caelum.soap.estoque.client.EstoqueWS;
import br.com.caelum.soap.estoque.client.EstoqueWS_Service;
import br.com.caelum.soap.estoque.client.Filtro;
import br.com.caelum.soap.estoque.client.Filtros;
import br.com.caelum.soap.estoque.client.ListaItens;
import br.com.caelum.soap.estoque.client.TipoItem;

public class EstoqueWsTest {
	
	public static void main(String[] args) {
		EstoqueWS cliente = new EstoqueWS_Service().getEstoqueWSImplPort();
		
		Filtros filtros = new Filtros();
		Filtro arg0 = new Filtro();
		arg0.setNome("Moto");
		arg0.setTipo(TipoItem.CELULAR.value());
		filtros.getFiltro().add(arg0);
		
		ListaItens todosOsItens = cliente.todosOsItens(filtros);
		
		System.out.println(todosOsItens.getItem().get(0).getNome());
	}

}
