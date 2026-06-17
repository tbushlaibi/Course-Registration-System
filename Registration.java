import java.util.Scanner;
//Part D
public class Registration {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        Roster roster = new Roster();
        int t = 0;

        while (t != 10) {
            System.out.println("Registration menu:");
            System.out.println("1- Add student.");
            System.out.println("2- Delete student.");
            System.out.println("3- Search for a student.");
            System.out.println("4- Add course to a student.");
            System.out.println("5- Delete course from a student.");
            System.out.println("6- Get student details.");
            System.out.println("7- Get advisor number.");
            System.out.println("8- Check if roster is empty.");
            System.out.println("9- Get roster size.");
            System.out.println("10- To exit.");
            System.out.print("Enter the action number to be performed: ");
            t = kbd.nextInt();
            kbd.nextLine();

            switch (t) {
                case 1:
                    System.out.print("Enter the student ID: ");
                    long ID = kbd.nextLong();
                    kbd.nextLine();
                    System.out.print("Enter the first name: ");
                    String first = kbd.nextLine();
                    System.out.print("Enter the last name: ");
                    String last = kbd.nextLine();
                    System.out.print("Enter the student Gender (M or F): ");
                    char gender = kbd.next().charAt(0);
                    System.out.print("Enter Email: ");
                    String email = kbd.next();
                    kbd.nextLine();
                    System.out.print("Enter GPA: ");
                    double gpa = kbd.nextDouble();
                    System.out.print("Enter Advisor Number: ");
                    long advisor = kbd.nextLong();
                    Student student = new Student(ID, first, last, gender, email);
                    student.setGPA(gpa);
                    student.setAdvisorNum(advisor);
                    if (roster.addStudent(student)) {
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("This student ID already exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter student ID: ");
                    ID = kbd.nextLong();
                    if (roster.deleteStudent(ID)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    ID = kbd.nextLong();
                    int index = roster.searchStudent(ID);
                    if (index != -1) {
                        System.out.println("Student found at index: " + index);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter student ID: ");
                    ID = kbd.nextLong();
                    kbd.nextLine();
                    System.out.print("Enter the course number: ");
                    String courseNum = kbd.nextLine();
                    System.out.print("Enter the course name: ");
                    String courseName = kbd.nextLine();
                    System.out.print("Enter the credit hours: ");
                    int credit = kbd.nextInt();
                    System.out.print("Enter the section number: ");
                    int section = kbd.nextInt();
                    Course course = new Course(courseNum, courseName, credit, section);
                    if (roster.addCourse(course, ID)) {
                        System.out.println("Course added successfully.");
                    } else {
                        System.out.println("Failed to add course.");
                    }
                    break;

                case 5:
                    System.out.print("Enter student ID: ");
                    ID = kbd.nextLong();
                    kbd.nextLine();
                    System.out.print("Enter Course Number: ");
                    courseNum = kbd.nextLine();
                    System.out.print("Enter Course Name: ");
                    courseName = kbd.nextLine();
                    System.out.print("Enter Credits: ");
                    credit = kbd.nextInt();
                    System.out.print("Enter Section: ");
                    section = kbd.nextInt();
                    course = new Course(courseNum, courseName, credit, section);
                    if (roster.deleteCourse(course, ID)) {
                        System.out.println("Course deleted successfully.");
                    }
                    break;

                case 6:
                    System.out.print("Enter student ID: ");
                    ID = kbd.nextLong();
                    roster.printStudentDetails(ID);
                    break;

                case 7:
                    System.out.print("Enter Student ID: ");
                    ID = kbd.nextLong();
                    roster.printAdvisor(ID);
                    break;

                case 8:
                    if (roster.isEmpty()) {
                        System.out.println("The roster is empty.");
                    }
                    else {
                        System.out.println("The roster is not empty.");
                    }
                    break;

                case 9:
                    System.out.println("The roster size is: " + roster.listSize());
                    break;

                case 10:
                    System.out.println("Exiting the program");
                    break;

                default:
                    System.out.println("Invalid action number, try again with a valid action number.");
            }
        }

        kbd.close();
    }
}
