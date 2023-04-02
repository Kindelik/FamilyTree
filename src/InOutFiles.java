import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public interface InOutFiles {
   abstract void loadFile(FileReader file);
    abstract void saveFile(FileWriter file);

}
