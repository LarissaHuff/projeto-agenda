package agenda;

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato();
        contato1.setEmail("larihof@gmail.com");
        contato1.setNome("larissa");

        Contato contato2 = new Contato();
        contato2.setEmail("luana_piovani@gmail.com");
        contato2.setNome("luana");

        Agenda agenda = new Agenda();
        agenda.adicionaContato(contato1);
        agenda.adicionaContato(contato2);

        Contato contato = agenda.buscaContato("luana");
        System.out.println(contato);

        agenda.getContatosList();
    }
}