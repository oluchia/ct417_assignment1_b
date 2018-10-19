package ie.nuigalway.oanyabuike;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class CourseProgramme
{
    private String courseName;
    private List<Module> moduleList;
    private List<Student> studentList;
    private DateTime startDate;
    private DateTime endDate;

    public CourseProgramme(String courseName, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;

        moduleList = new ArrayList<>();
        studentList = new ArrayList<>();
    }

    public String getCourseName() {

        return courseName;
    }

    public void setCourseName(String courseName) {

        this.courseName = courseName;
    }

    public List<Module> getModuleList() {

        return moduleList;
    }

    public List<Student> getStudentList() {

        return studentList;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    protected boolean hasModule(Module m) {
        m.hasCourse(this);
        return moduleList.add(m);
    }

    protected boolean hasStudent(Student s) {

        s.hasCourse(this);
        if (getModuleList().size() > 0) {
            for (Module m :moduleList) {
                m.hasStudent(s);
            }
        }
        return studentList.add(s);
    }

    @Override
    public String toString() {
        return "CourseProgramme " + "\t" +
                "courseName='" + courseName + '\'' +
                ", moduleList=" + moduleList +
                ", studentList=" + studentList +
                ", startDate=" + startDate +
                ", endDate=" + endDate ;
    }
}
