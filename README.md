# ScrumDemo
* przy uruchamianiu bazy lokalnie wykonać:<br>\- aktywować linię: spring.jpa.hibernate.ddl-auto=create w application.properties;<br>\- wykonać linie: 1, 2, 3 z resources/schema.sql_;<br>\- uruchomić aplikację i po odczekaniu zatrzymać;<br>\- aktywować linię: spring.jpa.hibernate.ddl-auto=none w application.properties;<br>\- wykonać linie: 4, 5 z resources/schema.sql_;<br>\- uruchomić i sprawdzić postmanem tworzenie wiersza w tabeli (json taki jak model)

* przy uruchamianiu bazy zdalnej wykonać:<br>\- poprawić linię 3 w application.properties (IP)

* podgląd danych w intellij: linia 6 w resources/schema.sql_
