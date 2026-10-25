package practice10;

public class Student {
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;
    private double gpa; // Средний балл
    private int iDNumber; // Идентификатор

    public Student(String firstName, String lastName, String specialty, int course, String group, double gpa, int iDNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
        this.iDNumber = iDNumber;
    }

    // Геттеры и сеттеры
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = course; }

    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    public int getiDNumber() { return iDNumber; }
    public void setiDNumber(int iDNumber) { this.iDNumber = iDNumber; }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + iDNumber +
                ", " + firstName + " " + lastName +
                ", Спец: '" + specialty + '\'' +
                ", Курс: " + course +
                ", Группа: '" + group + '\'' +
                ", GPA: " + gpa +
                '}';
    }
}