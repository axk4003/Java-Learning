public class Copywork {
    public static void main(String[] args) {
        Copy c1=new Copy();
        c1.setName("Set Name");
        c1.setId(1);
        c1.print();

        Copy c2=new Copy();
        c2.setName("Set Name");
        c2.setId(2);
        c2.print();

    }
}
class Copy{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void print(){
        System.out.println("Copy id is "+this.id);
        System.out.println("Copy name is "+this.name);
    }
}
