package Demo;

public class SXNoiBot {
//   hàm để in ra từng giá trị khi sắp xếp
    public static void printArray(int no,int[] a){
        System.out.print( "lần "+no+": ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }


//    hàm sắp xếp nổi bọt
    public static void bubbleSort(int[] a){
        int n=a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n-i-1; j++) {
//                j j+1 j+1<n-i j<n-i-1

                if (a[j]>a[j+1]){
                    isSorted=false;
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            } printArray(i,a);
            if (isSorted){
                break;
            }
        }
    }


//    hàm sắp xếp chèn
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


//    hàm sắp xếp chọn
    public static void selectionSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
//                tìm min từ i ->n
                if (a[j]<a[minIndex]){
                    minIndex=j;
                }
            }
//            đỏi chỗ
            if (minIndex != i){
                int t = a[i];
                a[i] = a[minIndex];
                a[minIndex] = t;
            }
            printArray(i,a);
        }
    }

//    hàm main
    public static void main(String[] args) {
        int[] a = {4,3,6,2,2,9,1};
        int[] b = {3,4,2,1,7,9,5};
        int[] c = {2,5,7,3,1,6,8};
        long startTime1 = System.nanoTime();
        bubbleSort(a);
        long endTime1 =System.nanoTime();
        System.out.println("end1 "+(endTime1-startTime1));
        long startTime2 = System.nanoTime();
        insertionSort(a);
        long endTime2 =System.nanoTime();
        System.out.println("end2 "+(endTime2-startTime2));
        long startTime3 = System.nanoTime();
        selectionSort(a);
        long endTime3 =System.nanoTime();
        System.out.println("end3 "+(endTime3-startTime3));
//        System.out.println("sắp xếp nổi bọt");
//        System.out.println("================");
//        bubbleSort(a);
//        System.out.println("sắp xếp chèn");
//        System.out.println("================");
//        insertionSort(b);
//        System.out.println("sắp xếp chọn");
//        System.out.println("=================");
//        selectionSort(c);

    }
}
