# MergeSort

This project implements the Merge Sort algorithm in Java. Merge Sort is a divide-and-conquer algorithm that divides the input array into two halves, sorts them, and then merges the sorted halves.

## Table of Contents

- [Overview](#overview)
- [Requirements](#requirements)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Overview

Merge Sort is an efficient, stable, and comparison-based sorting algorithm. It works by recursively dividing the array into halves until each sub-array contains only one element. Then, it merges the sub-arrays in a sorted manner to produce the final sorted array.

## Requirements

- Java 8 or higher

## Installation

1. Clone the repository:

    ```sh
    git clone https://github.com/0kakarot0/MergeSort.git
    ```

2. Navigate to the project directory:

    ```sh
    cd MergeSort
    ```

## Usage

To run the Merge Sort implementation, you can compile and run the `MergeSort` class.

### Compile:

```sh
javac -d bin src/merge_sort/MergeSort.java
```

Run:
```sh
java -cp bin merge_sort.MergeSort
```

Test Scenarios
--------------

The project includes comprehensive test scenarios to validate the Merge Sort implementation:

-   Sorting an empty list
-   Handling lists with null values
-   Sorting lists containing both positive and negative integers
-   Ensuring correct sorting with duplicate strings
-   Verifying the integrity of already sorted lists

These tests ensure that the Merge Sort algorithm performs correctly across various data types and edge cases.

Contributing
Contributions are welcome! If you have any ideas, suggestions, or bug reports, please create an issue or submit a pull request.

License
This project is licensed under the MIT License - see the LICENSE file for details.
