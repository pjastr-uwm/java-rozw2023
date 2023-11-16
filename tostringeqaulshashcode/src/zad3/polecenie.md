3. Wykonaj poniższe czynności:

* Zdefiniuj klasę `Book`, która posiada następujące pola: `title`, `author` i `numberOfPages`.
* Napisz konstruktor, który przyjmuje trzy argumenty i waliduje je przed przypisaniem do odpowiednich pól.
    - Liczba stron (`numberOfPages`) nie powinna być ujemna. W przypadku podania wartości ujemnej, ustaw liczbę stron na jedną.
    - Pola `title` i `author` nie powinny być puste ani równać się null. W przypadku podania pustego napisu lub null, ustaw odpowiednio pusty napis.
* Dodaj metodę `toString()`, która zwraca informacje o książce w formacie: `"Book: [title] by [author], Pages: [numberOfPages]."`.
* Dodaj metodę `equals()`, która porównuje dwie książki na podstawie ich pól `title`, `author` i `numberOfPages`.
* Dodaj metodę `hashCode()`, która generuje kod hash dla odpowiedniego obiektu. Metoda ta powinna być zgodna z metodą `equals()`