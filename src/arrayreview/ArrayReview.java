  /*
        Name:  [your name here]
        Assignment:  [assignment name]
        Program: [your program name here]
        Date:  [assignment due date here]
    
        Description:
        [program description in your own words]
    */

package arrayreview;
import java.util.*;
/**
 *
 * @author danasebai
 */
public class ArrayReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
       
        String word = sc.nextLine();
      
        char [] letters = new char[word.length()];
        
        for(int i = 0; i < word.length(); i++){
        
            letters[i] = word.charAt(i);
        }
        
        for(int i = word.length() -1; i >=0; i-- ){
           
            System.out.print(letters[i]);
        
    }

        
}
}
