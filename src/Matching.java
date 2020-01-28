


public class Matching {
    public static void main(String[] arg) {
        int[] array1 = new int[]{1, 7, 6, 5, 9};
        int[] array2 = new int[]{2, 7, 6, 3, 4};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println("(" + array1[i] + "," + array2[j] + ")");
                }
            }


        }
    }


}


//9. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
//        Write a program that will print out all matching pairs from arrays 1 and 2.
//        Expected output:
//        (7,7) and (6,6)