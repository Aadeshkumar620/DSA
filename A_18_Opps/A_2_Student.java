package A_18_Opps;

public class A_2_Student {
    public static class Student{
        String name;
        int rno;
        double percent;
    }
    public static class Car{
        String name;
        String type;
        int price;
    } 
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Aadesh kumar";
        x.rno = 96;
        x.percent = 80;
        

        Student y = new Student();
        y.name = "Ravi Raj";
        y.rno = 59;
        y.percent = 96;

        Car c1 = new Car();
        c1.name = "Alto";
        c1.price = 5999;
        c1.type = "hatchhback";

        testing t1 = new testing();
        System.out.println(t1.village);

        Glatudent s1 =new Glatudent();
        s1.setRno(8);
        


    }
    
}
