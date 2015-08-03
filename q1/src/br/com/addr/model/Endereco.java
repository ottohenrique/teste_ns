package br.com.addr.model;

import java.util.HashMap;

import org.json.simple.JSONValue;

public class Endereco {
	private HashMap<String, String> attr;
	
	public Endereco(String cep, String rua, String bairro, String cidade, String estado) {
		attr = new HashMap<>();
		
		attr.put("cep", cep);
		attr.put("rua", rua);
		attr.put("bairro", bairro);
		attr.put("cidade", cidade);
		attr.put("estado", estado);

	}
	
	public String toJson() {
		return JSONValue.toJSONString(attr);
	}
	
	public String getCep() {
		return attr.get("cep");
	}
	public void setCep(String cep) {
		attr.put("cep", cep);
	}
	
	public String getRua() {
		return attr.get("rua");
	}
	public void setRua(String rua) {
		attr.put("rua", rua);
	}
	
	public String getBairro() {
		return attr.get("bairro");
	}
	public void setBairro(String bairro) {
		attr.put("bairro", bairro);
	}
	
	public String getCidade() {
		return attr.get("cidade");
	}
	public void setCidade(String cidade) {
		attr.put("cidade", cidade);
	}
	public String getEstado() {
		return attr.get("estado");
	}
	public void setEstado(String estado) {
		attr.put("estado", estado);
	}
}
