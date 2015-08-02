package br.com.firstuniq;

import java.security.InvalidParameterException;

public class FindUniq {
	
	public static char firstChar(Stream stream)
			throws InvalidParameterException, UniqCharNotFoundException {
		
		if(stream == null)
			throw new InvalidParameterException("Stream nulo não é permitido");
		
		StreamParser sp = new StreamParser(stream);
		sp.parse();
		
		if(sp.getUniqChar() == null)
			throw new UniqCharNotFoundException("Não foi encontrado caracter único na stream.");
		
		return sp.getUniqChar();
	}
}
