import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.awt.Desktop;
import java.net.URI;
public class Main {

    public static void main(String[] args) {
        String emailAddress = "example@example.com";
        String messageBody = "Hi , \n" +
                "\n" +
                "This is Atharv, I am currently pursuing my masters at Northeastern university in information systems. I am actively looking for internship opportunities and I believe that I have the right mindset and potential to learn and grow in my career. \n" +
                "\n" +
                "I would greatly appreciate if we could get on a call and discuss any possible opportunities in your company or in your circle.\n" +
                "\n" +
                "My tech skills:\n" +
                "Java - JDBC drivers, Java servlet (JSP), APIs\n" +
                "Database - SQL, MySQL, MongoDB, DB2\n" +
                "DevOps -  CI/CD pipelines, Shell scripting, Terraform, Packer\n" +
                "Testing - Manual testing, DevOps, JavaScript (Zest, coffee)\n" +
                "JavaScript - Node.js, React.js, Next.js\n" +
                "Cloud - Azure, Google cloud, AWS\n" +
                "Networking - Gateway, Firewall, Security\n" +
                "\n" +
                "Best Regards\n" +
                "Atharv\n"+
                "Link to My Resume Below\n"+
                "https://drive.google.com/file/d/11dbSlIdAsfSJCdmNR89-Nu3KfCGJ8jgI/view";

        // Encode the message body, replacing spaces with %20 and line breaks with %0D%0A
        String encodedMessageBody = messageBody.replaceAll(" ", "%20").replaceAll("\n", "%0D%0A");

        // Construct the mailto URI
        String uriString = "mailto:" + emailAddress + "?body=" + encodedMessageBody;

        try {
            File file = new File("mylink2.png"); // To make image in current directory or to create images on Desktop
            ByteArrayOutputStream out = QRCode.from(uriString).to(ImageType.PNG).stream(); // returns the image data as a byte array stream.
            // Out has our content now we want to write that content into the file
            FileOutputStream fos = new FileOutputStream(file); // Where to store the qr code created
            fos.write(out.toByteArray());
            fos.close();
            System.out.println("QR Code is Generated");
            Desktop desktop = Desktop.getDesktop();
            desktop.mail(new URI(uriString)); // Pass uriString instead of qrData
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
