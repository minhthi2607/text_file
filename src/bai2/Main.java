package bai2;

import java.util.List;

import static bai2.FindMaxValue.findMax;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("bai2.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result_bai2.txt", maxValue);
    }
}
