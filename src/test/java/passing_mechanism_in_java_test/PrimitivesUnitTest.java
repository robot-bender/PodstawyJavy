package passing_mechanism_in_java_test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrimitivesUnitTest {

    @Test
    public void whenModifyingPrimitives_thenOriginalValuesNotModified() {

        int x = 1;
        int y = 2;

        //before modification
        assertEquals(x,1);
        assertEquals(y,2);

        modify(x,y);

        //after modification
        assertEquals(x,1);
        assertEquals(y,2);
    }

    private void modify(int x1, int y1) {
        x1 = 5;
        y1 = 10;
    }
}
