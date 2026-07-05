public class Main {
    public static void main(String[] args) {
        // Initialize the turtle
        Turtle bob = new Turtle();

        // Set a bright summer background
        Turtle.bgcolor("white");

        // Speed up the turtle so drawing doesn't take too long
        bob.speed(5);

        // Move turtle to the starting position for the sun rays
        bob.up();
        bob.setPosition(0, 0);
        bob.down();

        // Configure pen for the sun rays
        bob.penColor("orange");
        bob.width(4);

        // Draw 36 sun rays using a basic loop
        for (int i = 0; i < 36; i++) {
            bob.forward(150);
            bob.backward(150);
            bob.left(10); // Rotate 10 degrees for the next ray
        }

        // Draw the center of the sun using a stamp
        bob.up();
        bob.setPosition(0, 0);
        bob.shape("circle");
        bob.shapeSize(170, 170);
        bob.fillColor("gold");
        bob.outlineColor("darkorange");
        bob.outlineWidth(3);
        bob.stamp();

        // Hide the turtle cursor when finished
        bob.hide();
    }
}