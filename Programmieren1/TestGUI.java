import javax.swing.*;

public class TestGUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TestGUI());
    }

    public TestGUI() {
        // Fenster
        JFrame frame = new JFrame("Button Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());

        // Panel
        JPanel panel = new JPanel(new java.awt.GridBagLayout());
        panel.setBackground(java.awt.Color.LIGHT_GRAY);

        // Label (Textausgabe)
        JLabel label = new JLabel("");

        
        // Button
        JButton button = new JButton("Wahrheit zu Ilgin");
        button.setBackground(java.awt.Color.CYAN);
        button.setPreferredSize(new java.awt.Dimension(200, 50));
        

        // Button-Logik
        button.addActionListener(e -> label.setText("Ilgin ist Ausländer und soll ausgeschaffen werden."));

        // Komponenten hinzufügen
        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new java.awt.Insets(0, 0, 12, 0);
        panel.add(button, gbc);

        gbc.gridy = 1;
        gbc.insets = new java.awt.Insets(0, 0, 0, 0);
        panel.add(label, gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}