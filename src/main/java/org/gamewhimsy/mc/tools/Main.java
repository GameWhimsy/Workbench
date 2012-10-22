package org.tulonsae.mc.tools;

import java.io.IOException;
import java.util.List;

public class Main {

    private static final String CMD_LIST = "list";

    public static void main(String[] args) {
        String command = args[0].toLowerCase();

        switch (command) {
            case CMD_LIST:
                break;
            default:
                // TODO - syntax, help goes here
                break;
        }
    }

}
