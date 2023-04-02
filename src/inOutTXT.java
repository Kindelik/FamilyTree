import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.List;


public  class inOutTXT implements InOutFiles {

    @Override
    public void loadFile(FileReader file) {
        BufferedReader fileBuf = new BufferedReader(file);
    }

    @Override
    public void saveFile(FileWriter file) {

    }

}