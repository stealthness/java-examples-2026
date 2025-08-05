# Point class Examples

In this module we will explore the `Point` class, which represents a point in a 2D space with `x` and `y` coordinates.

## Example 1: Basic Point Class

```java
/**
 * Represents a point in 2D space.
 * It contains two fields: x and y, which represent the coordinates of the point.
 */
class Point {
    int x;
    int y;
    
}
```

Note: The `Point` class is a simple representation of a point in 2D space. It has two fields, `x` and `y`, which are 
integers representing the coordinates of the point and can be accessed directly:
```java 
Point point = new Point();
point.x = 5;
point.y = 10;
```