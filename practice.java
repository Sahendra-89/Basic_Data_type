public class practice {
    public static void bubbleSortDecending( int arr[]){
        for( int turn =0; turn<arr.length-1; turn++){
            for( int j=0; j<arr.length-1-turn; j++){
                if( arr[j]<arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]= temp;

                }
            }
        }
        public static void main(String  args[]){
            

        }
    }
    
}
