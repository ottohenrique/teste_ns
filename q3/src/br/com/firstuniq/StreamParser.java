package br.com.firstuniq;

import java.util.HashMap;
import java.util.Map.Entry;

public class StreamParser {
	private Stream stream;
	private HashMap<Character, Integer> charTable;
	private Character uniqChar;
	
	public StreamParser(Stream stream) {
		this.stream = stream;
		this.charTable = new HashMap<>();
	}

	/*
	 * Given a stream, reads each character and stores in a internal
	 * hash to count occurrences.
	 */
	public void parse() {
		readStream();
		HashMap<Character, Integer> out = filterCharTable();

		if (!out.isEmpty()) {
			uniqChar = out.entrySet().iterator().next().getKey();
		}
	}

	/*
	 * After parse returns the first uniq character found
	 * or null if none occurs.
	 * 
	 * @return Character
	 */
	public Character getUniqChar() {
		return this.uniqChar;
	}

	private void readStream() {
		while (stream.hasNext()) {
			char actual = stream.getNext();

			if (charTable.containsKey(actual)) {
				int t = charTable.get(actual);
				charTable.put(actual, t + 1);
			} else {
				charTable.put(actual, 1);
			}
		}
	}

	private HashMap<Character, Integer> filterCharTable() {
		HashMap<Character, Integer> out = new HashMap<>();
		for (Entry<Character, Integer> entry : charTable.entrySet()) {
			if (entry.getValue() == 1)
				out.put(entry.getKey(), entry.getValue());
		}

		return out;
	}
}