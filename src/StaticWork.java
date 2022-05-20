public class StaticWork {
    public static void main(String[] args) {
        Teacher.collegeName="Diamond";

        Teacher t1=new Teacher(1,"Rita");
        t1.id=1;
        t1.name="Rita";
        Teacher t2= new Teacher(1,"arya");
        t2.id=2;
        t2.name="arya";

        System.out.println("t1.collegeName");
        System.out.println("t2.collegeName");
    }
}
class Teacher{
    int id;
    String name;
    static String collegeName;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;

    }
}
