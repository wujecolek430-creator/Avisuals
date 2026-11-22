package com.quarmgaming.avisuals;

import net.fabricmc.api.ClientModInitializer;

public final class Avisuals implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TrailManager.initialize();
    }
}
