import java.text.DecimalFormat;

public class ArrayUtility {

    public static void print(int[] array) {
        for (int i: array) {
            System.out.print(i + ", ");
        }
    }

    public static int sum(int[] array) {
        int count = 0;
        for (int i: array) {
            count += i;
        }
        return count;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        double avg = (double) sum / array.length;
        // Truncate to two decimals
        avg = ((int) (avg * 100)) / 100.0;
        return avg;
    }


    public static int minimum(int[] array) {
        int min = array[0];
        for (int i: array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int min = array[0];
        for (int i: array) {
            if (i > min) {
                min = i;
            }
        }
        return min;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int i: array) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] newInt = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newInt[i] = array[array.length - i - 1];
        }
        return newInt;
    }

    public static void reverseTwo(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i: array) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String s: array) {
            if (s.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                str += array[i] + ", ";
            } else {
                str += array[i];
            }
        }
        return str;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }

    public static void shiftLeft(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = temp;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        int len = array.length;

        int[] carry = new int[n];
        for (int i = 0; i < n; i++) {
            carry[i] = array[len - n + i];
        }

        for (int i = len - 1; i >= n; i--) {
            array[i] = array[i - n];
        }

        for (int i = 0; i < n; i++) {
            array[i] = carry[i];
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int len = array.length;

        int[] carry = new int[n];
        for (int i = 0; i < n; i++) {
            carry[i] = array[i];
        }

        for (int i = 0; i < len - n; i++) {
            array[i] = array[i + n];
        }

        for (int i = 0; i < n; i++) {
            array[len - n + i] = carry[i];
        }
    }



}

