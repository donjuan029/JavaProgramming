import java.util.ArrayList;

//A função classe atribui como string o título e autor
public class Livro {
    
    String titulo;
    String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // A função info retorna a formatação que no caso é a descrisão do título e autor do livro
    public String getInfo() {
        return "Título: " + this.titulo + ", Autor: " + this.autor;
    }
}

// Classe Biblioteca.java


class Biblioteca {
    ArrayList<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void listarLivros() {
        System.out.println("Livros na biblioteca:");
        for (Livro livro : this.livros) {
            System.out.println(livro.getInfo());
        }
    }
}

// Classe Main.java
class Main {

    //O Array nesse caso serve para armarzenar cada livro com seu título e autor
    public static void main(String[] args) {
        Biblioteca minhaBiblioteca = new Biblioteca();
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling");

        minhaBiblioteca.adicionarLivro(livro1);
        minhaBiblioteca.adicionarLivro(livro2);
        minhaBiblioteca.listarLivros();
    }
}
