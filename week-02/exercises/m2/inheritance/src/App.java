public class App {
    public static void main(String[] args) {
       // Person p = new Person("Merilee", " Sheldrick");
       // Student s = new Student("Bale", " Packmann", "100-A29-WER");
       // Instructor i = new Instructor("Letisha", " Pursey", "INS-COMPSCI-123", "Dr.");

     //   printPerson(p);
    //    printPerson(s);
     //   printPerson(i);
        //after composition
        Person p = new Person("Merilee", "Sheldrick");

        Person s = new Person("Bale", "Packmann");
        s.setStudentRecord(new Student("100-A29-WER"));

        Person i = new Person("Letisha", "Pursey");
        i.setInstructorRecord(new Instructor("INS-COMPSCI-123", "Dr."));

        Person both = new Person("Pembroke", "Andrewartha");
        both.setStudentRecord(new Student("245-GZ4-KLA"));
        both.setInstructorRecord(new Instructor("INS-LIT-532", "Prof."));

        System.out.println(p.getFullName());
        System.out.println(s.getFullName());
        System.out.println(i.getFullName());
        System.out.println(both.getFullName());

    }
/*
   static void printPerson(Person p) {
      if (p instanceof Person) {
            System.out.println("I'm a person.");
        }
        if(p instanceof Student) {
            System.out.println("I am a Student.");
            //cast the person as a student
            String studentId = ((Student)p).getStudentId();
            System.out.println("Student ID: " + studentId);
        }
        if (p instanceof Instructor) {
            System.out.println("I'm an Instructor");
            //cast the person as instructor
            String title = ((Instructor)p).getTitle();
            System.out.println("Title: " + title);
        }
        System.out.println("My name is: " + p.getFullName());

 */

 //   }
}
