package com.naman.observerdesignpattern.Observer;

import com.naman.observerdesignpattern.Observable.InventoryObservable;
import com.naman.observerdesignpattern.Observable.IphoneInventoryObservableImpl;
import com.naman.observerdesignpattern.Observable.MacbookInventoryObservableImpl;

public class EmailAlertObserverImpl implements Observer{
    String email;

    public EmailAlertObserverImpl(String email) {
        this.email = email;
    }

    @Override
    public void update(InventoryObservable observable) {
        if(observable instanceof IphoneInventoryObservableImpl){
            System.out.println(new StringBuilder("Email Alert for : ").append(email).append(", updated Iphone inventory : ").append(observable.getInventory()));
        }
        if(observable instanceof MacbookInventoryObservableImpl){
            System.out.println(new StringBuilder("Email Alert for : ").append(email).append(", updated Macbook inventory : ").append(observable.getInventory()));
        }
    }
}
