package br.com.ericfujii.client;

public class AtendimentoRestClient {
	
	private static final String URL = "http://172.16.1.200:8080/rest/atendimentoRest/processar";

	public static void main(String[] args) {
		try {
			RequestAtendimentoRest request = new RequestAtendimentoRest();
			request.setCodigoRequest(ECodigoRequest.CARGA_PACOTES);
			d2dProcessarRequisicao(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void d2dProcessarRequisicao(RequestAtendimentoRest request) {
		try {
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
