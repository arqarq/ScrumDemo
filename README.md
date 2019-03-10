# ScrumDemo
* przy uruchamianiu bazy lokalnie wykonać:
- aktywować linię:
  spring.jpa.hibernate.ddl-auto=create w application.properties;
- wykonać linie: 1, 2, 3 z resources/mysql.sql;
- uruchomić aplikację i zatrzymać;
- aktywować linię:
  spring.jpa.hibernate.ddl-auto=none w application.properties;
- wykonać linie: 4, 5 z resources/mysql.sql;
- uruchomić i sprawdzić postmanem tworzenie wiersza w tabeli (json taki jak model)

* przy uruchamianiu bazy zdalnej wykonać:
- poprawić linię 3 w application.properties (IP)

* podgląd danych w intellij: linia 6 w resources/mysql.sql
