package ie.nuigalway.oanyabuike;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Module
{
    private String moduleName;
    private int id;
    private List<Student> studentList;
    private List<CourseProgramme> coursesList;


    public Module(String modName, int id) {
        this.moduleName = modName;
        this.id = id;

        studentList = new ArrayList<>();
        coursesList = new ArrayList<>();
    }

    public String getModuleName() {

        return moduleName;
    }

    public void setModuleName(String moduleName) {

        this.moduleName = moduleName;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public List<Student> getStudentList() {

        return studentList;
    }

    public List<CourseProgramme> getCoursesList() {

        return coursesList;
    }

    /*
    helper methods
     */
    protected void addCourse(CourseProgramme cp) {
        coursesList.add(cp);
    }

    protected void addStudent(Student s) {
        s.addModule(this);
        studentList.add(s);
    }
}
