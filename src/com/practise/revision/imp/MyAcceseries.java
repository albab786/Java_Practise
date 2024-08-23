package com.practise.revision.imp;

public class MyAcceseries {
    Laptop laptop;
    Car car;
    Watch watch;

    public MyAcceseries(Laptop laptop, Car car, Watch watch) {
        this.laptop = laptop;
        this.car = car;
        this.watch = watch;
    }

    @Override
    public String toString() {
        return "MyAcceseries{" +
                "laptop=" + laptop +
                ", car=" + car +
                ", watch=" + watch +
                '}';
    }
}
