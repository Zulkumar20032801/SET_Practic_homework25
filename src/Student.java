import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private String course;
    private String group;
    private int grade;

    public Student(String name, String course, String group, int grade) {
        this.name = name;
        this.course = course;
        this.group = group;
        this.grade = grade;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                ", grade=" + grade +
                '}';
    }


}
