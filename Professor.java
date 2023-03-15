package Q03;

public class Professor {
    private final String name;
    private final Course[] courses;
    private final Student[] students;
    private int numCourses;
    private int numStudents;

    public Professor(String name) {
        this.name = name;
        this.courses = new Course[10];
        this.students = new Student[50];
        this.numCourses = 0;
        this.numStudents = 0;
    }

    public void addCourse(Course course) {
        courses[numCourses] = course;
        numCourses++;
    }

    public void addStudent(Student student) {
        students[numStudents] = student;
        numStudents++;
    }

    public String getName() {
        return name;
    }

    public Course[] getCourses() {
        return courses;
    }

    public Student[] getStudents() {
        return students;
    }
}