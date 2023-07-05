import java.io.*;

public class CommandLineCopyFille  {
    public static void main(String[] args) {
       
        String path= args[0];
        String dest= args[1];

        try (InputStream in = new FileInputStream(path);
             OutputStream out = new FileOutputStream(dest)) {

            byte[] byteObj= new byte[50];
            int length;

            while ((length = in.read(byteObj)) > 0) {
                out.write(byteObj, 0, length);
            }

            System.out.println("File copied successfully.");
        } catch (IOException exc) {
            System.out.println("Error copying file: " + exc.getMessage());
        }
    }
}