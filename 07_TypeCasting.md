## Data Types in Java
Type casting means converting one data type into another. For example, turning an int into a double.

In Java, there are two main types of casting:

1. Widening Type Casting (Implicit Casting)
Widening casting is done automatically when passing a smaller size type into a larger size type.

This works because there is no risk of losing information. For example, an int value can safely fit inside a double:
Widening Casting (automatic) - converting a smaller type to a larger type size
> byte -> short -> int -> long -> float -> double


2. Narrowing Type Casting (Explicit Casting)
Narrowing casting must be done manually by placing the type in parentheses () in front of the value.

This is required because narrowing may result in data loss (for example, dropping decimals when converting a double to an int):
Data loss every time the converting data size is greater than the size of new datatype.
For floating number only decimal points gets eliminated, but in case of whole number garbage data can be the result while converting to smaller size.
Narrowing Casting (manual) - converting a larger type to a smaller type size
> double -> float -> long -> int -> char -> short -> byte

* If result of any operation is greater than current datatype it is promoted to increased datatype. Ex multiplication result of two byte size data 10 and 25 is 250 which is greater than range of byte is auto promoted to int type.

Mainly there are two types of Explicit Casting:
Explicit Upcasting
Explicit Downcasting 

