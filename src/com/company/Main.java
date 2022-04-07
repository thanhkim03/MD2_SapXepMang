package com.company;
public class Main {
        public static void printArray(int count,int[] arr){
            System.out.print( "lần "+count+": ");

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        //    hàm sắp xếp chèn
        public static void insertionSort(int[] array){
            int n = array.length;
            for (int i = 1; i < n; i++) {
//            chèn a[i] vao day 0-> i-1
                int arri=array[i];
                int j = i-1;

                while (  j>=0  &&  array[j]>arri  ){
                    array[j+1] =array[j];
                    j--;
                }
                array[j+1]=arri;
                printArray(i,array);
            }
        }

    public static void main(String[] args) {
        int[] arr = {5,3,1,6,2,8,4};
        insertionSort(arr);
    }
}
