package dresscode.app.desktop;


import representation.Graphics;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;


public class DesktopLauncher {
   public static void main(String[] args) {
      LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
      config.title = "DressCode";
      config.width = 1300;
      config.height = 680;
      config.resizable = true;
      config.x=30;
      config.y=10;
      new LwjglApplication(new Graphics(), config);
   }
}
