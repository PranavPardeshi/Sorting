import java.util.Scanner;

class QuickSorting {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sobj.nextInt();

        int Arr[] = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();
        }

        Sorting obj = new Sorting();
        obj.QuickSort(Arr, 0, size - 1);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print("| " + Arr[i] + " |");
        }
    }
}

class Sorting {
    public int Partition(int Arr[], int start, int end) {
        int pivot = Arr[start];
        int iCnt = 0;
        int temp = 0;

        for (int i = start + 1; i <= end; i++) {
            if (Arr[i] <= pivot) {
                iCnt++;
            }
        }

        // Place pivot at right position
        int pivotIndex = start + iCnt;
        temp = Arr[pivotIndex];
        Arr[pivotIndex] = Arr[start];
        Arr[start] = temp;

        // Handle left and right conditions
        int i = start, j = end;

        while (i < pivotIndex && j > pivotIndex) {
            while (Arr[i] <= pivot) {
                i++;
            }
            while (Arr[j] > pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                // Swap Arr[i] and Arr[j]
                temp = Arr[i];
                Arr[i] = Arr[j];
                Arr[j] = temp;
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    public void QuickSort(int Arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        // Partition
        int pivot = Partition(Arr, start, end);

        // Left part sort
        QuickSort(Arr, start, pivot - 1);

        // Right part sort
        QuickSort(Arr, pivot + 1, end);
    }
}
