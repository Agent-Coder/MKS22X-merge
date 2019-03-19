import java.util.Arrays;
public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    int[] copy=new int[data.length];
    for (int a=0;a<data.length ;a++ ) {
      copy[a]=data[a];
    }
    mergesortH(data,copy,0,data.length-1);
  }
  //inclusive of high and low
  public static void mergesortH(int[] data,int[] copy,int low, int high){
    if(low<high){
      mergesortH(copy,data,low,(high-low)/2+low);
      mergesortH(copy,data,((high-low)/2)+low+1,high);
      sorting(copy,data,low,((high-low)/2)+low+1,high);
    }
    //sorting(copy,data,low,((high-low)/2)+1);
  }
  public static void sorting(int[] data,int[] copy,int start1,int start2,int end){
    int i=start1;
    int j=start2;
    int k=start1;
    while(i<start2&&j<end+1){
      if(data[i]<=data[j]){
        copy[k]=data[i];
        i++;
      }
      else{
        copy[k]=data[j];
        j++;
      }
      k++;
    }
    if(j!= end+1){
      while(j<end+1){
        copy[k]=data[j];
        k++;
        j++;
      }
    }
    if(i!=start2){
      while(i<start2){
        copy[k]=data[i];
        k++;
        i++;
      }
    }
  }
  public static void insertionSort(int[] data,int low, int high){
  int store;
  //stores number that is being placed
  int i;
  //keeps track of current index being examined
  for (int x=low+1;x<high+1;x++){
      store=data[x];
      i=x;
      //store the value at the index we are examining
      while (i>=1&&store<data[i-1]){
        //loop backwards to find number where it is greater than stored
        data[i]=data[i-1];
        //start shifting if the stored number is less than current
        i--;
        //increment i, examines from right to left
      }
      data[i]=store;
      //set number at the place
   }
 }
  public static void main(String[] args) {
    int[] ary={1,1,1,2,3,7,3,5,7,3,10,20,30};
    int[] x=new int[ary.length];
    insertionSortsort(ary);
    System.out.println(Arrays.toString(ary));
  }


}
