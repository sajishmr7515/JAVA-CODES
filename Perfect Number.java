import java.util.*
class pallindrome{
 public static void main(string[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int sum = 0;
  for(i = 1 ; i<n ; i++ ){
   if(n%i == 0){
      sum = sum + i;
   }
  }
  if (sum==n){
   system.out.print("Perfect Number");
  }
  else{
   system.out.print("Not a Perfect Number");
  }
 } 
 }