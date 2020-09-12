public class Main {
    public static void main(String[] args) {
        School s = new School("VLN Computer Programming School", "530 E 41st Ave, Vancouver", "V5W 1P3");
        //  Add 10 students to student list //
        Student s1 = new Student("John", "Jin", "12", 1);
        s.addStudent(s1);
        Student s2 = new Student("Troy", "Kim", "12", 2);
        s.addStudent(s2);
        s.addStudent(new Student("Ainesh", "Malkani", "12", 3));
        s.addStudent(new Student("Brandon", "Chiem", "12", 4));
        s.addStudent(new Student("Brian", "Chen", "12", 5));
        s.addStudent(new Student("Ivan", "Cha", "12", 6));
        s.addStudent(new Student("Herry", "Lee", "12", 7));
        s.addStudent(new Student("Gabriel", "Chin", "12", 8));
        s.addStudent(new Student("Gene", "Marcos", "12", 9));
        s.addStudent(new Student("Shawn", "Lim", "12", 10));

        // Add 3 teachers to teacher list //
        Teacher t = new Teacher(": Shenton", "Tan", "Chemistry");
        s.addTeacher(t);
        s.addTeacher(new Teacher(": Timothy", "Dodds", "English Literature"));
        s.addTeacher(new Teacher(": Bryan", "Onstad", "Mathematics"));

     // Display both lists //
        System.out.println("\nStudents: ");
        s.showStudents();
        System.out.println("\nTeachers: ");
        s.showTeachers();

     // Remove 2 students //
        s.deleteStudent(s1);
        s.deleteStudent(s2);

     // Remove 1 teacher //
        s.deleteTeacher(t);

     // Displays both lists //
        System.out.println("\nAfter removing: " + "\n");
        System.out.println("Students: ");
        s.showStudents();
        System.out.println("\nTeachers: ");
        s.showTeachers();

    }

}