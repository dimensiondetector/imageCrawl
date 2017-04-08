import java.util.*;
import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class JsoupCrawler {
    public static void main(String[] args) throws IOException{
        Document doc = Jsoup.connect("http://www.supercars.net/gallery/119513/2841/5.html").get();
        String title = doc.title();
        System.out.println("title: " + title );
        
        //Elements links = doc.select("a[href]");
        /*for(Element link: links){
            System.out.println("\nlink: " + link.attr("href"));
            System.out.println("text: " + link.text());
        }*/
        
        System.out.println("Getting all images...");
        
        Elements imags = doc.getElementsByTag("img");
        
        for(Element src: imags){
            System.out.println("src: " + src.attr("abs:src"));
        }
        
    }
}
