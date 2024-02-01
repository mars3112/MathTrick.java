
/**
 * Write a description of class MathTrick here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//Name: Mars Gasmelseed
//CSIS10A: Java
//Approximate completion time: 2hrs (I kind of got confused haha)  
//References: github MathTrick.java
public class MathTrick
{
   public static void main(String[] args) {
        //Get a positive integer
        int x;
        x = 7;// When I changed the number (for an example 10), the number once I ran it changed to 28.
    

        //Square it and add the original number
        int y = x * x + x;

        //Divide by the original number
        y = y / x; 
        
        //Add 17 
        y = y + 17;  
        
        //Print the results 
        System.out.println("Here is the final result, which should be 3") ; 
        System.out.println(y);//printing the current value of y  
        System.out.println("After squaring x we have: "+(x*x+x)); // adding additional System.out.print's  
        System.out.println("After adding the original number we get: " + (x * x + x)) ; 
        System.out.println("After dividing by the original number we get: " + ((x * x + x) / x)); 
        System.out.println("After we have added 17 we get: " + (((x * x + x) / x) + 17)) ;  
        System.out.println("We then subtract the original number to get: " + ((((x * x + x) / x + 17) - x ))); 
        System.out.println("After we divide by 6 our result is: " + (((((x * x + x) / x) + 17) - x) / 6)); 
        System.out.println("Tada! that is the full process, goodjob!") ; 
    }
} 
