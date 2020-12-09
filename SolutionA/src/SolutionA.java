import java.util.Scanner;

public class SolutionA {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int arr[] = new int[count];

        for (int i = 0; i < count; i++)
            arr[i] = scanner.nextInt();

        scanner.close();

        int index = binarySearch(arr, 0, count - 1, false, -1);
        if (index == -1)
            System.out.println("NOT_FOUND");
        else
            System.out.println(index);

    }

    static int binarySearch(int arr[], int low, int high, boolean found,int index) {
        if (high >= low) {
            int mid = (low + high) / 2;
            int compare = mid + 1;

            if (compare == arr[mid]) {
                found = true;
                index = compare;
            }

            if (mid > arr[mid] && !found)
                return binarySearch(arr, (mid + 1), high, found,index);
            else
                return binarySearch(arr, low, (mid - 1),found,index);
        }

        /*
         * Return -1 if there is no Fixed Point
         */
        return index;
    }

}

