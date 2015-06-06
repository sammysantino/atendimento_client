package br.com.ericfujii.client;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestAtendimentoRest {
	
	@XmlElement(name = "codigo_request")
	private ECodigoRequest codigoRequest;

	public ECodigoRequest getCodigoRequest() {
		return codigoRequest;
	}
	
	public void setCodigoRequest(ECodigoRequest codigoRequest) {
		this.codigoRequest = codigoRequest;
	}
}
