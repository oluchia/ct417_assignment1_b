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
    private int id;
    private String userName;
    private List<CourseProgramme> courses;
    private List<Module> modules;


    public Student(String name, int age, DateTime dob, int id, String userName, List<CourseProgramme> cp, List<Module> modules) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dob;
        this.id = id;
        this.userName = userName;
        this.courses = cp;
        this.modules = modules;
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

    public int getId() {

        return id;
    }

    public void setId(int id) {

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

    public void setCourses(List<CourseProgramme> courses) {

        this.courses = courses;
    }

    public List<Module> getModules() {

        return modules;
    }

    public void setModules(List<Module> modules) {

        this.modules = modules;
    }

    protected String getUsername() {

        return name + "" + String.valueOf(age);
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", id=" + id +
                ", userName='" + userName + '\'' +
                ", courses=" + courses +
                ", modules=" + modules +
                '}';
    }
}
