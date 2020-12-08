package scraping;

import entity.Product;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestScraping {

    private String scraping(String url){
        List<String> jsonArray = new ArrayList<String>();
        try {

            Document document;
            document = Jsoup.connect(url).get();


            Elements element = document.getElementsByClass("tab-pane");
            Product item = new Product();
        }catch (Exception e){

        }

        return url;

    }

    public static void main(String[] args) {
        FileOutputStream fos = null;
        File file;
        //String sol = solution.findSolution("https://www.cermati.com/karir");
        String sol = null;
        try {
            file = new File("../solution.csv");
            fos = new FileOutputStream(file);
            byte[] bytesArray = sol.getBytes();

            fos.write(bytesArray);
            fos.flush();
            System.out.println("Success create file" );
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fos != null)
                {
                    fos.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("Error in closing the Stream");
            }

        }

    }

}
