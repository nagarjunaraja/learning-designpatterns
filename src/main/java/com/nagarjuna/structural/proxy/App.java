package com.nagarjuna.structural.proxy;




import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Image image = new ImageProxy("test image");
        Image image2 = new ImageProxy("second image");

        List<Image> images = new ArrayList<Image>();
        images.add(image);
        images.add(image2);

        Application application = new Application(images);


        System.out.println("Application setup");

        application.draw();

    }

}
