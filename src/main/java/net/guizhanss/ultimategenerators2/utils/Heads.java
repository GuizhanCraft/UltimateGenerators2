package net.guizhanss.ultimategenerators2.utils;

import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Heads {
    // https://minecraft-heads.com/custom-heads/head/21563-generator
    ENDLESS_GENERATOR("7f9f356f5fe7d1bc92cddfaeba3ee773ac9df1cc4d1c2f8fe5f47013032c551d"),
    DIESEL_BUCKET("5afe83692f71f05d113d891f8b838e07d7cb81419b20dc1b209eb84f771f0c9f"),
    DIESEL_GENERATOR("1ee115656bc220755c6d5bc87260c82141c253a34bc3db2bd72b727befcc0"),
    BIOMASS_BUCKET("37dbf1503bd1a27a457c509744d520eec38e3d48d8a3bfe3cade767789642f"),
    BIOFUEL_BUCKET("17c407aa7b336225309d5350e3f452bfcf355692e981d81ddfe3208bcf6ed26c"),
    MODULAR_GENERATOR_REGULATOR("db8736ff42bc68c11ede8d874b1512d29f2e8c5f6febe8f58dfcd9a0a51d6dee"),
    SOLID_STORAGE_EXPANSION("24fcc989f033947bf2b75416d4ce94a518cf7c2bdb57c43240e87d7ae2663279"),
    LIQUID_STORAGE_EXPANSION("16bcd180b1c8fc4ca39cf467c345ae83cc16b63cb255703460103a3eeba457"),
    ELECTRICITY_STORAGE_UNIT("31a3cd9b016b1228ec01fd6f0992c64f3b9b7b29773fa46439ab3f3c8a347704"),
    ADVANCED_BATTERY("f4f21cf5c234fc96db90a0a311d6fbe12f8789b7fa8155716757fd516b1811"),
    ALPHA_BATTERY("853b4ca7fe9a9e299d377ece4c037e1cd009a0b572d53c8469f0ce0ffe3ba8a2"),
    BETA_BATTERY("f216717f1da94f99be8242a931e39bbf32251dedf46cd2073ffa88969d74f963"),
    GAMMA_BATTERY("d80e2c33c4c8324452accf9235669e65f00d1926cc5331451925ca26e6aa721"),
    THERMAL_NEUTRON_REACTOR("9343ce58da54c79924a2c9331cfc417fe8ccbbea9be45a7ac85860a6c730"),
    THERMAL_NEUTRON_REACTOR_COOLANT_CELL("8c760c576a088cb29ceb26e3143b7f3c446cd6e5c50bf33151661ce636d0597e"),
    RAINBOW_ALLOY("41fe27a13c5fc17515cae695852716326b2b5df47d8d6b95a789ae38cac7b1");

    private final String texture;

    public ItemStack getItem() {
        return SlimefunUtils.getCustomHead(texture);
    }
}
