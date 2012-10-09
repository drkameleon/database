/**

Copyright (C) SYSTAP, LLC 2006-2007.  All rights reserved.

Contact:
     SYSTAP, LLC
     4501 Tower Road
     Greensboro, NC 27410
     licenses@bigdata.com

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; version 2 of the License.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
package com.bigdata.ha.msg;

import java.io.Serializable;

public class HA2PhaseCommitMessage implements IHA2PhaseCommitMessage,
        Serializable {

    private static final long serialVersionUID = 1L;

    private final boolean isJoinedService;
    private final long commitTime;

    public HA2PhaseCommitMessage(final boolean isJoinedService,
            final long commitTime) {

        this.isJoinedService = isJoinedService;
        this.commitTime = commitTime;

    }

    @Override
    public boolean isJoinedService() {
        return isJoinedService;
    }

    @Override
    public long getCommitTime() {
        return commitTime;
    }

}