package basiclibrary;

public class Library {

    public static int[] roll(int n) {
        int[] rolls = new int[n];

        for (int i = 0; i < rolls.length; i++){

            int ranRoll = (int)Math.ceil(Math.random() * 6);

            rolls[i] = ranRoll;

        }

        return rolls;

    }

    public static boolean containsDuplicates(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    return true;

                }
            }
        }

        return false;
    }

    public static double calculateAverages(int[] arr) {

        double average = 0;

        for (int num : arr) {

            average += num;
        }

        return average / arr.length;

    }

    public static int[] arrayOfArrays(int[][] arr) {

        double lowestAvg = calculateAverages(arr[0]);
        int index = 0;


        for (int i = 1; i < arr.length; i++) {

            double lowestAvgCheck = calculateAverages(arr[i]);

            if (lowestAvgCheck < lowestAvg) {

                lowestAvg = lowestAvgCheck;
                index = i;

            }
        }

        return arr[index];
    }


    public static void main (String[]args) {

        int i[]={5,5,5};
        int j[][]={{5,5,5},{6,6,6},{7,7,7}};
        int int1[]=roll(5);

        for (int h = 0; h < int1.length; h++){
            System.out.println(int1[h]);
        }

        System.out.println(containsDuplicates(i));

        System.out.println(calculateAverages(i));

        for (int n = 0; n < int1.length; n++){
            System.out.println( arrayOfArrays(j)[n]);
        }
    }
}