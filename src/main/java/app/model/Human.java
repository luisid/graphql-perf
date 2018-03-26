package app.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "Human")
public class Human extends Character {

    private String homePlanet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "favorite_droid_id")
    private Droid favoriteDroid;

    public String getHomePlanet() {
        return homePlanet;
    }

    public void setHomePlanet(String homePlanet) {
        this.homePlanet = homePlanet;
    }

    public Droid getFavoriteDroid() {
        return favoriteDroid;
    }

    public void setFavoriteDroid(Droid favoriteDroid) {
        this.favoriteDroid = favoriteDroid;
    }
}