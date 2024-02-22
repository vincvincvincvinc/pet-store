package fr.epsi.b32324c1;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date birth;
    private String couleur;

    // mapping to pet store
    @ManyToOne
    @JoinColumn(name = "petstore_id")
    private PetStore petStore;

    public void setPetStore(Object o) {
    }
}

