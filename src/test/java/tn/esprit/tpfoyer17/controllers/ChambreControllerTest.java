package tn.esprit.tpfoyer17.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.tpfoyer17.entities.Chambre;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(properties = {
    "spring.datasource.url=jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE;MODE=MySQL",
    "spring.datasource.driver-class-name=org.h2.Driver",
    "spring.datasource.username=sa",
    "spring.datasource.password=",
    "spring.jpa.database-platform=org.hibernate.dialect.H2Dialect",
    "spring.jpa.hibernate.ddl-auto=update",
    "spring.flyway.enabled=false",
    "spring.liquibase.enabled=false",
    "spring.jpa.show-sql=true",
    "spring.jpa.properties.hibernate.format_sql=true"
})
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