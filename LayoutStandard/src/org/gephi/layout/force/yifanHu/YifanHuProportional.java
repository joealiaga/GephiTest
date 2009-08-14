/*
Copyright 2008-2009 Gephi
Authors : Helder Suzuki <heldersuzuki@gephi.org>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.layout.force.yifanHu;

import javax.swing.Icon;
import org.gephi.layout.api.LayoutBuilder;
import org.gephi.layout.force.ProportionalDisplacement;
import org.openide.util.NbBundle;

/**
 *
 * @author Helder Suzuki <heldersuzuki@gephi.org>
 */
public class YifanHuProportional implements LayoutBuilder {

    public YifanHuLayout buildLayout() {
        YifanHuLayout layout = new YifanHuLayout(this, new ProportionalDisplacement(1f));
        return layout;
    }

    public String getName() {
        return NbBundle.getMessage(YifanHu.class, "YifanHuProportional_name");
    }

    public String getDescription() {
        return NbBundle.getMessage(YifanHu.class, "YifanHuProportional_description");
    }

    public Icon getIcon() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}