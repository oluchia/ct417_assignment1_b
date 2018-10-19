package ie.nuigalway.oanyabuike;

import org.joda.time.DateTime;

public class StudentMain {

    public static void main( String[] args ) {

        CourseProgramme ece = new CourseProgramme("ECE", new DateTime(2015, 9, 1, 0, 0), new DateTime(2019, 6, 1, 0, 0));

        Module softwareEng = new Module("Software Eng", 417);
        Module machineLearning = new Module("Machine Learning", 475);
        Module dsp = new Module("Digital Signal Processing", 445);

        Student john = new Student("John Smith", 20, new DateTime(), "12345000");
        Student alice = new Student("Alice Smith", 20, new DateTime(), "12345000");
        Student bob = new Student("Bob Smith", 20, new DateTime(), "12345000");
        Student charlie = new Student("Charlie Smith", 20, new DateTime(), "12345000");

        ece.addModule(softwareEng);
        ece.addModule(machineLearning);
        ece.addModule(dsp);

        ece.addStudent(john);
        ece.addStudent(alice);
        ece.addStudent(bob);
        ece.addStudent(charlie);

        System.out.println("Course: " + ece.getCourseName());
        System.out.println("Start date: " + ece.getStartDate().toString());
        System.out.println("End date: " + ece.getEndDate().toString());
        System.out.println("Modules:");
        for (Module module : ece.getModuleList()) {
            System.out.println(module.getModuleName() + " " + module.getId());
        }

        System.out.println("\nEnrolled students:\n");
        for (Student student : ece.getStudentList()) {

            System.out.println(student.getName() + ", ID: " + student.getId() + ", Username: " + student.getUsername());

            System.out.println("Courses this student is enrolled in:");
            for (CourseProgramme cp : student.getCourses()) {
                System.out.println(cp.getCourseName());
            }

            System.out.println("Modules this student is registered for:");
            for (Module module : student.getModules()) {
                System.out.println(module.getModuleName() + " " + module.getId());
            }

            System.out.println();
        }
    }

}
