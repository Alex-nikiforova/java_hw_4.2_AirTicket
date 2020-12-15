package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Offer;
import ru.netology.repository.OfferRepository;


import static org.junit.jupiter.api.Assertions.*;

class OfferManagerTest {
    OfferRepository repository = new OfferRepository();
    OfferManager manager = new OfferManager(repository);
    private final Offer first = new Offer(1, 13_770, "SVO", "KHV", 470);
    private final Offer second = new Offer(2, 15_660, "DME", "KHV", 465);
    private final Offer third = new Offer(3, 12_780, "DME", "KHV", 480);
    private final Offer fourth = new Offer(4, 11_736, "DME", "KHV", 480);

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
    }

    @Test
    public void shouldFindAnyOffers() {
        Offer[] actual = manager.searchBy("Dme", "KHV");
        Offer[] expected = new Offer[]{fourth, third, second};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindOneOffer() {
        Offer[] actual = manager.searchBy("svo", "KHV");
        Offer[] expected = new Offer[]{first};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldNotFindOffers() {
        Offer[] actual = manager.searchBy("ZIA", "KHV");

        assertEquals(actual.length, 0);
    }
}