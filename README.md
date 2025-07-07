# S03.02 - Patterns02

---

# 🎯 Objectives

- Learn to identify and handle software construction patterns.

---

## 📝 Description

Let's delve deeper into software construction patterns. Think carefully before building your software!

---

## 🔹 Level 1

In all exercises, create a Gradle project with a `Main` class that demonstrates the use of the pattern (with the necessary invocations).

### 📘 Exercise 1 - Builder

Develop a pizza order management system using the Builder design pattern in Java. The system must allow the creation of different types of pizzas with varying size, dough, and topping configurations.

Define a `Pizza` class with the following attributes:
* `size`
* `dough` (dough type)
* `toppings` (ingredients)

Create a `PizzaBuilder` interface with the necessary methods to configure the size, dough, and toppings of a pizza.

Implement one or more classes that act as concrete builders (`PizzaBuilder`) for different types of pizzas. For example, you could have a builder for Hawaiian pizza, another for vegetarian pizza, etc.

Develop a `MasterPizzaiolo` class that receives a `PizzaBuilder` and allows building pizzas in a specific way.

In the main program (`Main`), create instances of `PizzaBuilder` and `MasterPizzaiolo`, and use them to build pizzas with different configurations.

---

## 🔹 Level 2

### 📘 Exercise 1 - Observer

Design a system where a Stock Broker (Observable) notifies various Stock Agencies (Observers) of changes when the stock market goes up or down.

It is necessary for the Observable object to maintain references to the Observers.

---

## 🔹 Level 3

### 📘 Exercise 1 - Callback

Simulate a payment gateway that receives an encapsulating object for the payment method to be executed: credit card, PayPal, or bank account debit.

The gateway will invoke the payment without knowing the form and returning control to the origin class.
The class that invokes the payment gateway will be a shoe store.

---

# 🛠️ Technologies Used

- Java 21

---

## ⚙️ Installation & Execution

### 📋 Requirements

To run this project, you need:

- Java Development Kit (JDK) 21 or higher
- Gradle
- Eclipse or IntelliJ IDEA
- Git

---

### 🛠️ Installation

1.  Make sure **JDK 21** or higher is installed.
2.  Clone this repository:
    ```sh
    git clone https://github.com/DiegoBalaguer/S0302-Patterns02.git>
    ```
3.  Open the project with your preferred IDE (Eclipse or IntelliJ).
4.  Build the project with Gradle (if applicable):
    ```sh
    gradle build
    ```

---

### ▶️ Execution

1.  From your IDE:
    * Open the `main()` method in the `Principal` class or any exercise class.
    * Run the file directly using your IDE's run configuration.

2.  (Optional) From the command line (if using Gradle):
    ```sh
    gradle run
    ```

---

# 🌐 Deployment

This project is for **educational purposes** and is intended for **local development only**. No deployment or external environment is required.

---

## 📦 Repository

You can find the full source code on GitHub:
🔗 👉 https://github.com/DiegoBalaguer/S0302-Patterns02.git>

---

## ✅ Author Notes

These exercises are designed to give you practical experience with software design patterns, focusing on Builder, Observer, and Callback patterns.

Feel free to explore, modify, and expand upon the base code!

Happy coding! 🚀
