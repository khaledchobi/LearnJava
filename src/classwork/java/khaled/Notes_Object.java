package classwork.java.khaled;

public class Notes_Object {
    /*Object:
            -------
    An entity that has state and behavior is known as an object e.g., chair, bike, marker, pen, table, car, etc. It can be physical or logical (tangible and intangible).
    The example of an intangible object is the banking system.

    An object has three characteristics:
            ------------------------------------
            -- State: represents the data (value) of an object.
            -- Behavior: represents the behavior (functionality) of an object such as deposit, withdraw, etc.
            -- Identity: An object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user.
    However, it is used internally by the JVM to identify each object uniquely.

    An object is an instance of a class. A class is a template or blueprint from which objects are created. So, an object is the instance(result) of a class.

    Object Definitions:
            -------------------
            - An object is a real-world entity.
            - An object is a runtime entity.
            - The object is an entity which has state and behavior.
            - The object is an instance of a class.

    Class:
            ------
    A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical.

    A class in Java can contain:

           - Fields
 - Methods
 - Constructors
 - Blocks
 - Nested class and interface


    Instance variable:
            ------------------
    A variable which is created inside the class but outside the method is known as an instance variable. Instance variable doesn't get memory at compile time.
    It gets memory at runtime when an object or instance is created. That is why it is known as an instance variable.


    Method in Java:
            ---------------
    In Java, a method is like a function which is used to expose the behavior of an object.

    Advantage of Method
 - Code Re-usability
 - Code Optimization



    Ways to initialize object:
            --------------------------
    There are 3 ways to initialize object in Java.

            - By reference variable
  - By method
  - By constructor


    Different ways to create an object in Java:
            -------------------------------------------
    There are many ways to create an object in java. They are:

 - By new keyword
 - By newInstance() method
 - By clone() method
 - By deserialization
 - By factory method etc.

    Anonymous object:
            -----------------
    Anonymous simply means nameless. An object which has no reference is known as an anonymous object. It can be used at the time of object creation only.
     - new Calculation();//anonymous object


    Constructors in Java:
            ---------------------
            - In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor,
    memory for the object is allocated in the memory.
  - It is a special type of method which is used to initialize the object.
            - Every time an object is created using the new() keyword, at least one constructor is called.
            - It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.
            - There are two types of constructors in Java: no-arg constructor, and parameterized constructor.

    Rules for creating Java constructor:
            -------------------------------------
    There are two rules defined for the constructor.

  - Constructor name must be the same as its class name
  - A Constructor must have no explicit return type
  - A Java constructor cannot be abstract, static, final, and synchronized


    Exercise:
            ---------
    Create an Employee class with the following fields:
    - first Name
    - last name
    - date of birth
    - title
    - department

    Constructor:
       - no-arg constructor
       - two arg constructor (fname, lname)
       - three arg constructor (fname, lname, dob)
       - four arg constructor (fname, lname, dob, title)
       - five arg constructor (fname, lname, dob, title, dept)

    Methods:
            - printFullName()
            -- output: Saney Alam
    - printInfo()
           -- Output:
    Name: Saney Alam
    DOB: 09/02/1986
    Title: Software Engineer
    Department: IT
*/



}
