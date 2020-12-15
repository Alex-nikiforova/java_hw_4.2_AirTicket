package ru.netology.domain;

import java.util.Comparator;

public class OfferByTimeAscComparator implements Comparator <Offer>{
    @Override
    public int compare(Offer o1, Offer o2) {
        return o1.getTravelTimeInMin() - o2.getTravelTimeInMin();
    }
}
