public class CrudUsuario implements Crud<Usuario> {
    @Override
    public void Salvar(Usuario usuario) {
        System.out.println("Nome:" + usuario.Nome);
        System.out.println("Data de Nascimento :" + usuario.DataNascimento);
        System.out.println("Sexo:" + (usuario.Sexo == 1? "Masculino": "Feminino"));
        System.out.println("Usuário: "+ usuario.Nome +" cadastrado com sucesso!");

    }

    @Override
    public void Editar(Usuario usuario) {
        System.out.println("Nome:" + usuario.Nome);
        System.out.println("Data de Nascimento :" + usuario.DataNascimento);
        System.out.println("Sexo:" + (usuario.Sexo == 1? "Masculino": "Feminino"));
        System.out.println("Usuário: "+ usuario.Nome +" editado com sucesso!");

    }

    @Override
    public void Exluir(Usuario usuario) {
        System.out.println("Usuário: "+ usuario.Nome +" excluido com sucesso!");

    }
}
