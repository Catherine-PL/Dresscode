package representation;

import java.util.ArrayList;
import java.util.Arrays;

import representation.View.Screen;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Input;



public class UserMenu extends View implements InputProcessor
{
	public enum Selected 
	{
	    LOGIN,REGISTER,NAME,PASSWORD,REPASSWORD,CONTINUE,NONE
	}
	
	private SpriteBatch batch;
	private BitmapFont font;
	private Texture back;
	private Selected option;
	private Selected menu;
	
	public void init()
	{
		option=Selected.NONE;
		menu=Selected.LOGIN;
		
		batch= new SpriteBatch();
		font = new BitmapFont();
		font.setColor(Color.BLACK);
		back=new Texture(Gdx.files.internal("backlogin.png"));
	}
	
	public void batch()
	{
		Gdx.input.setInputProcessor(this);
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(back, 0, 0);		
		
		//TODO
		
		batch.end();
	}	
	
	//overrides

    @Override
    public boolean keyDown(int keycode) {
 
  

        return false;
         
    }
    
    void writeInput(StringBuilder field,int keycode)
    {
    	if ((field.toString().equals("your password")) || (field.toString().equals("your username"))) field.delete(0, field.length());
    	if ((keycode==Keys.BACKSPACE ) && (field.length()>0)) field.deleteCharAt(field.length()-1);
		else if ((keycode==Keys.SPACE ) && (field.length()>0)) field.append(" ");
		else if(keycode!=Keys.BACKSPACE) field.append(Input.Keys.toString(keycode).toLowerCase());
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

 
    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
    	if(button == Buttons.LEFT){
    		int X=screenX;
			int Y=screenY;

    	}
    	return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
	

