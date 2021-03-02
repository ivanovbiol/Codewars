import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ZywOoTest {

    // Tests provided by codewars.com
    @Test
    public void testSomething() {
        assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(
                new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep",
                        "sheep"}));
        assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(
                new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(
                new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!",
                ZywOo.warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
        assertEquals("Pls go away and stop eating my sheep",
                ZywOo.warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));

    }

    // My test cases
    @Test
    public void testEmptyInput() {
        assertEquals(ZywOo.EMPTY_ARRAY_MESSAGE, ZywOo.warnTheSheep(new String[0]));
    }

    @Test
    public void testDoesNotContainsOnlyWolfsAndSheep() {
        assertEquals(ZywOo.CAN_CONTAIN_ONLY_WOLFS_AND_SHEEP_MESSAGE,
                ZywOo.warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", " "}));
        assertEquals(ZywOo.CAN_CONTAIN_ONLY_WOLFS_AND_SHEEP_MESSAGE,
                ZywOo.warnTheSheep(new String[]{"wolf", "sheep", "somethingElse", "sheep", "sheep"}));
        assertEquals(ZywOo.CAN_CONTAIN_ONLY_WOLFS_AND_SHEEP_MESSAGE,
                ZywOo.warnTheSheep(new String[]{"wolf", "", "somethingElse", "sheep", "sheep"}));
        assertEquals(ZywOo.CAN_CONTAIN_ONLY_WOLFS_AND_SHEEP_MESSAGE,
                ZywOo.warnTheSheep(new String[]{"sheep", "sheep", "somethingElse", "sheep", "sheep"}));
        assertEquals(ZywOo.CAN_CONTAIN_ONLY_WOLFS_AND_SHEEP_MESSAGE,
                ZywOo.warnTheSheep(new String[]{"", "", "somethingElse", "", ""}));
        assertEquals(ZywOo.CAN_CONTAIN_ONLY_WOLFS_AND_SHEEP_MESSAGE,
                ZywOo.warnTheSheep(new String[]{"", "", "", "", ""}));

    }

    @Test
    public void testArrayContainsOnlyWolfs() {
        assertEquals(ZywOo.CONTAINS_ONLY_WOLFS_MESSAGE,
                ZywOo.warnTheSheep(new String[]{"wolf", "wolf", "wolf", "wolf", "wolf"}));
        assertEquals(ZywOo.CONTAINS_ONLY_WOLFS_MESSAGE,
                ZywOo.warnTheSheep(new String[]{"wolf"}));
    }

    @Test
    public void testArrayContainsOnlySheep() {
        assertEquals(ZywOo.CONTAINS_ONLY_SHEEP_MESSAGE,
                ZywOo.warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals(ZywOo.CONTAINS_ONLY_SHEEP_MESSAGE,
                ZywOo.warnTheSheep(new String[]{"sheep"}));
    }

    @Test
    public void testMoreThanOneWolf() {
        assertEquals(ZywOo.MORE_THAN_ONE_WOLF_MESSAGE, ZywOo.warnTheSheep(
                new String[]{"sheep", "wolf", "wolf", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals(ZywOo.MORE_THAN_ONE_WOLF_MESSAGE, ZywOo.warnTheSheep(
                new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "wolf"}));
    }
}
