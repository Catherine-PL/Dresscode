package representation;

import java.util.ArrayList;

import representation.View.Screen;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;




public class Graphics  extends ApplicationAdapter {
	
	private MainMenu mainMenu = new MainMenu();
	
	

	@Override
	public void create () {
		mainMenu.init();

		
		
	}

	@Override
	public void render () 
	{	
			switch(View.getView())
			{
				case MAINMENU:
					mainMenu.batch();
					//newGameMenu.init();
			        break;
				case END:
					System.exit(0);
			}
		
	}

	
//TODO na razie mnie to nie interesuje	
	public void dispose() {
	      // dispose of all the native resources
		
	   }

	   @Override
	   public void resize(int width, int height) {
	   }

	   @Override
	   public void pause() {
	   }

	   @Override
	   public void resume() {
	   }
	}
