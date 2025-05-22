# 💳 Credit Card Purchase Tracker - Java

This Java program simulates a simple credit card system where a user can input purchases until their credit limit is reached. It tracks purchases, checks for sufficient balance, and displays a sorted purchase history along with the remaining card balance.

## 📝 Features

- User inputs credit card limit.
- Iterative input of purchase description and price.
- Validation against remaining balance before approving purchase.
- Stops input if balance is insufficient or user chooses to exit.
- Displays sorted purchase history by purchase description.
- Shows remaining card balance at the end.

## 📂 Classes Overview

- **Main:** Handles user interaction, purchase input loop, and displays results.
- **CreditCard (assumed):** Manages credit limit, balance, and purchase list.
- **Buy (assumed):** Represents a purchase with description and price, implements comparable for sorting.

## 🚀 How to Use

1. Run the `Main` class.
2. Enter your credit card limit.
3. For each purchase, enter the description and price.
4. If the purchase is approved (enough balance), you can choose to continue or exit.
5. If the purchase exceeds the balance, the program stops.
6. Finally, a sorted list of all purchases and the remaining balance are shown.

## 🧠 Concepts Illustrated

- User input handling with `Scanner`.
- Object-oriented programming for purchases and credit card management.
- List sorting with `Collections.sort()`.
- Control flow with loops and conditionals.

## ⚙️ Requirements

- Java JDK 8 or higher.
- Classes `CreditCard` and `Buy` implemented with appropriate methods (`doBuy`, `getBuys`, etc.) and comparable interface for sorting `Buy` objects.

---

Made with ☕ Java to practice input handling, collections, and simple financial logic.