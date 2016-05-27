package br.com.caelum.estoque.ws;

import java.util.Date;

import javax.xml.ws.WebFault;

@WebFault(name="AutorizacaoFault", messageName="AutorizacaoFault")
public class AutorizacaoException extends Exception {

	private static final long serialVersionUID = 1L;

	public AutorizacaoException(String message) {
		super(message);
	}
	
    public InfoFault getFaultInfo() {
        return new InfoFault(new Date(), "Tolkien inválido");
    }
	
}
