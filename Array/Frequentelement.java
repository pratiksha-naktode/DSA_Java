public class FrequentElement{
    public static void main(String[] args) {
        int arr[]={1,5,6,6,2,3,4,4,};
        int maxcount=0;
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            int count=0;
          if((arr[i]%2)==0){
              for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
            }
            if(maxcount<count){
                maxcount=count;
                ans=arr[i];
            }
          }
        }
        System.out.println("frequent element "+ans);
    }
}