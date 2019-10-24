public class Sorting {

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < i - 1; j++) {
                if (arr[i] > arr[j + 1]) {
                    int tempVar = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tempVar;


                }
            }


        }

        return arr;
    }

//    public static void main(String[] args) {
//        int[] arry =  {1,4,2,6,3,};
//
//        System.out.println(bubbleSort(arry));
//    }

}
