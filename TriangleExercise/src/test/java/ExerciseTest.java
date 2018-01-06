import com.company.entities.*;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class ExerciseTest {


    @Test
    public void shouldPrintOneAsterisk() {
        OneAsterisk asterisk = new OneAsterisk();
        assertThat(asterisk.print(), CoreMatchers.is("*"));
    }

    @Test
    public void shouldPrintAHorizontalLineWhenGivenANumber() {
        Horizontal line = new Horizontal();
        assertThat(line.print(8, "*"), CoreMatchers.is("********"));
    }

    @Test
    public void shouldPrintAVerticalLineWhenGivenANumber() {
        Vertical vertical = new Vertical();
        assertThat(vertical.print(3, "*"), CoreMatchers.is("*\n*\n*\n"));
    }

    @Test
    public void shouldPrintARightTriangleWhenGivenANumber() {
        RightTriangle rightTriangle = new RightTriangle();
        assertThat(rightTriangle.draw(3), CoreMatchers.is("*\n**\n***\n"));
    }

    @Test
    public void shouldPrintAIsoscelesTriangleWhenGivenANumber() {
        Isosceles isosceles = new Isosceles();
        assertThat(isosceles.draw(3), CoreMatchers.is("  *  \n *** \n*****\n"));
    }

    @Test
    public void shouldPrintADiamondWhenGivenANumber() {
        Diamond diamond = new Diamond();
        assertThat(diamond.draw(3), CoreMatchers.is("  *  \n *** \n*****\n *** \n  *  \n"));
    }

    @Test
    public void shouldPrintADiamondWithANameWhenGivenANumber() {
        DiamondWithName diamond = new DiamondWithName();
        assertThat(diamond.draw(3), CoreMatchers.is("  *  \n *** \nWagner\n *** \n  *  \n"));
    }
}
