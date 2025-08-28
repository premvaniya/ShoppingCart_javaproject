
# 🏨 Hotel Seaside Ordering System

Welcome to **Hotel Seaside**, a simple Java-based console application that simulates a restaurant ordering experience. This project is ideal for beginners learning Java input/output, conditional logic, and user interaction.

---

## 📋 Features

- Displays a curated seafood menu
- Accepts user input for item selection
- Calculates total bill based on price and quantity
- Validates menu selection and handles invalid orders gracefully

---

## 🧑‍🍳 Menu Items

```
- Grilled Lobster Tail
- Garlic Butter Shrimp
- Pan-Seared Scallops
- Crab Cakes
- Baked Salmon with Lemon Herb Sauce
```

---

## 🚀 How It Works

1. The program welcomes the user and displays the menu.
2. It prompts the user to enter their desired dish.
3. If the dish matches one of the predefined menu items:
   - It asks for the price per plate.
   - It asks for the number of plates.
   - It calculates and displays the total bill.
4. If the dish is not on the menu, it asks the user to choose again.

---

## 🛠️ Requirements

- Java Development Kit (JDK) 8 or higher
- Any IDE or terminal that supports Java execution

---

## 💡 Example Interaction

```
Welcome to Hotel Seaside
Our menu =>
- Grilled Lobster Tail
- Garlic Butter Shrimp
- Pan-Seared Scallops
- Crab Cakes
- Baked Salmon with Lemon Herb Sauce
What would you like to order? Garlic Butter Shrimp
How many dollars for each? 12.5
How many Plates? 3
Your bill is 37.5$
```

---

## ⚠️ Notes

- The `switch` statement uses a multi-label case (Java 14+ feature). Ensure your compiler supports this syntax.
- Input is case-sensitive. Consider enhancing the app with `.equalsIgnoreCase()` or trimming whitespace for better UX.

---

## 📚 Learning Outcomes

This project helps reinforce:
- Java `Scanner` usage
- `switch-case` logic
- Basic arithmetic operations
- Console-based user interaction


