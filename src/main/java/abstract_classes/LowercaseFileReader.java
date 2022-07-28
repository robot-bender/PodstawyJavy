package abstract_classes;

import org.junit.Test;

import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;


public class LowercaseFileReader extends BaseFileReader {

    public LowercaseFileReader(Path filePath) {
        super(filePath);
    }

    @Override
    protected String mapFileLine(String line) {
        return line.toLowerCase();
    }

    @Test
    public void givenLowercaseFileReaderInstance_whenCalledreadFile_thenCorrect() throws Exception {
        URL location = getClass().getClassLoader().getResource("files/test.txt");
        Path path = Paths.get(location.toURI());
        BaseFileReader lowercaseFileReader = new LowercaseFileReader(path);

        // assertThat(lowercaseFileReader.readFile()).isInstanceOf(List.class);
    }
}
