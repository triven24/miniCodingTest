package Triven;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Stage2Test
{
    @Test
    public void shoutNumber() {

        String threeStr = "3";
        String fiveStr = "5";
        for (int i = 1; i <= 100; i++) {
            String s = String.valueOf(i);
            if(i % 3 == 0 || s.contains(threeStr)){
                if(i % 5 == 0 || s.contains(fiveStr)){
                    System.out.println("FizzBuzz");
                }else{
                    System.out.println("Fizz");
                }
            }else if(i % 5 == 0 || s.contains(fiveStr)){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
