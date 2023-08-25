/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Raahi;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/**
 *
 * @author raahi
 */
public class PurchaseMedicinePrintable implements Printable {
    
    private final Component componentToPrint;
    
    public PurchaseMedicinePrintable(Component componentToPrint) {
        this.componentToPrint = componentToPrint;
    }
    
    @Override
    public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return Printable.NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
        componentToPrint.paint(g2d);
        
        return Printable.PAGE_EXISTS;
    }
}

