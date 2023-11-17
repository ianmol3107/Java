public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,53,76,80,90,116};
        System.out.println(BinSearch(arr,80));
    }
    static int BinSearch(int[] arr, int target){
        int starting,ending;
        starting = 0;
        ending = arr.length-1;

        while(starting<=ending){
            int mid = starting+(ending-starting)/2;
            if(target>arr[mid]){
                starting = mid+1;
            }
            else if(target<arr[mid]){
                ending = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
