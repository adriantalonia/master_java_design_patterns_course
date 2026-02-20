# ☕ Java Design Patterns – Hands-On Course

> Master the Design Patterns Every Java Developer Should Know — with Hands-On Projects, Live Coding, and Real-World Examples.

---

## 📖 About This Course

This course covers the most essential **Java Design Patterns**, based on the classic **Gang of Four (GoF)** book. Each pattern is brought to life with modern Java and explained in a clear, practical, and easy-to-follow way.

You'll build **real Java applications** using each pattern so you understand *how* and *when* to use them in real-world development — no copy/paste programming, just live coding from scratch.

> 🏆 From the instructor behind **800,000+ students** and **82,000+ reviews** — the #1 Java course on Udemy.

---

## 🎯 What You'll Learn

### 🔨 Creational Patterns
- **Factory** – Decouple object creation from usage
- **Abstract Factory** – Families of related objects
- **Singleton** – Single instance management
- **Builder** – Step-by-step object construction
- **Prototype** – Object cloning

### 🏗️ Structural Patterns
- **Adapter** – Bridge incompatible interfaces
- **Bridge** – Separate abstraction from implementation
- **Composite** – Tree structures of objects
- **Facade** – Simplified interface to complex systems
- **Decorator** – Dynamic behavior extension

### 🔄 Behavioral Patterns
- **Chain of Responsibility** – Pass requests along a chain
- **Iterator** – Sequential collection access
- **Observer** – Event-driven communication
- **Strategy** – Interchangeable algorithms

---

## 🛠️ Tools & Technologies

| Tool | Details |
|------|---------|
| **Java** | Java 25+ (compatible with Java 17+) |
| **IDE** | IntelliJ IDEA (free Community Edition) |
| **Build Tool** | Maven |

---

## 🚀 Getting Started

### Prerequisites
- Basic Java programming experience (beginner level is fine!)
- IntelliJ IDEA installed ([download free version](https://www.jetbrains.com/idea/download/))
- Java 17+ installed ([download here](https://adoptium.net/))

### Clone the Repository

```bash
git clone https://github.com/adriantalonia/master_java_design_patterns_course
cd master_java_design_patterns_course
```

### Build the Project

```bash
mvn clean install
```

### Run a Pattern Example

```bash
mvn exec:java -Dexec.mainClass="com.example.patterns.singleton.SingletonDemo"
```

---

## 📁 Project Structure

```
java-design-patterns/
├── creational/
│   ├── factory/
│   ├── abstract-factory/
│   ├── singleton/
│   ├── builder/
│   └── prototype/
├── structural/
│   ├── adapter/
│   ├── bridge/
│   ├── composite/
│   ├── facade/
│   └── decorator/
├── behavioral/
│   ├── chain-of-responsibility/
│   ├── iterator/
│   ├── observer/
│   └── strategy/
└── README.md
```