package com.naman.observerdesignpattern.Observer;

import com.naman.observerdesignpattern.Observable.InventoryObservable;
import com.naman.observerdesignpattern.Observable.IphoneInventoryObservableImpl;
import com.naman.observerdesignpattern.Observable.MacbookInventoryObservableImpl;

public class SmsAlertObserverImpl implements Observer{
    String mobileNo;

    public SmsAlertObserverImpl(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public void update(InventoryObservable observable) {
        if(observable instanceof IphoneInventoryObservableImpl){
            System.out.println(new StringBuilder("SMS Alert for : ").append(mobileNo).append(", updated Iphone inventory : ").append(observable.getInventory()));
        }
        if(observable instanceof MacbookInventoryObservableImpl){
            System.out.println(new StringBuilder("SMS Alert for : ").append(mobileNo).append(", updated Macbook inventory : ").append(observable.getInventory()));
        }
    }
}
