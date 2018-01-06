import com.company.entities.Horizontal;
import com.company.entities.OneAsterisk;
import com.company.entities.Triangle;
import com.company.entities.Vertical;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class TriangleTest {


    private Triangle triangle;

    @Before
    public void setUp(){
        this.triangle = new Triangle();
    }

    @Test
    public void shouldPrintOneAsterisk(){
        OneAsterisk asterisk = new OneAsterisk();
        assertThat(asterisk.print() , CoreMatchers.is("*"));
    }

    @Test
    public void shouldPrintAHorizontalLineWhenGivenANumber(){
        Horizontal line = new Horizontal();
        assertThat(line.print(8) , CoreMatchers.is("********\n"));
    }

    @Test
    public void shouldPrintAVerticalLineWhenGivenANumber() {
        Vertical vertical = new Vertical();
        assertThat(vertical.print(3) , CoreMatchers.is("*\n*\n*\n"));
    }

    @Test
    public void shouldPrintARightTriangleWhenGivenANumber() {
        assertThat(triangle.drawRightTriangle(3) , CoreMatchers.is("*\n**\n***\n"));
    }
//
//    @Test
//    public void shouldPrintAIsoscelesTriangleWhenGivenANumber() {
//        assertThat(triangle.drawIsoscelesTriangle(3) , CoreMatchers.is("\t*\t\n\t***\t\n*****\n"));
//    }
//
//    @Test
//    public void shouldPrintADiamondWhenGivenANumber() {
//        assertThat(triangle.drawDiamond(3) , CoreMatchers.is(" * \n *** \n ***** \n *** \n  *  \n"));
//    }
}
