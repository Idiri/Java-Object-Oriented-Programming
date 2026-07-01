# Java Object-Oriented Programming

A structured collection of Java OOP implementations, ranging from isolated concept exercises to full exam-simulation systems built under time constraints. The repository tracks a deliberate progression: single-concept demos → multi-class domain models → iterative exam re-attempts with visible refinement between sessions.

---

## Repository Structure

```
src/
├── ArrayOfObjects/          Arrays of custom objects, iteration patterns
├── OverloadedConstructors/  Constructor overloading
├── eksamensøving/           Exam practice sessions (NO) — draft/in-progress
│   └── sesh1, sesh2, sesh5, sesh7   Iterative re-attempts of past exams
├── exams/                   Exam practice sessions (NO) — cleaned/final
│   └── session1, session2, session3, h2025, vr2025
└── exercises/oop/           Concept-isolated exercises (EN), Bro Code course order
```

`eksamensøving` and `exams` model the same recurring problem sets. The former holds working drafts with syntax errors and stubs; the latter holds the refactored, compiling versions. Diffing the two shows the actual learning progression rather than just the end state.

---

## Concept Coverage

| Concept | Primary Location | Notes |
|---|---|---|
| Encapsulation | `exercises/oop/getterSetter/`, `sesh1/Person.java` | Validated setters, private fields |
| Multi-level inheritance | `exercises/oop/inheritance/`, `sesh1/`, `exams/` | `Organism → Animal → Dog/Cat`; `Person → Student/Ansatt` |
| Abstract classes | `exams/session1/Dyr.java`, `exams/session2/Konto.java` | Abstract method contracts (`lagLyd()`, `utførTransaksjon()`) |
| Interfaces | `sesh2/Kreditt.java`, `exercises/oop/interfaces/` | Single and multi-interface implementation |
| Polymorphism | `exercises/oop/polymorphism/`, `exams/session1/` | Static array of base type, dynamic dispatch at runtime |
| Constructor overloading | `OverloadedConstructors/User.java` | 0–3 parameter variants |
| Custom exceptions | `oppgave2/BrukerFeil.java`, `sesh5/.../FeilInntastingUnntak.java` | Both extend `Exception` (checked) |
| Multithreading | `oppg3/Timer.java`, `exams/session2/SaldoKalkulator.java` | See threading evolution below |
| File I/O | `FilSkriverTraad.java`, `exercises/oop/*` | Thread-based file writes, `Scanner` file reads |
| Collections | Most modules | `ArrayList`, `Collections.shuffle()`, lambda `removeIf` |

---

## Threading: Design Evolution

The codebase shows a deliberate shift in concurrency approach across sessions, not just repeated examples:

| Stage | Location | Approach | Issue Addressed |
|---|---|---|---|
| Early | `eksamensøving/oppg3/Timer.java` | `extends Thread` | Ties the class to a single inheritance slot |
| Mid | `exams/session2/SaldoKalkulator.java` | `extends Thread`, but with **work partitioning** across `Runtime.getRuntime().availableProcessors()` | Introduces parallel workload splitting on a fixed dataset (1000 accounts) |
| Final | `sesh7/Eksamenvr2025Oppgave3.java`, `exercises/oop/multithreading/` | `implements Runnable` | Frees the class to extend something else later; matches idiomatic Java concurrency style |

Same pattern for exception handling: `oppgave3/StudentAdministrasjonSystem` uses ad-hoc validation, while `sesh5/EksamenV2024Oppgave3.java` introduces a dedicated checked exception (`FeilInntastingUnntak`) plus a background search thread — the more defensive, production-shaped version of the same feature.

---

## Domain Models (Recurring Across Sessions)

Two problem domains reappear 3–4 times each, reimplemented from scratch under exam conditions:

**University Administration** — `Person → Student / Ansatt`, with `Emne` (course) and `Karakter` (grade) as the association layer, aggregated in `Institutt`.
- Draft versions (`eksamensøving/sesh1`, `sesh5`) use `ArrayList`.
- Clean version (`exams/` top level) switches to fixed-size arrays with manual index counters — a constraint check, not a regression.

**Airline Booking** — `Flyselskap` aggregates `Flight`, `Booking`, and `kunde`/`Bedriftskunde` (customer hierarchy). Reimplemented in `exam2022/oppgave1` and cleanly in `exams/vr2025/oppgave1` under the renamed `Kunde/Firma` model.

---

## Module Reference

### `exercises/oop/` — Concept Isolation (English)

One concept per folder, minimal surface area, inline explanatory comments.

| Folder | Concept | Example |
|---|---|---|
| `abstraxt/` | Abstract classes | `Shape → Circle, Rectangle, Triangle` |
| `aggregation/` | Has-a, independent lifecycle | `Library` holds an externally-created `Book[]` |
| `composition/` | Part-of, owned lifecycle | `Car` instantiates its own `Engine` internally |
| `interfaces/` | Multiple interface implementation | `Fish implements Predator, Prey` |
| `polymorphism/dynamic/` | Runtime dispatch | `Scanner`-driven type selection, `Animal` reference resolves to actual subtype |
| `statix/` | Static state | `Friend` tracks count via static field/method |
| `supahclass/` | `super()` chaining | `Person → Student/Employee` constructor delegation |
| `threading/` | Background execution | Countdown thread vs. blocking `Scanner` read on main thread |

### `exams/` — Refined Exam Solutions (Norwegian)

| Session | Problem | Key Classes |
|---|---|---|
| `session1` | Zoo / animal sounds | `Dyr` (abstract), `Løve`, `Tiger`, `Zookeeper` |
| `session2` | Bank accounts, parallel balance sum | `Konto` (abstract), `Brukskonto`, `Sparekonto`, `SaldoKalkulator` |
| `session3` | Shopping list | `Handleliste` |
| `h2025/oppgave2` | Tournament group draw | `Turnering → Pulje → Lag → Kamp` |
| `vr2025/oppgave1` | Customer/firm credit model | `Kunde`, `BedriftsKunde`, `Kreditt` |
| `vr2025/oppgave3` | Threading benchmark (3-thread) | `Timer`, `ThreadTest` |

---

## Language Note

Identifiers in `eksamensøving/` and `exams/` are in Norwegian — these mirror actual exam problem statements and are kept untranslated intentionally, to preserve fidelity with the source material. `exercises/oop/` is entirely in English.

---

## Build & Run

No build tool — plain `javac`/`java`, no external dependencies.

```bash
# Single file with main()
javac FileName.java
java FileName

# Multi-class module
javac File1.java File2.java MainFile.java
java MainFile

# Subdirectory module (e.g. exams/session2)
cd exams/session2
javac *.java
java Main
```

**Requirement:** JDK 11+.

---

## Status

| Area | State |
|---|---|
| `exercises/oop/` | Stable — all files compile and run |
| `exams/` | Stable — final/reviewed versions |
| `eksamensøving/` | Draft — some files contain stubs or syntax errors by design (working history, not dead code) |
