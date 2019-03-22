import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        String hamlet = "My name is Hamlet";
        String leon = "My name is Leon";

        String actual = hamletParser.changeHamletToLeon(hamlet);

        Assert.assertEquals(leon, actual);
    }

    @Test
    public void testChangeHoratioToTariq() {
        String horatio = "My name is Horatio";
        String tariq = "My name is Tariq";

        String actual = hamletParser.changeHoratioToTariq(horatio);

        Assert.assertEquals(tariq, actual);
    }

    @Test
    public void testChangeHAMLETToLEON(){
        String HAMLET = "My name is HAMLET";
        String LEON = "My name is LEON";

        String actual = hamletParser.changeHAMLETToLEON(HAMLET);

        Assert.assertEquals(LEON, actual);
    }

    @Test
    public void testChangeHORATIOToTARIQ(){
        String HORATIO = "My name is HORATIO";
        String TARIQ = "My name is TARIQ";

        String actual = hamletParser.changeHORATIOToTARIQ(HORATIO);

        Assert.assertEquals(TARIQ, actual);
    }

    @Test
    public void testFindHoratio() {
        String horatio = "Hello, what do you think of Horatio";
        String notHoratio = "Nonsense, gibberish and foolishness";

        Assert.assertTrue(hamletParser.findHoratio(horatio));
        Assert.assertFalse(hamletParser.findHoratio(notHoratio));
    }

    @Test
    public void testFindHamlet() {
        String hamlet = "Hello, what do you think of Hamlet";
        String notHamlet = "Nonsense, gibberish and foolishness";

        Assert.assertTrue(hamletParser.findHamlet(hamlet));
        Assert.assertFalse(hamletParser.findHamlet(notHamlet));
    }

    @Test
    public void testFindHORATIO(){
        String HORATIO = "Hello, what do you think of HORATIO";
        String notHORATIO = "Nonsense, gibberish and foolishness";

        Assert.assertTrue(hamletParser.findHORATIO(HORATIO));
        Assert.assertFalse(hamletParser.findHORATIO(notHORATIO));
    }

    @Test
    public void testFindHAMLET(){
        String HAMLET = "Hello, what do you think of HAMLET";
        String notHAMELT = "Nonsense, gibberish and foolishness";

        Assert.assertTrue(hamletParser.findHAMLET(HAMLET));
        Assert.assertFalse(hamletParser.findHAMLET(notHAMELT));
    }

    @Test
    public void execute(){
        hamletParser.execute();
    }
}