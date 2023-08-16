import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        // Insert an element at index 2
        int element = 10;
        int index = 2;
        arr = insertElement(arr, element, index);

        System.out.println("After inserting " + element + " at index " + index + ":");
        System.out.println(Arrays.toString(arr));

        // Remove the element at index 3
        index = 3;
        arr = removeElement(arr, index);

        System.out.println("After removing element at index " + index + ":");
        System.out.println(Arrays.toString(arr));
    }

    // Method to insert an element at a specific index in an array
    public static int[] insertElement(int[] arr, int element, int index) {
        int[] newArray = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArray.length; i++, j++) {
            if (i == index) {
                newArray[i] = element;
                j--;
            } else {
                newArray[i] = arr[j];
            }
        }

        return newArray;
    }

    // Method to remove an element at a specific index from an array
    public static int[] removeElement(int[] arr, int index) {
        int[] newArray = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i == index) {
                j--;
            } else {
                newArray[j] = arr[i];
            }
        }

        return newArray;
    }
}
