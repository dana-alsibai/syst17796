  /*
        Name:  [Dana Alsibai ]
        Assignment:  [Exercise 1.1a]
        Program: []
        Date:  [assignment due date here]
    
        Description:
        [program description in your own words]
    */

package arrayreview;

/**
 * A class to model students. Student can study.
 * They have a name and an ID.
 *
 * @author danasebai, 2020
 */
public class Student {
    
    private String name;
    private String studentId;
    
    /**
     * A constructor that takes in both parameters
     * @param name
     * @param studentId 
     */
    public Student(String name, String studentId){
    this.name = name;
    this.studentId = studentId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    /**
     * a method that returns true if a student studied 
     * and false otherwise.
     * @return wether or not the student studied.
     */
     
    public boolean didStudy(){
        return true;
}

}