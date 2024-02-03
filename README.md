SINGLE(TON) PATTERN:
Versichere, dass nur genau eine Instanz einer Klasse existiert. Stelle einen globalen Zugriffspunkt auf diese Instanz zur Verfügung.
Objekte die wir nur einmal brauchen: 
Einstellungen Logging, Caches, Grafische Komponenten, Verbindungen zur Datenbank, Netzwerk, ....

OBSERVER PATTERN:
Definiert eine eins-zu-viele Abhängigkeit zwischen Objekten, sodass bei einer Änderung eines Objekts alle abhängigen Objekte informiert und aktualisiert werden.
Funktioniert wie ein Abo für Zeitung/Magazin 
1. Verlag beginnt eine Zeitung zu veröffentlichen 
2. Abonnent*innen registrieren sich bei Verlag und erhalten neue Ausgaben 
3. Bestellen Abo ab wenn nicht mehr interessiert
Es gibt ein Subject(Publisher) und ein  Observer (Subscriber).

LOSE KOPPLUNG DURCH OBSERVER PATTERN: Subject weiß über Observer nur, dass Interface implementiert wird. Neue Observer
können während Laufzeit hinzugefügt werden Subject muss nicht angefasst werden um Observer hinzuzufügen. Subjects und Observers können unabhängig weiterverwendet werden. Änderung von Subject/Observer hat keinen Einfluss auf jeweils anderen.
