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


    public Module(String modName, int id, List<Student> sList, List<CourseProgramme> cList) {
        this.moduleName = modName;
        this.id = id;
        this.studentList = sList;
        this.coursesList = cList;

        studentList = new ArrayList<Student>();
        coursesList = new ArrayList<CourseProgramme>();
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

    public void setStudentList(List<Student> studentList) {

        this.studentList = studentList;
    }

    public List<CourseProgramme> getCoursesList() {

        return coursesList;
    }

    public void setCoursesList(List<CourseProgramme> coursesList) {

        this.coursesList = coursesList;
    }

    @Override
    public String toString() {
        return "Module {" +
                "moduleName='" + moduleName + '\'' +
                ", id=" + id +
                ", studentList=" + studentList +
                ", coursesList=" + coursesList +
                '}';
    }
}
