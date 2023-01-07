package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    @Test
    public void addMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("film 01");
        manager.addMovie("film 02");
        manager.addMovie("film 03");

        String[] expected = {"film 01", "film 02", "film 03"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastIfUnderLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("film 01");
        manager.addMovie("film 02");
        manager.addMovie("film 03");

        String[] expected = {"film 03", "film 02", "film 01"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastIfOverLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("film 01");
        manager.addMovie("film 02");
        manager.addMovie("film 03");
        manager.addMovie("film 04");
        manager.addMovie("film 05");
        manager.addMovie("film 06");
        manager.addMovie("film 07");
        manager.addMovie("film 08");
        manager.addMovie("film 09");
        manager.addMovie("film 10");
        manager.addMovie("film 11");

        String[] expected = {"film 11", "film 10", "film 09", "film 08", "film 07", "film 06", "film 05",
                "film 04", "film 03", "film 02"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastIfLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("film 01");
        manager.addMovie("film 02");
        manager.addMovie("film 03");
        manager.addMovie("film 04");
        manager.addMovie("film 05");
        manager.addMovie("film 06");
        manager.addMovie("film 07");
        manager.addMovie("film 08");
        manager.addMovie("film 09");
        manager.addMovie("film 10");

        String[] expected = {"film 10", "film 09", "film 08", "film 07", "film 06", "film 05",
                "film 04", "film 03", "film 02", "film 01"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
