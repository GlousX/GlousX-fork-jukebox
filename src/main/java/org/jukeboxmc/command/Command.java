package org.jukeboxmc.command;

import lombok.Getter;
import lombok.ToString;
import org.jukeboxmc.command.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kaooot
 * @version 1.0
 */
@Getter
@ToString
public abstract class Command {

    private String name = "";
    private String description = "";
    private String permission = "";
    private String permissionMessage = "";
    private boolean showNoPermissionMessage = true;

    private final List<String> aliases = new ArrayList<>();

    public Command() {
        Class<?> clazz = this.getClass();

        if ( clazz.isAnnotationPresent( Name.class ) ) {
            this.name = clazz.getAnnotation( Name.class ).value();
        }

        if ( clazz.isAnnotationPresent( Description.class ) ) {
            this.description = clazz.getAnnotation( Description.class ).value();
        }

        if ( clazz.isAnnotationPresent( Permission.class ) ) {
            this.permission = clazz.getAnnotation( Permission.class ).value();
            this.showNoPermissionMessage = clazz.getAnnotation( Permission.class ).showNoPermissionMessage();
        }

        if ( clazz.isAnnotationPresent( Aliases.class ) ) {
            Alias[] aliases = clazz.getAnnotation( Aliases.class ).value();

            for ( Alias alias : aliases ) {
                this.aliases.add( alias.value() );
            }
        } else {
            if ( clazz.isAnnotationPresent( Alias.class ) ) {
                this.aliases.add( clazz.getAnnotation( Alias.class ).value() );
            }
        }

        if ( clazz.isAnnotationPresent( PermissionMessage.class ) ) {
            this.permissionMessage = clazz.getAnnotation( PermissionMessage.class ).value();
        }
    }

    /**
     * This method can be used to define code which is essential for the execution of this {@link Command}
     *
     * @param commandSender who executed the command
     * @param alias         which was used by the {@link CommandSender} to execute this {@link Command}
     * @param arguments     which were given by the {@link CommandSender}
     *
     * @return a fresh {@link CommandOutput} which has been generated by the execution
     */
    public abstract void execute( CommandSender commandSender, String command, String[] args );
}