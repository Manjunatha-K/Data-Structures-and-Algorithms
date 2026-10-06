package com.learn.DataStructureAndAlgorithms.binarySearch;

public class GasStationBrute {
    public static void main(String[] args) {
        int[] arr = {1, 13, 17, 23};
        int k = 5;
        PlaceGasStations(arr, k);
    }

    private static void PlaceGasStations(int[] arr, int k) {

        int[] gasStationPlaces = new int[arr.length - 1];
        for (int i = 1; i <= k; i++) {
            double maxSection = -1;
            int maxIndex = -1;
            for (int j = 0; j < arr.length-1; j++) {
                double diff = arr[j + 1] - arr[j];
                double sectionLength = diff/(double) (gasStationPlaces[j]+1);
                if(sectionLength>maxSection){
                    maxSection = sectionLength;
                    maxIndex = j;
                }
            }
            gasStationPlaces[maxIndex]++;
        }
        double maxAns = -1;
        for(int i =0;i<gasStationPlaces.length;i++){
            double diff = arr[i+1]- arr[i];
            double secLen = diff/(double) (gasStationPlaces[i]+1);
            maxAns = Math.max(maxAns,secLen);
        }
        System.out.println("Minimum of maximum distance between the gas-station should be : "+ maxAns);
    }
}
