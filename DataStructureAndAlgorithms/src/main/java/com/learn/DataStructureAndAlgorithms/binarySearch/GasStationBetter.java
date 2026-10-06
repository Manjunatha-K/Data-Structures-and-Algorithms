package com.learn.DataStructureAndAlgorithms.binarySearch;

import ch.qos.logback.core.joran.sanity.Pair;

import java.util.PriorityQueue;

public class GasStationBetter {

    static class Pair {
        double distance;
        int index;

        public Pair(double distance, int index) {
            this.distance = distance;
            this.index = index;
        }
    }

    private static void PlaceGasStations(int[] arr, int k) {

        int[] gasStationPlaces = new int[arr.length - 1];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.distance, a.distance));
        ;
        for (int i = 0; i < arr.length - 1; i++) {
            pq.add(new Pair(arr[i + 1] - arr[i], i));
        }
        for (int i = 1; i <= k; i++) {

            Pair top = pq.poll();
            int secIndex = top.index;
            gasStationPlaces[secIndex]++;

            double diff = arr[secIndex + 1] - arr[secIndex];
            double sectionLength = diff / (double) (gasStationPlaces[secIndex] + 1);

            pq.add(new Pair(sectionLength, secIndex));

        }
        System.out.println("Minimum of maximum distance between the gas-station should be : " + pq.peek().distance);
    }

    public static void main(String[] args) {
        int[] arr = {1, 13, 17, 23};
        int k = 5;
        PlaceGasStations(arr, k);
    }

}
