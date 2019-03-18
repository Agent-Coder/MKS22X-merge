import java.util.Arrays;
public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    mergesortH(data,0,data.length-1);
  }
  //inclusive of high and low
  public static void mergesortH(int[] data,int low, int high){
    if(data.length>1){
      int[] l=new int[((high-low)/2)+1];
      int[] r=new int[high-l.length+1];
      if((((high-low)/2)+1)+(high-(l.length-1))!=data.length){
        System.out.println(l.length);
        System.out.println(r.length);
        System.out.println(data.length);
        System.out.println("NOOOOOOOOOOOOOOOOO");
      }
      for (int i=0;i<l.length;i++) {
        l[i]=data[i];
      }
      for (int i=0;i<r.length;i++) {
        r[i]=data[i+(l.length-1)];
      }
      mergesortH(l,low,l.length-1);
      mergesortH(r,l.length,high);
      int a=0;
      int b=0;
      for (int j=0;j<data.length;j++) {
        if(a>l.length-1){
          data[j]=r[b];
          b++;
        }
        else if(b>l.length-1){
          data[j]=r[a];
          a++;
        }
        else{
          if(l[a]>=r[b]){
            data[j]=l[a];
            a++;
          }
          else{
            data[j]=r[b];
            b++;
          }
        }
      }
    }
  }
  public static void sorting(int[] data,int start1,int end1,int start2,int end2){
    int[] copy=data;
    int longer=end1;
    int shorter=end2;
    if(end1-start1<end2-start2){
      longer=end2;
      shorter=end1;
    }
    int i=start1;
    int j=start1;
    int k=start1;
    while(i<=shorter){
      if(copy[i]<=copy[j]){
        data[k]=copy[i];
        i++;
      }
      else{
        data[k]=copy[j];
        j++;
      }
      k++;
    }
    while(j<=shorter){
      data[k]=data[j];
      k++;
      j++;
    }
  }
  public static void main(String[] args) {
    int[] ary={2,4,6,2,2,5,23,4,65,3,3,7,237,789};
    mergesort(ary);
    System.out.println(Arrays.toString(ary));
  }


}
