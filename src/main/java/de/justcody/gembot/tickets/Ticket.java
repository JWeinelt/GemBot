package de.justcody.gembot.tickets;


import net.dv8tion.jda.api.entities.Member;

import java.util.Date;

public class Ticket {
    private long opener;
    private long handler;
    private String id; // UUID

    private String title;
    private String description;

    private Date opened;
    private Date closed;

    private TicketStatus status;
    private TicketType type;

    // Applications
    private String applicationText;



    // Discord Management
    private long channel;
    private long voiceChannel;
    private boolean voiceRequested;
    private long messageID;
}
