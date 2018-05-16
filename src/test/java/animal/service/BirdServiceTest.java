package animal.service;

import animal.domain.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BirdServiceTest {

    private List<Bird> birds = Arrays.asList(new Chicken(),new Eagle(), new Hawk(), new Parrot(), new Penguin());

    private BirdService birdService;

    @Before
    public void setup() {
        birdService = new BirdService();
    }

    @Test
    public void getFastestBird() throws Exception {
        Bird fastest = birdService.getFastestBird(birds);
        Assert.assertTrue(fastest instanceof Hawk);
    }

    @Test
    public void getBirdsByLetterName() throws Exception {
        List<Bird> birdsExpected = Arrays.asList(new Parrot(), new Penguin());
        Assert.assertEquals(birdsExpected,birdService.getBirdsSpeciesByLetterName(birds,"P"));
    }

    @Test
    public void printFunctionalInterface() throws Exception {
        //TODO Implement to pass
        String prettyPrint = "Bird -> Parrot";
        PrettyPrint<Parrot> function = null;

        Assert.assertEquals(prettyPrint, function.apply(new Parrot()));
    }

}