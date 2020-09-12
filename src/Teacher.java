public class Teacher {
    // Fields //
    // First name //
    private String fName;

    // Last name //
    private String lName;

    // Subject //
    private String subject;

    // Methods //
    // Appropriate Constructor //
    public Teacher(String fName, String lName, String subject) {
        this.fName = fName;
        this.lName = lName;
        this.subject = subject;
    }

    // When teacher object printed Name: name Subject: subject //
    public String toString() {
        return "Name" + fName + " " + lName + "\t | Subject: " + subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
