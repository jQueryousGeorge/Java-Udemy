# Section 4 
## S4 E28 - Java Features / Java Buzzwords
1. Simple - similar cyntax to C / C++, so Java is considered a simple language
2. Secure - Java has a built-in security feature to check code safety before executing it. The class loader subsystem's Linking step's 'Verify' process is the one who checks code security.
3. Portable - Java has platform independency.
4. Object-oriented - OOP is a software dev methodolgy. It follows these four steps:
    - Abstraction
    - Encapsulation
    - Inheritance
    - Polymorphism
- What is *Abstraction*? - manages complexity by creating higher-level interfaces and reusable components (like functions or classes) that allow users to interact with code without needing to understand its "under the hood" workings.
5. Robust - Means that Java is strong, and never crashes. An important component of Java in this context (robust) is Java's **exception handling**.
6. **Multithreaded/Multithreading** - Java breaks a single program into multiple pieces (for efficiency) so that multiple components of the program are able to run simultaneously.
7. **Architectural-Neutral**: Java is hardware-neutral. Java supports these architectures:
    - Von-Neumann 
    - ARM (Advanced RISC Machines)
    - RISC
    - CISC
    - Embedded
8. **Interpreted** - Java uses an interpreter *and* a JIT Compiler. Interpreted languages run slower than others, since they must interpret. Java introduced **JIT Compiler** to speed up.
9. **High performance** - Java's use of JIT makes it a high performance intepreted language.
10. **Distributed** - Java supports distributed computing. Java programs can use multithreading to distribute specific sections of a program onto separate computers. In turn, these different computers can work together as *one*, single computer to execute the program together... as a distributed system.
    - These are primarily seen on enterprise applications... Like the Spring framework.
11. **Dynamic** - There are two interpretations of *dynamic*: (1) Every object in Java is dynamic because it ic created in the **heap**. (2) The other meaning of dynamic is that Java can easily move the running state of a program from Machine A to Machine B... since Java is a dsitributed language.

---

## Section 4 E29 - Operators in Java
### [Operators in Java] Operator precedence
`*` and `/` and `%` >>> `+` and `-`
- Parentheses are used to change the order of precedence. Place the desired operator into a parentheses and it will take precedence.
- The lecturer mentioned something about larger dtypes. It might be a rule that the larger dtype is the one who takes precedence (e.g., float > int --> so, the combined value will be of type float).

---

### [Operators in Java] Combined dtypes; what if they're different types?
If you try to add a `short` and a `byte`, or a `long` and a `byte`, they will all be converted to **integers**, as the basic value type for all of these is an integer. As well, Java's `+` operator assumes both dtypes on both sides of the `+` operator are integers by default. 

The exception are the dtypes that use **decimals** -- as an `int` does not allow decimals, so the outcome of combining a float and an integer will be float, since we cannot create a decimal-based integer.
- Internally, Java converts the dtypes during runtime... a process known as **coercion**.

In a nutshell, the precedence of dtypes in dtype conversion when using the `+` or `-` operators:
- `double` > `float`
- `float` > `long` 
- `float` > `integer`
- character + short -> integer
- character + integer -> integer
- float + double -> double
- long + double -> double
- byte + short -> integer
- short + integer -> integer

#### [T] Quick note! 
**Type casting** is how you verbosely declare a dtype inside a variable. See reference below. We need to declare `a` and `b` as floats so we can properly divide the two integers. Otherwise, the outcome will be an integer, too, which does not allow decimals. The type casted part is the `(float)` before `a / b`.
``` java
float c = (float) a / b;
```

#### [T] Quick Note!
Java's scope: Local variables belong to the block `{ }` they are declared in. Two different methods inside a class cannot reference variables within each. To share a variable declared in method x with the main method, you can either (1) return a value in method x, then just declare a variable in main method as method x (execution) ... (e.g., in main: `int aa = methodX();`), (2) use `System.out.println();` inside method x and then just call the method inside the main method, or (3) declare a static variable inside the global class scope (e.g., `static int aa;`), then assign a value to the variable inside method x... wbecause then the main method will have the known value when you attempt to print it out.

---

### [Operators in Java] What is an Expression?
In Java, an expression is a combination of variables, literals, operators, and method calls that evaluates to a *single value*.

#### [T] Quick Note!
What does *parse* mean? -> In programming, parsing means analyzing a string of characters to extract meaningful data and convert it into a structured format that a computer can process.
- For `Integer.parseInt();`, Java will read each char of a string, one-by-one, to extract the ints, then convert the chars to an Integer.