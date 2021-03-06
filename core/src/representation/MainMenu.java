package representation;

import java.util.ArrayList;







import java.util.Arrays;

import representation.View.Screen;
import base.Serializer;

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



public class MainMenu extends View implements InputProcessor
{
	public enum Selected 
	{
	    LOGIN,REGISTER,NAME,PASSWORD,REPASSWORD,CONTINUE,NONE
	}
	
	private SpriteBatch batch;
	private StringBuilder[] texts;
	private String[] textsbuffer;
	private BitmapFont font;
	private Texture back;
	private Selected option;
	private Selected menu;
	
	public void init()
	{
		View.setUserManager(Serializer.deserialzeUserManager());
		option=Selected.NONE;
		menu=Selected.LOGIN;
		texts= new StringBuilder[5];
		textsbuffer = new String[5];
		for (int i=0;i<5;i++)
		{
			texts[i]=new StringBuilder(16);
		}
		texts[0]=texts[0].append("your username");
		texts[1]=texts[1].append("your password");
		texts[2]=texts[2].append("your password");
		
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
		
		if(menu.equals(Selected.LOGIN)) batchLogin();
		else batchRegister();
		
		batch.end();
	}	
	
	
	void batchLogin()
	{
		for(int i=0; i<2;i++)
		{
			textsbuffer[i]=texts[i].toString();
			if(textsbuffer[i].length()>16) textsbuffer[i]=texts[i].substring(0,16);
			if(i==1 && !textsbuffer[i].equals("your password")) font.draw(batch, toPassword(textsbuffer[i]), 265, screensizeY - (345+i*35));	
			else font.draw(batch, textsbuffer[i], 265, screensizeY - (345+i*35));	
		}
		font.draw(batch, texts[3].toString(), 465, screensizeY - (345));
		font.draw(batch, texts[4].toString(), 465, screensizeY - (345+1*35));
		
	}
	void batchRegister()
	{
		for(int i=0; i<3;i++)
		{
			textsbuffer[i]=texts[i].toString();
			if(textsbuffer[i].length()>16) textsbuffer[i]=texts[i].substring(0,16);
			if(i>0 && !textsbuffer[i].equals("your password")) font.draw(batch, toPassword(textsbuffer[i]), 265, screensizeY - (345+i*35));	
			else font.draw(batch, textsbuffer[i], 265, screensizeY - (345+i*35));	
		}
		font.draw(batch, texts[3].toString(), 465, screensizeY - (345));
		font.draw(batch, texts[4].toString(), 465, screensizeY - (345+1*35));
		
	}
	
	String toPassword(String text)
	{
		String passw="*";
		for(int i=1;i<text.length();i++)
		{
			passw=passw+"*";
		}
		
		return passw;
	}
	//overrides

    @Override
    public boolean keyDown(int keycode) {
 
        if(option.equals(Selected.NAME)) writeInput(texts[0],keycode);
        else if(option.equals(Selected.PASSWORD)) writeInput(texts[1],keycode);
        else if(option.equals(Selected.REPASSWORD)) writeInput(texts[2],keycode);

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

    public void refreshTexts()
    {
    	texts[4]=new StringBuilder(16);
		texts[3]=new StringBuilder(16);
		texts[0]=(new StringBuilder(16)).append("your username");
		texts[1]=(new StringBuilder(16)).append("your password");
		texts[2]=(new StringBuilder(16)).append("your password");
    }
    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
    	if(button == Buttons.LEFT){
    		int X=screenX;
			int Y=screenY;

			if(X<262 && X>169 && Y<282 && Y>250)
			{
				refreshTexts();
				menu=Selected.REGISTER;
				back=new Texture(Gdx.files.internal("backregister.png"));
			}
			else if(X<262 && X>169 && Y<250 && Y>214)
			{
				refreshTexts();
				menu=Selected.LOGIN;
				back=new Texture(Gdx.files.internal("backlogin.png"));
			}
			else if(X<355 && X>261 && Y<511 && Y>491)
			{
				option=Selected.CONTINUE;
				texts[4]=new StringBuilder(16);
				texts[3]=new StringBuilder(16);
				if(menu.equals(Selected.LOGIN))
				{
					//TODO login action
					int login=View.getUserManager().loginUser(texts[0].toString(),texts[1].toString());
					if (login==0) 
					{
						View.setView(Screen.USERMENU);
						return true;
					}
					else if(login==1) texts[4]=(new StringBuilder(16)).append("Wrong password");
					else if(login==2) texts[3]=(new StringBuilder(16)).append("There is no user with that name");
				}
				else
				{
					int register=View.getUserManager().createUser(texts[0].toString(),texts[1].toString(),texts[2].toString());
					if (register==0) 
					{
						texts[3]=(new StringBuilder(16)).append("Registration successful");
						return true;
					}
					else if(register==1) texts[4]=(new StringBuilder(16)).append("Given passwords don't match");
					else if(register==2) texts[3]=(new StringBuilder(16)).append("This username already exists");
				}
			}
			else if(X>262 && X<400 && Y<369 && Y>334)
			{
				option=Selected.NAME;
			}
			else if(X>262 && X<400 && Y<408 && Y>369)
			{
				option=Selected.PASSWORD;
			}
			else if(X>262 && X<400 && Y<455 && Y>408 && menu.equals(Selected.REGISTER))
			{
				option=Selected.REPASSWORD;
			}
			else 
			{
				option=Selected.NONE;
			}
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
	

