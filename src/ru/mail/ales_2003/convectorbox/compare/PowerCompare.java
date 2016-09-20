
package ru.mail.ales_2003.convectorbox.compare;

import java.util.Comparator;
import ru.mail.ales_2003.convectorbox.Convector;

/**
 *
 * @author admin
 */
public class PowerCompare extends AbstractComparator{

    
    
    
    @Override
    public int compare(Convector c1, Convector c2) {
        return c1.getPower().compareTo(c2.getPower());
    }
    
}
