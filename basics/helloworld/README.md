# Creating basic HelloWorld

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