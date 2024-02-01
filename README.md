# csis10a-assignment-01
Comments, variables, and assignment statements

In this exercise you will get introduced to some fundamentals of the Java programming language. This tutorial assumes that you have already completed [your first Java program](https://greenteapress.com/thinkapjava/html/thinkjava003.html#hello). If you haven't done this, do so now!

## Getting started

Clone this project using git.

In BlueJ create a new project called using this folder. Then create a new class called MathTrick. Type in the following source code:

```java
//Name: [fill in your name here]
//Approximate completion time: [fill this in later]
//References: None
public class MathTrick {
    public static void main(String[] args) {

    }
}
```

## MathTrick.java

The first three lines of your program start with two forward slashes: //. A pair of forward slashes tells Java to ignore the rest of that line. These are called comments and are good for providing information that is useful to us but not to the computer.

Note that the name of the Java file matches the name after public class inside the source code. This will always be the case for our Java programs. What we have at this point is a bare-bones Java program that does nothing at all. Our program will consist of instructions (called statements) that go in between the public static void main(String[] args) { and the following closing curly brace, }. Every statement in Java is terminated with a semicolon ; and they are executed in order from top to bottom. Since nothing is in there right now, our program will do nothing. Compile and run your program to make sure there aren't any errors yet. If everything is correct, your program will appear to do nothing when you run it (on Windows a message will come up saying press any key to continue... - this is just an indication that the program completed running).

I found the following "Math Trick" at http://www.slideshare.net/simonesu/amazing-math-trick. We will write a Java program to test it out.

> [!IMPORTANT]
> __Mind-Reading Number Trick__
> 1. Think of a number, any positive integer (but keep it small so you can do computations in your head).
> 2. Square it.
> 3. Add the result to your original number.
> 4. Divide by your original number.
> 5. Add, oh I don't know, say 17.
> 6. Subtract your original number.
> 7. Divide by 6.
> 8. The number you are thinking of now is 3!

Before writing any program, it is a good idea write some comments in your program first to plot out what you intend to do. This is important because when you are planning things out, your mind is free to focus on the big picture, but when you are writing your actual program source code, you are more focused on the details and the big picture tends to get fuzzy or forgotten. Write in some comments in your program, so the entire program should now look more like this

```java
//Name: Whateveryour Nameis
//Approximate completion time: TODO: write this in
//References: None
public class MathTrick {
    public static void main(String[] args) {
        //Get a positive integer
        //Square it
        //Add the original number
        //Divide by the original number
        //Add 17
        //Subtract the original number
        //Divide by 6
        //Print the result
    }
}
```

Notice how each of the newly written comments have two tabs at the start of the line. In general, every time you see a pair of curly braces { }, all lines in between them get one additional tab character on the left hand side, compared to lines outside that pair of curly braces. This makes our code easier to read, especially when things start getting complicated. Get into the habit of correct indentation now (Textpad will sometimes add tabs for you automatically, but it uses a simple heuristic so you cannot always trust that it is correct).

Note that I have put a TODO: for the completion time. Programmers often use the word TODO: within a comment to remind themselves of something they have to do later on. In this case, we don't know how long it took to write this program because we aren't done yet!

Now we will start writing source code to make the program work. First, we will need a variable to store our original number. A variable is simply a place to store a single value, a "box" if you will. The following line tells Java to create a variable called x, and that the type of variable is an int, which stands for integer. As you might guess, an int variable is capable of holding an integer, such as -2, -1, 0, 1, or 2. There are many different types of variables in Java, but we will only use the int type in this exercise.

We have to give the variable some initial starting value, so the next line initializes the variable with the value 7 (this was an arbitrary choice, the math trick said we can start with any number).

```java
//Get a positive integer
int x;
x = 7;
```

Our next task is to square x. Looking at the later steps of the program, note that we will need to use the original variable x again later on, so we will use a second variable (which we will call y) to keep track of the current value after applying the various steps of the math trick. That way we still have the original value x for later.

```java
//Square it
int y;
y = x * x;
```

In Java, `*` means multiplication. We also have the other standard arithmetic operators available: `/`, `+`, and `-`. Important: the = means assignment, which is an action. It says that y becomes whatever x times x currently is. If y changes later, that doesn't cause x to change; if x changes later, that doesn't cause y to change. You might read the = operator as "gets", that is, "y gets x*x". You might also imagine it as a left arrow that copies the value over.

Unlike in algebra, variables are allowed to change over the course of a Java program while it is running. We will take advantage of this in the next statement, reusing the variable y in this way. Note that this assignment statement is also setting y to be a value in terms of itself. That's ok! It says "y becomes whatever y + x currently is". For example, since x started as 7 as above, then y is 49 due to the previous line of code, and now y becomes 49 + 7, i.e. 56.

```java
//Add the original number (to y)
y = y + x;
```

The next two steps are completely similar. Take a moment to make sure you understand how they work. What would you expect y to be after these two lines?

```java
//Divide by the original number
y = y / x;

//Add 17
y = y + 17;
```

This would be a good time to compile your program to see if any errors have come up. Note that the Java compiler will only detect grammatical errors, called syntax errors. If you had put 18 instead of 17, that would be a logical error which is impossible for Java to detect (it can't know your intentions). However, if you missed a semicolon or missed a + sign, that would be a syntax error which the compiler can detect. Program the next two steps of the math trick on your own at this point.

When it comes time to print the final result, we can use the following print commands:

```java
//Print the result
System.out.println("Here is the final result, which should be 3:");
System.out.println(y);  //This prints the current value of y
```

Notice that I put a comment at the end of a line. This is allowed in Java, and doesn't change the behavior of anything before the comment on that line. Now run your program. What happens? What if you change the original value of x? Does it still result in a 3? Does the math trick appear to work?

#### One more step:

Add in more System.out.println(y); commands throughout the program so you can see how the y variable changes after each time it is modified with an assignment statement. Fill in the approximate time it took to complete your program at the top and have the instructor check your work when you are done.
