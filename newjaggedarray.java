class newjaggedarray{
 public static void main(String args[])
 {
 int arr[][]=new int[4][];
 arr[0]=new String[3];
 arr[1]=new double[2];
 arr[2]=new char[8];
 arr[3]=new int[1];
 arr[0][]={"mohammada","ali","hanfi"};
 arr[1][]={12.3,34.6};
 arr[2][]={"a","l","i","h","a","n","f","i"};
 arr[3][]={4};
 for(int i=0;i<arr.length;i++)
  {
   for(int j=0;j<arr[i].length;j++)
    {
    System.out.print(arr[i][j]+" ");
    }
    System.out.println();
   }
 }

}
