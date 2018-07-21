/*
 * Copyright (C) 2017 Marc Magon
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.weblogappender;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;

/**
 * @param <C>
 * @param <A>
 * @param <F>
 * @param <E>
 * @param <J>
 *
 * @author Marc Magon
 * @since 22 Apr 2017
 */
public abstract class WebLogAppenderDiv<C extends GlobalChildren, A extends Enum & AttributeDefinitions, F extends GlobalFeatures, E extends GlobalEvents, J extends WebLogAppenderDiv<C, A, F, E, J>>
		extends Div<C, A, F, E, J>
{

	private static final long serialVersionUID = 1L;

	private final Div webLogDisplay;

	/*
	 * Constructs a new WebLogAppenderDiv
	 */
	public WebLogAppenderDiv()
	{
		setID(WebLogAppenderPageConfigurator.getWebLogDivName());
		webLogDisplay = new Div();
		webLogDisplay.setID(WebLogAppenderPageConfigurator.getWebLogDivDisplayName());
		getChildren().add(webLogDisplay);
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof WebLogAppenderDiv))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		WebLogAppenderDiv<?, ?, ?, ?, ?> that = (WebLogAppenderDiv<?, ?, ?, ?, ?>) o;

		return getWebLogDisplay() != null ? getWebLogDisplay().equals(that.getWebLogDisplay()) : that.getWebLogDisplay() == null;
	}

	public Div getWebLogDisplay()
	{
		return webLogDisplay;
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + (getWebLogDisplay() != null ? getWebLogDisplay().hashCode() : 0);
		return result;
	}
}
