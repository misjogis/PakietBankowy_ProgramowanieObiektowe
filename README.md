# PakietBankowy_ProgramowanieObiektowe
repozytorium rozwijane na potrzeby ćwiczeń z Programowania Obiektowego

## Zaczęliśmy na laboratotium 4, 4-5 kwietnia 2020

### Zadanie 3 – Tworzenie i rozwój pakietu symulującego prace banku
UWAGA: to zadanie będzie sukcesywnie rozwijane podczas kolejnych ćwiczeń, zachęcam do przechowywania go w repozytorium Git (lokalnie) oraz GitHub (zdalnie). Proszę skorzystać z wiedzy i umiejętności przekazywanych na przedmiocie Narzędzia Informatyki.

* Podzadanie 3.1 – Tworzenie prostego pakietu bankowego
* Podzadanie 3.2 – Tworzenie klienta banku
* Podzadanie 3.3 – Rozbudowa klasy Konto

Kolejne commity będą zgodne z tymi zadaniami

## Dalej na laboratotium 5, 25-26 kwietnia 2020

### Zadanie 4 – Rozwój pakietu symulującego prace banku
UWAGA: to zadanie było i będzie sukcesywnie rozwijane podczas kolejnych ćwiczeń.

* Podzadanie 4.1 – Wykorzystanie tablic do reprezentowania zależności 1 do wielu

* Podzadanie 4.2 – Wykorzystanie kolekcji do realizacji zależności 1 do wielu

*UWAGA: tu jednak stosujemy ArrayList, bo jakikolwiek Set nie pozwala nam na numerację klientów, czy też kont*

Kolejne commity będą zgodne z tymi zadaniami

## Duże zmiany ilustrujące różne mechanizmy - do analizy podczas laboratotium 7, 30-31 maja 2020

* Wprowadzono dzidziczenie w postaci nowych rodzajów kont

* Wprowadzono wyjątki w postaci wyjątku zabezpieczającego wypłątę ponad saldo

* Zmieniono pokietyzację, pojawiłsię nowy pakiet odpowiedzialny za raporty, klasy związane czysto z bankiem zostały przeniesione do pakietu **domain**

* Wprowadzono wzorzec projektowy **Singleton** - klasa **Bank** jest Singletonem, można ją utworzyć tylko raz.
