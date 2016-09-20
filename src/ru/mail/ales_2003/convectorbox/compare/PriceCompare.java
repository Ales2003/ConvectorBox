/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mail.ales_2003.convectorbox.compare;

import java.util.Comparator;
import ru.mail.ales_2003.convectorbox.Convector;

/**
 *
 * @author admin
 */
public class PriceCompare extends AbstractComparator {

    @Override
    public int compare(Convector c1, Convector c2) {
        return c1.getPrice().compareTo(c2.getPrice());
    }

}
