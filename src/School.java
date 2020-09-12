import java.util.ArrayList;
public class School {
    // Fields //
    // Holds an ArrayList of Teachers //
    ArrayList<Teacher> teachers = new ArrayList<>();

    // Holds an ArrayList of students //
    ArrayList<Student> students = new ArrayList<>();

    // Holds an ArrayList of Courses //
    ArrayList<String> courses = new ArrayList<>();

    // 3 fields of your choosing (example name) with setters and getter //
    private String name;
    private String address;
    private String zip;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    // Methods //
    // Add a teacher to list //
    public void addTeacher(Teacher t) { this.teachers.add(t); }

    // Add a student to list //
    public void addStudent(Student t) {
        this.students.add(t);
    }

    // Delete teacher from list //
    public boolean deleteTeacher(Teacher t) {
        int index = -1;
        for(int i=0;i<teachers.size();i++) {
            if(t.getfName().equalsIgnoreCase(teachers.get(i).getfName()) &&
                    t.getlName().equalsIgnoreCase(teachers.get(i).getlName()) ) {
                index = i;
                break;
            }
        }
        if(index >=0) {
            teachers.remove(index);
            return true;
        }
        return false;
    }

    // Delete student from list //
    public boolean deleteStudent(Student t) {
        int index = -1;
        for(int i=0;i<students.size();i++) {
            if(t.getId()==students.get(i).getId() ) {
                index = i;
                break;
            }
        }
        if(index >=0) {
            students.remove(index);
            return true;
        }
        return false;
    }

    // Show all Teachers //
    public void showTeachers() {
        for(Teacher t: teachers) {
            System.out.println(t);
        }
    }

    // Show all Students //
    public void showStudents() {
        for(Student t: students) {
            System.out.println(t);
        }
    }

    // Appropriate constructor //
    public School(String name, String address, String zip) {
        this.name = name;
        this.address = address;
        this.zip = zip;
    }
}
