  /*
        Name:  [Dana Alsibai ]
        Assignment:  [Exercise 1.1a]
        Program: []
        Date:  january 24th, 2020
    
        Description:
        [program description in your own words]
    */

package arrayreview;

/**
 *A class to model part time student 
 * @author danasebai
 */
public class PartTime extends Student {
    
    private int hoursOfStudy;

    public PartTime(String name, String studentId) {
        super(name, studentId);
    }

    public int getHoursOfStudy() {
        return hoursOfStudy;
    }

    public void setHoursOfStudy(int hoursOfStudy) {
        this.hoursOfStudy = hoursOfStudy;
    }
    

}
