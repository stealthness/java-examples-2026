# Creating basic HelloWorld

Create a file called `HelloWorld.java`

Using a text editor, type the following code in, and save the file.

```java
public class HelloWorld {
	
	public static void main(String[] args){
		System.out.println("Hello World 2026!");
	}
	
}
```

Open up a commandline/terminal promot window at the location of your `HelloWorld.java'` and type `javac HelloWorld.java` (I have assumed that java has been installed). At same location should see 
a file created called `HelloWorld.class`.

Now to run this program we type in the commandline/terminal `java HelloWorld`, note we do not use `HelloWorld.class`, this is a file that contains `HelloWorld` class that we are looking to run. 