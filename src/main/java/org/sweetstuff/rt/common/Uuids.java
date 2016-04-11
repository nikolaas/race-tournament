package org.sweetstuff.rt.common;

import java.util.UUID;

/**
 *
 * @author stupak
 */
public final class Uuids {

    private Uuids() {
    }
    
    public static String newId() {
        return UUID.randomUUID().toString();
    }
}
