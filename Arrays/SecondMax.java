import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class SecondMax{
    public static void main(String[] args)
    {
        int a[] = new int[5];
      Scanner s = new Scanner(System.in);
      int max;
      int sec = 0 ;
      for(int i = 0; i < 5; i++)
      {
        a[i] = s.nextInt();
      }
      max = a[0];
      for(int i = 0; i < 5; i++)
      {
        if(max < a[i])
        {
          sec = max;
          max = a[i];
        }
        else if(sec < a[i] && a[i] != max)
        {
          sec = a[i];
        }
        
      }
      System.out.println(sec);
    }
}
