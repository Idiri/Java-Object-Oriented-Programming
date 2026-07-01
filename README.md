# Java Object-Oriented Programming

A hands-on collection of Java programs built while learning OOP fundamentals. Each project demonstrates core concepts through practical, runnable examples — from a fantasy RPG to a smart home system to a role-based security model.

---

## Concepts Covered

| Concept | Where to Find It |
|---|---|
| Encapsulation | `Person.java`, `Car.java`, `Student.java` |
| Inheritance | `LectureExercises/`, `Employee.java`, `superclass.java` |
| Polymorphism | `HeroGame.java`, `HomeMain.java` |
| Abstract Classes | `GameCharacter.java`, `Device.java`, `SecurityProject/User.java` |
| Interfaces | `Healable.java`, `Adjustable.java`, `Connectable.java`, `SecurityProject/Authorized.java` |
| Method Overloading | `Overload.java` |
| Custom Exceptions | `SecurityProject/SecurityBreachException.java` |
| Exception Handling | `QuotientWithException.java`, `TestCircleWithException.java` |
| File I/O | `ReadData.java`, `TestFileClass.java`, `TryWithResourceDemo.java` |
| Collections (ArrayList) | `ArrayListDemo.java`, `SecurityProject/SecurityMain.java` |

---

## Projects

### Hero Game
> Abstract classes + Interfaces + Polymorphism in a fantasy RPG

**Files:** `GameCharacter.java`, `Warrior.java`, `Mage.java`, `Healable.java`, `HeroGame.java`

`GameCharacter` is an **abstract class** that defines the template for all heroes — name, level, health, damage mechanics, and an abstract `performAction()`. `Warrior` and `Mage` each **extend** it and **implement** the `Healable` interface. `HeroGame` runs the simulation, treating all characters uniformly via polymorphism and using `instanceof` to safely cast before calling `heal()`.

```
GameCharacter (abstract)
├── Warrior  implements Healable
└── Mage     implements Healable
```

**Run:**
```bash
javac GameCharacter.java Healable.java Warrior.java Mage.java HeroGame.java
java HeroGame
```

**Expected output:**
```
--- The Adventure Begins ---
Ragnar swings a massive sword!
Merlin casts a fireball!

--- Combat and Healing ---
Ragnar took a hit!
Ragnar restored 15 health! Current health is: 85.0
Merlin restored 15 health! Current health is: 115.0
```

---

### Smart Home
> Multiple interface implementation + Abstract device hierarchy

**Files:** `Device.java`, `SmartLight.java`, `SmartSpeaker.java`, `Adjustable.java`, `Connectable.java`, `HomeMain.java`

`Device` is an **abstract class** with a `powerButton()` toggle and abstract `displayStatus()`. `SmartLight` implements `Adjustable` (controls brightness). `SmartSpeaker` implements both `Adjustable` (volume) and `Connectable` (WiFi). `HomeMain` iterates over devices and calls interface methods only after `instanceof` checks — a real-world pattern for working with mixed object types.

```
Device (abstract)
├── SmartLight   implements Adjustable
└── SmartSpeaker implements Adjustable, Connectable
```

**Run:**
```bash
javac Device.java Adjustable.java Connectable.java SmartLight.java SmartSpeaker.java HomeMain.java
java HomeMain
```

---

### Security System
> Role-based access control with a custom exception

**Files:** `SecurityProject/`

`User` is an **abstract class** with private fields, encapsulated via getters/setters, and a `login()` method. `Admin` extends `User` and implements the `Authorized` interface, giving it access to a vault — protected by a **custom checked exception** (`SecurityBreachException`) when the wrong PIN is used. `Guest` inherits `User` but has no `Authorized` access. `SecurityMain` stores both in an `ArrayList` and processes them polymorphically.

```
User (abstract)
├── Admin  implements Authorized
└── Guest
```

**Run:**
```bash
cd SecurityProject
javac User.java Authorized.java SecurityBreachException.java Admin.java Guest.java SecurityMain.java
java SecurityMain
```

**Expected output:**
```
Full System Access granted
Attempting to open Alice's vault...
SECURITY EVENT: CRITICAL: Unauthorized Vault Access Attempted!
Accessing database... Logs decrypted
----------------------
Read only access
Access Denied for: Bob
----------------------
```

---

### Lecture Exercises
> Basic inheritance and method overriding

**Files:** `LectureExercises/Animal.java`, `Cat.java`, `Dog.java`, `Fish.java`

`Animal` defines a generic `move()` method. Each subclass overrides it with its own behavior. The simplest entry point for understanding the inheritance chain and `@Override`.

```
Animal
├── Cat   → "The cat is running"
├── Dog   → "The dog is running"
└── Fish  → "The fish is swimming"
```

---

## Standalone Demos

| File | Demonstrates |
|---|---|
| `Person.java`, `Car.java`, `Student.java` | Constructors, fields, basic encapsulation |
| `Employee.java`, `Main3.java` | Simple inheritance with `super()` |
| `Overload.java` | Constructor overloading |
| `superclass.java`, `Organism.java`, `Plant.java`, `Dawg.java` | Inheritance chains |
| `ArrayListDemo.java` | `ArrayList` — add, loop, remove |
| `QuotientWithIf.java` | Preventing division-by-zero without exceptions |
| `QuotientWithException.java` | Handling division-by-zero with `try/catch` |
| `TestCircleWithException.java` | Custom exception in a geometry context |
| `InputMismatchExceptionDemo.java` | Catching bad user input |
| `ReadData.java` | Reading a file with `Scanner` |
| `TestFileClass.java` | Inspecting files with the `File` class |
| `TryWithResourceDemo.java` | Try-with-resources for auto-closing streams |

---

## How to Compile & Run

```bash
# Single file with a main()
javac FileName.java
java FileName

# Multiple dependent files
javac File1.java File2.java MainFile.java
java MainFile

# A subdirectory project (e.g. SecurityProject)
cd SecurityProject
javac *.java
java SecurityMain
```

> Requires Java 11 or higher. No external dependencies.
