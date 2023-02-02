package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        Iterator<Character> iterator = evenElements.iterator();
        for (int i = 0; i < evenElements.size(); i++) {
            if (i % 2 == 0) {
                while (evenElements.size() != 0) {
                    evenElements.peek();
                    int j = 0;
                    StringBuilder str = new StringBuilder();
                    for (j = 0; j < evenElements.size(); j++) {
                        str.append(j);
                    }
                }
            }
        }
        return str;
    }

    private String getDescendingElements() {
        Iterator<Character> iterator = descendingElements.iterator();
        while (iterator.hasNext()) {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < descendingElements.size(); i++) {
                str.append(i);
            }
        }
        return str;
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}