// Author: Gaber Alawi
// Description: Finds prime numbers in a given range
// Date: 12/7/18

// returns true if an integer is prime, false otherwise
def isPrime(n: Int): Boolean = {
    // returns true if n is prime, false otherwise
    // acc must be greater than 2
    def isPrimeHelp(n: Int, acc: Int): Boolean = {
        if(n != acc && n % acc == 0){
            false
        } else{
            if(acc < n-2){
                isPrimeHelp(n, acc + 2)
            } else{
                true
            }
            
        }
    }
    if(n == 2){
        true
    } else if(n % 2 == 0 || n == 1){
        false
    } else{
        isPrimeHelp(n, 3)
    }
}

// returns an inclusive list of prime numbers between integers n and m
def primesBetween(n: Int, m: Int): List[Int] = {
    // returns an inclusive list of prime numbers between integers n and m
    // primes must be an empty list
    def primesBetweenHelper(n: Int, m: Int, primes: List[Int]): List[Int] = {
        if(n <= m){
            if(isPrime(m)){                
                primesBetweenHelper(n, m - 1, m :: primes)
            } else{
                primesBetweenHelper(n, m - 1, primes)
            }  
        } else{
            primes
        }    
    }
    primesBetweenHelper(n, m, List())
}