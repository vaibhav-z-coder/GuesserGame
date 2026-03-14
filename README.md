# 🎯 Guesser Game (Java)

A simple **console-based Java game** where one player (Guesser) thinks of a number and multiple players try to guess it.
An **Umpire** collects all guesses and decides the winner.

This project demonstrates **basic Object-Oriented Programming (OOP)** concepts in Java.

---

## 📌 Features

* 🧠 One **Guesser** selects a secret number
* 👥 **Three Players** try to predict the number
* ⚖️ **Umpire** compares all guesses
* 🏆 Announces the **winner**
* 💻 Simple **terminal-based gameplay**

---

## 🏗️ Project Structure

The program is divided into four main classes:

| Class         | Responsibility                          |
| ------------- | --------------------------------------- |
| `GuesserGame` | Main class that starts the game         |
| `Guesser`     | Chooses the secret number               |
| `Player`      | Players who guess the number            |
| `Umpire`      | Collects numbers and decides the winner |

---

## 🧠 How the Game Works

1. The **Guesser** enters a secret number.
2. Three **Players** try to guess the number.
3. The **Umpire** collects all guesses.
4. The **Umpire compares** the numbers.
5. The correct player **wins the game**.

---

## 🔄 Game Flow

```
Guesser chooses a number
        │
        ▼
Players guess numbers
        │
        ▼
Umpire collects all guesses
        │
        ▼
Umpire compares numbers
        │
        ▼
Winner is announced 🎉
```

---

## ▶️ How to Run the Program

### 1️⃣ Compile the Java file

```bash
javac GuesserGame.java
```

### 2️⃣ Run the program

```bash
java GuesserGame
```

---

## 💻 Example Output

```
Guesser, Please guess a number :
5

Please guess a number :
2

Please guess a number :
5

Please guess a number :
8

Yay!! Player 2 has won the game!
```

---

## 📚 Concepts Used

* Java Classes and Objects
* Methods
* Scanner for user input
* Basic Conditional Statements
* Object-Oriented Design

---

## 🚀 Future Improvements

Possible upgrades for the game:

* 🎲 Random number generator
* 👥 Unlimited players
* 🔁 Play again option
* 🏆 Scoreboard system

---

## 👨‍💻 Author

**Vaibhav Singh**

Learning Java and building small projects to understand **Object-Oriented Programming**.

---

⭐ If you like this project, consider **starring the repository!**
