//coding ninja sum (second largest andsmallest arr)
//pb:Problem statement
//You have been given an array ‘a’ of ‘n’ unique non-negative integers.
//Find the second largest and second smallest element from the array.
//Return the two elements (second largest and second smallest) as another array of size 2.

//Example :
//Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
//Output: [4, 2]

//Date:24.11.25
//optimal approach:O(N)
//having 2 variables largest points to first and second largest -1,or any int value Integer_Maxval for maximum and Integer_Min value for minimum
//if a[i]>largest,update smallest and then largest to avoid confusion
//then if there exist any second value which is greater than existing second largest replace it and check if element!=largest; eg[1 2 7 7 7 7 7 5] largest =7 and second largest is 5 since 5 is<7
//similar code for second smallest 2 func returing a value and conveting it into arr to solve pb
public class Solution {
  public static int secondlargest(int n,int[]a){
        int largest=a[0];
        int second=-1;
        for(int i=0;i<n;i++){
            if(a[i]>largest){
                second=largest;
                largest=a[i];
            }
            else if(a[i]!=largest && a[i]>second){
                second=a[i];
            }

        }
        return second;

  }
public static int secondsmallest(int n,int[]a){
    int l=a[0];
        int s=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<l){
                s=l;
                l=a[i];
            }
            else if(a[i]!=l && a[i]<s){
                s=a[i];
            }

        }
        return s;

}

    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int sl=secondlargest(n,a);
        int sm=secondsmallest(n,a);
        int [] arr=new int[2];
        arr[0]=sl;
        arr[1]=sm;
        return arr;

     
    }
}
