package br.com.addr.model;

import java.util.regex.Pattern;

import br.com.addr.exceptions.AddressNotFoundException;

public class ConsultaCep {
	private StringBuilder cep;
	private Pattern cepFormat = Pattern.compile("/[0-9]{8}/");
	
	public ConsultaCep(String cep) {
		this.cep = new StringBuilder(cep.replace("-", ""));
	}
	
	public boolean isValid() {
		return cepFormat.matcher(cep.toString()).matches();
	}
	
	public Endereco getAddress() throws AddressNotFoundException {
		CepDatabase db = CepDatabase.getInstance();
		int p = cep.length() - 1;
		
		Endereco addr = null;
		while(!cep.equals("00000000")) {
			if(db.containsCep(cep.toString())) {
				addr = db.getAddres(cep.toString());
				break;
			} else {
				cep.setCharAt(p--, '0');
			}
		}
		
		if(addr == null)
			throw new AddressNotFoundException("Cep não encontrado na base");
		
		return addr;
		
	}

}
