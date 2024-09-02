QUESTION FOUR: Debugging Concepts

A) What is a Breakpoint?
A breakpoint is a debugging tool that allows you to pause the execution of your program at a specific line of code. This pause enables you to inspect the current state of the program, such as variable values and the flow of execution, to identify any issues.

How to Apply a Breakpoint:

1: Set a Breakpoint:
In your Integrated Development Environment (IDE) like IntelliJ IDEA or Android Studio, you can set a breakpoint by clicking on the left margin next to the line of code where you want the program to pause. A red dot will appear, indicating the breakpoint is set.

2: Run in Debug Mode:
Start the program in debug mode. The program will run until it reaches the breakpoint and then pause.

3:Inspect Variables and Execution Flow:
While the program is paused, you can inspect the values of variables, step through the code line by line, and understand how the program is executing. This helps in identifying and fixing errors.


b) A stack trace is a report that provides the sequence of method calls that the program was executing at the time an error occurred. It helps in identifying where the error happened and understanding the chain of method calls leading up to the error.

How to Apply a Stack Trace:

1: Run the Program:
When the program encounters an error, such as an exception, Java automatically generates a stack trace.

2:Analyze the Stack Trace:
The stack trace is printed to the console and shows the exact line where the error occurred and the method calls that led to that point. By examining the stack trace, you can identify the source of the error and the sequence of events that caused it.
