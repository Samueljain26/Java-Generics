package com.bridgelabz.smartwarehouse;

import java.util.*;

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        for (T item : items) {
            item.displayItem();
        }
    }

    // Wildcard method to display all types of WarehouseItems
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayItem();
        }
    }
}
