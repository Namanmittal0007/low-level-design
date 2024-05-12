package com.naman.observerdesignpattern.Observable;

import com.naman.observerdesignpattern.Observer.Observer;

public interface InventoryObservable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifySubscribers();
    void setInventory(int invCount);
    int getInventory();
}
