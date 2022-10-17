package dev.kreutz.smssender.shared;

import java.io.Serializable;

public class NameResponse implements Serializable {
    private final String name;

    public NameResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
