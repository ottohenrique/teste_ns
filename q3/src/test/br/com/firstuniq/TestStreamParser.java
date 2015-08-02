package test.br.com.firstuniq;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.firstuniq.StreamParser;

public class TestStreamParser {

	@Test
	public void testBasicStream() {
		MockStream s = new MockStream("aAbBABac");
		StreamParser sp = new StreamParser(s);
		
		sp.parse();
		
		assertEquals("Uniq char not found at begining of stream", new Character('b'), sp.getUniqChar());
	}

	@Test
	public void testUniqCharAtLastPosition() {
		MockStream s = new MockStream("aAbBABabc");
		StreamParser sp = new StreamParser(s);
		
		sp.parse();
		
		assertEquals("Uniq char not found at end of stream", new Character('c'), sp.getUniqChar());
	}

	@Test
	public void testUniqCharNotFound() {
		MockStream s = new MockStream("AaBbAaBb");
		
		StreamParser sp = new StreamParser(s);
		sp.parse();
		
		assertNull("Nonexistent uniq char", sp.getUniqChar());
	}
	
	@Test
	public void testLongMixedStream() {
		LongMockStream stream = new LongMockStream();
		
		StreamParser sp = new StreamParser(stream);
		sp.parse();
		
		assertNull(sp.getUniqChar());
	}
}
