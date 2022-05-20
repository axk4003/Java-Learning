//Write a program in Java to join two arrays.
 public class Array1 {
    public static void main(String[] args) {
        String [] countries ={"USA","Nepal","Japan","India"};
        String [] capitals= {"WDC","KTM","Tokyo","New Delhi"};

        for(int i=0; i<countries.length; i++)
        {
            System.out.println("The capital city of "+ countries[i] + " is " + capitals[i]);
        }

    }
}
