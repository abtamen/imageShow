import java.awt.*;
import javax.swing.*;

/** Tiny example showing the main difference in using 
 *  JFrame instead of Frame: using the content pane
 *  and getting the Java (Metal) look and feel.
 *  1998-99 Marty Hall, http://www.apl.jhu.edu/~hall/java/
 */

public class JFrameExample extends WindowUtilities {
  public static void main(String[] args) {
    WindowUtilities.setNativeLookAndFeel();
    JFrame f = new JFrame("This is a test");
    f.setSize(400, 150);
    Container content = f.getContentPane();
    content.setBackground(Color.white);
    content.setLayout(new FlowLayout()); 
    content.add(new JButton("Button 1"));
    
    content.add(new JButton("Button 2"));
    content.add(new JButton("Button 3"));
    String i=null;
    content.add(new JCheckBox(i));
    System.out.println(i);
    f.addWindowListener(new ExitListener());
    f.setVisible(true);
  }
}
