
public class Main {

    static void Display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 15, 3, 9, 0};

        System.out.print("Before using Inserstion sort: ");
        Display(arr);
        System.out.println("");
        InsertionSort ob = new InsertionSort();
        System.out.print("After using Inserstion sort: ");
        ob.Sort(arr);
        Display(arr);
    }

}
