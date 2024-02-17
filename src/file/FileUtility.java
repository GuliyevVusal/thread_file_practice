package file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileUtility {

}
//    public static void writeTextToFileNIO(String message, String fileName) throws IOException {
//        Path filePath = Paths.get(fileName);
//        Files.write(filePath, message.getBytes(), StandardOpenOption.APPEND); //1- ci CREATE sadece yaradir file-ni
//        // ve count 100 defe demeyimize baxmayaraq 1 defe yazir file uzerine yazir her defe APPEND edirik sora artiq
//        // file icersinie count 100 dediyimize gore 100 defe yazacaq
//    }
//}
//
//    private static void writeIntoFile(String text, String fileName, boolean append) throws Exception {
//        try (BufferedWriter br = new BufferedWriter(new file_practice.FileWriter(fileName, append))) {
//            br.write(text);
//            br.newLine();
//        }
//    }
//
//    public static void writeIntoFile(String fileName, String text) throws Exception {
//        writeIntoFile(fileName, text, false);
//    }
//
//    public static void appendIntoFile(String fileName, String text) throws Exception {
//        writeIntoFile(fileName, text, true);
//
//    }
//}

//    public static void writeObjectToFile(Object obj, String objectFile) throws Exception {
//        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get(objectFile)))) {
//            oos.writeObject(obj);
//            oos.flush();
//        }
//    }
//
//    public static Object readObject(String objectFile) throws Exception {
//        try (ObjectInputStream iis = new ObjectInputStream(Files.newInputStream(Paths.get(objectFile)))) {
//            return iis.readObject();
//        }
//    }

//    public static void readTextFile(String filePath) throws IOException {
//        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
//        String text = new String(bytes, StandardCharsets.UTF_8);
//        System.out.println(text);
//    }
//
//    public static void writeImageToFile(String imagePath) throws IOException {
//        byte[] bytes = Files.readAllBytes(Paths.get(imagePath));
//        Path path = Paths.get("pattern-diagram2222.jpg");
//        Files.write(path, bytes, StandardOpenOption.CREATE);
//    }
//
//    public static void writeObjToFile() throws IOException {
//        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("User")))) {
//            Teacher t = new Teacher();
//            t.setFirstName("Vusal");
//            t.setLastName("Guliyev");
//            t.setAge(33);
//            t.setSalary(10000);
//            oos.writeObject(t);
//            oos.flush();
//        }
//    }
//
//    public static void readObject() throws Exception {
//        try (ObjectInputStream iis = new ObjectInputStream(Files.newInputStream(Paths.get("User")))) {
//            Object obj = iis.readObject();
//            Teacher user = (Teacher) obj;
//            System.out.println(user.toString());
//        }
//    }
//
//    public static void writeTextToFileWithIo(String text) throws Exception {
//        try (FileOutputStream fos = new FileOutputStream("newtext.txt")) {
//            fos.write(text.getBytes(StandardCharsets.UTF_8));
//        }
//    }
//
//    public static void writeImageToFileWithIo(String image) throws Exception {
//        try (FileOutputStream fs = new FileOutputStream("myImage.jpg")) {
//            byte[] bytes = Files.readAllBytes(Paths.get(image));
//            fs.write(bytes);
//        }
//    }

//    public static void writeTextToFileWithIo_2(String text) throws IOException {
//        try (file_practice.FileWriter fw = new file_practice.FileWriter("newtext2.txt");
//             BufferedWriter bw = new BufferedWriter(fw)) {
//            bw.write(text);
//            bw.newLine();
//        }
//    public static void writeTextToFileWithIo_2(String text, String fileName) throws IOException {
//        try (file_practice.FileWriter fw = new file_practice.FileWriter(fileName);
//             BufferedWriter bw = new BufferedWriter(fw)) {
//            for (int i = 0; i < 100; i++) {
//                bw.write(text);
//                bw.newLine();
//            }
//        }
//    }
//
//}
//
//    public static void readFromTextFileWithBufferReader(String fileName) throws Exception {
//        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        }
//    }
//
//    public static void readFromTextFileByByte(String fileName) throws Exception {
//        try (FileReader fr = new FileReader(fileName)) {
//            int charByte;
//            while ((charByte = fr.read()) != -1) {
//                System.out.println((char) charByte);
//            }
//        }
//    }
