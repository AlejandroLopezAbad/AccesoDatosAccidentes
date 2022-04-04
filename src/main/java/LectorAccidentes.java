import model.AccidentesTrafico;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LectorAccidentes {

    private static LectorAccidentes instance;
    public static final String SEPARATOR = FileSystems.getDefault().getSeparator();
    //F:\AccesoDatosAccidentes\src\main\resources
    public static final String DATA_DIR = System.getProperty("user.dir") + SEPARATOR + "src"+SEPARATOR+"main"+SEPARATOR+"resources";
    public static final String FILE = "2021_Accidentalidad.csv";
    public static final String FILE_PATH = DATA_DIR + SEPARATOR + FILE;
    private List<AccidentesTrafico> accidentesList;

    private LectorAccidentes() {
        getAccidentes();
    }

    public static LectorAccidentes getInstance() {
        if (instance == null) {
            instance = new LectorAccidentes();
        }
        return instance;
    }

    public List<AccidentesTrafico> getAccidentesList() {
        return accidentesList;
    }

    public void setAccidentesList(List<AccidentesTrafico> accidentesList) {
        this.accidentesList = accidentesList;
    }

    private Stream<String> getFile() {
        Stream<String> data = null;
        try {
            data = Files.lines(Paths.get(FILE_PATH)).skip(1);

        } catch (IOException ex) {
            System.err.println("Error de lectura de datos: " + ex.getMessage());
        }
        return data;
    }

    private void getAccidentes() {
        accidentesList = new ArrayList<>();
        accidentesList = getFile().map(s ->{
            String[] lineadatos = s.split(";");
            if (lineadatos[2].length() <= 7) {
                String a = lineadatos[2];
                lineadatos[2] = "0" + a;
            }
            AccidentesTrafico ac = new AccidentesTrafico(
                    lineadatos[0],
                    lineadatos[1],
                    lineadatos[2],
                    lineadatos[3],
                    lineadatos[4],
                    lineadatos[5],
                    lineadatos[6],
                    lineadatos[7],
                    lineadatos[8],
                    lineadatos[9],
                    lineadatos[10],
                    lineadatos[11],
                    lineadatos[12],
                    lineadatos[13],
                    lineadatos[14],
                    lineadatos[15],
                    lineadatos[16],
                    lineadatos[17],
                    lineadatos[18]);
            return ac;
        }).parallel().collect(Collectors.toList());
    }

}
