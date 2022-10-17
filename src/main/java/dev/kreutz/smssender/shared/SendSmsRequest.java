package dev.kreutz.smssender.shared;

import java.io.Serializable;

public class SendSmsRequest  implements Serializable {
    private final String number;

    public SendSmsRequest(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
