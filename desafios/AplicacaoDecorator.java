package desafios;

import java.io.FilterWriter;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * AplicacaoDecorator demonstra o uso do padrão Decorator em Java I/O.
 * Inclui a classe UpperCaseWriter que converte texto para maiúsculas
 * antes de escrever no arquivo.
 */
public class AplicacaoDecorator {

    /**
     * UpperCaseWriter é um FilterWriter que converte todos os caracteres
     * para maiúsculas antes de escrever no Writer subjacente.
     */
    static class UpperCaseWriter extends FilterWriter {

        public UpperCaseWriter(Writer out) {
            super(out);
        }

        @Override
        public void write(String str) throws IOException {
            String upperCaseStr = str.toUpperCase();
            super.write(upperCaseStr, 0, upperCaseStr.length());
        }

        //Opcional: sobrescreve write(int c) para suportar escrita de caracteres individuais
        @Override
        public void write(int c) throws IOException {
            super.write(Character.toUpperCase(c));
        }

        //Opcional: sobrescreve write(char[] cbuf, int off, int len)
        @Override
        public void write(char[] cbuf, int off, int len) throws IOException {
            for (int i = off; i < off + len; i++) {
                cbuf[i] = Character.toUpperCase(cbuf[i]);
            }
            super.write(cbuf, off, len);
        }
    }

    public static void main(String[] args) {
        String nomeArquivo = "maiusculo.txt";
        String fraseOriginal = "esta é uma frase de teste em letras minúsculas.";

        System.out.println("Frase original (minúscula): \"" + fraseOriginal + "\"");
        System.out.println("Gravando no arquivo " + nomeArquivo + " usando o UpperCaseWriter...");

        try (
            BufferedWriter escritor = new BufferedWriter(
                new UpperCaseWriter(
                    new FileWriter(nomeArquivo)
                )
            )
        ) {
            escritor.write(fraseOriginal);
            escritor.flush();

            System.out.println("\nEscrita concluída. Verifique o arquivo " + nomeArquivo + ".");
            System.out.println("O conteúdo deve estar em CAIXA ALTA.");

        } catch (IOException e) {
            System.err.println("\n--- ERRO DE I/O ---");
            System.err.println("Falha ao escrever ou fechar o arquivo: " + e.getMessage());
        }
    }
}
