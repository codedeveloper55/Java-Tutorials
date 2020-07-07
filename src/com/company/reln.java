package com.company;

// in this java file we will try to understand the relationships
//between classes : Composition / Association / Inheritance




public class reln {

    //========================== Inheritance Part ==================//


//IS-A is a way of saying: This object is a type of that object.


    public class animal{
//animal is a super-class
    }

    public class mammal extends animal{
//mammal is a sub-class of animal class
    }

    public class reptile extends animal{
//reptile is a sub-class of animal class
    }

    public class dog extends mammal{
//dog is a sub-class of mammal class and animal class
    }

    /*
    The IS-A relationship between above classes can be defined as :
    Mammal -- is a -- >  Animal
    Reptile -- is a -- > Animal
    Dog -- is a -- > Mammal
    And Dog -- is a -- > Animal
    ~ Dog is a mammal and an animal because dog is a sub-class of mammal class
    ,which is a sub-class of animal class.
     */



    //========================== Association Part ==================//

    // HAS-A relationship helps to reduce duplication of code as well as bugs.

    public class vehicle{}
    public class speed{}

    public class Van extends vehicle {
        private speed sp;
    }
    //The above code represents that Van HAS-A speed
    //We do not specify speed methods in Van class as now we have
    // a larger scope and the code can be reused too.
    //So now we do no need to wirte the code of speed again and again.
    }
