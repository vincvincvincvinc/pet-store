package fr.epsi.b32324c1;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        // création du entity manager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");

        entityManagerFactory.close();
    }

}