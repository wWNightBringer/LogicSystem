package com.example.nightbringer.logicsysytem.model;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by Nightbringer on 6/5/2018.
 */

public class App extends Application {
    private static List<Product> products;

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }

    public static List<Product> getProducts() {
        return products;
    }

    public static void setProducts(List<Product> products) {
        App.products = products;
    }
}
