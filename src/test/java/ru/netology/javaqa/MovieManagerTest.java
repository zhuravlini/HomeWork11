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
    public void findLast() {
        MovieManager manager = new MovieManager();

        manager.addMovie("film 01");
        manager.addMovie("film 02");
        manager.addMovie("film 03");

        String[] expected = {"film 03", "film 02", "film 01"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}