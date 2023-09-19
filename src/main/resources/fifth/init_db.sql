CREATE DATABASE MyShop;
USE MyShop;

CREATE TABLE IF NOT EXISTS Products (
                                      ProductID BIGINT PRIMARY KEY,
                                      ProductName VARCHAR(255),
                                      SupplierID BIGINT,
                                      CategoryID BIGINT,
                                      Price DECIMAL(10, 2),
                                      FOREIGN KEY (SupplierID)
                                          REFERENCES Suppliers (SupplierID)
                                          ON UPDATE NO ACTION
                                          ON DELETE NO ACTION,

                                      FOREIGN KEY (CategoryID)
                                          REFERENCES Categories (CategoryID)
                                          ON UPDATE NO ACTION
                                          ON DELETE NO ACTION
                                    );

CREATE TABLE IF NOT EXISTS Suppliers (
                                       SupplierID BIGINT PRIMARY KEY,
                                       SupplierName VARCHAR(255),
                                       City VARCHAR(255),
                                       Country VARCHAR(255)
                                    );

CREATE TABLE IF NOT EXISTS Categories (
                                        CategoryID BIGINT PRIMARY KEY,
                                        CategoryName VARCHAR(255),
                                        Description TEXT
                                    );

INSERT INTO Suppliers (SupplierID, SupplierName, City, Country)
VALUES
    (1, 'Exotic Liquid', 'London', 'UK'),
    (2, 'New Orleans Cajun Delights', 'New Orleans', 'USA'),
    (3, 'Grandma Kelly’s Homestead', 'Ann Arbor', 'USA'),
    (4, 'Tokyo Traders', 'Tokyo', 'Japan'),
    (5, 'Cooperativa de Quesos ''Las Cabras''', 'Oviedo', 'Spain');

INSERT INTO Categories (CategoryID, CategoryName, Description)
VALUES
    (1, 'Beverages', 'Soft drinks, coffees, teas, beers, and ales'),
    (2, 'Condiments', 'Sweet and savory sauces, relishes, spreads, and seasonings'),
    (3, 'Confections', 'Desserts, candies, and sweet breads'),
    (4, 'Dairy Products', 'Cheeses'),
    (5, 'Grains/Cereals', 'Breads, crackers, pasta, and cereal');

INSERT INTO Products (ProductID, ProductName, SupplierID, CategoryID, Price)
VALUES
    (1, 'Chais', 1, 1, 18.00),
    (2, 'Chang', 1, 1, 19.00),
    (3, 'Aniseed Syrup', 1, 2, 10.00),
    (4, 'Chef Anton’s Cajun Seasoning', 2, 2, 22.00),
    (5, 'Chef Anton’s Gumbo Mix', 2, 2, 21.35);

-- Select product with product name that begins with ‘C’:
SELECT *
FROM Products
WHERE ProductName LIKE 'C%';

-- Select the product with the smallest price:
SELECT *
FROM Products
ORDER BY Price
LIMIT 1;

-- Select the cost of all products from the USA:
SELECT SUM(P.Price) AS TotalCost
FROM Products P
        JOIN Suppliers S ON P.SupplierID = S.SupplierID
WHERE S.Country = 'USA';

-- Select suppliers that supply 'Condiments':
SELECT S.SupplierName
FROM Suppliers S
          JOIN Products P ON S.SupplierID = P.SupplierID
          JOIN Categories C ON P.CategoryID = C.CategoryID
WHERE C.CategoryName = 'Condiments';

-- Add a new supplier and product related to the 'Beverages' category:
INSERT INTO Suppliers (SupplierName, City, Country)
VALUES
    ('Norske Meierier', 'Lviv', 'Ukraine');

SET @SupplierID = LAST_INSERT_ID();

INSERT INTO Products (ProductName, SupplierID, CategoryID, Price)
VALUES
    ('Green tea', @SupplierID, 1, 10.00);
