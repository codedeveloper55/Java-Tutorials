// Inheritance in Java

/*
  What is Inheritance in Java?
  Inheritance can be defined as the process where one class acquires the properties
  (methods and fields) of another. With the use of inheritance the information is made
   manageable in a hierarchical order.The class which inherits the properties of other
   is known as subclass (derived class, child class) and the class whose properties are
   inherited is known as superclass (base class, parent class).
 */

/*
  Important Terms
  Super Class : The class whose features are inherited is called Super Class.(Base/Parent Class)

  Sub Class :   The class that inherits features of another class is called Sub Class. Sub Class
                can also add its own methods and fields in addition to the inherited ones.

  Fields:       In Object - Oriented Programming variables are also called feilds.

  Constructors: A constructor in Java is a special method that is used to initialize objects.
                The constructor is called when an object of a class is created. It can be used
                to set initial values for object attributes.

                All classes have constructors, whether you define one or not, because Java automatically
                provides a default constructor that initializes all member variables to zero. However, once
                you define your own constructor, the default constructor is no longer used.

                Eg:
                public class MyClass {
                     public MyClass() {
                        }
                 }

                 In above example the  :
                  public MyClass() {
                        }
                 is the constructor.


 */
/*
    Syntax:
              class derived-class extends base-class
              or
              class sub-class extends super-class
 */

package com.company;



//Lets create a super class
class calculations{
    int z;
    //Creating a method
    public void addition(int X, int Y) {
        z = X + Y;//APPLIED ARITHEMATIC
        System.out.println("The sum of the given numbers is " + z);
    }
    //Creating a method
    public void subtraction(int X, int Y){
        z = X - Y;
        System.out.println("The difference between the given numbers is " + z);
    }

}


public class inherit extends calculations{

// Simple Example of inheritance

    /*
    for inheritance you need to have a super class and a sub class
     */

//Now we are going to create a sub class which will use all the methods of super class
//but will also have some of its own.

    //Now we are going to create a method
    public void multiplication(int X, int Y){
        z = X * Y;
        System.out.println("The product of the given numbers is " + z);
    }

}

