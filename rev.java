public class rev {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};
        int n=arr.length;
        System.out.println("original array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int start=0, end=n;
        while(start<end){
            int temp= arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
        }
        System.out.println("After reverse ");
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    
}
