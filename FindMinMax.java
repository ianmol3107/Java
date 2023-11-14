public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {-20,-30,-10,-150,-60,-70};
        System.out.println("Min number is: "+Min(arr));
        System.out.println("Max number is: "+Max(arr));
    }
    static int Min(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int min = arr[0];

        for(int i=1; i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    static int Max(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int max = arr[0];
        for(int i=1; i<arr.length;i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
