# BookBestsellerApp

A Java application to analyze Amazon's Top 50 Bestselling Books dataset from 2009-2019. This project processes a CSV dataset containing information about 550 bestselling books and provides various analytical functions.

## Project Overview

This application reads a CSV dataset containing Amazon's bestselling books and provides functionality to:

- Count books by specific authors
- List all authors in the dataset
- Find all books written by a particular author
- Filter books by user rating
- Get book titles and prices by author

## Directory Structure

```
lld-assignment/
├── src/
│   ├── Book.java              # Book model class
│   ├── BookService.java       # Business logic and data operations
│   ├── DatasetReader.java     # CSV file reader and parser
│   └── Driver.java            # Main application entry point
├── data/
│   └── bestsellers_with_categories.csv  # Dataset file
└── README.md                  # This documentation
```

## Dataset Information

The dataset contains information about 550 Amazon bestselling books with the following columns:

- **Name**: Book title
- **Author**: Author name
- **User Rating**: Average Amazon user rating (3.3 to 4.9)
- **Reviews**: Number of user reviews (37 to 87,800)
- **Price**: Book price ($0 to $105)
- **Year**: Year the book appeared on bestseller list (2009-2019)
- **Genre**: Book genre (Fiction or Non-fiction)

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- The dataset file: `data/bestsellers_with_categories.csv`

## How to Run

### Step 1: Compile the Code

```bash
javac src/*.java
```

### Step 2: Run the Application

```bash
java -cp src Driver
```

### Alternative: Compile and Run in One Command

```bash
javac src/*.java && java -cp src Driver
```

## Features

### 1. Count Books by Author

Returns the total number of books written by a specific author.

### 2. List All Authors

Displays all unique authors present in the dataset.

### 3. List Books by Author

Returns all book titles written by a specific author.

### 4. Filter Books by Rating

Finds all books with a specific user rating.

### 5. Get Books and Prices by Author

Returns book titles and their corresponding prices for a specific author.

## Sample Output

When you run the application, you'll see output similar to:

```
Loaded 550 books.
Authors in dataset:
[JJ Smith, Pretty Simple Press, Dr. Steven R Gundry MD, ...]

Stephen King has 4 books.
Books by Stephen King:
11/22/63: A Novel
Doctor Sleep: A Novel
Joyland (Hard Case Crime)
Under the Dome: A Novel

Books with user rating 4.7:
[Multiple books with 4.7 rating...]

Books and prices by Stephen King:
11/22/63: A Novel - $22.0
Doctor Sleep: A Novel - $13.0
Joyland (Hard Case Crime) - $12.0
Under the Dome: A Novel - $20.0
```

## Technical Details

### Classes

- **Book**: Model class representing a book with all its attributes
- **DatasetReader**: Handles CSV file reading and parsing with error handling
- **BookService**: Contains business logic for all data operations
- **Driver**: Main class that demonstrates all functionality

### Error Handling

The application includes robust error handling for:

- Malformed CSV data
- Missing or invalid numeric values
- File reading errors

## Dependencies

This project uses only standard Java libraries - no external dependencies required.

## License

This project is for educational purposes.
