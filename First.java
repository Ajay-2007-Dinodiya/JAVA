/*                                                             Deletion  */
// public class first {
//     public static void main(String[] args) {
//         int arr [] = {10,20,30,80,60};
//         int val = 30;
//         for(int i = 0 ;i<arr.length;i++){
//             if(val==arr[i]){
//                 for(int j = i;j<arr.length;j++){
//                     arr[j]=arr[j+1];
//                 }
//                 break;
//             }
//         }
//         for(int i = 0 ; i<arr.length;i++){
//             System.out.println(arr[i] + " ");
//         }
//     }
// }
//                                                        Insertion 



 /*                                                        Binary search                                               */

// public class First{
//     public static int BinarySearch ( int num[],int key){
//         int start = 0 , end = num.length-1 ;

//         while(start < end){
//             int mid = (start + end)/2 ;
//             if(num[mid]== key){
//                 return mid;
//             }
//             if(num[mid] < key){
//                 start = mid + 1;
//             }
//             else{
//                 end = mid - 1; 
//             }
//         }
//         return -1 ;
//     }
//     public static void  main ( String args []){
//         int num [] = {2,4,6,8};
//         int key = 4 ;
//         System.out.println(BinarySearch(numbers,key));
//     }
//  }


// /*                                                                             zeroes aage non zero piche   */

// public class First {
//     public static void main(String[] args) {

//         int[] arr = {1, 0, 3, 0, 5, 0, 2};
//         int index = arr.length - 1;
    
//         for (int i = arr.length - 1; i >= 0; i--) {
//             if (arr[i] != 0) {
//                 arr[index] = arr[i];
//                 index--;
//             }
//         }
        
//         for (int i = index; i >= 0; i--) {
//             arr[i] = 0;
//         }

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

// /*                                                     find the missing term                                                    */
// public class First{
//     public static void main( String args[]){
//         int arr[] = {6,7,8,10};
//         int first = arr[0];
//         int last = arr[arr.length-1];
//         int expectedsum = n*(first + last)/2 ;

//         int actualsum = 0;
//         for(int i = 0; i< arr.length;i++){
//             actualsum += arr[i];
//         }
//         int missingnum = expectedsum - actualsum ;
//         System.out.println(missingnum);
//      }    
// }
 /*                                                    area of rectangle                                        */
// public class first{
//      public static void main (String args []){

//         int a = 7;
//         int b = 7;
//         int area = a*b ;
//         System.out.println(area);
//      }
// }


// public class First{
//    public static void main(String[] args) {
//       int num = 4;
//       if(num>0){
//          System.out.println("num is +ive");
//       }
//       else if(num<0){
//          System.out.println("num is -ive");
//       }
//       else{
//          System.out.println("num is neutral");
//       }
//       }
//    } 






