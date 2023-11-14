public class LinearSearch {
    public static void main(String[] args){
        int[] arr1 = {4,5,9,10,15};
        int ans1 =search(arr1,9);
        System.out.println(ans1);

        int[] arr2 = new int[5];
        int ans2 = search(arr2,5);
        System.out.print(ans2);
    }
     static int search(int[] array, int target){
        if(array.length==0){
            return -1;
        }
        for (int index=0; index <array.length; index++) {
            if(array[index]==target){
                    return index;
        }
        }
        return -1;
    }

}
