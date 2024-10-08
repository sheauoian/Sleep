package com.github.sheauoian.croissantsys.pve

import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageByEntityEvent

class DamageListener: Listener {
    @EventHandler
    fun onDamage(e: EntityDamageByEntityEvent) {
        if (e.entity is Player) {
            if (e.damager is Player) {
                // PvP の禁止
                e.isCancelled = true
                return
            }
            e.damage = 0.0
        }
        else if (e.damager is Player) {

        }
    }
}