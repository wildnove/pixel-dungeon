/*
 * Pixel Dungeon
 * Copyright (C) 2014 Wildnove (extending Oleg Dolya's work)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.watabou.pixeldungeon.items.food;

import com.watabou.pixeldungeon.actors.buffs.Hunger;
import com.watabou.pixeldungeon.sprites.ItemSpriteSheet;

public class ChickenLeg extends Food {

	{
		name = "chicken leg";
		image = ItemSpriteSheet.CHICKENLEG;
		energy = Hunger.STARVING;
	}
	
	@Override
	public String info() {
		return "This is famous Dungeon Fried Chicken's leg. Spicy!";
	}
	
}
