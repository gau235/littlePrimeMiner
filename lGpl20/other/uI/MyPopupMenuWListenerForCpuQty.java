package lGpl20.other.uI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

import lGpl20.o.O;

/**
 * 本類 PopupMenu.<br/>
 * <br/>
 * My PopupMenu.
 * 
 * @version 2019/04/20_18:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyPopupMenuWListenerForCpuQty" >
 *          MyPopupMenuWListenerForCpuQty.java</a>
 * 
 */
public class MyPopupMenuWListenerForCpuQty extends JPopupMenu
		implements MouseListener, /* PopupMenuListener, */ActionListener, Serializable {

	private static final Class<MyPopupMenuWListenerForCpuQty> CLASS_THIS = MyPopupMenuWListenerForCpuQty.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	protected /* static final */ JMenuItem MENU_ITEM = new JMenuItem("Cores");

	private final ButtonGroup BUTTON_GROUP = new ButtonGroup();

	private final JButton BUTTON;

	/**
	 * My PopupMenu.<br/>
	 * Constructor.
	 */
	public MyPopupMenuWListenerForCpuQty(JButton theButton) {

		BUTTON = theButton;

		MENU_ITEM.setBackground(MyComponenter.COLOR_BACKGROUND);
		// MENU_ITEM.setOpaque(true);
		MENU_ITEM.setFont(MyComponenter.dynaFontDialog_1_40);

		add(MENU_ITEM);
		addSeparator();

		int value;
		String sValue;
		for (int i = 0, defI = O.ARY32_OF_QTY_OF_CPU.length >>> 1; i != O.ARY32_OF_QTY_OF_CPU.length; i++) {

			value = O.ARY32_OF_QTY_OF_CPU[i];
			sValue = Integer.toString(value);

			JRadioButtonMenuItem radioButtonMenuItem = new JRadioButtonMenuItem(sValue);
			radioButtonMenuItem.addActionListener(this);
			radioButtonMenuItem.setFont(MyComponenter.dynaFontDialog_1_40);
			radioButtonMenuItem.setBackground(MyComponenter.COLOR_BACKGROUND);

			add(radioButtonMenuItem);
			BUTTON_GROUP.add(radioButtonMenuItem);

			if (i == defI) {

				radioButtonMenuItem.setSelected(true);// init
				theButton.setText(Integer.toString(value));// init

			}

		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

		if (e.getButton() == 3 && BUTTON.isEnabled()) {

			show(e.getComponent(), e.getX(), e.getY());

		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object objForSource = e.getSource();

		if (objForSource instanceof JRadioButtonMenuItem) {

			if (BUTTON.isEnabled()) {

				JRadioButtonMenuItem radioButtonMenuItem = (JRadioButtonMenuItem) objForSource;

				if (radioButtonMenuItem.isSelected()) {

					String sValue = radioButtonMenuItem.getSelectedObjects()[0].toString();
					BUTTON.setText(sValue);// cores

				}

			}

		}

	}

}