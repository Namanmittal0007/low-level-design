package com.naman.observerdesignpattern;

import com.naman.observerdesignpattern.Observable.InventoryObservable;
import com.naman.observerdesignpattern.Observable.IphoneInventoryObservableImpl;
import com.naman.observerdesignpattern.Observable.MacbookInventoryObservableImpl;
import com.naman.observerdesignpattern.Observer.EmailAlertObserverImpl;
import com.naman.observerdesignpattern.Observer.Observer;
import com.naman.observerdesignpattern.Observer.SmsAlertObserverImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverDesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObserverDesignPatternApplication.class, args);

        InventoryObservable iphoneInventoryObservable = new IphoneInventoryObservableImpl();
        InventoryObservable macbookInventoryObservable= new MacbookInventoryObservableImpl();

        Observer observer1 = new EmailAlertObserverImpl("naman@gmail.com");
        Observer observer2 = new EmailAlertObserverImpl("ramesh@gmail.com");
        Observer observer3 = new SmsAlertObserverImpl("+91-982376812");

        iphoneInventoryObservable.add(observer1);
        iphoneInventoryObservable.add(observer2);
        iphoneInventoryObservable.add(observer3);
        macbookInventoryObservable.add(observer1);
        macbookInventoryObservable.add(observer2);
        macbookInventoryObservable.add(observer3);

        System.out.println();
        iphoneInventoryObservable.setInventory(10);
        macbookInventoryObservable.setInventory(8);

        System.out.println();
        iphoneInventoryObservable.setInventory(0);
        macbookInventoryObservable.setInventory(0);

        System.out.println();
        iphoneInventoryObservable.setInventory(100);
        macbookInventoryObservable.setInventory(50);
    }

}
