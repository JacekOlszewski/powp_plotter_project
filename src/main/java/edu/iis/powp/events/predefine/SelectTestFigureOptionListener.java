package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.kis.powp.drawer.panel.DrawPanelController;

public class SelectTestFigureOptionListener implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
    	DrawPanelController controller = Application.getComponent(DrawPanelController.class);
    	System.out.println(e.getActionCommand().toString());
    	if(e.getActionCommand().toString().equals("Figure Joe 1")) {
    	    controller.clearPanel();
    		FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	} else {
    		controller.clearPanel();
    		FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	}
    }
}
