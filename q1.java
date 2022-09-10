//Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.*;
public class q1{
    public static void main(String[] args){

        System.out.print("Enter length");
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();

        System.out.print("Enter breadth");
        Scanner sc1=new Scanner(System.in);
        int breadth=sc1.nextInt();

        if(length== breadth){
            System.out.print("Square");
        }
        else{
            System.out.print("Rectangle");
        }

    }

}