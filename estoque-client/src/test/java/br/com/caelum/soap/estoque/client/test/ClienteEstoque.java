package br.com.caelum.soap.estoque.client.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import br.com.caelum.soap.estoque.client.EstoqueWS;
import br.com.caelum.soap.estoque.client.Filtro;
import br.com.caelum.soap.estoque.client.Filtros;
import br.com.caelum.soap.estoque.client.Item;
import br.com.caelum.soap.estoque.client.ListaItens;
import br.com.caelum.soap.estoque.client.TipoItem;

public class ClienteEstoque {

	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("http://localhost:8080/estoque-web/EstoqueWS?wsdl");
		
	        QName qname = new QName("http://ws.estoque.caelum.com.br/", "EstoqueWS");
	
	        Service service = Service.create(url, qname);
	
	        EstoqueWS cliente = service.getPort(EstoqueWS.class);
	
	        Filtro filtro = new Filtro();
	        filtro.setNome("IPhone");
	        filtro.setTipo(TipoItem.CELULAR.value());;
	
	        Filtros filtros = new Filtros();
	        filtros.getFiltro().add(filtro);
			ListaItens lista = cliente.todosOsItens(filtros);
	
	        for (Item item : lista.getItem()) {
	            System.out.println("er"+item.getNome());
	        }
	        
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
