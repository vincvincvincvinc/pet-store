package fr.epsi.b32324c1;

import javax.persistence.*;

@Entity
public class Fish extends Animal {
    @Enumerated(EnumType.STRING)
    private FishLivEnv livingEnv;

    // Getters and setters
}
