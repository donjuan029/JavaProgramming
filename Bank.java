import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class Bank {

    public static final String USUARIO = "Java";
    public static final String SENHA = "abc@123";
    public static double saldo = 0;

    public static void main(String[] args) {

        int tentativas = 3;
        boolean loginValido = false;

        while (tentativas > 0 && !loginValido) {
            String usuarioInformado = JOptionPane.showInputDialog("Digite o usuário:");
            String senhaInformada = JOptionPane.showInputDialog("Digite a senha:");

            if (usuarioInformado.equals(USUARIO) && senhaInformada.equals(SENHA)) {
                loginValido = true;
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
            } else {
                tentativas--;
                JOptionPane.showMessageDialog(null, "Login inválido! Tente novamente. Você tem " + tentativas + " tentativas restantes.");
            }
        }

        if (!loginValido) {
            JOptionPane.showMessageDialog(null, "Acesso bloqueado!");
            System.exit(0);
        }

        while (true) {
            int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    new String[]{"Consultar Saldo", "Sacar", "Empréstimo", "Depósito", "Sair"}, null);

            switch (opcao) {
                case 0:
                    consultarSaldo();
                    break;
                case 1:
                    sacar();
                    break;
                case 2:
                    emprestimo();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void consultarSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo: R$" + String.format("%.2f", saldo));
    }

    public static void sacar() {
        try {
            double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:"));

            if (valorSaque > saldo) {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
            } else if (valorSaque <= 0) {
                JOptionPane.showMessageDialog(null, "Valor inválido!");
            } else {
                saldo -= valorSaque;
                JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! Saldo atual: R$" + String.format("%.2f", saldo));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número.");
        }
    }

    public static void emprestimo() {
        try {
            double valorEmprestimo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do empréstimo:"));

            if (valorEmprestimo > saldo * 2) {
                JOptionPane.showMessageDialog(null, "Valor do empréstimo excede o limite!");
            } else if (valorEmprestimo <= 0) {
                JOptionPane.showMessageDialog(null, "Valor inválido!");
            } else {
                int parcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite em quantas vezes deseja pagar:"));
                if (parcelas <= 0) {
                    JOptionPane.showMessageDialog(null, "Número de parcelas inválido!");
                    return;
                }

                double valorParcela = valorEmprestimo / parcelas;
                saldo += valorEmprestimo;

                JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!\nValor da parcela: R$" +
                        String.format("%.2f", valorParcela) + "\nNovo saldo: R$" + String.format("%.2f", saldo));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite números válidos.");
        }
    }

    public static void depositar() {
        try {
            double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito:"));

            if (valorDeposito <= 0) {
                JOptionPane.showMessageDialog(null, "Valor inválido!");
            } else {
                saldo += valorDeposito;
                JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso! Saldo atual: R$" + String.format("%.2f", saldo));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número.");
        }
    }
}