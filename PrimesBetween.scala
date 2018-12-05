object PrimeFinder {
    def main(args: Array[String]) {
        println(primesBetween(args(0).toInt, args(1).toInt))
    }

    def primesBetween(n: Int, m: Int): List[Int] = {
        primesBetweenHelper(n, m, List())
    }

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

    def isPrime(n: Int): Boolean = {
        if(n == 2){
            true
        } else if(n % 2 == 0 || n == 1){
            false
        } else{
            isPrimeHelp(n, 3)
        }
    }
    
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
}