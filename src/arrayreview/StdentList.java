  /*
        Name:  [your name here]
        Assignment:  [assignment name]
        Program: [your program name here]
        Date:  [assignment due date here]
    
        Description:
        [program description in your own words]
    */

package arrayreview;

/**
 *
 * @author danasebai, 2020
 */
public class StdentList {

    
    public static void main(String[] args) {
          
          Student [] studentList = new Student [5];
          
          // make up 5 student to put inside
          
          studentList[0] = new Student("superman", "007");
          studentList[1] = new Student("james Bond", "700");
          studentList[2] = new Student("Wonder Woman", "100");
          studentList[3] = new Student("Batman", "001");
          studentList[4] = new Student("Joker", "002");
          
          for(Student s : studentList){
              System.out.println(s.getName());
          }
    }

}
