public class First1 {
public static void main(String[] args) {
        int pos =3;
        int value = 60;
        int [] arr = { 10,20,30,40,50};
        for(int i = arr.length-1 ; i > pos-1 /* pos-1 isliye kiya kyuki i index value ko show kar rha h  joh ki 30 h */;i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1] = value; // insert karwa diya 
        for (int i =0;i<arr.length; i++){
            System.out.print(arr[i]);
        }

    } 
}
