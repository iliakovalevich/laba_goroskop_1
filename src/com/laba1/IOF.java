package com.laba1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class IOF {
    public ArrayList readTxtFile(String pathname) throws FileNotFoundException {
        Scanner s = new Scanner(new File(pathname));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNextLine()){
            list.add(s.nextLine());
        }
        s.close();
        return list;
    }
}
