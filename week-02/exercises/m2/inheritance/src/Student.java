//1. 'extends' pulls all non-private members from Person into Student

    public class Student {
            //extends Person {
        private String studentId;

        public String getStudentId() {
            return studentId;
        }
        public Student(String studentId) {
            this.studentId = studentId;
        }

    //    public void setStudentId(String studentId) {
   //         this.studentId = studentId;
   //     }

     //   public Student(String firstName, String lastName, String studentId) {
      //      //2. call the constructor on the "super" or parent class (Person)
       //     super(firstName, lastName);
       //     this.studentId = studentId;
       // }

     //   @Override
     //   public String getFullName() {
      //      String personFullName = super.getFullName();
       //     //append the student id to the persons full naem
       //     return String.format("%s, ID: %s", personFullName, studentId);
        //}
    }

