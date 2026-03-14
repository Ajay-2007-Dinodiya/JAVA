// public class Pattern {
//     public static void main(String args[]){
//         for(int i =1 ;i<=5;i++){
//             for(int j =1; j<=i;j++){
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }
//     }
    
// }


// public class Pattern {
//     public static void main(String[] args) {
//         for(int i =1;i<=5;i++){
//             for(int j =1;j<=5;j++){
//                 if(i==1 || i == 5 || j ==1 || j == 5){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
        
//     }

// }



// public class Pattern {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j =1 ;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Pattern {
//     public static void main(String[] args) {
//         int num = 4 ;
//         String result = (num%2==0) ? "even" : "odd";
//         System.out.println(result);
//     }
// }
// public class Pattern{
//     public static void main(String[] args) {
//         int num = 10;
//         for(int i=num ;i>=1;i--){
//             System.out.println(i);
//         }
//     }
// }


// public class Pattern{
//     public static void main(String[] args) {
//         int num = 123;
//         int rev = 0;
//         while(num>0){
//             int digit= num%10;
//             rev= rev*10 + digit;
//             num=num/10;
//         }
//         System.out.println(rev);
//     }
// }

public class Pattern{
    public static void main(String[] args) {
        int i , j ;
        for(i=1;i<=5;i++){
            for(j=5;j>i;j--){
                System.out.print(" ");
            }
            for(j = 1;j<=i;j++){
                System.out.print(j);
            }
            for(j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}