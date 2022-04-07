package InsertionSort;

public class InsertionSort {
    public static void printArray(int no,int[] a){
        System.out.print( "lần "+no+": ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void insertionSort(int[] a){
        int n = a.length;
        for (int i = 1; i <n ; i++) {
//            chèn a[i] vao day 0-> i-1
            int ai=a[i];
            int j = i-1;
            while (j>=0&&a[j]>ai){
                a[j+1] =a[j];
                j--;
            }
            a[j+1]=ai;
            printArray(i,a);
        }
    }

    public static void main(String[] args) {
        int[] array={1,5,7,2,3,4,9};
        insertionSort(array);
    }
}
