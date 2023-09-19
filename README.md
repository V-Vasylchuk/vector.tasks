## Vector Coding Tasks

This repository contains solutions to five coding tasks related to various topics. 
Each task is described below along with a brief summary of the solution.

## Task 1: Rail Fence Cipher

### Description:
* Implement encoding and decoding functions for the Rail Fence Cipher.
* Encoding places characters in a diagonal pattern along a set of "rails."
* Decoding reverses this process to retrieve the original string.

### [Solution](https://github.com/V-Vasylchuk/vector.tasks/blob/c6f237c20020c026d4d464e3579188a9381d695b/src/main/java/first/RailFenceCipherEncoder.java)
*   Two functions are provided: `encode` and `decode`.
*   These functions take a string and the number of rails as arguments.
*   They return the encoded and decoded strings, respectively.
*   The solution assumes that the number of rails is at least 2 and handles empty strings gracefully.

## Task 2: Digit Transformation
### Description
* Transform a number by adding one to each of its digits.
* If a digit is 9, it is replaced with 10.

### [Solution](https://github.com/V-Vasylchuk/vector.tasks/blob/c6f237c20020c026d4d464e3579188a9381d695b/src/main/java/second/DigitsTransformer.java)
* A function `transform` is provided.
* It takes a number from console and returns the transformed number.
* The transformation is done without converting the number to a string.

## Task 3: Sudoku Validation
### Description
* Validate a Sudoku puzzle of size NxN (where N > 1 and √N is an integer).
* Ensure that no number appears more than once in a row, column, or small square.

### [Solution](https://github.com/V-Vasylchuk/vector.tasks/blob/c6f237c20020c026d4d464e3579188a9381d695b/src/main/java/third/SudokuValidator.java)
* A function `validateSudoku` is provided.
* It takes a multidimensional array representing the Sudoku puzzle and returns true if it's valid, false otherwise.
* The solution checks the dimensions and validates the rules of Sudoku.

## Task 4: Sortable Shapes
### Description
* Create four different shapes (Square, Rectangle, Triangle, Circle) that can be sorted by area.
* Define the area calculation for each shape.

### [Solution](https://github.com/V-Vasylchuk/vector.tasks/blob/c6f237c20020c026d4d464e3579188a9381d695b/src/main/java/fourth)
* Four shape classes are provided: Square, Rectangle, Triangle, and Circle, all implementing the Shape interface.
* Each shape has an getArea method to calculate its area.
* Shapes can be added to a list and sorted based on area.

## All solutions above, have unit tests: [Link](https://github.com/V-Vasylchuk/vector.tasks/blob/c6f237c20020c026d4d464e3579188a9381d695b/src/test/java)

## Task 5: MyShop Database
### Description
* Create and populate a database named `MyShop` with three tables: `Products`, `Categories`, and `Suppliers`.
* Perform various database operations, including data insertion and retrieval.

### [Solution](https://github.com/V-Vasylchuk/vector.tasks/blob/c6f237c20020c026d4d464e3579188a9381d695b/src/main/resources/fifth/init_db.sql)
* SQL queries and statements are used to create the database tables and populate them with data.
* Queries are provided to perform specific operations, such as selecting products, calculating costs, and adding new data.
* The database structure is designed to support product, category, and supplier information.

## Author
_[Vasyl Vasylchuk](https://www.linkedin.com/in/vasyl-vasylchuk-632303273/)_