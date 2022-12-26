import GLOOP.*;
public class Game {
    GLKamera cam;
    GLHimmel sky;
    GLTastatur kb;
    GLLicht light;
    Guns pistol;
    public void run(){
        cam = new GLEntwicklerkamera();
        sky = new GLHimmel("src/sky.png");
        light = new GLLicht();
        kb = new GLTastatur();
        pistol = new Guns();
        pistol.pistol(0, 0, 0, "flashlight");

        while(!kb.esc()){
            Sys.warte();
        }
    }
}
