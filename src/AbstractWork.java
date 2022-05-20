public class AbstractWork {
    public static void main(String[] args) {
    Addidas a1=new Addidas();
    a1.printBrand();

    }
}
abstract class Cloth{
    public abstract void printBrand();
}
class Addidas extends Cloth{
    public void printBrand(){
        System.out.println("brand name of cloth is Addidas");
    }
}

