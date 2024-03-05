package org.example;

import java.util.*;

/**
 * La clase Agenda gestiona una lista de contactos y proporciona métodos para añadir, eliminar y modificar contactos.
 */
public class Agenda implements IAgenda {
    private List<Persona> contacts; // Lista de Persona

    /**
     * Constructor para la clase Agenda. Inicializa la lista de contactos.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Añade un nuevo contacto o actualiza el teléfono de un contacto existente.
     *
     * @param name  Nombre del contacto.
     * @param phone Teléfono asociado al contacto.
     */
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Elimina un contacto de la lista.
     *
     * @param name Nombre del contacto a eliminar.
     */
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Modifica el número de teléfono de un contacto específico.
     *
     * @param name     Nombre del contacto.
     * @param oldPhone Número de teléfono antiguo.
     * @param newPhone Nuevo número de teléfono.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Obtiene la lista de contactos almacenados en la agenda.
     *
     * @return Lista de contactos.
     */
    public List<Persona> getContacts() {
        return this.contacts;
    }
}