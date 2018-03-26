package app.model;

import org.crygier.graphql.annotation.SchemaDocumentation;

import javax.persistence.*;
import java.util.List;

abstract class Character {
    @Id
    @SchemaDocumentation("Primary Key for the Character Class")
    private String id;

    @SchemaDocumentation("Name of the character")
    private String name;

    @SchemaDocumentation("Who are the known friends to this character")
    @ManyToMany
    @JoinTable(name="character_friends",
            joinColumns=@JoinColumn(name="source_id", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="friend_id", referencedColumnName="id"))
    private List<Character> friends;

    @SchemaDocumentation("What Star Wars episodes does this character appear in")
    @ElementCollection(targetClass = Episode.class)
    @Enumerated(EnumType.ORDINAL)
    private List<Episode> appearsIn;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Character> getFriends() {
        return friends;
    }

    public void setFriends(List<Character> friends) {
        this.friends = friends;
    }

    public List<Episode> getAppearsIn() {
        return appearsIn;
    }

    public void setAppearsIn(List<Episode> appearsIn) {
        this.appearsIn = appearsIn;
    }
}
