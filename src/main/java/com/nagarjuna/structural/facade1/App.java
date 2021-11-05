package com.nagarjuna.structural.facade1;

//By using this interface, the client doesn't concern themselves with the logic behind feeding the animals.
public class App {
    public static void main(String[] args) {
        ZooKeeper zookeeper = new ZooKeeper();
        
        zookeeper.feedLion();
        zookeeper.feedWolf();
        zookeeper.feedBear();        
    }
}
