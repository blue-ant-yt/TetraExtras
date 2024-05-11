package net.vinnaxy.tetraextras.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModConfig {
    public static ForgeConfigSpec.BooleanValue endersCataclysmConfig;
    public static ForgeConfigSpec.BooleanValue upgradedNetheriteConfig;
    public static ForgeConfigSpec.BooleanValue ultimeriteConfig;
    public static ForgeConfigSpec.BooleanValue quarkConfig;
    public static ForgeConfigSpec.BooleanValue majruszProgressiveDifficultyConfig;
    public static ForgeConfigSpec.BooleanValue enigmaticLegacyConfig;
    public static ForgeConfigSpec.BooleanValue aquaculture2Config;
    public static ForgeConfigSpec.BooleanValue createConfig;
    public static ForgeConfigSpec.BooleanValue mysticalConfig;
    public static ForgeConfigSpec.BooleanValue mysticaladdonsConfig;

    public static final String CATEGORY_GENERAL = "TetraExtras";
    public static final ForgeConfigSpec SPEC;

    static {
        final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.comment("Mod Settings")
                .push(CATEGORY_GENERAL);

        builder.comment("You can enable and disable Mods compatibility here",
                "since some of this mods compatible mods overlaps with some other Tetra Addons.");

        endersCataclysmConfig = createConfig(builder, "L_Enders Cataclysm [Coming Soon]", true);
        upgradedNetheriteConfig = createConfig(builder, "Upgraded Netherite [Coming Soon]", true);
        ultimeriteConfig = createConfig(builder, "Upgraded Netherite Ultimerite [Coming Soon]", true);
        quarkConfig = createConfig(builder, "Quark [Coming Soon]", true);
        majruszProgressiveDifficultyConfig = createConfig(builder, "Majrusz's Progressive Difficulty [Coming Soon]", true);
        enigmaticLegacyConfig = createConfig(builder, "Enigmatic Legacy [Coming Soon]", true);
        aquaculture2Config = createConfig(builder, "Aquaculture 2 [Coming Soon]", true);
        createConfig = createConfig(builder, "Create", false);
        mysticalConfig = createConfig(builder, "Mystical Agricilture [Coming Soon]", true);
        mysticaladdonsConfig = createConfig(builder, "Mystical Agradditions [Coming Soon]", true);

        builder.pop();

        SPEC = builder.build();
    }

    private static ForgeConfigSpec.BooleanValue createConfig(ForgeConfigSpec.Builder builder, String modName, boolean defaultValue) {
        return builder.comment("Enable or Disable compatibility with " + modName)
                .define(modName.replace(" ", ""), defaultValue);
    }
}

