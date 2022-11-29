import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Song {
    private String title;
    private String author;
    private String text;

    public Song(String title, String author, String text) {
        this.title = title;
        this.author = author;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void fileWriter(){
        try (FileWriter fileWriter = new FileWriter("song.txt")){
            fileWriter.write(getTitle());
            fileWriter.write(getAuthor());
            fileWriter.write(getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void fileReader(){
        try (FileReader fileReader = new FileReader("song.txt")){
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
