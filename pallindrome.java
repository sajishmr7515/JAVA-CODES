import java.util.*
class pallindrome{
 public static void main(string[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter Array Elements :");
    for(int i = 0 ; i<n ; i++){
        arr[i] = sc.nextInt();
    }
    boolean pallindrome = true;
    for(int i=0 ; i<n/2 ; i++){
       if(arr[i]!=arr[n-1-i]){
        pallindrome = false;
        break;
       } 
    }
    if(pallindrome){
        System.out.print("The number of Array is pallindrome");
    }
    else{
        System.out.print("The number of Array is not pallindrome");
    }
    sc.close();
 }
}
