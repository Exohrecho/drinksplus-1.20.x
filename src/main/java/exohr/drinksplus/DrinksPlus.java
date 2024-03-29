package exohr.drinksplus;

import exohr.drinksplus.block.ModBlocks;
import exohr.drinksplus.item.ModItems;
import exohr.drinksplus.item.ModItemsGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DrinksPlus implements ModInitializer {

    public static final String MOD_ID = "drinksplus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}