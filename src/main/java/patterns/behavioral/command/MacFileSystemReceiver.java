package patterns.behavioral.command;

import java.sql.SQLOutput;

public class MacFileSystemReceiver implements FileSystemReceiver{

    @Override
    public void openFile() {
        System.out.println("Writting file in MAc OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing dile in Mac OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Mac OS");
    }
}
