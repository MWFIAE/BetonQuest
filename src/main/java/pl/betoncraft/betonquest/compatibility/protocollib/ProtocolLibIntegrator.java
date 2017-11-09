/**
 * BetonQuest - advanced quests for Bukkit
 * Copyright (C) 2016  Jakub "Co0sh" Sapalski
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pl.betoncraft.betonquest.compatibility.protocollib;

import pl.betoncraft.betonquest.BetonQuest;
import pl.betoncraft.betonquest.compatibility.Compatibility;
import pl.betoncraft.betonquest.compatibility.Integrator;


public class ProtocolLibIntegrator implements Integrator {
    
    private BetonQuest plugin;
    
    public ProtocolLibIntegrator() {
        plugin = BetonQuest.getInstance();
    }

    @Override
    public void hook() {
        // if Citizens is hooked, start NPCHider
        if (Compatibility.getHooked().contains("Citizens")) {
            NPCHider.start();
            plugin.registerEvents("updatevisibility", UpdateVisibilityNowEvent.class);
        }
    }

    @Override
    public void reload() {

    }

    @Override
    public void close() {

    }

}
