package com.company;


// Encapsulation in Java

/*
     What is encapsulation?
     he whole idea behind encapsulation is to hide the implementation details from users.
     If a data member is private it means it can only be accessed within the same class.
     No outside class can access private data member (variable) of other class.
 */

/*
    How to setup Encapsulation?
    To achieve encapsulation in Java −
     1. Declare the variables of a class as private.
     2.Provide public setter and getter methods to modify and view the variables values.
 */

/*
    What is the benefit of encapsulation?
    1.The fields of a class can be made read-only or write-only.
    2.A class can have total control over what is stored in its fields.
 */




//you can use the class for your desired outputs but you cnot change the code in the class
//we created this class to store the private attributes
public class encap {

    /*
    we will declare private variable, that
    could be accessed ussing private methods of class
     */

    private String yourName;
    private int yourAge;
    private int yourStudentId;

    /*
    Now we are going to declare and initialize the public methods
     */

    public String getYourName() {
        //we are using get method to input the name
        return yourName;
    }

    public int getYourStudentId() {
        return yourStudentId;
    }

    public int getYourAge() {
        return yourAge;
    }


    /*
    Now we will declare public set methods which will set the values for the
    input but they will not affect the private attributes
     */

    public void setYourAge(int newAge) {
        //we are using set method to set the value of yourAge to new age
        //so that if the public method is used, it does not affects our
        //private attributes
        this.yourAge = newAge;
    }

    public void setYourName(String newName) {
        this.yourName = newName;
    }

    public void setYourStudentId(int newStudentId) {
        this.yourStudentId = newStudentId;
    }

}

/*
Now refer back to the encapsulation part in main class.


We cannot operate methods on any class outside the main class
So if you create a new class, you will have to declare and initialze your
objects in main class.
 */
