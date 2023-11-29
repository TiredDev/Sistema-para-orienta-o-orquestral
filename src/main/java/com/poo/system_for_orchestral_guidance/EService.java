package com.poo.system_for_orchestral_guidance;



import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EService {
    private final  List<Igreja> igrejas = new ArrayList<>();
 private final List<Musico> musicos = new ArrayList<>();

  public void addIgeja(Igreja igreja) {
        igrejas.add(igreja);
    }

    public List<Igreja> mostrarIgrejas() {
        return igrejas;
    }

    public Igreja buscarIgrejas(String nome) {
        for (Igreja igreja : igrejas) {
            if (igreja.getNome().equals(nome)) {
                return igreja;
            }
        }
        return null;
    }

    public void atualizarIgrejas(String nome, String Novolocal, int Novonumero_maximo, double Novotamanho_igreja){
        Igreja igreja = buscarIgrejas(nome);
        if(igreja != null){
            igreja.setLocal(Novolocal);
            igreja.setNumero_maximo(Novonumero_maximo);
            igreja.setTamanho_igreja(Novotamanho_igreja);
        }

    }
    public void excluirIgreja(String nome){
          Igreja igreja = buscarIgrejas(nome);
        if(igreja != null){
            igrejas.remove(igreja);
        }

    }
    // Métodos para Músicos
    public void addMusico(Musico musico) {
        musicos.add(musico);
    }

    public List<Musico> mostrarMusicos() {
        return musicos;
    }

    public Musico buscarMusico(String nome) {
        for (Musico musico : musicos) {
            if (musico.getNome().equals(nome)) {
                return musico;
            }
        }
        return null;
    }

    public void atualizarMusico(String nome, String novoNomeIgreja, String novoInstrumento) {
        Musico musico = buscarMusico(nome);
        if (musico != null) {
            musico.setNomeIgreja(novoNomeIgreja);
            musico.setInstrumento(novoInstrumento);
        }
    }

    public void excluirMusico(String nome) {
        Musico musico = buscarMusico(nome);
        if (musico != null) {
            musicos.remove(musico);
        }
    }
    public Musico buscarMusicoPorIgreja(String nomeIgreja) {
        for (Musico musico : musicos) {
            if (musico.getNomeIgreja().equals(nomeIgreja)) {
                return musico;
            }
        }
        return null;
    }
}