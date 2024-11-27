import javax.swing.*;

public class Banco {
    private JTextField Saldo;
    private JTextField Valor;
    private JTextField Sacarvalor;
    private JTextField Valordeposito;
    private JButton RealizarDeposito;
    private JButton Realizarsaque;
    private JPanel Home;
    private JTextField InserirValor;
    private JTextField InserirDeposito;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Saldo");
        frame.setContentPane(new Banco().Home);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();

        frame.setVisible(true);

    }
}

