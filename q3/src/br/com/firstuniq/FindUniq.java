package br.com.firstuniq;

import java.security.InvalidParameterException;

public class FindUniq {
	
	/*
	 * Given a stream object parses it and return the
	 * first uniq char. If none found throws an exception.
	 * 
	 * @return char
	 * @throws InvalidParameterException for null stream
	 * @throws UniqCharNotFoundException if a stream have no one uniq char.
	 */
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
