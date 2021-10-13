public class Person {
    //fields
    private String firstName;
    private String lastName;
    //new code : composition
    private Student studentRecord;
    private Instructor instructorRecord;

    //getters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //new code
    public Student getStudentRecord() {
        return studentRecord;
    }

    public void setStudentRecord(Student studentRecord) {
        this.studentRecord = studentRecord;
    }

    public Instructor getInstructorRecord() {
        return instructorRecord;
    }

    public void setInstructorRecord(Instructor instructorRecord) {
        this.instructorRecord = instructorRecord;
    }

    //constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //methods
    public String getFullName() {
       // return String.format("%s%s ",firstName, lastName);
        StringBuilder buffer = new StringBuilder(100);

        // am i an instructor?
        if (instructorRecord != null) {
            buffer.append(instructorRecord.getTitle());
            buffer.append(" ");
        }

        //plain person
        buffer.append(firstName);
        buffer.append(" ");
        buffer.append(lastName);

        //am i student?
        if (studentRecord != null) {
            buffer.append(", ID: ");
            buffer.append(studentRecord.getStudentId());
        }
        return buffer.toString();
    }
}
