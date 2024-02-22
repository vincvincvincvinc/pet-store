package fr.epsi.b32324c1;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private String street;
    private String zipCode;
    private String city;


    @OneToOne(mappedBy = "address")
    private PetStore petStore;
}

