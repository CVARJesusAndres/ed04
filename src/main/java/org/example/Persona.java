package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Persona representa un contacto con su nombre y una lista de teléfonos asociados.
 */
public class Persona {
    private String name;
    private List<String> phones;

    /**
     * Constructor para la clase Persona.
     *
     * @param name  Nombre del contacto.
     * @param phone Teléfono inicial asociado al contacto.
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtiene el nombre del contacto.
     *
     * @return El nombre del contacto.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtiene la lista de teléfonos asociados al contacto.
     *
     * @return Lista de teléfonos del contacto.
     */
    public List<String> getPhones() {
        return this.phones;
    }
}