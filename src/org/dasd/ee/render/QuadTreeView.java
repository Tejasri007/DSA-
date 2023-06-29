package org.dasd.ee.render;

import org.dasd.ee.algorithms.QuadTree;
import org.dasd.ee.tests.Test;
import org.dasd.ee.tests.TestSettings;

import java.awt.*;
import java.util.Set;

/**
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * <p>
 * Written By: brandon on 10/12/16
 */
public class QuadTreeView extends RenderView<QuadTree> {

	private static final String title = "Quad Tree";

	public QuadTreeView(Test test, TestSettings settings) {
		super(test, settings, title);
	}


	@Override
	protected QuadTree getAlgorithm(Integer width, Integer height) {
		return new QuadTree(width, height);
	}


	@Override
	protected void render(Graphics2D g, TestSettings settings, QuadTree algorithm, Set<Rectangle> allBoxes, Rectangle testBox) {
		g.setColor(Color.GRAY);
		algorithm.getInnerBoxes().forEach(g::draw);
	}


}
