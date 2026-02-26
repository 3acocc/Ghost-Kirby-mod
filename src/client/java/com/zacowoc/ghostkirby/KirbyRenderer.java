package com.zacowoc.ghostkirby;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.client.renderer.entity.state.ArmedEntityRenderState;
import net.minecraft.client.renderer.item.ItemModelResolver;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Mob;

public class KirbyRenderer extends MobRenderer<Mob, KirbyRenderState, kirby> {

    private final ItemModelResolver itemModelResolver;

    public KirbyRenderer(EntityRendererProvider.Context context) {
        super(context, new kirby(kirby.createBodyLayer().bakeRoot()), 0.5f);
        this.itemModelResolver = context.getItemModelResolver();
        this.addLayer(new ItemInHandLayer<>(this));
    }

    @Override
    public KirbyRenderState createRenderState() {
        return new KirbyRenderState();
    }

    @Override
    public void extractRenderState(Mob entity, KirbyRenderState state, float partialTicks) {
        super.extractRenderState(entity, state, partialTicks);
        ArmedEntityRenderState.extractArmedEntityRenderState(entity, state, this.itemModelResolver);
        state.isHoldingItem = !entity.getMainHandItem().isEmpty();
    }

    @Override
    public ResourceLocation getTextureLocation(KirbyRenderState state) {
        return ResourceLocation.parse("modid:textures/entity/kirby.png");
    }
}