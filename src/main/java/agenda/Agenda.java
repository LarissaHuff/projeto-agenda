package agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contato> contatosList = new ArrayList<>();

    public void adicionaContato(Contato contato) {
        contatosList.add(contato);
    }

    public Contato buscaContato(String nome) {

        for (int i = 0; i < contatosList.size(); i++) {
            Contato contato = contatosList.get(i);
            String nomeDaVez = contato.getNome();
            if (nomeDaVez.equals(nome)) {
                return contato;
            }
        }

        return contatosList.stream()
                .filter(it -> it.getNome().equals(nome))
                .findFirst()
                .orElseThrow();

    }

    public List<Contato> getContatosList() {
        return contatosList;
    }
}

