public class HouseProperties {
    public static void main(String[] args) {
        House h1=new House();
        h1.id=1;
        h1.name="ranch";
        h1.price=600000;
        h1.printFunction();

        House h2=new House();
        h2.id=2;
        h2.name="mansion";
        h2.price=900000;
        h2.printFunction();

        House h3=new House();
        h3.id=3;
        h3.name="farmhouse";
        h3.price=400000;
        h3.printFunction();

    }
}
class House{
    int id;
    String name;
    int price;

    void printFunction(){
        System.out.println("House id is " +id);
        System.out.println("House name is " +name);
        System.out.println("House price is " +price);
    }
}