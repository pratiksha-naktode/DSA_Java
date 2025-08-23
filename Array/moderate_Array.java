import java.util.*;
public  class moderate_Array{
    public  static void Ascending(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public  static void Descending(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
   public static void Duplicates(int arr[]) {
    boolean flag = false;
    int n = arr.length;
    int count = 0;
    int duplicates[] = new int[n];
    boolean exist=false;
    
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                                // store duplicate at "count" index, not "i"
                for(int k=0;k<count;i++){
                    if(duplicates[k]==arr[i]){
                        exist=true;
                        break;
                    }
                }
                if(!exist){
                    
                duplicates[count] = arr[i];
                count++;
                flag = true;
                }
                 // avoid storing the same duplicate multiple times
            }
        }
    }

    if (!flag ) {
        System.out.println("Element not found...");
    } else {
        for (int k = 0; k < count; k++) {
            System.out.print(duplicates[k] + " ");
        }
    }
}

public static void RemoveArray(int arr[]) {
    int n = arr.length;
    int count = 0;
    int unique[] = new int[n];

    for (int i = 0; i < n; i++) {
        boolean isduplicate = false;//reset each time

        // check if arr[i] already appeared before
        for (int j = 0; j < i; j++) {
            if (arr[i] == arr[j]) {
                isduplicate = true;
                break;
            }
        }

        // if not duplicate, store it
        if (!isduplicate) {
            unique[count] = arr[i];
            count++;
        }
    }

    // print only unique values
    for (int k = 0; k < count; k++) {
        System.out.print(unique[k] + " ");
    }
}

public static void CountFrequency(int arr[]){
    boolean visited[] = new boolean[arr.length];
    for(int i=0;i<arr.length;i++){
        if (visited[i]) continue; // already counted this element
        int count=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]){
                visited[j] = true; // mark duplicates as counted
                count++;
            }
            }
            System.out.println("frequency of "+arr[i]+ " is "+count);

    }
}

public static int [] Merge(int arr1[],int arr2[]){
    int n1=arr1.length+arr2.length;
    int arr3[]=new int[n1];
    for(int i=0;i<arr1.length;i++){
        arr3[i]=arr1[i];
    }
    for(int i=0;i<arr2.length;i++){
        arr3[arr1.length+i]=arr2[i];
    }
    return arr3;
}

    
    public static void main(String args[]){
        int arr[]={2,8,-1,10,2,2};
        // System.out.println("Array in ascending order :");
        // Ascending(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        //  System.out.println("Array in descending order :");
        //  Descending(arr);
        //  System.out.print(Arrays.toString(arr));

        // boolean res=Duplicates(arr);
        // if(res){
        //     System.out.println("Array contain duplicates value");
        // }
        // else{
        //     System.out.println("No duplicates value");
        // }


        // Duplicates(arr);
        //  System.out.print(Arrays.toString(arr));
        //  RemoveArray(arr);
        //CountFrequency(arr);
        int a[]={1,2,3,4};
        int b[]={9,8,7,6,5};
        int mergearray[]=Merge(a,b);
        System.out.println(Arrays.toString(mergearray));

               
    }
}