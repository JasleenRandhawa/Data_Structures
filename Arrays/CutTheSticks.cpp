/*
 * An integer array of stick lengths (lengths). 
 * Pointer to the variable which is used to store the size of the result array.
 * 
 */

int* cutSticks(int n, int *lengths, int *result_size) 
{
	int zeros = 0;
  int count = 0;
  int min = findMin(lengths, n);
  
  while(min != 9999)
  {
    count = 0;
    for(int i =0; i< n; i++)
  	{
    	if(lengths[i] != 0)
    	{
      		lengths[i] -= min;
          	count ++;
    	}
  	}
    printf("%d\n", count);
    min = findMin(lengths, n);
  }
  
}
int findMin(int a[], int n)
{
  int min = 9999;
  for(int i = 0; i < n; i++)
  {
    if(min > a[i] && a[i] != 0)
      min = a[i];
  }
  return min;
  
}
