public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){}
  public static void mergesortH(int[] data,low,high){
    if(low<high){
      mergesortH(data,low,(high-low+1)/2);
      mergeSortH(data,(high-low+1)/2,high);
    }
  }
  public static void sorting(int[] data1,int start1,int start2){
    int[] sorted=new int[start1-start2];

  }
}
