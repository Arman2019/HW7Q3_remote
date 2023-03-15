package Q03;

public class Student {
    private final String name;
    private final String fieldOfStudy;
    private final int semester;
    private final Course[] courses;
    private final int[] grades;
    private final int numCourses;

    public Student(String name, String fieldOfStudy, int semester) {
        this.name = name;
        this.fieldOfStudy = fieldOfStudy;
        this.semester = semester;
        this.courses = new Course[10];
        this.grades = new int[10];
        this.numCourses = 0;
    }


    public void addGrade(Course course, int grade) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i] == course) {
                grades[i] = grade;
                return;
            }else
                System.out.println("Error: course not found");
        }

    }

    public String getName() {
        return name;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public int getSemester() {
        return semester;
    }

    public Course[] getCourses() {
        return courses;
    }

    public int[] getGrades() {
        return grades;
    }
}