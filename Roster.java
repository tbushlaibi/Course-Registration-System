import java.util.LinkedList;
//Part C
public class Roster {
    private LinkedList<Student> studentsList;
    private int size;

    //i. default constructor
    /**
     *
     */
    public Roster() {
        this.studentsList = new LinkedList<>();
        this.size = 0;
    }

    //ii. add student
    /**
     *
     * @param studentN
     * @return
     */
    public boolean addStudent(Student studentN)
    {
        for(int i=0; i < size; i++){
            if (studentsList.get(i).getIdNum() == studentN.getIdNum()) {
                return false;
            }

            if(studentsList.get(i).getIdNum()>studentN.getIdNum()){
                studentsList.add(i,studentN);
                size++;
                return true;
            }
        }
        studentsList.add(studentN);
        size++;
        return true;
    }

    //iii. delete student

    /**
     *
     * @param idNum
     * @return
     */
    public boolean deleteStudent(long idNum)
    {
        for(int i=0; i<size; i++)
            if (studentsList.get(i).getIdNum()==(idNum)) {
                studentsList.remove(i);
                size--;
                return true;
            }
        return false;
    }

    //iv. search student
    /**
     *
     * @param idNum
     * @return
     */
    public int searchStudent(long idNum){
        for (int i=0; i<size; i++)
            if (studentsList.get(i).getIdNum() == (idNum)){
                return i ; }
        return -1;
    }

    //v. is empty
    /**
     *
     * @return
     */
    public boolean isEmpty() {
        if(this.studentsList.isEmpty())
            return true;
        return false;
    }

    //vi. size
    /**
     *
     * @return
     */
    public int listSize() {
        return this.size;
    }

    //vii. get student
    /**
     *
     * @param index
     * @return
     */
    public Student getStudent(int index){
        Student S = new Student();
        if(index < 0 || index >= studentsList.size())
            throw new IndexOutOfBoundsException();
        else {
            for(int i=0; i<studentsList.size(); i++)
                if(index==i){
                    S = studentsList.get(index);
                    System.out.println("Location at= "+ index);
                    System.out.println("Student id: "+S.getIdNum());
                }
        }return S;
    }

    //viii. add course
    /**
     *
     * @param crs
     * @param idNum
     * @return
     */
    public boolean addCourse(Course crs,long idNum)
    {   //a
        int point = searchStudent(idNum);
        if(point ==-1) {
            return false;
        }
        Student student = studentsList.get(point);
        if(student.getCoursesRegistered().contains(crs)){
            return false;
        }

        int totalCredits = 0;
        for(int i=0 ; i<student.getCoursesRegistered().size();i++){
            totalCredits += student.getCoursesRegistered().get(i).getCredits();
        }

        int maxCredit;

        if (student.getGPA() > 3.00) {
            maxCredit = 21;
        } else {
            maxCredit = 18;
        }

        if (totalCredits + crs.getCredits() > maxCredit) {
            return false;
        }
        else {
            student.getCoursesRegistered().add(crs);
            return true;
        }
    }

    //ix. delete course
    /**
     *
     * @param crs
     * @param idNum
     * @return
     */
    public boolean deleteCourse(Course crs, long idNum) {
        int point = searchStudent(idNum);
        if(point == -1){
            System.out.println("Student not found.");
            return false;
        }
        boolean found = false;
        Student student = studentsList.get(point);
        for (int i =0;i<student.getCoursesRegistered().size();i++)
            if ((crs.equals(student.getCoursesRegistered().get(i)))){
                found = true;
                break;
            }
        if (!found){
            System.out.println("Course not found.");
            return false;
        }
        int totalCredits = 0;
        for(int i=0 ; i<student.getCoursesRegistered().size();i++){
            totalCredits += student.getCoursesRegistered().get(i).getCredits();
        }

        if(totalCredits - crs.getCredits() < 12){
            System.out.println("Can't delete the course because the credit hours will be less than 12.");
            return false;
        }
        for (int i =0;i<student.getCoursesRegistered().size();i++)
            if (crs.equals(student.getCoursesRegistered().get(i))) {
                student.getCoursesRegistered().remove(i);
                break;
            }
        return true;
    }

    //x. print student details
    /**
     *
     * @param idNum
     */
    public void printStudentDetails(long idNum){
        int point = searchStudent(idNum);
        if (point == -1){
            System.out.println(" student not found ");
            return;
        }
        Student student = studentsList.get(point);
        System.out.println("Student ID:"+student.getIdNum()+"\nStudent Name:" + student.getFirstName() + " "+
                student.getLastName()+"\nStudent gender "+student.getGender()+"\nStudent email: "+ student.getEmail()+"\n");
        student.printCoursesRegistered();
    }

    //xi. print advisor
    /**
     *
     * @param idNum
     */
    public void printAdvisor(long idNum){
        int point = searchStudent(idNum);
        if (point == -1){
            System.out.println(" student not found ");
        }
        else{
            Student student = studentsList.get(point);
            System.out.println(" AdvisorNum = "+student.getAdvisorNum());
        }
    }

}
