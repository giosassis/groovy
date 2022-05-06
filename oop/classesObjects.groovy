//Class - Colletion of data and methods that represents a read world object. 

package com.test.demo 

class Fruits { 

private String fruitName;
private String fruitColor;

def setFruitName (String name) {
    fruitName = name;
}


def setFruitColor (String color) {
    fruitColor = color;
}

def getFruitName () {
    println "Name fruit is $fruitName"
}

def getFruitColor () {
    println "Color fruit is $fruitColor"
}

static void main(args) {

    Fruits apple = new Fruits ()
    apple.setFruitName("apple")
    apple.setFruitColor("red")
            
    apple.getFruitName()s
    apple.getFruitColor()

    Fruits banana = new Fruits ()
    banana.setFruitName("banana")
    banana.setFruitColor("yellow")
            
    banana.getFruitName()
    banana.getFruitColor()
    }

}