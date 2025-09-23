import java.util.ArrayList;

//Superclasse
class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    //Esse método pode ser sobrescrito pelas subclasses
    public String getDescricao() {
        return "Título: " + titulo + " | Autor: " + autor;
    }
}

//Subclasse Livro Físico
class LivroFisico extends Livro {
    private int numeroPaginas;

    public LivroFisico(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public String getDescricao() {
        return super.getDescricao() + " | Páginas: " + numeroPaginas;
    }

}

//Subclasse Ebook
class Ebook extends Livro {
    private String formato;

    public Ebook(String titulo, String autor, String formato) {
        super(titulo, autor);
        this.formato = formato;
    }

    public String getDescricao() {
        return super.getDescricao() + " | Formato: " + formato;
    }
}

//Classe Biblioteca
class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        System.out.println("\n Lista de Livros na Biblioteca: ");
        for (Livro livro : livros) {
            System.out.println(livro.getDescricao());
        }
    }
}


// A classe principal
public class HerançaArrayLivro {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        //Instâncias criadas
        LivroFisico livro1 = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", 1200);
        Ebook ebook1 = new Ebook("Clean Code", "Robert C. Martin", "PDF");

        //Adicionando na biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(ebook1);

        //Listando
        biblioteca.listarLivros();
    }
}
