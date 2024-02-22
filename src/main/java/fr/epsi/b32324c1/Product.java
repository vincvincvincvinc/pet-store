package fr.epsi.b32324c1;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String label;
    @Enumerated(EnumType.STRING)
    private ProdType type;
    private double price;

    // mapping to pet store
    @ManyToMany(mappedBy = "products")
    private List<PetStore> petStores;
}

