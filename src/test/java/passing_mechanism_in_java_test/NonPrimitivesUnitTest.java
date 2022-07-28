package passing_mechanism_in_java_test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonPrimitivesUnitTest {

    @Test
    public void whenModifyingObjects_thenOriginalObjectChanged() {
        Foo a = new Foo(1);
        Foo b = new Foo(1);

        //before modification
        assertEquals(a.num,1);
        assertEquals(b.num,1);

        modify(a, b);

        //after modification
        assertEquals(a.num,2);
        assertEquals(b.num,1);
    }

    private void modify(Foo a1, Foo b1) {
        a1.num++;

        b1 = new Foo(1);
        b1.num++;
    }

    class Foo {
        public int num;

        public Foo(int num) {
            this.num = num;
        }
    }

}
