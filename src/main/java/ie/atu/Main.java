package ie.atu;


public class Main {
    public Main() {
    }

    public static void main(String[] args) {
       Student1 student = new Student1();
        student.setName();
        student.setEmail();
        student.setCourse();

        Student1 student2 = new Student1("");
        student2.setName();
        student2.setEmail();
        student2.setCourse();

        Student1 student3 = new Student1("", "", "");

        student3.setName();
        student3.setEmail();
        student3.setCourse();

        student.getName();
        student.getEmail();
        student.getCourse();

        student2.getName();
        student2.getEmail();
        student2.getCourse();

        student3.getName();
        student3.getEmail();
        student3.getCourse();
    }
}