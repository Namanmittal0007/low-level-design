package com.naman.observerdesignpattern.Observable;

import com.naman.observerdesignpattern.Observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class IphoneInventoryObservableImpl implements InventoryObservable{
    List<Observer> observers = new ArrayList<>();
    int inventory;
    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void setInventory(int invCount) {
        if(invCount==0){
            inventory=invCount;
            return;
        }
        inventory+=invCount;
        notifySubscribers();
    }

    @Override
    public int getInventory() {
        return inventory;
    }
}
