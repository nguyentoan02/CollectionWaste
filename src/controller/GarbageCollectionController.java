/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.GarbageCollectionModel;
import view.GarbageCollectionView;

/**
 *
 * @author This PC
 */
public class GarbageCollectionController {
    private GarbageCollectionModel model;
    private GarbageCollectionView view;

    public GarbageCollectionController(GarbageCollectionModel model, GarbageCollectionView view) {
        this.model = model;
        this.view = view;
    }

    public int calculateCost() {
        int time = model.getTotalTime();
        int cost = time * 120000 + 57000; // Labor and dump cost
        return cost;
    }
}
