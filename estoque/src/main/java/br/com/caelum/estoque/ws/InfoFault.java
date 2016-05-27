package br.com.caelum.estoque.ws;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class InfoFault {

	private Date dataErro;
	private String mensagem;
	
	
	public InfoFault(Date dataErro, String mensagem) {
		super();
		this.dataErro = dataErro;
		this.mensagem = mensagem;
	}


	public InfoFault() {
		super();
	}
	
	
	
}
