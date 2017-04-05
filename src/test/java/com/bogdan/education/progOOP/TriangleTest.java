package com.bogdan.education.progOOP;

import com.bogdan.education.progOOP.task1.triangle.Triangle;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by bm on 04.04.17.
 */
public class TriangleTest {

    @Test
    public void test1() {
        Triangle triangle1 = new Triangle(7.9, 10.1, 5.3);
        assertEquals(20.736301954543396, triangle1.areaTriangle());

        Triangle triangle2 = new Triangle(8.9, 9.1, 4.3);

        assertEquals(18.76942244050147, triangle2.areaTriangle());
        assertEquals("18.769", triangle2.areaTriangleTostring());


    }
}
