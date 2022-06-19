import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {
    private JTextField txtNome;
    private JTextField txtNota1;
    private JTextField txtNota2;
    private JTextField txtNota3;
    private JTextField txtTotal;
    private JButton Calcular;
    private JTextField txtMedia;
    private JTextField txtResultado;

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel Main;

    public JavaCalculator() {
        Calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int n1, n2, n3,total;
                double media;


                n1 = Integer.parseInt(txtNota1.getText());
                n2 = Integer.parseInt(txtNota2.getText());
                n3 = Integer.parseInt(txtNota3.getText());

                total = n1 + n2 + n3;

                txtTotal.setText(String.valueOf(total));

                media = total/3;

                txtMedia.setText(String.valueOf(media));

                if (media > 60){
                    txtResultado.setText("Aprovado");
                }
                else{
                    txtResultado.setText("Reprovado");
                }
            }
        });
    }
}
