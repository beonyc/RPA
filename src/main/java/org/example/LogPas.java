package org.example;

public enum LogPas {
    INFO("sugrobov","ghjytgrd.1Y");
    private final String username;
    private final String password;

    public String getName() {
        return username;
    }

    public String getPass() {
        return password;
    }

    LogPas(String name, String pas) {
        this.username=name;
        this.password=pas;


    }

}
