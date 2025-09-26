import java.util.ArrayList;
import java.util.List;

// Classe genérica personalizada que armazena um item do tipo T
class Caixa<T> {
    private T item;

    // Método para adicionar um item à caixa
    public void adicionar(T item) {
        this.item = item;
    }

    // Método para obter o item da caixa
    public T obter() {
        return this.item;
    }

    // Método extra para verificar se há item na caixa
    public boolean temItem() {
        return this.item != null;
    }

    // Método extra para limpar o conteúdo da caixa
    public void limpar() {
        this.item = null;
    }
}

// Enum que representa os gêneros de filmes
enum Genero {
    ACAO, COMEDIA, DRAMA, FICCAO_CIENTIFICA
}

// Classe base Filme
class Filme {
    private String titulo;
    private Genero genero;

    public Filme(String titulo, Genero genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Filme{" + "titulo='" + titulo + '\'' + ", genero=" + genero + '}';
    }
}

// Subclasse de Filme para testar wildcard
class FilmeInfantil extends Filme {
    public FilmeInfantil(String titulo, Genero genero) {
        super(titulo, genero);
    }
}

public class GenericsClass {
    // Método genérico que aceita listas de Filme ou de suas subclasses
    public static void imprimirListaFilmes(List<? extends Filme> lista) {
        System.out.println("Lista de Filmes:");
        for (Filme filme : lista) {
            System.out.println(filme);
        }
    }

    public static void main(String[] args) {
        // Usando a classe genérica com String
        Caixa<String> caixaString = new Caixa<>();
        caixaString.adicionar("Java para Iniciantes");
        System.out.println("Conteúdo da caixa de String: " + caixaString.obter());

        // Usando a classe genérica com Integer
        Caixa<Integer> caixaInteger = new Caixa<>();
        caixaInteger.adicionar(123);
        System.out.println("Conteúdo da caixa de Integer: " + caixaInteger.obter());

        // Demonstração de segurança de tipos
        // caixaString.adicionar(100); // ERRO: tipo incompatível (descomente para ver o erro de compilação)

        // Criando lista de filmes
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("O Chamado", Genero.ACAO));
        filmes.add(new Filme("A Chegada", Genero.FICCAO_CIENTIFICA));

        // Imprimindo lista de filmes usando wildcard
        imprimirListaFilmes(filmes);

        // Criando lista de filmes infantis (subclasse de Filme)
        List<FilmeInfantil> filmesInfantis = new ArrayList<>();
        filmesInfantis.add(new FilmeInfantil("Toy Story", Genero.COMEDIA));
        filmesInfantis.add(new FilmeInfantil("Divertida Mente", Genero.DRAMA));

        // Imprimindo lista de filmes infantis usando o mesmo método genérico
        imprimirListaFilmes(filmesInfantis);
    }
}
