package bai3;

import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn của bạn :");
        String path = scanner.nextLine();

        System.out.println("Nhập đường dẫn file kết quả ");
        String result = scanner.nextLine();
        copyFile(path, result);
    }

    private static void copyFile(String path, String result) {
        File file = new File(path);
        File resultFile = new File(result);

        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            if (!resultFile.exists()) {
                throw new FileNotFoundException();
            }

            int count = 0;

            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(resultFile);

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
                count++;
            }

            System.out.println("Sao chép file thành công");
            System.out.println("Số ký tự trong file: " + count);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }


}
