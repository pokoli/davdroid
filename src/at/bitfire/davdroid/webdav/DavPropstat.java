/*******************************************************************************
 * Copyright (c) 2014 Ricki Hirner (bitfire web engineering).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/
package at.bitfire.davdroid.webdav;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict=false,name="propstat")
public class DavPropstat {
	@Element
	DavProp prop;
	
	@Element
	String status;
}
