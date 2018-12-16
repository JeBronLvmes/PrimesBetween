Author: Jeb Alawi
E-mail: alawi.5@osu.edu

Files:
    PrimesBetween.scala
        - file containing necessary methods

Instructions:
    To load on the interpreter, in a terminal type and enter scala. Then type ":load PrimesBetween.scala"
    Lastly, type "primesBetween(n, m)", where n and m is the range of numbers you want to find prime numbers.

Functions:

    isPrime()
        - takes an integer n and returns a boolean, true if the integer is prime, false if it is not.
        
    isPrimeHelp()
        - takes an integer n greater than 2 and an integer accumumlator. Returns a boolean, true if the number is prime, false if not
        
    primesBetween()
        - takes two integers; n and m. returns an inclusive list of prime numbers between the two integers
        
    primesBetweenHelper()
        - takes two integers; n and m, as well as an empty list. Returns an inclusive list of prime numbers between the two in