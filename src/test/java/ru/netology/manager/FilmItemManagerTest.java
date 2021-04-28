package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmItemManagerTest {
    private FilmManager manager = new FilmManager(0);
    private FilmItem first = new FilmItem(1, 1, "first", 1, 1);
    private FilmItem second = new FilmItem(2, 2, "second", 1, 1);
    private FilmItem third = new FilmItem(3, 3, "third", 1, 1);
    private FilmItem fourth = new FilmItem(4, 4, "fourth", 1, 1);
    private FilmItem fifth = new FilmItem(5, 5, "fifth", 1, 1);
    private FilmItem sixth = new FilmItem(6, 6, "sixth", 1, 1);
    private FilmItem seventh = new FilmItem(7, 7, "seventh", 1, 1);
    private FilmItem eighth = new FilmItem(8, 8, "eighth", 1, 1);
    private FilmItem ninth = new FilmItem(9, 9, "ninth", 1, 1);
    private FilmItem tenth = new FilmItem(10, 10, "tenth", 1, 1);
    private FilmItem eleventh = new FilmItem(11, 11, "eleventh", 1, 1);

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

    }

    @Test

    public void showTheLastTenth (){
        FilmManager manager = new FilmManager(10);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        FilmItem[] actual = manager.Last();
        FilmItem[] expected = new FilmItem[]{eleventh, tenth, ninth, eighth,
                seventh, sixth, fifth, fourth, third,second};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void showTheLastIfMore (){
        FilmManager manager = new FilmManager(15);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        FilmItem[] actual = manager.Last();
        FilmItem[] expected = new FilmItem[]{ tenth, ninth, eighth,
                seventh, sixth, fifth, fourth, third,second, first};
        assertArrayEquals(expected, actual);

    }
    @Test
    public void showTheLastIfLess (){
        FilmManager manager = new FilmManager(2);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        FilmItem[] actual = manager.Last();
        FilmItem[] expected = new FilmItem[]{ tenth, ninth};
        assertArrayEquals(expected, actual);

    }
}