public class arrays {
    public static void main(String[] args) {
        int[] array = {-856, 57, 400, -9, 0, 38, 277, 998, 999, 597, 88, 647, -90, 300,
                -555, -60, 2, 17, -604, 408, 23, 222, -222, 90, 852, 5, 64, 741, -32, 96};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] < 10) {
                int result = 1;
                for (int j = 1; j <= array[i]; j++) {
                    result = result * j;
                }
                System.out.println(result);
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > 10 && array[i] < 100) || (array[i] < -10 && array[i] > -100)) {
                if (array[i] % 2 == 0) {
                    System.out.println("Четные: " + array[i] + " " + array[i] / 2);
                } else
                    System.out.println("Нечетные: " + array[i] + " " + array[i] * 3);
            }
        }
        System.out.println();
        int max = array[1];
        for (int i = 1; i < array.length; i += 2) {
            if (array[i] >= 100 && array[i] < 1000) {
                if (array[i] > max)
                    max = array[i];
            }
        }
        System.out.println("Максимальное трехзначное: " + max);
        System.out.println();

        int min = array[0];
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] <= -100 && array[i] > -1000) {
                if (array[i] < min)
                    min = array[i];
            }
        }
        System.out.println("Минимальное трехзначное: " + min);
    }
}

