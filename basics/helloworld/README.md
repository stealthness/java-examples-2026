# Creating basic HelloWorld

## Writing your first progrom

This exercise assumes that Java is already installed on your system.

1. Create a file called `HelloWorld.java`, and using a text editor, type the following code;

```java
public class HelloWorld {
	
	public static void main(String[] args){
		System.out.println("Hello World 2026!");
	}
	
}
```


Save the `HelloWorld.java` file.

2. Open a command line or terminal window and navigate to the location where you saved `HelloWorld.java'`. Compile the Java file by typing:
```
javac HelloWorld.java
```

If the compilation is successful, a file named `HelloWorld.class` will be created in the same directory.

3. To run the program, type the following command in the commandline or terminal:
```
java HelloWorld
```

Note: Do not include the `.class` extension. The `HelloWorld.class` file contains the compiled bytecode for the `HelloWorld` class, which the java command will execute.

You should see the following output:
```
Hello World 2026!
```


## Dealing with compiling Errors

1. Open `BadHelloWorld.java` and examine the program, you might be able to spot some issues just by reading the code, 
but let's use `javac` to compile and see what errors are detected:

```java
/**
 * This program has several mistakes
 */
public class Hello World {
	
	public static void main(String[] args){
		
		if (args.len > 0 {
			System.out.println('Hello ' + args[0]);
		} el {
			
				System.out.println("Hello World 2026!");
			}
		}
		
		System.out.println("End")
	}
	
}
```

2. The compiler should report several errors. Example output:
```
BadHelloWorld.java:4: error: '{' expected
public class Hello World {
                  ^
BadHelloWorld.java:8: error: ')' expected
                if (args.len > 0 {
                                ^                                           ^
.
.
.
BadHelloWorld.java:16: error: illegal start of type
                System.out.println("End")
                                   ^
BadHelloWorld.java:19: error: class, interface, enum, or record expected
}
^
12 errors
```

3. Go through the errors and fix the code untill the program compiles successfully. 
A good approach is to fix each error one at a time and recompile frequently to avoid introducing new errors.

4. The corrected file should look something like this

```java/**
 * This program has several mistakes
 */
public class BadHelloWorld {
	
	public static void main(String[] args){
		
		if (args.length > 0) {
			System.out.println("Hello " + args[0]);
		} else {
			
				System.out.println("Hello World 2026!");
			
		}
		
		System.out.println("End");
	}
	
}
```

5. You can run the corrected file the same way as before by typing the following in the command line or terminal:

```
java BadHelloWorld
```

To get the following output:

```
Hello World 2026!
```

However, we can also pass command-line arguments as strings after the command:

```
java BadHelloWorld Bob two 3
```
This produces the result: 
```
Hello Bob
```
Note that in this simple example, we only use the first element of the `args` array.
