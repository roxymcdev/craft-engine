package net.momirealms.craftengine.core.world;

public record WorldVec3d(World world, double x, double y, double z) implements Position {
    public WorldVec3d(WorldPosition position) {
        this(position.world(), position);
    }

    public WorldVec3d(World world, Position position) {
        this(world, position.x(), position.y(), position.z());
    }
}
