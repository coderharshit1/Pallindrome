class palindromeNum
{
 public static void main(String args[])
 {
     int n,reversedNum=0,remainder,originalNum;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a number");
     n=sc.nextInt();
 originalNum = n;
 while(n!=0)
     {
         remainder=n%10;
         reversedNum=reversedNum*10+remainder;
         n=n/10;
     }
     	
 if (originalNum==reversedNum)
     {
         System.out.println(originalNum+" is a palindrome");
     }
     else
     {
         System.out.println(originalNum+" is not a palindrome");
     } 
 }
}