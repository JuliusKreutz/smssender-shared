package dev.kreutz.smssender.shared;

import java.io.Serializable;

public class SetTextRequest implements Serializable {
    private final String text;

    public SetTextRequest(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
