/*  Just think that if fruits is a class
then Apple, Bananas, Berries, Mangoes are the objects.
And we have to declare the characterstics of the objects
 */





package com.company;

//This program is for Object Oriented Programming concepts

import java.util.logging.LoggingPermission;

public class Main {
//Here we have declared our class as main

    int x= 5;
    //we have declared a variable x inside class main and outside the funciton, so now
    //we can use this value of x in number of functions.

    final int y = 25;
    //We used final so that the value of y cannot be changed using objects.

    public static void main(String[] args) {

        //We are going to declare a new object of class - main

        Main myObject1 =  new Main();
        //We declared a new object of class main
        // the structure is  ============      class_name  object_name = new class_name(Parameters);
        System.out.println(myObject1.x);
        //We used the newly defined object to display the value of x

        //Example of multiple objects

        Main myObject2 = new Main();
        System.out.println(myObject2.x);
//Here x is the attribute of main class. An attribute is  a variable of a class. We can access it
        //by object.attribute


        //========================================================//

        //Modifying the attributes
        myObject1.x = 20;
//This will change the value of attribute for only one object
        System.out.println(myObject1.x);
        System.out.println(myObject1.y);

        //==========================   END   ================================//



        //==========================    Encapsulation Part ==================//
        //Please refer to encap file first




                encap Student1 = new encap();
                //here above we just createad a new object of class encap.

                //now we are going to set the value in public set methods from encap class
                 Student1.setYourAge(19);
                 //we used the names of public set methods
                 Student1.setYourName("Prabhjot Singh");
                 Student1.setYourStudentId(2277901);


                 //now we are going to display the entered information
                System.out.println("The name of the student is " + Student1.getYourName());
                //we used the get method here are we wanted to get the name we enterd
                //if you pay a close look in encap class you will understand the relation between the
                //get method and set method
                System.out.println("The age of the student is " + Student1.getYourAge());
                System.out.println("The Student ID of the studnet is " + Student1.getYourStudentId());

                //You cannot Directly Use the  yourName, yourAge and yourStudentID due to
                //Encapsulation


        //==========================   END   ================================//



        //========================== Inheritance Part ==================//

        //First refer to inherit.java file first


        // Simple Example of Inheritance

        int a = 10;
        int b = 20;

        inherit opeations = new inherit();

        opeations.multiplication(a, b);
//Now here we have declared two parameters, whose value we have given above
        opeations.addition(a, b);
        //We can even fill the values directly instead of the attributes
        opeations.subtraction(10, 20);
//we don't need to print these objects as we have already defined a printing
        //function while writing the method



            }

        }

