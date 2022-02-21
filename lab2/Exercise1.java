 public class Exercise1
{ 
   static int getSecondSmallest(int arr[])
   {
      int s = arr[0];

      for (int i=0; i < arr.length; i++){
         if(arr[i] < s)
            s = arr[i];
      }

     int s2 = Integer.MAX_VALUE;

     for (int i=0; i < arr.length; i++){
         if(arr[i] != s && arr[i] < s2)
           s2 = arr[i];
     }

    return s2;

  }

  public static void main(String args[])
  {

      int arr[] = {22, 23, 1, 30, 24, 20};
      System.out.println(getSecondSmallest(arr)); 
   }
}