package lab15;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame {
    private JTextArea textArea;
    private JMenu colorMenu;
    private JMenu fontMenu;

    public TextEditor() {
        setTitle("Text Editor");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание текстовой области
        textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        add(new JScrollPane(textArea));

        // Создание меню выбора цвета
        colorMenu = new JMenu("Цвет");
        JMenuItem blueItem = new JMenuItem("Синий");
        blueItem.addActionListener(new ColorActionListener(Color.BLUE));
        colorMenu.add(blueItem);
        JMenuItem redItem = new JMenuItem("Красный");
        redItem.addActionListener(new ColorActionListener(Color.RED));
        colorMenu.add(redItem);
        JMenuItem blackItem = new JMenuItem("Черный");
        blackItem.addActionListener(new ColorActionListener(Color.BLACK));
        colorMenu.add(blackItem);

        // Создание меню выбора шрифта
        fontMenu = new JMenu("Шрифт");
        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        timesNewRomanItem.addActionListener(new FontActionListener("Times New Roman"));
        fontMenu.add(timesNewRomanItem);
        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        msSansSerifItem.addActionListener(new FontActionListener("MS Sans Serif"));
        fontMenu.add(msSansSerifItem);
        JMenuItem courierNewItem = new JMenuItem("Courier New");
        courierNewItem.addActionListener(new FontActionListener("Courier New"));
        fontMenu.add(courierNewItem);

        // Создание главного меню
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(colorMenu);
        menuBar.add(fontMenu);
        setJMenuBar(menuBar);
    }

    // Обработчик событий для выбора цвета
    private class ColorActionListener implements ActionListener {
        private Color color;

        public ColorActionListener(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setForeground(color);
        }
    }

    // Обработчик событий для выбора шрифта
    private class FontActionListener implements ActionListener {
        private String fontName;

        public FontActionListener(String fontName) {
            this.fontName = fontName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setFont(new Font(fontName, Font.PLAIN, 12));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextEditor().setVisible(true);
            }
        });
    }
}
