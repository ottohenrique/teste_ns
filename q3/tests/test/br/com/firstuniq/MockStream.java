package test.br.com.firstuniq;

import br.com.firstuniq.Stream;

public class MockStream implements Stream {
	
	private String stream;
	private int size = -1, pos = -1;
	
	public MockStream(String stream) {
		this.stream = stream;
		this.size = stream == null ? -1 : stream.length();
		this.pos = stream == null ? -1 : 0;
	}

	@Override
	public char getNext() {
		if(!hasNext()) {
			return '\0';
		}
		
		char c = stream.charAt(pos);
		pos++;
		return c;
	}

	@Override
	public boolean hasNext() {
		if(pos == -1 || (pos >= size)) {
			return false;
		} else {
			return true;
		}
	}

}
