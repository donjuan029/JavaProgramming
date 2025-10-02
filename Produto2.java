import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

/**
 * Classe Produto preparada para serialização.
 * Representa um item com nome, preço e código (não serializável).
 */
public class Produto2 implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final String nome;
    private final double preco;

    /**
     * Campo marcado como 'transient':
     * Não será incluído na serialização.
     * Ideal para dados sensíveis ou temporários.
     */
    private transient int codigo;

    //Construtor
    public Produto2(String nome, double preco, int codigo) {
        this.nome = Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.preco = preco;
        this.codigo = codigo;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getCodigo() {
        return codigo;
    }

    //toString aprimorado
    @Override
    public String toString() {
        return String.format("Produto {nome='%s', preco=%.2f, codigo=%d}", nome, preco, codigo);
    }

    //equals e hashCode para comparação e uso em coleções
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Produto2)) return false;
        Produto2 other = (Produto2) obj;
        return Double.compare(preco, other.preco) == 0 &&
               Objects.equals(nome, other.nome);
               //'codigo' é ignorado por ser transient
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }
}

