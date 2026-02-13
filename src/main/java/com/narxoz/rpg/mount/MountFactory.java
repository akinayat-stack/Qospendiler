package com.narxoz.rpg.mount;

public class MountFactory {
    public Mount createDefaultMount(String name) {
        return new Mount(name, 60, 70, 100, 50); 
    }

    public Mount createWarMount(String name) {
        return new Mount(name, 80, 90, 120, 70);
    }
}