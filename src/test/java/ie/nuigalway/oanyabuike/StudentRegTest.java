package ie.nuigalway.oanyabuike;

import org.joda.time.DateTime;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class StudentRegTest
{
    @Test
    public void testGetUsername() {
        Student s;
        s = new Student("Oluchi", 20, new DateTime(), 900990, null, null, null);

        assertEquals(s.getUsername(), "Oluchi20");
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
