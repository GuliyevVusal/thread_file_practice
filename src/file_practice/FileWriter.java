package file_practice;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileWriter implements Runnable {

    public enum WRITE_TYPE {
        IO, NIO
    }

    private final String message;
    private final String fileName;
    private final WRITE_TYPE writeType;
    private final int count;


    private FileWriter(String message, String fileName, WRITE_TYPE writeType, int count) {
        this.message = message;
        this.fileName = fileName;
        this.writeType = writeType;
        this.count = count;
    }

    @Override
    public void run() {
        if (writeType == WRITE_TYPE.IO) {
            writeByIO();
        } else if (writeType == WRITE_TYPE.NIO) {
            writeByNIO();
        }
    }

    private void writeByNIO() {
        try {
            for (int i = 0; i < count; i++) {
                Files.write(Paths.get(fileName), (message + "." + System.nanoTime() + "\n").getBytes(), StandardOpenOption.APPEND);
                //1- ci CREATE sadece yaradir file-ni
                // ve count 100 defe demeyimize baxmayaraq 1 defe yazir message-ni file-nin uzerine yazir her defe.
                //APPEND edirik sora artiq file icersinie count 100 dediyimize gore 100 defe yazacaq message-ni
                //Eger ki NIO ile 1 fayla her 2 Thread salam sagol yazsa bir basa fayla yazir deye qarisiq yazacaqlar
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private void writeByIO() {
        try (BufferedWriter br = new BufferedWriter(new java.io.FileWriter(fileName, true))) {
            for (int i = 0; i < count; i++) {// IO ile 1 fayla her 2 Thread yazanda sira ile yazirlar bu casede 100 defe
                br.write(message + "." + System.nanoTime());// Salam sonra 100 defe sagol yazacaq
                br.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static FileWriter instance(String message, String fileName, WRITE_TYPE writeType, int count) {
        return new FileWriter(message, fileName, writeType, count);
    }
}
