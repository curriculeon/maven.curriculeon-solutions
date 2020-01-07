package com.github.curriculeon;

/**
 * Created by leon on 1/7/2020.
 */
public class MyObject implements Runnable {
    @Override
    public void run() {
        ItemInventory itemInventory = new ItemInventory();
        itemInventory.add(null);
        itemInventory.add(null);
        itemInventory.add(null);
        itemInventory.add(null);
        itemInventory.add(null);
        itemInventory.add(null);
        for(Item item : itemInventory) {

        }
    }
}
