package representation;

import java.util.LinkedList;
import java.util.List;


public abstract class View {

	public enum Screen {
	    MAINMENU, USERMENU, GAMEPLAY, ENDGAME,
	    CREDITS, RULES,END}
	
	private static Screen view = Screen.MAINMENU;
	final static int screensizeX=1300; 
	final static int screensizeY=680; 
	
	public void init(){}
	public void batch(){}
	
	public static Screen setView(Screen _view)
	{
		view = _view;
		return view;
	}
	
	public static Screen getView()
	{
		return view;
	}
	
}
