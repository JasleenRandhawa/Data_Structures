import java.util.Scanner;
class SpiralTraverseMatrix
{
  
    // Function print matrix in spiral form 
    static void printSpiral(int a[][], int m, int n) 
    { 
        int i, k = 0, l = 0; 
        /*  
        k - starting row index 
        m - ending row index 
        l - starting column index 
        n - ending column index 
        i - iterator 
        */
  
        while (k < m && l < n) { 
            // Print the first row from the remaining rows 
            for (i = l; i < n; ++i) { 
                System.out.println(a[k][i]); 
            } 
            k++; 
  
            // Print the last column from the remaining columns 
            for (i = k; i < m; ++i) { 
                System.out.println(a[i][n - 1]); 
            } 
            n--; 
  
            // Print the last row from the remaining rows */ 
            if (k < m) { 
                for (i = n - 1; i >= l; --i) { 
                    System.out.println(a[m - 1][i]); 
                } 
                m--; 
            } 
  
            // Print the first column from the remaining columns */ 
            if (l < n) { 
                for (i = m - 1; i >= k; --i) { 
                    System.out.println(a[i][l]); 
                } 
                l++; 
            } 
        } 
    } 
  
    // driver program 
    public static void main(String[] args) 
    { 
      Scanner s=new Scanner(System.in);
      int r=s.nextInt();
      int c=s.nextInt();
      int i,j;
      int a[][]=new int[r][c];
      for(i=0;i<r;i++)
      {
        for(j=0;j<c;j++)
        {
          a[i][j]=s.nextInt();
        }
      }
      printSpiral(a,r,c);
    } 
} 

class Main
{
  public static void main(String[] args)
  {
    int r, c, i, j;
    Scanner sc = new Scanner(System.in);
    r = sc.nextInt();
    c = sc.nextInt();
    int a[][] = new int[50][50];
    for(i = 0; i < r; i++)
      for(j = 0; j < c; j++)
        a[i][j] = sc.nextInt();
    SpiralTraverseMatrix.printSpiral(a, r, c);
  }
}
