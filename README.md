# Kotlin Fundamentals & Laboratory Exercises

Raccolta di esercizi pratici, teoria e pattern sviluppati durante le lezioni e le esercitazioni di laboratorio di Mobile Computing (EveryWareLab).

Il repository documenta il percorso di apprendimento del linguaggio **Kotlin**, focalizzandosi sui costrutti avanzati, la programmazione orientata agli oggetti (OOP) e l'interoperabilità con la JVM.

---

## 📌 Argomenti Trattati

### 1. Fondamenti e Funzionale (Lezione 17)
* **Sintassi di Base e Tipizzazione:** Variabili (`val` / `var`), inferenza di tipo (*type inference*) e conversioni esplicite (`.toInt()`)[cite: 7].
* **Null Safety:** Tipi nullable (`T?`), operatori di chiamata sicura (`?.`), pattern `?.let { ... }` ed operatore Elvis (`?:`)[cite: 10, 11].
* **Control Flow:** Gestione di range (`..`, `until`), espressioni `if` e `when`[cite: 9].
* **Funzioni e Lambda:** Funzioni di ordine superiore, lambda expressions, sintassi *trailing lambda*, uso della variabile `it` e *closures*[cite: 13, 14, 15].

### 2. Object-Oriented Programming in Kotlin (Lezione 18)
* **Classi e Costruttori:** Costruttore primario integrato nella classe (`class Person(val name: String)`) e costruttori secondari concatenati tramite `constructor(...) : this(...)`[cite: 28, 29, 34, 35].
* **Inizializzazione:** Uso del blocco `init` per l'esecuzione di codice generico all'atto della creazione dell'istanza[cite: 33].
* **Data Classes & Enum Classes:** Classi di dati con generazione automatica di `equals`, `toString`, `copy`[cite: 38] ed enumerazioni gestite tramite `when`[cite: 39].
* **Proprietà Avanzate:** Getter e setter personalizzati con la variabile di supporto implicita `field`, e *computed properties* (proprietà calcolate al volo)[cite: 41, 43].
* **Pattern Singleton e Membri Statici:** Utilizzo di `object` per i singleton e di `companion object` all'interno delle classi[cite: 48, 49, 50].
* **Ereditarietà e Polimorfismo:** Classi e membri chiusi di default (keyword `open`), classi astratte, interfacce e l'obbligo di usare la keyword `override`[cite: 53, 54, 57, 58].
* **Smart Cast e Controllo dei Tipi:** Operatore `is` (analogo a `instanceof`) per il cast implicito e gestione del downcasting[cite: 63].
* **Extension Functions / Properties:** Aggiunta di metodi e proprietà a classi esistenti senza modificarne il codice sorgente[cite: 70].
* **Scope Functions:** Funzioni predefinite come `.let`, `.run`, `.with`, `.apply`, `.also` per scrivere codice compatto[cite: 75, 76].

---

## 🛠️ Tecnologie e Strumenti

* **Linguaggio:** Kotlin
* **Runtime:** Java Development Kit (JDK 17+)
* **Ambiente di sviluppo:** Visual Studio Code
* **Build / Compilatore:** `kotlinc` / JVM CLI

---

## 🚀 Compilazione ed Esecuzione

```bash
# Verifica della versione
kotlinc -version

# Compilazione e creazione del jar eseguibile
kotlinc NomeFile.kt -include-runtime -d NomeFile.jar

# Esecuzione
java -jar NomeFile.jar