
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class CopyOfPicture
{
    private Square wall;
    private Square window;
    private Square door;
    private Square door2;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class CopyOfPicture
     */
    public CopyOfPicture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.changeColor ("black");
        wall.moveVertical(130);
        wall.changeSize(120);
        wall.makeVisible();

        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(20);
        window.moveVertical(160);
        window.makeVisible();
        
        door = new Square();
        door.changeColor("red");
        door.moveHorizontal(70);
        door.moveVertical(190);
        door.makeVisible();
        
        door2 = new Square();
        door2.changeColor("red");
        door2.moveHorizontal(70);
        door2.moveVertical(220);
        door2.makeVisible();

        roof = new Triangle();
        roof.changeSize(120, 180);
        roof.moveHorizontal(70);
        roof.moveVertical(65);
        roof.changeColor("magenta");
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(175);
        sun.moveVertical(-55);
        sun.changeSize(100);
        sun.makeVisible();
      
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
