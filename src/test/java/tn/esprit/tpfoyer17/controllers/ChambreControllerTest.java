package tn.esprit.tpfoyer17.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.tpfoyer17.entities.Chambre;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ChambreControllerTest {

    @Autowired
    private ChambreController chambreController;

    @Test
    void testAddChambre_simple() {
        Chambre chambre = new Chambre();
        chambre.setNumeroChambre(777L);
        Chambre resultat = chambreController.addChambre(chambre);
        assertThat(resultat).isNotNull();
    }

    @Test
    void testRetrieveChambre_simple() {
        Chambre resultat = chambreController.retrieveChambre(1L);
        assertThat(resultat).isNotNull();
    }
}