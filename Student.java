import java.util.ArrayList;
//Part B
public class Student {
    private long idNum;
    private String firstName;
    private String lastName;
    private char gender;
    private String email;
    private ArrayList<Course> coursesRegistered;
    private double GPA;
    private long advisorNum;

    // default constructor
    /**
     *
     */
    public Student() {
        this.idNum = 0;
        this.firstName = "";
        this.lastName = "";
        this.gender = 'M';
        this.email = "";
        this.coursesRegistered = new ArrayList<>();
        this.GPA = 0.0;
        this.advisorNum = 0;
    }

    //with 5 parameters
    /**
     *
     * @param idNum
     * @param firstName
     * @param lastName
     * @param gender
     * @param email
     */
    public Student(long idNum, String firstName, String lastName, char gender, String email) {
        this.idNum = idNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.coursesRegistered = new ArrayList<>();
    }

    //set of IdNum
    /**
     *
     * @param idNum
     */
    public void setIdNum(long idNum) {
        this.idNum = idNum;
    }
    //get of IdNum
    /**
     *
     * @return
     */
    public long getIdNum() {
        return idNum;
    }

    //set of FirstName
    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //get of FirstName
    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    //set of LastName
    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //get of LastName
    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    //set of Gender
    /**
     *
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }
    //get of Gender
    /**
     *
     * @return
     */
    public char getGender() {
        return gender;
    }

    //set of Email
    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    //get of Email
    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    //set of CourseRegistered
    /**
     *
     * @param coursesRegistered
     */
    public void setCoursesRegistered(ArrayList<Course> coursesRegistered) {
        this.coursesRegistered = coursesRegistered;
    }
    //get of CourseRegistered
    /**
     *
     * @return
     */
    public ArrayList<Course> getCoursesRegistered() {
        return coursesRegistered;
    }

    //set of GPA
    /**
     *
     * @param GPA
     */
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    //get of GPA
    /**
     *
     * @return
     */
    public double getGPA() {
        return GPA;
    }

    //set of AdvisorNum
    /**
     *
     * @param advisorNum
     */
    public void setAdvisorNum(long advisorNum) {
        this.advisorNum = advisorNum;
    }
    //get of AdvisorNum
    /**
     *
     * @return
     */
    public long getAdvisorNum() {
        return advisorNum;
    }

    //equals
    /**
     *
     * @param student
     * @return
     */
    public boolean equals(Student student) {
        return (this.idNum == student.idNum);
    }

    //printCoursesRegistered
    /**
     *
     */
    public void printCoursesRegistered() {
        if(this.coursesRegistered.isEmpty())
            System.out.println("No courses registered");
        else
        { System.out.println("Registered courses: ");
            for(int i=0; i<coursesRegistered.size(); i++) {
                System.out.println("Student's Course: " + (i+1)+ " ");
                System.out.println(" Name = " + coursesRegistered.get(i).getCourseName());
                System.out.println(" Code = " +coursesRegistered.get(i).getCourseNum());
                System.out.println(" Credits =  " + coursesRegistered.get(i).getCredits());
                System.out.println(" Section Number =  " + coursesRegistered.get(i).getSection());
            }
        }
    }
}
