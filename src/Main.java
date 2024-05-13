import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Main{
    public static void main(String[] args){
        //To handle I/O Exceptions
        try{
            File file=new File("abc.png"); // To make image in current directory or to create images on Desktop
            //You can find the path to desktop from command line
            //File file=new File("/c/Users/Atharv Joshi/Desktop/abc.png");

            String content="This is my content";
            ByteArrayOutputStream out= QRCode.from(content).to(ImageType.PNG).stream();//  returns the image data as a byte array stream.
            //Out has our content now we want to write that content into the file
            FileOutputStream fos=new FileOutputStream(file);// Where to store the qr code created
            fos.write(out.toByteArray());
            fos.close();
            System.out.println("QR Code is Generated");
        }
        catch(Exception e){
         e.printStackTrace();
        }
        }
        }