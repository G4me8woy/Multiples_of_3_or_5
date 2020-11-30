// > We need to calculate the sum of all multiples of 3 OR 5 < a given number
// meaning a value can't be added to the sum twice

//Plan
// * compute all multiples of 3 and add to sum for which I'd have to create a variable for
// * For all multiples of 15 check if it can be perfectly divisible by 3, if it can, skip it, else add to sum
// * return sum   

public class solution_1 {
    public static int solution(int number){
        // > ADD ALL ALLOWED MUTIPLES OF 3 TO SUM
        // * creating variable to hold sum
        int sum = 0;
        // * adding all multiples of 3 less than given number
        for (int i = 1; i < Math.abs(number/3)+1; i++) 
            sum += 3*i;

        // > GENERATING MULTIPLES OF 5 LESS THAN GIVEN AND ADDING TO SUM IF NOT A MULTIPLE OF 3
        // * multiples of 5 less than given number
        for (int i = 1; i < Math.abs(number/5); i++) {
            // * checking if the number is also a multple of 3 by checking if mod(%) 3 (remainder after dividing by 3) is greater than 0
            
            if (((5*i)%3) == 0)
            // if truely is also multiple 3
            continue;
            //if not
            sum += 5*i;
        }

        // > RETURN SUM
        return sum;
    }

    public static void main(String[] args){
       System.out.println(solution(20));
       //when number = 20
       //for 3 => 3 6 9 12 15 18 = 63
       //for 5 => 5 10 = 15
       //sum = 78

       //System.out.println(solution(25));
       //when number = 25
       //for 3 => 3 6 9 12 15 18 21 24 = 108
       //for 5 => 5 10 20 = 35
       //sum = 143
 
       //System.out.println(solution(40));
       //when number = 40
       //for 3 => 3 6 9 12 15 18 21 24 27 30 33 36 39 = 273
       //for 5 => 5 10 20 25 35 = 95
       //sum = 368
        
        //properly uncomment out any case to test it out and maybe add some cases to test the algorithm
        //you're to submit any change and/or additions have fun, stay safe...

    }
}
