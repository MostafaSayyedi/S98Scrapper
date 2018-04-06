import org.jsoup.Jsoup;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class ScrapS98Class {
    public static  void main(String[] args) throws IOException{
        ///****part1 __ get the main page link****//
        String newLine = System.getProperty("line.separator");
        //****get url input from user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please Enter URL from Soft98.ir:");
        String URL =br.readLine();

        //****
        //final  Element doc = Jsoup.connect("http://soft98.ir/").get();
        final  Element doc = Jsoup.connect(URL).get();
        //log(doc.title());
        final Elements newsHeadlines = doc.select("h2.card-title > a");
        //for (Element headline : newsHeadlines) {
        //log("%s\n\t%s",
        //headline.attr("title"), headline.absUrl("href");
        //Element a = newsHeadlines.select("a").first();
        //Element a = newsHeadlines.select("a").get(5);
        Element a0 = newsHeadlines.select("a").get(0);
        Element a1 = newsHeadlines.select("a").get(1);
        Element a2 = newsHeadlines.select("a").get(2);
        Element a3 = newsHeadlines.select("a").get(3);
        Element a4 = newsHeadlines.select("a").get(4);
        Element a5 = newsHeadlines.select("a").get(5);
        String linkStr0 = a0.attr("href");
        String linkStr1 = a1.attr("href");
        String linkStr2 = a2.attr("href");
        String linkStr3 = a3.attr("href");
        String linkStr4 = a4.attr("href");
        String linkStr5 = a5.attr("href");
        //System.out.println(headline.text());
        //System.out.println(linkStr0);
        //System.out.println(linkStr1);
        //System.out.println(linkStr2);
        //System.out.println(linkStr3);
        //System.out.println(linkStr4);
        //System.out.println(linkStr5);
        //System.setOut(new PrintStream(new FileOutputStream("log_file.txt")));
        //}
        ///****part1 __ get the main page link****//

        //****part2 __get the dl links in Exclusive page****//
        final Element doc1 = Jsoup.connect(linkStr0).get();
        final Elements newsHeadlines1 = doc1.select("dd.download-list-item > a");
        Element a6 = newsHeadlines1.select("a").get(0);
        String linkStr6 = a6.attr("href");
        System.out.println(linkStr6);
        Logger.log(linkStr6 + newLine);
        //******************
        final Element doc2 = Jsoup.connect(linkStr1).get();
        final Elements newsHeadlines2 = doc2.select("dd.download-list-item > a");
        Element a7 = newsHeadlines2.select("a").get(0);
        String linkStr7 = a7.attr("href");
        System.out.println(linkStr7);
        Logger.log(linkStr7 + newLine);
        //******************
        final Element doc3 = Jsoup.connect(linkStr2).get();
        final Elements newsHeadlines3 = doc3.select("dd.download-list-item > a");
        Element a8 = newsHeadlines3.select("a").get(0);
        String linkStr8 = a8.attr("href");
        System.out.println(linkStr8);
        Logger.log(linkStr8 + newLine);
        //******************
        final Element doc4 = Jsoup.connect(linkStr3).get();
        final Elements newsHeadlines4 = doc4.select("dd.download-list-item > a");
        Element a9 = newsHeadlines4.select("a").get(0);
        String linkStr9 = a9.attr("href");
        System.out.println(linkStr9);
        Logger.log(linkStr9 + newLine);
        //******************
        final Element doc5 = Jsoup.connect(linkStr4).get();
        final Elements newsHeadlines5 = doc5.select("dd.download-list-item > a");
        Element a10 = newsHeadlines5.select("a").get(0);
        String linkStr10 = a10.attr("href");
        Logger.log(linkStr10 + newLine);
        //******************
        final Element doc6 = Jsoup.connect(linkStr5).get();
        final Elements newsHeadlines6 = doc6.select("dd.download-list-item > a");
        Element a11 = newsHeadlines6.select("a").get(0);
        String linkStr11 = a11.attr("href");
        System.out.println(linkStr11);
        Logger.log(linkStr11 + newLine);
        //******************
        //PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        //System.setOut(out);
        //****part2 __get the dl links in Exclusive page****//
    }
}