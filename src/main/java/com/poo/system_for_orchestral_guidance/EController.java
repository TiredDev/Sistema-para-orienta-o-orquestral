package com.poo.system_for_orchestral_guidance;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/controller")

public class EController {
    private final EService eService;

    public EController(EService eService) {
        this.eService = eService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/addIgreja")
    public void addIgreja(@RequestBody Igreja igreja) {
        try {
            eService.addIgeja(igreja);
        } catch (Exception e) {
            System.err.println("Erro ao adicionar igreja: " + e.getMessage());
        }
    }

    @GetMapping("/mostrarIgrejas")
    public List<Igreja> mostrarIgrejas() {
        try {
            return eService.mostrarIgrejas();
        } catch (Exception e) {
            System.err.println("Erro ao exibir igrejas: " + e.getMessage());
            return null;
        }
    }

    @GetMapping("/buscarIgrejas/{nome}")
    public Igreja buscarIgrejas(@PathVariable String nome) {
        try {
            return eService.buscarIgrejas(nome);
        } catch (Exception e) {
            System.err.println("Erro ao buscar igreja: " + e.getMessage());
            return null;
        }
    }

    @PutMapping("/atualizarQuantidade/{nome}/{Novolocal}/{Novonumero_maximo}/{Novotamanho_igreja}")
    public void atualizarQuantidade(@PathVariable String nome, @PathVariable String Novolocal,
            @PathVariable int Novonumero_maximo, @PathVariable double Novotamanho_igreja) {
        try {
            eService.atualizarIgrejas(nome, Novolocal, Novonumero_maximo, Novotamanho_igreja);
        } catch (Exception e) {
            System.err.println("Erro ao atualizar igreja " + e.getMessage());
        }
    }

    @DeleteMapping("/excluirIgreja/{nome}")
    public void excluirIgreja(@PathVariable String nome) {
        try {
            eService.excluirIgreja(nome);
        } catch (Exception e) {
            System.err.println("Erro ao excluir igreja: " + e.getMessage());
        }
    }
 @PostMapping("/addMusico")
    public void addMusico(@RequestBody Musico musico) {
        try {
            eService.addMusico(musico);
        } catch (Exception e) {
            System.err.println("Erro ao adicionar músico: " + e.getMessage());
        }
    }

    @GetMapping("/mostrarMusicos")
    public List<Musico> mostrarMusicos() {
        try {
            return eService.mostrarMusicos();
        } catch (Exception e) {
            System.err.println("Erro ao exibir músicos: " + e.getMessage());
            return null;
        }
    }

    @GetMapping("/buscarMusico/{nome}")
    public Musico buscarMusico(@PathVariable String nome) {
        try {
            return eService.buscarMusico(nome);
        } catch (Exception e) {
            System.err.println("Erro ao buscar músico: " + e.getMessage());
            return null;
        }
    }

    @PutMapping("/atualizarMusico/{nome}/{NovoNomeIgreja}/{NovoInstrumento}")
    public void atualizarMusico(@PathVariable String nome, @PathVariable String NovoNomeIgreja,
            @PathVariable String NovoInstrumento) {
        try {
            eService.atualizarMusico(nome, NovoNomeIgreja, NovoInstrumento);
        } catch (Exception e) {
            System.err.println("Erro ao atualizar músico: " + e.getMessage());
        }
    }

    @DeleteMapping("/excluirMusico/{nome}")
    public void excluirMusico(@PathVariable String nome) {
        try {
            eService.excluirMusico(nome);
        } catch (Exception e) {
            System.err.println("Erro ao excluir músico: " + e.getMessage());
        }
    }
    @GetMapping("/buscarMusicoPorIgreja/{nomeIgreja}")
public Musico buscarMusicoPorIgreja(@PathVariable String nomeIgreja) {
    try {
        return eService.buscarMusicoPorIgreja(nomeIgreja);
    } catch (Exception e) {
        System.err.println("Erro ao buscar músico por igreja: " + e.getMessage());
        return null;
    }
}

}