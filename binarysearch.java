public class binarysearch {
    public static int    binarySearch( int numbers[],int key){
        int start=0,  end=numbers.length-1;
        while( start<=end){
            int mid = (start+end)/2;
            // comparesion number in value in index

             if(numbers[mid]==key){
                return mid;
             }
             if(numbers[mid]< key){
                start=mid+1;

             }else{
                end=mid-1;
             }
        }
        return-1;


    }
    public static void main(String args[]){
        int number[]={2,4,6,8,10,12,14,16};
        int key=1;
        System.out.println(" index for key is : " +binarySearch(number, key ));
    }
    
}
