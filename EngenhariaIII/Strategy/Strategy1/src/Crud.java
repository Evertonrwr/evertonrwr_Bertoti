public interface Crud<T>  {
    void Salvar(T obj);
    void Editar(T obj);
    void Exluir(T obj);

}
