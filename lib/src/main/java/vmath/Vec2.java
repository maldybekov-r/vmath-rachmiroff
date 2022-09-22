/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package vmath;

public class Vec2 {
    private float x, y;

    public Vec2() {
        this(0.0f, 0.0f);
    }

    public Vec2(float x, float y) {
        if (Float.isNaN(x) || Float.isNaN(y)) {
            throw new ArithmeticException();
        }

        this.x = x;
        this.y = y;
    }

    public float x() {
        return x;
    }

    public float y() {
        return y;
    }

    public float mag() {
        return 0.0f; // TODO
    }

    public Vec2 norm() {
        return new Vec2(); // TODO
    }

    public Vec2 add(Vec2 other) {
        return new Vec2(); // TODO
    }

    public Vec2 sub(Vec2 other) {
        return new Vec2(); // TODO
    }

    public Vec2 mul(float scalar) {
        return new Vec2(); // TODO
    }

    public float dot(Vec2 other) {
        return 0.0f; // TODO
    }

    public String toString() {
        return ""; // TODO
    }
}
