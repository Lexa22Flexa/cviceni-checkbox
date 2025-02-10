import javax.swing.*;
import java.awt.event.ActionEvent;

public class TlacitkaFrame extends JFrame {
    private JTextField tfText;
    private JLabel lbText;
    private JPanel pnMain;
    private JButton btPrint;
    private JButton btA;
    private JButton btB;
    private JButton btC;
    private JButton btD;

    public TlacitkaFrame() {
        initComponents();
    }

    private void initComponents() {
        setContentPane(pnMain);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Tlačítka");
        pack();
        btA.addActionListener(e -> pridejText(e)); //ActionListener = rozhraní, které vyžaduje nějakou třídu a ta musí mít metodu actionPerformed(); když dáme novou třídu ActionListener, je to anonymní třída, do metody actionPerformed napíšeme něco, v parametru máme ActionEvent => zas to můžem volat => stačí napsat jak to máme (zkrácené)
        btB.addActionListener(e -> pridejText(e));
        btC.addActionListener(e -> pridejText(e));
        btD.addActionListener(e -> pridejText(e));
        btPrint.addActionListener(e -> vypis());
    }

    private void pridejText(ActionEvent e) {
        JButton tlacitko = (JButton) e.getSource(); //zeptáme se ActionEvent, co bylo zdrojem události
        // v závorkách přetypování
        tfText.setText(tfText.getText() + tlacitko.getText()); //přečteme text v tlačítku a přidáme ho do textového pole
    }

    private void vypis() {
        JOptionPane.showMessageDialog(this, tfText.getText(), "Tvůj text", JOptionPane.INFORMATION_MESSAGE);
        //můžeme tam dát nadpis dialogového okýnka (3. položka) a nastavit jaký typ okýnka (4. položka) = nastaví ikonku okýnka
    }
}
