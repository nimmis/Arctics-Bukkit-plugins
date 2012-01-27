package me.nimmis.ArcAccess;

import org.bukkit.plugin.java.JavaPlugin;

public class ArcAccess extends JavaPlugin {
	public void onDisable() {
        // TODO: Place any custom disable code here

        // NOTE: All registered events are automatically unregistered when a plugin is disabled

        // EXAMPLE: Custom code, here we just output some info so we can check all is well
        System.out.println("ArcAccess Disabled");
    }
	public void onEnable() {
        // TODO: Place any custom enable code here including the registration of any events

        // Register our events
		System.out.println("ArcAccess Enabled");
		
	}
		
}
