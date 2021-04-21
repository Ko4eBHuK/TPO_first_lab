package function

import kotlin.math.*

class Calculator {

    fun secant(x: Double) : Double{

        if(abs(x) > 0.1){
            throw IllegalArgumentException("absolute amount of secant argument is far from zero")
        } else{
            var result = 0.0
            val termsNumber = 10
            var factorial = 1

            for (i in 0..termsNumber){
                factorial = 1
                for(j in 1..i*2)
                    factorial *= j

                result += x.pow(2*i) / factorial
            }

            return result
        }

    }

}