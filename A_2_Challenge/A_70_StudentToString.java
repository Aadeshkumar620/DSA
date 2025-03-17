package A_2_Challenge;

class A_70_StudentToString {
    String name;
    int age;
    String rollNumber;
    String house;

    public A_70_StudentToString(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student Details:{name:" + name
                + ", age:" + age
                + ", roll number:" + rollNumber
                + ", house:" + house + " }";
    }

    public static void main(String[] args) {
        A_70_StudentToString stu = new A_70_StudentToString("Prashant",
                30, "001", "Shivaji");
        System.out.println(stu);
    }
}









