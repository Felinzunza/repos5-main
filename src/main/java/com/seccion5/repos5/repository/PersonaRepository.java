package com.seccion5.repos5.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.seccion5.repos5.model.Persona;

@Repository
public class PersonaRepository {
    private List<Persona> personas=new ArrayList<>();

        /*
     * 
     * SOLO PRUEBAS
     */
    public PersonaRepository(){
        personas.add(new Persona(1, "12.345.678-9", "Juan", "Pérez", 30));
        personas.add(new Persona(2, "23.456.789-0", "María", "González", 25));
        personas.add(new Persona(3, "34.567.890-1", "Carlos", "Ramírez", 40));
        personas.add(new Persona(4, "45.678.901-2", "Ana", "Torres", 35));
        personas.add(new Persona(5, "56.789.012-3", "Luis", "Martínez", 28));
    }

    public Persona create(Persona persona){
        personas.add(persona);
        return persona;

    }

    public List<Persona>readALL(){
        return personas;
    }

    public Persona read(int id){
        for (Persona persona : personas){
            if (persona.getId() == id) {
                return persona;
            }


        }
        return null;
    }

    public Persona update(int id, Persona pmod){
        Persona per = read(id);
        if (per != null){
            per.setNombre(pmod.getNombre());
            per.setApellido(pmod.getApellido());
            per.setEdad(pmod.getEdad());
            return per; // <-- Esta línea es necesaria
        }
        return null;
    }



    
}
