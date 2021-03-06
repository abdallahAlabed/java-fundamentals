package basiclibrary;
import java.util.*;

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

    public static String weatherData(int[][] weatherArr) {
        HashSet<Integer> weatherSet = new HashSet<>();

        for (int[] ints : weatherArr) {
            for (int day : ints) {
                weatherSet.add(day);
            }
        }

        if (weatherSet.isEmpty())
            return "0";

        int min = Collections.min(weatherSet);

        int max = Collections.max(weatherSet);

        StringBuilder response = new StringBuilder();

        response.append("High: ").append(max).append("\n");

        response.append("Low: ").append(min).append("\n");

        for (int i = min; i < max; i++) {

            if (!weatherSet.contains(i)) response.append("Never saw temperature: ").append(i).append("\n");

        }

        return response.toString();
    }

    public static String tally(List<String> votes) {

        if (votes.isEmpty()) return "0";

        HashSet<String> votedItems = new HashSet<>();
        votedItems.addAll(votes);

        int numVotes = 0;
        String winner = null;

        for (String item : votedItems) {
            int count = Collections.frequency(votes, item);
            if (numVotes < count) {
                numVotes = count;
                winner = String.format("%s received the most votes!", item);
            } else if (numVotes == count) {
                winner = "Tie for the winner, a re-vote is needed";
            }
        }

        return winner;
    }

    public static void main (String[]args) {

        int i[]={5,5,5};

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int int1[]=roll(5);

        for (int h = 0; h < int1.length; h++){
            System.out.println(int1[h]);
        }

        System.out.println(containsDuplicates(i));

        System.out.println(calculateAverages(i));

//        System.out.println( Arrays.toString(arrayOfArrays(weeklyMonthTemperatures)));

    }

}

