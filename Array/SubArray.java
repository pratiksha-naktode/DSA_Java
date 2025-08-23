public class SubArray {
public static void SubArray2(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print("["+arr[k]+"]");
                    count++;
                }
                System.out.println("");
            }
        }
         System.out.println("total subarray in array"+count);
    }
    // Find subarray whose sum matches target using brute force
    public static void Demo(int arr[], int target) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == target) {
                    found = true;
                    System.out.print("Subarray found: ");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }

        if (!found) {
            System.out.println("No subarray found");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        SubArray2(arr);
        Demo(arr, 7);
    }
}
