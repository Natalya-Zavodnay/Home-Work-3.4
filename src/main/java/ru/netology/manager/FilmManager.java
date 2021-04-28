package ru.netology.manager;

import lombok.Data;
import ru.netology.domain.FilmItem;

@Data

public class FilmManager {
    int numberLast;
    private FilmItem[] items = new FilmItem[0];

    public void add(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }
    public FilmManager(int numberLast) {
        if (numberLast > 0) {
            this.numberLast = numberLast;
        }
    }

    public FilmItem[] Last() {
        int countFilms = items.length;
        if (numberLast<items.length){
            countFilms=numberLast;
        }
        FilmItem[] result = new FilmItem[countFilms];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }



}


