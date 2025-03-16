package A_18_Opps;

public class StudentClass {
    // creating a new data type
    public static void change(Student s){
        s.name = "Rohan";
    }
    public static void main(String[] args) {
        Student s1 = new Student("Raghav", 46 , 92.0);
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);
    }
    
}
