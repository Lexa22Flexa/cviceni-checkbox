import javax.swing.*;

public class CheckboxFrame extends JFrame {
    private JPanel panel;
    private JCheckBox ch;
    private JButton btChecked;

    public CheckboxFrame() {
        initComponents();
    }

    private void initComponents() {
        setContentPane(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

        btChecked.addActionListener(e -> zkontrolujStav());
    }

    private void zkontrolujStav() {
        if (ch.isSelected()) {
            JOptionPane.showMessageDialog(this, "Stav checkboxu je: true \n Přepínám na stav: false");
            ch.setSelected(false);
        } else {
            JOptionPane.showMessageDialog(this, "Stav checkboxu je: false \n Přepínám na stav: true");
            ch.setSelected(true);
        }
    }
}
