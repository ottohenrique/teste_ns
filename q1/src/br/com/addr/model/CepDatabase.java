package br.com.addr.model;

import java.util.HashMap;

public class CepDatabase {
	private HashMap<String, Endereco> table;
	
	private static CepDatabase instance;
	
	public static CepDatabase getInstance() {
		if(instance == null) {
			instance = new CepDatabase();
		}
		
		return instance;
	}
	
	private CepDatabase() {
		table = new HashMap<>();
		
		table.put("01046010", new Endereco("01046010", "Av. Ipiranga", "Republica", "São Paulo", "SP"));
		table.put("01040000", new Endereco("01040000", "Av. Ipiranga", "Republica", "São Paulo", "SP"));
		table.put("12090000", new Endereco("12090000", "Estreliseas", "Campos Eliseos", "Taubaté", "SP"));
		table.put("23080123", new Endereco("23080123", "Rua das Batatas", "Centro", "Pindamonhangaba", "SP"));
		table.put("45909200", new Endereco("45909200", "Rua do Patrono", "Centro", "Floripa", "SC"));
	}
	
	public boolean containsCep(String cep) {
		return table.containsKey(cep);
	}
	
	public Endereco getAddres(String cep) {
		return table.get(cep);
	}

}
