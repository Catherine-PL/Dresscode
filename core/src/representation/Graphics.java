package representation;

import com.badlogic.gdx.ApplicationAdapter;


public class Graphics  extends ApplicationAdapter {
	
	private MainMenu mainMenu = new MainMenu();
	private UserMenu userMenu = new UserMenu();
	
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
			        break;
				case USERMENU:
					userMenu.batch();
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
