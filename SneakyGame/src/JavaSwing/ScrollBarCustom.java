package JavaSwing;

import JavaSwing.ModernScrollBarUI;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBarCustom extends JScrollBar {

    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(8, 12));
        setForeground(Color.BLUE);
        setBackground(Color.black);
    }
}
