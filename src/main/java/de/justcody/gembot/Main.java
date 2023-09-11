package de.justcody.gembot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.util.Arrays;
import java.util.logging.Logger;

public class Main {
    private static Logger logger;
    private static JDA jda;
    private static final String token = "";

    public static void main(String[] args) {
        // Startup process
        logger = Logger.getLogger("GemBot");

        JDABuilder builder = JDABuilder.create(token, Arrays.asList(GatewayIntent.values()));
        jda = builder.build();
    }



    // Logger Utilities
    /**
    Prints info message in the logger.
     @param message Message to print
     */
    public static void info(Object message) {
        logger.info(message.toString());
    }


    public static void warn(Object message) {
        logger.warning(message.toString());
    }


    public static void err(Object message) {
        logger.severe(message.toString());
    }


}
