package creational_patterns.prototype;

public class Client {

    public static void main(String[] args) {
        Student student = new Student("John", 20, "Stanford");
        Student studentCopy = student.copy();
        System.out.println(studentCopy);
    }
}
