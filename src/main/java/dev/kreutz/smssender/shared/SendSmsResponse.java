package dev.kreutz.smssender.shared;

import java.io.Serializable;

public class SendSmsResponse  implements Serializable {
    private final boolean ok;


    public SendSmsResponse(boolean ok) {
        this.ok = ok;
    }

    public boolean isOk() {
        return ok;
    }
}
