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


Java's description of a method is:

A method declares executable code that can be invoked by passing a fixed number of values as arguments.

**Benefits of the Method**

- A method is a way of reducing code duplication.
- A method can be executed many times with potentially different results, by passing data to the method in the form of arguments.
- 

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

--------------------------------------------------------

**The Logical AND operator and the Logical OR operator**
--------------------------------------------------------

The **and** operator comes in two forms in Java, as does the or operator.

**&&** is the Logical **and** which operates on **boolean** operands - Checking if a given condition is **true** or **false**.

The **&** is a bitwise operator working at the bit level. This is an advanced concept.

The **||** is the Logical **or**, and it operates on **boolean** operands - Checking if a given condition is **true** or **false**.

The **|** is a bitwise operator working at the bit level.

    int topScore = 90;

    if (topScore == 100) {

        System.out.println("You got the high score!");
    }

    int secondTopScore = 80;

    if (topScore > secondTopScore && topScore < 100) {

        System.out.println("You got the low score!");
    }
          
 

--------------------------------------------------
         
**The NOT Operator**
--------------------

The exclamation mark **(!)**, or the **NOT** operator, is also known as the Logical Complement Operator.

It can be used with a boolean variable, to test for the opposite value.


    boolean isCar = false;

    if (!isCar) {

        System.out.println("It is not a car!");

    }



----------------------------------------

**The Ternary Operator**
------------------------

The ternary operator has three operands. The only operator currently in Java that does have three. Java calls it the conditional operator.

The structure of this operator is:

**operand1 ? operand2 : operand3**

    String makeOfCar = "Vauxhall";

    boolean isDomestic = makeOfCar == "Vauxhall" ? false : true;

    if (isDomestic) {

        System.out.println("It is a domestic!");

    }


-------------------------------------------------------

**Java's Code Units**
----------------------
 Code is consists of special hierarchical units, which together forms a whole.

These are:

**Expressions** - An expression computes to a single value.

**Statements** - Statements are stand-alone units of work.

**Code Blocks** - A code block is a set of zero, one, or more statements, usually grouped together in some way to achieve a single goal.




**Whitespace**
----------------------

What is whitespace?

- Whitespace is any extra spacing, horizontally or vertically, placed around Java source code.
- It is usually added for human readability purposes.
- In Java, all these extra spaces are ignored.

For example in Java, the following lines of code is the same.

This line of code,

        int anotherVariable=50;myVariable--; System.out.println("myVariable = "+myVariable);

And this line of code,

        in anotherVariable=50;
        myVariable--;
        System.out.println("myVariable = "+myVariable );


**Code Blocks and If Then Else Control Statement**
----------------------








