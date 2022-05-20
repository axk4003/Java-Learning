public class InheritanceWork {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.id=321;
        c.name="Bob";
        c.color="white";
        c.sound="meow";
        c.print();


    }
}
class Animal{
    int id;
    String name;
    String color;

}
class Cat extends Animal{
    String sound;

    void print(){
        System.out.println("Cat id is " +id);
        System.out.println("Cat name is " +name);
        System.out.println("Cat color is " +color);
        System.out.println("Cat sound is " +sound);
    }


}