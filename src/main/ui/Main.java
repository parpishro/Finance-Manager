package ui;

import java.io.IOException;

// starts the application
public class Main {
    public static void main(String[] args) throws IOException {
        new FinAppGUI((new Init()).getMaster());
    }
}
