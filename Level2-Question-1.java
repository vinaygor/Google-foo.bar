answer(int x, int y)
{
	int temp = x+y -1;
       int sum = 1;
       for(int i=1;i<temp;i++){
           sum = sum + i;
       }
       for(int i=1;i<x;i++){
           sum = sum+1;
       }
       System.out.println(sum);

}