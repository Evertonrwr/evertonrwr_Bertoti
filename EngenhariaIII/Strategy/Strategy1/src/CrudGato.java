public class CrudGato implements Crud<Gato> {
    @Override
    public void Salvar(Gato gato) {
        System.out.println("Nome:" + gato.Nome);
        System.out.println("Raça:" + gato.Raca);
        System.out.println("Gato:" + gato.Nome + " cadastrado com sucesso!");

    }

    @Override
    public void Editar(Gato gato) {
        System.out.println("Nome:" + gato.Nome);
        System.out.println("Raça:" + gato.Raca);
        System.out.println("Gato:" + gato.Nome + " editado com sucesso!");

    }

    @Override
    public void Exluir(Gato gato) {
        System.out.println("Gato:" + gato.Nome + " excluido com sucesso!");

    }
}
