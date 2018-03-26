package app.model;

import org.crygier.graphql.annotation.SchemaDocumentation;
import javax.persistence.Entity;

@Entity
@SchemaDocumentation("Represents an electromechanical robot in the Star Wars Universe")
public class Droid extends Character {
    @SchemaDocumentation("Documents the primary purpose this droid serves")
    private String primaryFunction;

    public String getPrimaryFunction() {
        return primaryFunction;
    }

    public void setPrimaryFunction(String primaryFunction) {
        this.primaryFunction = primaryFunction;
    }
}