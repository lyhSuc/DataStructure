package sort;

import java.util.Arrays;

public class AllSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{4, 24, 22, 45})));
        System.out.println(Arrays.toString(selectSort(new int[]{4, 24, 22, 45})));
    }
    //{4,24,22,45}

    /**
     * 选择排序
     * @param arr
     * @return
     */
    public static int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min>arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {//min是关键点
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
            System.out.println("第" + (i + 1) + "轮后");
        }
        return arr;
    }

    /**
     * 冒泡 排序
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
