# Kotlin Fundamentals & Laboratory Exercises

Raccolta di esercizi pratici, teoria e primi algoritmi sviluppati durante le lezioni e le esercitazioni di laboratorio di Mobile Computing (EveryWareLab).

Il repository documenta il percorso di apprendimento del linguaggio **Kotlin**, focalizzandosi sui concetti cardine del linguaggio, la sintassi idiomatica e la forte interoperabilità con l'ecosistema Java e la JVM.

---

## 📌 Argomenti Trattati (Lezione 15)

* **Sintassi di Base e Tipizzazione:**
  * Dichiarazione di variabili immutabili (`val`) e mutabili (`var`).
  * *Type Inference* (inferenza automatica del tipo) e tipizzazione esplicita[cite: 7].
  * Conversioni di tipo esplicite (es. `.toInt()`, `.toDouble()`) per evitare promozioni automatiche ambigue[cite: 7].
  * Interpolazione di stringhe con `$` e `${...}`[cite: 7].
  * Uguaglianza strutturale (`==` che mappa su `.equals()`) vs uguaglianza di riferimento (`===`)[cite: 7].

* **Strutture di Controllo e Intervalli:**
  * Gestione dei range (`..` inclusivo, `..<` o `until` escluso, `downTo`, `step`)[cite: 9].
  * Il costrutto `if` come espressione (che sostituisce l'operatore ternario)[cite: 9].
  * Il costrutto `when` come evoluzione dello switch (con o senza argomento, match su range ed espressioni)[cite: 9].

* **Null Safety & Gestione dei Nullabili:**
  * Tipi nullable (`T?`) per prevenire le `NullPointerException` a tempo di compilazione[cite: 10].
  * *Smart Cast*: il compilatore riconosce automaticamente i controlli di non-nullità (`if (a != null)`)[cite: 10].
  * Operatore di chiamata sicura (`?.`) e pattern `?.let { ... }`[cite: 11].
  * Operatore Elvis (`?:`) per valori di fallback[cite: 11].

* **Collezioni (Collections):**
  * Distinzione tra collezioni immutabili (`List`, `Set`, `Map`) e mutabili (`MutableList`, `MutableSet`, `MutableMap`)[cite: 7].
  * Utilizzo di `Pair` e dell'operatore infisso `to` per la dichiarazione di mappe[cite: 7, 8].

* **Funzioni e Programmazione Funzionale:**
  * Funzioni top-level e parametri con valori di default o nominati[cite: 11, 12].
  * Funzioni a singola espressione (*single-expression functions*)[cite: 12].
  * Funzioni di ordine superiore (*higher-order functions*) che accettano altre funzioni come parametri[cite: 13, 14].
  * Lambda expressions, sintassi *trailing lambda*, uso della variabile implicita `it` e *closures* (cattura del contesto)[cite: 14, 15].

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