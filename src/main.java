import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {

        // 1. Siapkan DATA terlebih dahulu (layer Model)
       CharacterManager manager = new CharacterManager();
manager.addCharacter(new Character("Michell", CharacterType.WARRIOR, 5));
manager.addCharacter(new Character("Gandalf", CharacterType.MAGE, 3));
manager.addCharacter(new Character("Legolas", CharacterType.ARCHER, 4));
        // 2 Karakter Baru (Total 5)
manager.addCharacter(new Character("Arwen", CharacterType.HEALER, 6));
manager.addCharacter(new Character("Frodo", CharacterType.ARCHER, 2));
        // Uji coba tambah karakter baru untuk melihat perubahan statistik secara dinamis:
        // manager.addCharacter(new Character("Lancelot", CharacterType.WARRIOR, 10));

        // 2. Jalankan GUI dengan AMAN di Event Dispatch Thread
        // Kirim objek 'manager' ke MainWindow agar View dapat mengambil data & statistik
        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow(manager);
            window.setVisible(true); // Tampilkan jendela
        });
    }
}