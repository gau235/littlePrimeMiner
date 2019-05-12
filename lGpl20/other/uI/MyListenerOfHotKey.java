package lGpl20.other.uI;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.Serializable;
import java.util.TreeMap;

import javax.swing.JTextField;

import lGpl20.o.O;

/**
 * 本類別熱鍵聽人.<br/>
 * <br/>
 * The class for hot keys.
 * 
 * @version 2017/05/19_10:48:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyListenerOfHotKey" >MyListenerOfHotKey
 *          .java</a>
 * 
 */
public class MyListenerOfHotKey implements KeyListener, Serializable {

	private static final Class<MyListenerOfHotKey> CLASS_THIS = MyListenerOfHotKey.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	protected final TreeMap<Long, JTextField> MAP_OF_TEXT_FIELD;

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public MyListenerOfHotKey(MyComponenter myClubOfComponent) {

		MAP_OF_TEXT_FIELD = myClubOfComponent.MAP_OF_TEXT_FIELD;

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent keyEvent) {

		final Object source = keyEvent.getSource();
		final int keyCode = keyEvent.getKeyCode();
		final int selectedIndex = MyComponenter.tabbedPane.getSelectedIndex();

		O.l("selectedIndex=" + selectedIndex + O.S32 + "keyCode=" + keyCode + O.S32 + CLASS_THIS);

		final long textFieldIndex1 = selectedIndex * MyAide.NUM_STEP;// must use long
		final long textFieldIndex2 = textFieldIndex1 + 1L;

		if (keyCode == KeyEvent.VK_DOWN || keyCode == KeyEvent.VK_UP) {

			if (selectedIndex == 5) {

				// return;

			}

			if (source == MAP_OF_TEXT_FIELD.get(textFieldIndex1)) {

				MAP_OF_TEXT_FIELD.get(textFieldIndex2).selectAll();
				MAP_OF_TEXT_FIELD.get(textFieldIndex2).requestFocusInWindow();

				return;

			}

			if (source == MAP_OF_TEXT_FIELD.get(textFieldIndex2)) {

				MAP_OF_TEXT_FIELD.get(textFieldIndex1).selectAll();
				MAP_OF_TEXT_FIELD.get(textFieldIndex1).requestFocusInWindow();

				return;

			}

		}

		if (keyCode == KeyEvent.VK_ENTER) {

			O.l("textFieldIndex1=" + textFieldIndex1 + O.S32 + CLASS_THIS);

			int i = 0;

			if (selectedIndex == i++ && source != MyComponenter.buttonMP1) {

				// synchronized (KEY_TO_SYN) {

				if (MyComponenter.buttonMP0.isEnabled()) {

					MyAide.doMinePrime();

				}

				return;

				// }

			}

			if (selectedIndex == i++ && source != MyComponenter.buttonRP1) {

				// synchronized (KEY_TO_SYN) {

				if (MyComponenter.buttonRP0.isEnabled()) {

					MyAide.doMarkPrime();

				}

				return;

				// }

			}

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
