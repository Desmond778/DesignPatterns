package org.des.designpatterns.structural.flyweight;

import java.util.HashMap;

//Flyweight design pattern is used when we need to create a lot of Objects of a class. Since every object consumes
// memory space that can be crucial for low memory devices, such as mobile devices or embedded systems, flyweight
// design pattern can be applied to reduce the load on memory by sharing objects

//The number of Objects to be created by application should be huge.
//The object creation is heavy on memory and it can be time consuming too.
//The object properties can be divided into intrinsic and extrinsic properties, extrinsic properties of an Object should be defined by the client program
public class ShapeFactory {

    private static final HashMap<ShapeType,Shape> shapes = new HashMap<ShapeType,Shape>();

    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);

        if (shapeImpl == null) {
            if (type.equals(ShapeType.OVAL_FILL)) {
                shapeImpl = new Oval(true);
            } else if (type.equals(ShapeType.OVAL_NOFILL)) {
                shapeImpl = new Oval(false);
            } else if (type.equals(ShapeType.LINE)) {
                shapeImpl = new Line();
            }
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }

    public static enum ShapeType{
        OVAL_FILL,OVAL_NOFILL,LINE;
    }
}
