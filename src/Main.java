public class Main {
    public static void main(String[] args) {
        Turtle bob = new Turtle();
        Turtle.bgcolor("white");
        bob.speed(5);
        bob.up();
        bob.setPosition(0, 0);
        bob.down();
        bob.penColor("orange");
        bob.width(4);
        for (int i = 0; i < 36; i++) {
            bob.forward(150);
            bob.backward(150);
            bob.left(10); // Rotate 10 degrees for the next ray
        }
        bob.up();
        bob.setPosition(0, 0);
        bob.shape("circle");
        bob.shapeSize(170, 170);
        bob.fillColor("gold");
        bob.outlineColor("darkorange");
        bob.outlineWidth(3);
        bob.stamp();
        bob.hide();
    }
}