import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * The class for parsing email whose html file is given
 */
public class HTMLParser {
    public static void main(String[] args) throws IOException {
        //default file location
        String fileLocation = "";

        //get file location as input arguement
        if(args.length!=0 && args[0]!=null)
            fileLocation = args[0];
        else{
            System.out.println("No File Path Provided, cannot continue..");
            System.exit(1);
        }

        File input = new File(fileLocation);
        Document doc = Jsoup.parse(input, "UTF-8", "http://example.com/");

        //Getting each element that is required
        Elements nameElement = doc.select(Paths.NAME.getSelector());
        Elements emailElement = doc.select(Paths.EMAIL.getSelector());
        Elements addressElement = doc.select(Paths.ADDRESS.getSelector());
        Elements phoneElement = doc.select(Paths.PHONE.getSelector());
        Elements bedsElement = doc.select(Paths.BEDS.getSelector());
        Elements bathsElement = doc.select(Paths.BATHS.getSelector());


        Data data = new Data();
        if(nameElement!=null && !nameElement.isEmpty()){
            data.setName(nameElement.first().text());
        }

        if(emailElement!=null && !emailElement.isEmpty()){
            data.setEmail(emailElement.first().text());
        }

        if(phoneElement!=null && !phoneElement.isEmpty()){
            data.setPhone(phoneElement.first().text());
        }

        if(addressElement!=null && !addressElement.isEmpty()){
            data.setAddress(addressElement.first().text());
        }

        if(bedsElement!=null && !bedsElement.isEmpty()){
            data.setBeds(bedsElement.first().text());
        }

        if(bathsElement!=null && !bathsElement.isEmpty()){
            data.setBaths(bathsElement.first().text());
        }
        /**
         * Writing the output to a file output.txt
         */
        FileOutputStream outputStream = new FileOutputStream("output.json");
        outputStream.write(data.toJsonString().getBytes());
        outputStream.flush();
        outputStream.close();
    }
}
