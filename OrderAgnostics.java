public class OrderAgnostics {
    public static void main(String[] args) {
        int[] arr1 = {10,20,53,76,80,90,116};
        int[] arr2 = {116,90,83,76,53,20,10};
        System.out.println("For Ascending Array: "+OrderAgnostic(arr1,90));
        System.out.println("For Descending Array: "+OrderAgnostic(arr2,90));
    }
    static int OrderAgnostic(int[] arr, int target){
        int starting,ending;
        starting = 0;
        ending = arr.length-1;
        boolean isAsc = arr[starting]<arr[ending];

        while(starting<=ending){
            int mid = starting+(ending-starting)/2;
            if(arr[mid]==target) {
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    starting = mid+1;
                }
                else{
                    ending = mid - 1;
                }
            }else{
                if(target<arr[mid]){
                    starting = mid+1;
                }
                else{
                    ending = mid - 1;
                }
            }

        }
        return -1;
    }
}
