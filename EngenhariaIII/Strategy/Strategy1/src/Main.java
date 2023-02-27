import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.Nome = "Tom";
        usuario.Sexo = 1;
        usuario.DataNascimento = new Date("19/04/2002");

        CrudUsuario crudUsuario= new CrudUsuario();
        crudUsuario.Salvar(usuario);
        usuario.Nome = "Tom Rocha";
        crudUsuario.Editar(usuario);
        crudUsuario.Exluir(usuario);

        Gato gato = new Gato();
        gato.Nome = "Miau";
        gato.Raca = "Siamês";

        CrudGato crudGato = new CrudGato();
        crudGato.Salvar(gato);
        gato.Nome = "Miaw";
        crudGato.Editar(gato);
        crudGato.Exluir(gato);
    }
}
