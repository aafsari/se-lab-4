import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void shouldCreateRectangle() {
        Rectangle rectangle = new Rectangle(1, 2);
        Assert.assertTrue(true);
    }

    @Test
    public void shouldSetRectangleWidthOnCreation() {
        Rectangle rectangle = new Rectangle(1, 2);
        Assert.assertEquals(rectangle.width, 1);
    }

    @Test
    public void shouldSetRectangleHeightOnCreation() {
        Rectangle rectangle = new Rectangle(1, 2);
        Assert.assertEquals(rectangle.height, 2);
    }

    @Test
    public void shouldComputeRectangleArea() {
        Rectangle rectangle = new Rectangle(3, 2);
        Assert.assertEquals(rectangle.computeArea(), 6);
    }

    @Test
    public void shouldGetRectangleWidthByGetter() {
        Rectangle rectangle = new Rectangle(3, 2);
        Assert.assertEquals(rectangle.getWidth(), 3);
    }

    @Test
    public void shouldGetRectangleHeightByGetter() {
        Rectangle rectangle = new Rectangle(3, 2);
        Assert.assertEquals(rectangle.getHeight(), 2);
    }

    @Test
    public void shouldSetRectangleHeightBySetter() {
        Rectangle rectangle = new Rectangle(3, 2);
        rectangle.setHeight(10);
        Assert.assertEquals(rectangle.getHeight(), 10);
    }

    @Test
    public void shouldSetRectangleWidthBySetter() {
        Rectangle rectangle = new Rectangle(3, 2);
        rectangle.setWidth(8);
        Assert.assertEquals(rectangle.getWidth(), 8);
    }

}
