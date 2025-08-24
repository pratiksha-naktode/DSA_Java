public class MajorityElement{
    public static int Bruetforce(int arr[])
    {
        
        for(int i=0;i<arr.length;i++)
        {
            int count=0; //reset for every new i element
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>(arr.length/2)){
                   
                   return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[]={1,2,1,4,4,4,4};
        int res=Bruetforce(arr);
        if(res==-1){
            System.out.println("Not exist");
        }
        else{
            System.out.println("Majority Element "+res);
        }
       
    }
}