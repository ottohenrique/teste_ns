package test.br.com.firstuniq;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.Test;

import br.com.firstuniq.FindUniq;
import br.com.firstuniq.UniqCharNotFoundException;

public class TestFindUniq {

	@Test(expected=InvalidParameterException.class)
	public void testNullStreamArg() throws InvalidParameterException, UniqCharNotFoundException {
		FindUniq.firstChar(null);
	}
	
	@Test(expected=UniqCharNotFoundException.class)
	public void testEmptyStream() throws InvalidParameterException, UniqCharNotFoundException {
		FindUniq.firstChar(new MockStream(""));
	}
	
	@Test(expected=UniqCharNotFoundException.class)
	public void testStreamDuplicated() throws InvalidParameterException, UniqCharNotFoundException {
		FindUniq.firstChar(new MockStream("AaBbCcAaBbCc"));
	}
	
	@Test
	public void testStreamWithUniqAtBegining() throws InvalidParameterException, UniqCharNotFoundException {
		MockStream mock = new MockStream("AadBbCcAaBbCc");
		assertEquals(new Character('d'), new Character(FindUniq.firstChar(mock)));
	}
	
	@Test
	public void testStreamWithUniqAtEnd() throws InvalidParameterException, UniqCharNotFoundException {
		MockStream mock = new MockStream("AaBbCcAaBbCcd");
		assertEquals(new Character('d'), new Character(FindUniq.firstChar(mock)));
	}

}
