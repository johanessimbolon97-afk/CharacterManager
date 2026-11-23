package com.unpri.charactermanager.view;
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Jendela utama aplikasi Character Manager.
 * Menerapkan prinsip MVC: MainWindow (View) tidak melakukan kalkulasi rumit,
 * melainkan meminta data statistik langsung dari CharacterManager (Model).
 */
public class MainWindow extends JFrame {

    private JPanel mainPanel;
    private final CharacterManager characterManager; // Menyimpan referensi model

    public MainWindow(CharacterManager characterManager) {
        super("Character Manager v0.3");
        this.characterManager = characterManager;

        initComponents();

        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        mainPanel = new JPanel(); // Container utama

        ArrayList<Character> characterList = characterManager.getAllCharacters();

        // Judul dengan total karakter dinamis dari model
        JLabel titleLabel = new JLabel("=== Daftar Karakter (" + characterManager.getTotalCharacters() + ") ===");
        mainPanel.add(titleLabel);

        // Loop menampilkan data tiap karakter
        for (Character c : characterList) {
            String info = c.getName() + " | " + c.getType() + 
                          " | Lv." + c.getLevel() + 
                          " | HP:" + c.getHitPoints() + 
                          " | ATK:" + c.getAttackPower();
            JLabel characterLabel = new JLabel(info);
            mainPanel.add(characterLabel);
        }

        // =========================================================================
        // TANTANGAN MANDIRI: JLabel Statistik Ringkas (MVC Compliant)
        // Kalkulasi diserahkan sepenuhnya ke Model, View hanya menampilkan hasilnya.
        // =========================================================================
        double avgLevel = characterManager.getAverageLevel();
        JLabel statsLabel = new JLabel("📊 Rata-rata Level: " + String.format("%.2f", avgLevel));
        mainPanel.add(statsLabel);

        add(mainPanel); // Menempatkan panel ke jendela JFrame
    }
}