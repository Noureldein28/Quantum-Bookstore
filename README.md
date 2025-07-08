# Quantum Bookstore Management System

A Java-based online bookstore management system that handles different types of books with inventory management, purchasing, and automated services.

## Overview

The Quantum Bookstore is an object-oriented system designed to manage an online book inventory with support for multiple book types, automated shipping, and email services. The system follows extensible design principles to easily accommodate new book types in the future.

## Features

- **Multi-type Book Management**: Support for Paper Books, E-Books, and Showcase Books
- **Inventory Management**: Add, remove, and track books in the system
- **Purchase System**: Handle book purchases with quantity validation
- **Automated Services**: Integration with shipping and email services
- **Outdated Book Removal**: Automatically remove books that exceed maximum age
- **Stock Management**: Track and validate stock levels for physical books
- **Extensible Design**: Easy to add new book types without modifying existing code

## System Architecture

### Core Classes

#### Book (Abstract Base Class)
- **Properties**: ISBN, title, year published, price
- **Methods**: Getters/setters, abstract Buy method, outdated book detection
- **Purpose**: Defines common book attributes and behavior

#### Book Types

1. **paperBook**
   - Extends Book, implements shippingService
   - Has stock management
   - Validates quantity before purchase
   - Integrates with shipping service

2. **EBook**
   - Extends Book
   - Has file type property
   - Integrates with mail service for digital delivery

3. **showcaseBook**
   - Extends Book
   - Not available for purchase (display only)

#### Services

- **shippingService**: Interface for physical book delivery
- **mailService**: Interface for digital book delivery

#### Management System

- **InventorySystem**: Central management for all book operations
  - Add/remove books
  - Purchase handling
  - Outdated book cleanup


## Usage Examples

### Adding Books to Inventory

```java
InventorySystem store = new InventorySystem();

// Add a paper book
store.addBook(new paperBook("111a", 50, "Head First Design Patterns", 2015, 5));

// Add a paper book 
store.addBook(new PaperBook("123s",50 ,"Grokking Algorithm" ,2015,5));

// Add an e-book
store.addBook(new EBook("00a", 30, "Head First Object-Oriented Analysis", 2006, "PDF"));

// Add a showcase book
store.addBook(new showcaseBook("000", 0, "Introduction to Operating Systems", 1990));
```

### Purchasing Books

```java
// Buy paper book  (ISBN, quantity, email, address)
store.buyBook("111a", 6, "noureldein2808@gmail.com", "Cairo");

// Buy paper book  (ISBN, quantity, email, address)
store.buyBook("123s" , 2 ,"noureldein2808@gmail.com","Cairo"  );

// Buy e-book 
store.buyBook("00a", 2, "noureldein2808@gmail.com", "");

// Try to buy showcase book 
store.buyBook("000", 1, "noureldein2808@gmail.com", "");
```

### Removing Outdated Books

```java
// Remove books older than 5 years (as of 2025)
store.removeOutdatedBooks(5, 2025);
```

## Program Screenshots

### Complete Program Execution
![Run from the Main](screenshots/Runningprogram.png.png)

### Complete main program function
![main function](screenshots/Quantumbookstorefulltest.png)


