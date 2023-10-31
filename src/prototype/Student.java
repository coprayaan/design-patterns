package prototype;

public class Student {
    public String name;
    public int age;
    public String school;

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.school = student.school;
    }

    public Student copy() {
        return new Student(this);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
    }
}
