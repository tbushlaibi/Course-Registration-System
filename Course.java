//Part A
public class Course {
    private String courseNum;
    private String courseName;
    private int credits;
    private int section;

    // default constructor
    /**
     *
     */
    public Course() {
        this.courseNum = " ";
        this.courseName = " ";
        this.credits = 0;
        this.section = 0;
    }

    //with 4 parameters
    /**
     *
     * @param courseNum
     * @param courseName
     * @param credits
     * @param section
     */
    public Course(String courseNum , String courseName , int credits , int section) {
        this.courseNum = courseNum;
        this.courseName = courseName;
        this.credits = credits;
        this.section = section;
    }

    //set of CourseNum
    /**
     *
     * @param courseNum
     */
    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    //get of CourseNum
    /**
     *
     * @return
     */
    public String getCourseNum() {
        return courseNum;
    }

    //set of CourseName
    /**
     *
     * @param courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    //get of CourseName
    /**
     *
     * @return
     */
    public String getCourseName() {
        return courseName;
    }

    //set of Credits
    /**
     *
     * @param credits
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    //get of Credits
    /**
     *
     * @return
     */
    public int getCredits() {
        return credits;
    }

    //set of section
    /**
     *
     * @param section
     */
    public void setSection(int section) {
        this.section = section;
    }

    //get of section
    /**
     *
     * @return
     */
    public int getSection() {
        return section;
    }

    //Equals
    /**
     *
     * @param c1
     * @return
     */
    public boolean equals(Course c1) {
        if (courseNum.equalsIgnoreCase(c1.courseNum))
            return true;
        return false;
    }

    //toString
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "( Course Number= "+courseNum+", Course Name= "+courseName+", Credit hours= "+credits+ ", Section= "+section+" )";
    }
}
