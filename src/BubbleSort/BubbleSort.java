package BubbleSort;

public class BubbleSort {
    static int[] list = {1,5,4,9,2,3,8,7,6};
    public static void bubbleSort(int[] list){
        boolean check= true;
        for (int i = 1; i < list.length; i++) {
            check =false;
            for (int j = 0; j < list.length-i; j++) {
                if (list[j]>list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1]=temp;
                    check=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+" ");
        }
    }
}
