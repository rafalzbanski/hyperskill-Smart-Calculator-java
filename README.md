# Smart Calculator with Java

### Calculators are a very helpful tool that we all use on a regular basis. Why not create one yourself, and make it really special? In this project, you will write a calculator that not only adds, subtracts, and multiplies, but is also smart enough to remember your previous calculations.

## 

> [!IMPORTANT]
> *Link to project on hyperskill [page](https://hyperskill.org/projects/42)*
> 
## stage 1:
## Description:
Create first simple sum operation

## Objective:
Write a program that reads two integer numbers from the same line and prints their sum in the standard output. Numbers can be positive, negative, or zero.

## Example:
The example below shows the input and the corresponding output. Your program should work in the same way. Do not add extra characters after the output!

> [!NOTE]
> The greater-than symbol followed by a space (`>`) represents the user input. Notice that it's not the part of the input.

```
> 5 8
13
```

## stage 2:
## Description:
It is high time to improve the previous version of the calculator. What if we have many pairs of numbers, the sum of which we need to find? It will be very inconvenient to run the program every time. So then let's add a loop to continuously calculate the sum of two numbers. Be sure to have a safeword to break the loop. Also, It would be nice to think through situations where users enter only one number or do not enter numbers at all.

## Objective:
Write a program that reads two numbers in a loop and prints the sum in the standard output.
If a user enters only a single number, the program should print the same number. If a user enters an empty line, the program should ignore it.
When the command `/exit` is entered, the program must print `"Bye!"` (without quotes), and then stop.

## Example:
The example below shows the input and the corresponding output. Your program should work in the same way. Do not add extra characters after the output!

> [!NOTE]
> The greater-than symbol followed by a space (`>`) represents the user input. Notice that it's not the part of the input.

```
> 17 9
26
> -2 5
3
>
> 7
7
> /exit
Bye!
```
