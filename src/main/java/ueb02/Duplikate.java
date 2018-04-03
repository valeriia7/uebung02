package ueb02;

class Duplikate {
	/**
	 * Gibt ein StringSet mit den Wörtern zurück, welche mindestens zwei mal im Text vorkommen.
	 * Alle Satzzeichen im Text sollen ignoriert werden.
	 * @param text Eingabetext, kann Satzzeichen enthalten welche ignoriert werden.
	 * @return StringSet mit den Wörtern, welche mind. zwei mal vorkommen.
	 */
	static StringSet findeDuplikate(String text) {
		StringSet s1 = new StringSetImpl();
		StringSet s2 = new StringSetImpl();

		// Satzzeichen entfernen; Vorsicht mit ? (beliebig viele) und . (jedes Zeichen)
		String[] satzz = {
				"\\?", "!", ",", "\\.", ":", "'", "\"", "-"
		};
		for (String z : satzz)
			text = text.replaceAll(z, "");

		for (String w : text.split(" ")) {
			// kennt das erste Set das Wort bereits, so tritt es zum 2. mal auf!
			if (s1.contains(w))
				s2.add(w);

			// jedes Wort in das erste Set einfuegen
			s1.add(w);
		}

		return s2;
	}
}
