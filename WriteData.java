import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteData {
    private String fileName;
    public WriteData(String fileName) {
        this.fileName = fileName;
    }

    public void SaveData(String data){
        try {
            CreateFile(fileName);
        }catch (IOException e){
            System.out.println("Не смог создать файл, ошибка: " + e.getMessage());
        }
        try {
            addDataToFile(fileName,data);
        } catch (IOException e){
            System.out.println("При работе с файлом возникла ошибка: " + e.getMessage());
        }
    }

    private void CreateFile(String fileName) throws IOException {
        Path file = Path.of(fileName);
        if(!Files.isRegularFile(file)){
            Files.createFile(file);
        }
    }

    private void addDataToFile(String fileName, String data) throws IOException{
        Path file = Path.of(fileName);
        Files.writeString(file, data);
    }
}
