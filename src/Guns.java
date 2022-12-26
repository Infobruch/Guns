import GLOOP.*;
public class Guns {
    GLKegelstumpf barrel, ironsightL, ironsightR, redDot;
    GLQuader handle;
    GLVektor v3Centre;


    public void pistol(double x, double y, double z, String attachments){
        v3Centre = new GLVektor(x, y, z);
        barrel = new GLKegelstumpf(0, 0, 0, 2.5, 2.5, 20);
        barrel.drehe(0, 180, 0);
        barrel.setzePosition(v3Centre.x, v3Centre.y, v3Centre.z - 7.5);
        barrel.setzeFarbe(0, 1, 1);

        handle = new GLQuader(0, 0, 0, 2.5, 7.5, 5);
        handle.drehe(-20, 0, 0);
        handle.setzePosition(v3Centre.x, v3Centre.y - 4, v3Centre.z);
        handle.setzeFarbe(1, 0, 0);

        ironsightL = new GLKegelstumpf(0, 0, 0, 0.5, 0.5, 1);
        ironsightL.setzePosition(v3Centre.x - 0.75, v3Centre.y + 2.5, v3Centre.z);
        ironsightL.setzeFarbe(0, 0, 1);

        ironsightR = new GLKegelstumpf(0, 0, 0, 0.5, 0.5, 1);
        ironsightR.setzePosition(v3Centre.x + 0.75, v3Centre.y + 2.5, v3Centre.z);
        ironsightR.setzeFarbe(0, 0, 1);

        redDot = new GLKegelstumpf(0, 0, 0, 0.25, 0.25, 1);
        redDot.setzePosition(v3Centre.x, v3Centre.y + 2.5, v3Centre.z - 16);
        redDot.setzeFarbe(1, 0, 0);

        switch (attachments){
            case "flashlight":
                flashlight(v3Centre.x, v3Centre.y - 2.5, v3Centre.z - 17.25);
        }

    }

    GLKegelstumpf light, casing;
    GLVektor v3FlashlightAttach;
    public void flashlight(double x, double y, double z){
        v3FlashlightAttach = new GLVektor(x, y, z);
        light = new GLKegelstumpf(0, 0, 0, 1.5, 1.5, 4);
        light.setzePosition(v3FlashlightAttach.x, v3FlashlightAttach.y - 1.4, v3FlashlightAttach.z + 2.5);
        light.setzeFarbe(1, 1, 1);
        light.setzeSelbstleuchten(1, 1, 1);

        casing = new GLKegelstumpf(0, 0, 0, 1.6, 1.6, 5);
        casing.setzePosition(v3FlashlightAttach.x, v3FlashlightAttach.y - 1.4, v3FlashlightAttach.z + 3.1);
        casing.setzeFarbe(0, 0, 0);
        casing.setzeGlanz(0, 0, 0, 1);
    }
}
