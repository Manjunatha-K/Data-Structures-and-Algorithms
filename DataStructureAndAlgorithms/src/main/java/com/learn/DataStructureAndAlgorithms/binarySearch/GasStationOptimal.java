package com.learn.DataStructureAndAlgorithms.binarySearch;

public class GasStationOptimal {
    public int numberOfGasStationsRequired(int[] arr, double dist) {
        int required = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            required += (int) ((arr[i + 1] - arr[i]) / dist);
        }
        return required;
    }


    public double minimiseMaxDistance(int[] arr, int k) {
        double low = 0;
        double high = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            high = Math.max(high, (double) (arr[i + 1] - arr[i]));
        }

        while (high - low > 1e-6) {
            double mid = low + (high - low) / 2.0;
            if (numberOfGasStationsRequired(arr, mid) > k) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        GasStationOptimal obj = new GasStationOptimal();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        double ans = obj.minimiseMaxDistance(arr, k);
        System.out.printf("%.6f\n", ans);
    }
}
