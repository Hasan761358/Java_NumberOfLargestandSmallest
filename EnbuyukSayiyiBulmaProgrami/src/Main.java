import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberofelements, largest=0, smallest=0;

        System.out.print("Kaç tane sayı giriceksiniz : ");
        numberofelements= scan.nextInt();

        int [] array= new int[numberofelements];

        for(int i = 0 ; i < numberofelements; i++){
            System.out.print(i+1 + ". number : ");
            array[i]= scan.nextInt();
           if(i==0){
               largest=array[i];
               smallest=array[i];

           }
           if(array[i]<smallest){
               smallest=array[i];
           }
           if (array[i]>largest){
               largest=array[i];
           }
        }
        System.out.println("Number of largest : "+ largest);
        System.out.println("Number of smallest : "+ smallest);
    }
}