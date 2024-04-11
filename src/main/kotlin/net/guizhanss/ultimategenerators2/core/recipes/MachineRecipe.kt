package net.guizhanss.ultimategenerators2.core.recipes

import org.bukkit.inventory.ItemStack
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe as SfMachineRecipe

/**
 * Represents a recipe for a machine.
 */
open class MachineRecipe(
    val ticks: Int,
    val input: Array<ItemStack>,
    val output: Array<ItemStack>,
) {
    fun toSf() = SfMachineRecipe(ticks / 2, input, output)
}
