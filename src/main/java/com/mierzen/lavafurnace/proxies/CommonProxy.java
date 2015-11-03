package com.mierzen.lavafurnace.proxies;

import com.mierzen.lavafurnace.ModBlocks;
import com.mierzen.lavafurnace.ModCrafting;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent e)
    {
        ModBlocks.init();
    }

    public void init(FMLInitializationEvent e)
    {
        ModCrafting.init();
    }

    public void postInit(FMLPostInitializationEvent e)
    {

    }
}
