package it.epicode;

import it.epicode.dao.PersonaDAO;
import it.epicode.entities.Mestiere;
import it.epicode.entities.Persona;

import java.time.LocalDate;

public class UsaPersonaDAO {

    public static void main(String[] args) {
        PersonaDAO dao = new PersonaDAO();

        Persona p = new Persona();
        p.setNome("Francesco");
        p.setCognome("Galdi");
        p.setMestiere(Mestiere.IMPIEGATO);
        p.setDataNascita(LocalDate.of(2000,5,5));

        //dao.inserisciPersona(p);
        //System.out.println(p);

        //Persona p2 = dao.getById(2);

        //System.out.println(p2);

        dao.cancellaPersona(3);
    }
}
