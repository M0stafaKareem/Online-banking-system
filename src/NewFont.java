
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;

public class NewFont {
    
public static Font getFont(int fontSize) throws Exception {
    Font font = Font.createFont( Font.TRUETYPE_FONT, new FileInputStream(new File("C:\\Users\\mostafa\\Documents\\NetBeansProjects\\Software project\\src\\Elements\\Nexa-Black-Italic.ttf")) ).deriveFont(Font.PLAIN , fontSize) ;
    return font ;
}
}
