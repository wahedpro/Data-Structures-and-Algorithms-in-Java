import java.util.Scanner;
public class Arrays{
    public static void main(String[] ages){
        //create array
        int[] number=new int[10];
        
        //Scanner Object create
        Scanner input=new Scanner(System.in);

        //input value in array 
        for(int i=0; i<number.length; i++){
            number[i]=input.nextInt();
        }

        //Array print
        for (int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
    }
}