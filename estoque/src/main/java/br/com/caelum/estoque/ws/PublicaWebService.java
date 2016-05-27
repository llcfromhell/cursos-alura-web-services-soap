package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

public class PublicaWebService {
	
	public static void main(String[] args) {
		
		EstoqueWS estoqueWS = new EstoqueWS();
		String url = "http://localhost:9090/estoquews";
		
		System.out.println("WS is up.");
		
		Endpoint.publish(url, estoqueWS);
		
	}

}
