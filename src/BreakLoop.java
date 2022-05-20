public class BreakLoop {
    public static void main(String[] args) {
        for(int i=100; i>=1; i--){
            if(i==50||i==65||i==70){
                continue;
            }
            System.out.println(i);
        }
    }
}
