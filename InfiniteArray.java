public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        int answer;

        while(target>arr[end]) {
            int temp = end + 1;
            end = end + (end - start+1) * 2;
            start = temp;
        }
        return BinSearch(arr,target,start,end);
    }
    static int BinSearch(int[] arr, int target, int starting, int ending){


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
