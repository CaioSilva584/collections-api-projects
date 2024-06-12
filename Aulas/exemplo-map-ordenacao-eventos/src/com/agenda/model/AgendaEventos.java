package com.agenda.model;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        eventos = new HashMap<>();
    }

    public void adcionarEvento(LocalDate data, String nome, String atracao) {
        eventos.put(data, new Evento(nome, atracao));
    }

    public Map<LocalDate, Evento> exibirAgenda() {
        Map<LocalDate, Evento> eventosPorData = new TreeMap<>(eventos);
        return eventosPorData;
    }

    public Map<LocalDate, Evento> obterProximoEvento() {
        Map<LocalDate, Evento> proximoEvento = new HashMap<>();
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);
        LocalDate dataAtual = LocalDate.now();
        Evento evento = null;

        if (!eventos.isEmpty()) {
            for (Map.Entry<LocalDate, Evento> e : eventosOrdenados.entrySet()) {
                if (e.getKey().isAfter(dataAtual)) {
                    proximoEvento.put(e.getKey(), e.getValue());
                    break;
                }
            }
        }

        return proximoEvento;
//        Set<LocalDate> dataSet = eventos.keySet();
//        Collection<Evento> values = eventos.values();

    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adcionarEvento(LocalDate.of(2024 , Month.JUNE, 13), "Festa", "Musica");
        agenda.adcionarEvento(LocalDate.of(2024 , Month.APRIL, 13), "Aniversario", "Cavalo");
        agenda.adcionarEvento(LocalDate.of(2024 , Month.SEPTEMBER, 13), "Workshop", "Palestra");
        agenda.adcionarEvento(LocalDate.of(2024 , Month.JUNE, 14), "Curso", "Aula");
        agenda.adcionarEvento(LocalDate.of(2024 , Month.JUNE, 11), "Abertura", "Apresentação");

        System.out.println(agenda.exibirAgenda());
        System.out.println(agenda.obterProximoEvento());
    }

}
