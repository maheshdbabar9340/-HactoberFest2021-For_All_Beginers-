class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 55, 17, 19, 40 };
        susu(arr);
    }

    public static void susu(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            // swap(arr[min], arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void swap(int first, int sec) {
        int temp = first;
        first = sec;
        sec = temp;
        // first = first + sec;
        // sec = first - sec;
        // first = first - sec;
        // first = first + 10;
        // sec = sec - 10;
    }
}