package College_work;

public class Q1 {
    public static void main(String[] args) {

        String[] cities = {"Paris", "London", "Dubai", "Mumbai"};
        int[] flightCost = {200, 250, 370, 450};
        int[] hotelCostPerDay = {20, 30, 15, 10};
        int[] weeklyCarRental = {200, 120, 80, 70};


        int[] totalCosts = new int[cities.length];
        for (int i = 0; i < cities.length; i++) {
            totalCosts[i] = flightCost[i] + (hotelCostPerDay[i] * 7) + weeklyCarRental[i];
            System.out.println(cities[i] + ": $" + totalCosts[i]);
        }

        int minIndex = findMinimumIndex(totalCosts);
        System.out.println(cities[minIndex]);

        //Second Scenario

        int[] tripDurations = {4, 10, 14};
        for (int duration : tripDurations) {
            System.out.println(duration);
            if (duration % 7 > 0) {
                int wcr=duration/7+1;
                for (int i = 0; i < cities.length; i++) {

                    int totalCost = flightCost[i] + (hotelCostPerDay[i] * duration) + wcr*weeklyCarRental[i];
                    System.out.println(cities[i] + ": $" + totalCost);
                }
                System.out.println();
            }
            else{
                int wcr=duration/7;
                for (int i = 0; i < cities.length; i++) {

                    int totalCost = flightCost[i] + (hotelCostPerDay[i] * duration) + wcr*weeklyCarRental[i];
                    System.out.println(cities[i] + ": $" + totalCost);
                }
                System.out.println();

            }
        }

    }
        private static int findMinimumIndex(int[] arr) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            return minIndex;
        }
    }


