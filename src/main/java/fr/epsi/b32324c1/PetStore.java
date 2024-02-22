package fr.epsi.b32324c1;

import javax.persistence.*;
import java.util.List;

@Entity
public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String managerName;

    // mappings avec tous les autres entités
    @ManyToMany
    @JoinTable(
            name = "petstore_product",
            joinColumns = @JoinColumn(name = "petstore_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "petStore")
    private List<Animal> animals;

    // Getter for animals
    public List<Animal> getAnimals() {
        return animals;
    }

    // Setter for animals
    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    // Method to add an animal
    public void addAnimal(Animal animal) {
        animals.add(animal);
        animal.setPetStore(this);
    }

    // Method to remove an animal
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
        animal.setPetStore(null);
    }
}