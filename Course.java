package Q03;

public class Course {
    private final String name;
    private final Professor professor;
    private final Student[] students;
    private int numStudents;

    public Course(String name, Professor professor) {
        this.name = name;
        this.professor = professor;
        this.students = new Student[50];
        this.numStudents = 0;
    }

    public void addStudent(Student student) {
        students[numStudents] = student;
        numStudents++;
        professor.addStudent(student); // also add student to professor's list
    }

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Student[] getStudents() {
        return students;
    }
}
