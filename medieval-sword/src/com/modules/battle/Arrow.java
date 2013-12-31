package com.modules.battle;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.game.Assets;
import com.game.Constants;
import com.races.humans.units.Archer;

/**
 * Create new arrow and add it to stage
 */
public class Arrow extends Image {
	
	public Arrow( float x_position, float y_position, int orientation, Stage stage ) {
		this.x = x_position;
		this.y = y_position + Archer.HEIGHT / 2;
		this.stage = stage;

		if( orientation == Constants.RIGHT )
			this.setRegion( Assets.getTextureRegion( "arrow" + Constants.RIGHT ) );
		else
			this.setRegion( Assets.getTextureRegion( "arrow" + Constants.LEFT ) );
		
		this.width = 20;
		this.height = 3;
		
		this.stage.addActor( this );
	}
	
	public void remove() {
		stage.removeActor( this );
	}
}
