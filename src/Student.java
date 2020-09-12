public class Student {
    // Fields //
    // First name //
    private String fName;

    // Last name //
    private String lName;

    // Grade //
    private String grade;

    // Unique student number created on constructionMethods //
    private int id;

    // Methods //
    public void setId(int id) {
        this.id = id;
    }
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    // Appropriate Constructor //
    public Student(String fName, String lName, String grade, int id) {
        this.fName = fName;
        this.lName = lName;
        this.grade = grade;
        this.id = id;
    }

    // When printed "Name: name Grade: grade //
    public String toString() {
        return "Name: " + fName + " " + lName + " | Grade: " + grade;
    }
}