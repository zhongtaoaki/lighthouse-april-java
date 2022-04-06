package firstWeek;

/**
 * 算法 アルゴリズム
 * 排序
 */
public class SortDemo {

    public static void main(String[] args) {

        int[] array = { 2, 5, 3, 1, 4 };

        sort(array);

        for (int i : array) {
            System.out.println(i);
        }
        // 1,2,3,4,5
    }

    // 冒泡排序 bubble
    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
    }

}
