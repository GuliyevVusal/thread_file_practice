import file_practice.FileWriter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {


        FileWriter fileWriter1 = FileWriter.instance("Salam", "comonfile.txt", FileWriter.WRITE_TYPE.NIO, 100);
        FileWriter fileWriter2 = FileWriter.instance("Sag ol", "comonfile.txt", FileWriter.WRITE_TYPE.NIO, 100);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(fileWriter1);
        executorService.submit(fileWriter2);

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);


    }
}