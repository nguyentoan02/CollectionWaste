/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author This PC
 */
public class GarbageCollectionModel {
    private int[] garbageAtStations;
    private int totalGarbage;
    private int totalTime;

    public GarbageCollectionModel() {
        garbageAtStations = new int[100]; // Assuming a maximum of 100 stations
        totalGarbage = 0;
        totalTime = 0;
    }

    public void collectGarbage(int station, int garbage) {
        garbageAtStations[station] = garbage;
        totalGarbage += garbage;
        totalTime += 8; // 8 minutes to collect at the station

        if (totalGarbage >= 10000) {
            dumpGarbage();
        }
    }

    public void dumpGarbage() {
        totalGarbage = 0;
        totalTime += 30; // 30 minutes to go to the dump
    }

    public int getTotalTime() {
        return totalTime;
    }
}
