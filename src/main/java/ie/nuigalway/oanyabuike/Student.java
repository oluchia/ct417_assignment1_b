package ie.nuigalway.oanyabuike;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 */
public class Student {

    private String name;
    private int age;
    private DateTime dateOfBirth;
    private String id;
    private String userName;
    private List<CourseProgramme> courses;
    private List<Module> modules;


    public Student(String name, int age, DateTime dob, String id) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dob;
        this.id = id;

        courses = new ArrayList<>();
        modules = new ArrayList<>();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public DateTime getDateOfBirth() {

        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {

        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public List<CourseProgramme> getCourses() {

        return courses;
    }

    public List<Module> getModules() {

        return modules;
    }

    protected String getUsername() {

        return name + "" + String.valueOf(age);
    }

    /*
    helper methods
     */
    protected void addModule(Module m) {
        modules.add(m);
    }

    protected void addCourse(CourseProgramme cp) {
        courses.add(cp);
    }
}
