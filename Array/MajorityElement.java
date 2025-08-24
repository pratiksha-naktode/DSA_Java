public class MajorityElement{
    public static int Bruetforce(int arr[])
    {
      for(int i=0;i<arr.length;i++)
        {
            int count=0; //reset for every new i element
            for(int j=i;j<arr.length;j++){//count itself also
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

public static int MooresVoting(int arr[]){
    int freq=0, ans=0;
    for(int i=0;i<arr.length;i++){
        if(freq==0){
            ans=arr[i]; //set current elemt to ans
        }
        if(ans==arr[i]){ //check ans with current element if same increment
            freq++;
        }
        else{
            freq--;//not same decrease
        }
    }
    
    int count=0;
    for(int i=0;i<arr.length;i++){
    if(ans==arr[i]){
        count++;
    }
    }
    if(count>(arr.length/2)){
        return ans;
    }
    else{
return -1; //return -1 if element return by moores is not majority
    }
   // return ans;//return majority element
}


    public static void main(String args[]){
        int arr[]={1,4,2,3,4,4,4};
        // int res=Bruetforce(arr);
        // if(res==-1){
        //     System.out.println("Not exist");
        // }
        // else{
        //     System.out.println("Majority Element "+res);
        // }

        int result=MooresVoting(arr);
        if(result==-1){
             System.out.println("Not exist");
        }
        else{
                System.out.println("majority element is "+result);
       
        }
        
    }
}