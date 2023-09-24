public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Task 1");
        int [ ] intArray = new int [3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        double[] doubleArray = {1.57, 7.654, 9.986};

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println();

        String[] stringArray = new String[4];
        stringArray[0] = "My";
        stringArray[1] = "name";
        stringArray[2] = "is";
        stringArray[3] = "Java";

        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }
        System.out.println();

        // task 2
        System.out.println("Task 2");
        int[] array1 = {1, 2, 3,4 , 5};
        int[] array2 = {6, 7, 8, 9, 10};

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);

        if (i < array1.length - 1) {
            System.out.print(",");
        }
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);

        if (i < array2.length - 1){
            System.out.print(",");
        }
        }
        System.out.println();

        // task 3
        System.out.println("Task 3");
        int[] arr1 = {1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};

        for (int i = arr1.length - 1; i >= 0; i--){
            System.out.print(arr1 [i]);
        if (i > 0){
            System.out.print(",");
        }
        }
        System.out.println();

        for (int i = arr2.length - 1; i >= 0; i--){
            System.out.print(arr2 [i]);
        if (i > 0){
            System.out.print(",");
        }
        }
        System.out.println();

        //task 4
        System.out.println("Task4");
        int[] array = {1, 3, 6, 8, 9, 17};
        for (int i = 0; i < array.length; i++) {
        if (array[i] % 2 != 0) {
        array[i]++;
        }
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}