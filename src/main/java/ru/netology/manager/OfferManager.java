package ru.netology.manager;

import ru.netology.domain.Offer;
import ru.netology.repository.OfferRepository;

import java.util.Arrays;

public class OfferManager {
    private final OfferRepository repository;

    public OfferManager(OfferRepository repository) {
        this.repository = repository;
    }

    public void add(Offer item) {
        repository.save(item);
    }

    public Offer[] searchBy(String text) {
        Offer[] result = new Offer[0];
        for (Offer offer: repository.findAll()) {
            if (matches(offer, text)) {
                Offer[] tmp = new Offer[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = offer;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }

    public boolean matches(Offer offer, String search) {
        if(offer.getFrom().equalsIgnoreCase(search)){
            return true;
        }
        if(offer.getTo().equalsIgnoreCase(search)){
            return true;
        }
        return false;
    }
}
