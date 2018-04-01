_Übungsaufgabe zur Veranstaltung [Programmieren 2](https://hsro-wif-prg2.github.io) im [Bachelorstudiengang Wirtschaftsinformatik](https://www.fh-rosenheim.de/technik/informatik-mathematik/wirtschaftsinformatik-bachelor/) an der [Hochschule Rosenheim](http://www.fh-rosenheim.de)._


# Set und Duplikate

In dieser Übung implementieren wir die Datenstruktur _Set_ (siehe Interface `StringSet`), und verwenden sie anschließend um Wörter in Texten zu finden, welche mindestens zwei mal vorkommen.


## Teilaufgabe 1

Vervollständigen Sie die Klasse `StringSetImpl` in dem Sie die `add`, `contains`, `remove` und `size` Methoden implementieren
	- Implementieren Sie das Set als Baumstruktur, wie in der Vorlesung besprochen.
	- Implementieren Sie die notwendige Hilfsklasse als _innere Klasse_.
	- Bedenken Sie, dass die Klasse `String` die Methoden `equals` und `compareTo` bereitstellen, um Strings miteinander zu vergleichen.
	- Verifizieren Sie, dass der Test `StringSetTest` fehlerfrei abläuft.


## Teilaufgabe 2

Implementieren Sie die statische Methode `Duplikate.findeDuplikate()`, in der Sie nun das Set verwenden, um die Wörter in einem String zu finden, welche mindestens zwei mal vorkommen.
	- Die Methode `String.split` zerlegt einen String in ein Array von Strings.
	- Verifizieren Sie, dass der Test `testFindeDuplikate()` fehlerfrei abläuft.
