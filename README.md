<h1>LearningJava</h1>


**Access Modifiers & Class keyword**
------------------------------------

- The **public** Java keyword is what's called an **access modifier**.
- The class keyword is used to define a class. The class name will be the text following the keyword, so FirstClass in this case.
    
    The left and right curly braces, they are used to define the class code block, or class body.


    public class FirstClass {
    
        public static void main(String[] args) {
    
            System.out.print("Hello World");
        }
    }


------------------------------------------------------------------

**What is a Method?**
---------------------

A method is a collection of statements, one or more, that perform an operation.
- The main method is what java looks for when starting running a program.
- It's the entry point for any Java code.
- You can also create your own methods.

---------------------------------


**Statements**
--------------


**if-then statements in Java**

The **if-then** statement is the most basic of all the control flow statements. It tells your program to execute a certain section of code, only if a particular test evaluates to *true*. This is known as conditional logic.

----

**Conditional logic**

Conditional logic uses specific statements in Java to allow us to check a condition, and execute certain code based on whether that condition is *true* or *false*.

----------

**Assignment Operator(=)**
--------------------------

The assignment operator assigns the value of an expression, to the variable to the left of the operator.

    public class Hello {
        public static void main(String[] args) {
    
            System.out.println("Hello World");
    
            boolean isAlien = false;
    
            if (isAlien == false) {
                System.out.println("It is not an alien!");
            }
        }
    }




boolean isAlien = false;

isAlien is the variable in this case, and it has been set to false, which is the value of our expression.

--------------

**Equality Operator(==)**
---------------------------

The equality operator tests to see if two operands are considered equal and returns a boolean value.


    if (isAlien == false) {
    }

So, isAlien is being tested against the value false.





