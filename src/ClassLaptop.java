public class ClassLaptop {
    public static void main(String[] args) {
        //here l1 is Object
        Laptop l1=new Laptop();
        l1.name= "HP";
        l1.ram= 128;

        System.out.println(l1.name);
        System.out.println(l1.ram);

        Laptop l2=new Laptop();
        l2.name= "dell";
        l2.ram=256;
        System.out.println(l2.name);
        System.out.println(l2.ram);




    }
}
//This is Class.Here Laptop is Class
class Laptop{
    String name;
    int ram;
}
