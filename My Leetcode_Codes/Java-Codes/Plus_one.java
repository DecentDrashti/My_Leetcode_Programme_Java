import java.util.*;
public class Day2_streak {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int[] digits = new int[n]; 
       for (int d = 0; d <n; i++) {
        System.out.println("Enter an integer:");
         digits[d] = sc.nextInt(); 
       }
//        if(digits[n-1]<9){
//         digits[n-1]+=1;
//        }
//        else if(n>1){
//         digits[(n-1)]=0;
//         digits[(n-2)]+=1;
//         if(digits[(n-2)]>9){
//            digits=new int[n+1];
//            digits[0]=1;
//         }
//         }
//        else if(n==1){
//              digits=new int[n+1];
//              digits[0]=1;
//          }
//         //  else if(n==2){
//         //     digits=new int[n+1];
//         //     digits[0]=1
//         //  }
        
//        return digits;
//     }
// }