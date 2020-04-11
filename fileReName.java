import java.io.File;
public class fileReName{
    public fileReName(){
        File file = new File("C:\\Users\\M.T.PARK\\OneDrive\\Programming\\java\\test\\abc001.txt");
        file.renameTo(new File("C:\\Users\\M.T.PARK\\OneDrive\\Programming\\java\\test\\abc002.txt"));       
    }

    public static void main(String[] args){
        new fileReName();
    }
}