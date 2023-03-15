package Q03;

public class UniversityApplication {
    public static void main(String[] args) {
        // create a professor
        Professor Yarahmadi = new Professor("Yarahmadi");

        // create two courses
        Course math1 = new Course("Mathematics 1", Yarahmadi);
        Course math2 = new Course("Mathematics 2", Yarahmadi);

        // add courses to professor's list
        Yarahmadi.addCourse(math1);
        Yarahmadi.addCourse(math2);

        // create some students
        Student rezaMohammadi = new Student("Reza Mohammadi", "mechanics", 5);
        Student hoomanAhmadi = new Student("Hooman Ahmadi", "computer science", 3);
        Student niloufarHajipour = new Student("Niloufar Hajipour", "biology", 4);

        // add students to courses
        math1.addStudent(rezaMohammadi);
        math1.addStudent(hoomanAhmadi);
        math1.addStudent(niloufarHajipour);

        // add grades
        rezaMohammadi.addGrade(math1, 17);
        hoomanAhmadi.addGrade(math1, 15);
        niloufarHajipour.addGrade(math1, 18);

        // create another professor
        Professor rezaei = new Professor("Rezaei");

        // create another course
        Course physics2 = new Course("Physics 2", rezaei);

        // add course to professor's list
        rezaei.addCourse(physics2);

        // add student to course
        physics2.addStudent(rezaMohammadi);
		
		// print out which students are in which courses and which professor has which students
        System.out.println(math1.getName() + " students: ");
        for (Student student : math1.getStudents()) {
            if (student != null) {
                System.out.println(student.getName());
            }
        }
        System.out.println("Mathematics 1 professor: " + math1.getProfessor().getName());

        System.out.println(math2.getName() + " students: ");
        for (Student student : math2.getStudents()) {
            if (student != null) {
                System.out.println(student.getName());
            }
        }
        System.out.println("Mathematics 2 professor: " + math2.getProfessor().getName());

        System.out.println(physics2.getName() + " students: ");
        for (Student student : physics2.getStudents()) {
            if (student != null) {
                System.out.println(student.getName());
            }
        }
        System.out.println("Physics 2 professor: " + physics2.getProfessor().getName());

        // print out Reza Mohammadi's grade in Mathematics 1
        System.out.println(rezaMohammadi.getName() + "'s grade in " + math1.getName() + ": " + rezaMohammadi.getGrades()[0]);
    }


}
