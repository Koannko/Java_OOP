package srp2;

import java.util.Scanner;

public class ScannerInputProvider implements InputProvider {
    private Scanner scanner;

    public ScannerInputProvider(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String prompt(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
