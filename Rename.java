import java.io.File;
public class Rename{
    public static void main(String[] args){
        final String folder = "C:\\Users\\M.T.PARK\\OneDrive\\Programming\\java\\test";
        File file = new File(folder);
        String[] fileList = file.list();
        for(int i =0; i <fileList.length; i++){
            System.out.println(fileList[i]);
        }
    }
}