// // public class second {
// //     public static void main(String[] args) {
// //         int a = 8 ;
// //         int b = 6;
// //         int area = a *b ;
// //         System.out.println(area);
// //     } 
// // }

    
// // class Uniques{
// //     int id;
// //     String name;

// //     Uniques(int i,String n){
// //         id=i;
// //         name=n;}
// //         void display() {
// //         System.out.println(id + " " + name);
// //     }}
// // public class div{
// //     public static void main(String[] args) {
// //         Uniques s1 = new Uniques(101,"ajay");
// //         s1.display();}
  
        
// //     }
// public class div {
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         int largest = Integer.MIN_VALUE;
//         for(int i =0 ;i < arr.length ; i++){
//             if(arr[i]>largest){
//                 largest= arr[i];
//             }
//         }
//         System.out.println(largest);
        
//     }
// }

// import java.util.*;
// public class div{
//     public static void main (String args[]){
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         float b = sc.nextFloat();
//     }
// }

// public class div {
//     public static void main (String args[]){
//         int arr [] = {1,2,3,4};
//         int largest = Integer.MIN_VALUE;
//         int secondlargest = Integer.MIN_VALUE;

//         for(int i = 0;i<arr.length;i++){
//             if(arr[i]>largest){
//                 secondlargest= largest;
//                 largest = arr[i];
//             }
//         }
//         System.out.println(secondlargest);
//     }
// }

// public class div {
//     public static void main (String args[]){
//         int arr [] = {1,2,3,4,5};
//         int first = 0;
//         int last = arr.length-1;
//         while(first<=last){
//             int temp = arr[first];
//             arr[first]=arr[last];
//             arr[last]=temp;

//             first++;
//             last--;
//         }
//         for(int i = 0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

//                     target two sum by two loop

// public class TWO_SUM {
//     public static void main(String[] args) {
//         int arr[]={6,4,2,1,5,0,3};
        
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 if (arr[i]+arr[j]==6){
//                     System.out.println(arr[i]+"+"+arr[j]+"= 6");
//                 }
//             }
//                     }
//     }
    
// }

// duplicate element 
public class Div {
    public static void main(String args[]) {

        int arr[] = {1,2,3,4,4};
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){

                if(arr[i] == arr[j]){

                    for(int k = j; k < n - 1; k++){
                        arr[k] = arr[k + 1];
                    }

                    n--;   // size kam karo
                    j--;   // check again same position
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
  
// // two sum two pointer 
// public class Div {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 6, 7, 11};
//         int t = 9, i = 0, j = arr.length - 1;

//         while (i < j) {
//             if (arr[i] + arr[j] == t)
//                 System.out.println(arr[i++] + " + " + arr[j--] + " = " + t);
//             else if (arr[i] + arr[j] < t) i++;
//             else j--;
//         }
//     }
// }
