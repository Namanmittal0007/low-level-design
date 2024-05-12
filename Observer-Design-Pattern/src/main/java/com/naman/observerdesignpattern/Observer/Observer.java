package com.naman.observerdesignpattern.Observer;

import com.naman.observerdesignpattern.Observable.InventoryObservable;

public interface Observer {
    void update(InventoryObservable observable);
}
