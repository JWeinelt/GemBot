package de.justcody.gembot.tickets;

import java.awt.*;

public enum TicketStatus {
    OPENED(new Color(255, 145, 0)),
    WAITING(new Color(255, 242, 0)),
    ANSWERED(new Color(34, 253, 0)),
    CLOSED(new Color(255, 0, 0)),
    DELETED(new Color(73, 73, 73));

    public final Color color;


    TicketStatus(Color color) {
        this.color = color;
    }
}
