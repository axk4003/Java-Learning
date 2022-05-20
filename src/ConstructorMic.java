public class ConstructorMic {
    public static void main(String[] args) {
        Mic m1=new Mic(1,"sony",75);
        m1.printFunction();
        Mic m2=new Mic(2,"samsung",100);
        m2.printFunction();
    }
}

class Mic{
    int id;
    String name;
    double price;

    public Mic(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void printFunction(){
        System.out.println("the id of mic is "+this.id);
        System.out.println("the name of mic is "+this.name);
        System.out.println("the price of mic is "+this.price);
    }
}