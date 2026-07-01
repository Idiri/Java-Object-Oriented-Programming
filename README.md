# Java Object-Oriented Programming

Java codebase built for learning OOP fundamentals, data structures and algorithms, and exam preparation. Content is split between isolated concept exercises and full domain models built under exam conditions, with a deliberate workflow separating drafts from final solutions.

---

## Repository Structure

| Directory | Purpose |
|---|---|
| `docs/` | Reference material — PDFs, slide decks, diagrams. Not code. |
| `eksamensøving/` | Draft workspace for exam problems. Expect stubs, incomplete logic, and syntax errors — this is working history, not dead code. |
| `exams/` | Final, refactored exam solutions. Everything here compiles and runs. |
| `exercises/` | Concept-isolated OOP exercises (inheritance, polymorphism, interfaces, threading, etc.). One concept per unit. |
| `LectureExercises/` | Exercises tied directly to lecture material — smaller scope than `exercises/`. |
| `SecurityProject/` | Standalone project: role-based access control with a custom checked exception. |
| `src/` | Miscellaneous top-level source files and entry points (`Main.java` and similar). |

---

## Refinement Workflow

`eksamensøving/` and `exams/` are not duplicates — they represent two stages of the same problem set.

1. **Draft (`eksamensøving/`)** — First pass at an exam problem under time pressure. Code here may not compile. Logic is stubbed where the design isn't settled yet. This is intentional: it's a scratchpad, not a deliverable.
2. **Refactor (`exams/`)** — Once the design is correct, the draft is rewritten from scratch in `exams/`. This step typically fixes structural issues (`Thread` subclassing replaced with `Runnable`, `ArrayList` swapped for fixed-size arrays where the problem constrains it, ad-hoc validation replaced with checked exceptions).

If you want to see the actual learning progression rather than just the final answer, diff a problem's `eksamensøving/` version against its `exams/` counterpart.

---

## Build & Run

No build tool. Plain `javac` / `java`, no external dependencies.

```bash
# Single file with a main()
javac FileName.java
java FileName

# Multi-class module
javac File1.java File2.java MainFile.java
java MainFile

# Subdirectory project (e.g. SecurityProject)
cd SecurityProject
javac *.java
java Main
```

**Requirement:** JDK 11+.
