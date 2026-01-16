package com.day05.robowarehouse;
class PackageItem {
    int weight;
    String id;

    PackageItem(String id, int weight) {
        this.id = id;
        this.weight = weight;
    }

    void display() {
        System.out.println(id + " Weight " + weight);
    }
}
