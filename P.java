
import java.util.Scanner;
public class P
{
  public static void main(String[]args){
      Scanner scanner = new Scanner (System.in);
      System.out.println("Enter the number of elements in the array:");
      int a = scanner.nextInt();
      
      int numbers[] = new int[a];
      
      System.out.println("Enter the elements of the array:");
      
      for(int i=0; i< a; i++){
          numbers [i] = scanner.nextInt();
          
      }
      
      int largest = numbers[0];
      
      for(int i = 1; i < a; i++){
          if (numbers[i] > largest){
              largest = numbers[i];
          }
      }
      
      System.out.println("The largest number in the array is:" + largest);
      
  }
}
