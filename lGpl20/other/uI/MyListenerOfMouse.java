package lGpl20.other.uI;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;

import lGpl20.o.O;
import lGpl20.prime64.thr.Thrva;

/**
 * 我的滑鼠監聽人.<br/>
 * <br/>
 * My MouseListener.
 * 
 * @version 2019/05/02_12:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyListenerOfMouse" >MyListenerOfMouse.
 *          java</a>
 * 
 */
public class MyListenerOfMouse implements MouseListener, Serializable {

	private static final Class<MyListenerOfMouse> CLASS_THIS = MyListenerOfMouse.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public MyListenerOfMouse(MyComponenter myClubOfComponent) {

	}

	@Override
	public void mouseClicked(MouseEvent mouseEvent) {
	}

	@Override
	public void mousePressed(MouseEvent mouseEvent) {
	}

	@Override
	public void mouseReleased(MouseEvent mouseEvent) {

		Object source = mouseEvent.getSource();
		int numOfMouseButton = mouseEvent.getButton();

		if (numOfMouseButton == 1) {

			// O.l("mouseEvent.getModifiers()=" + mouseEvent.getModifiers() + O.S32 + CLASS_THIS);
			actByMouse((Component) source);

		} else if (numOfMouseButton == 3) {

		}

	}

	@Override
	public void mouseEntered(MouseEvent mouseEvent) {
	}

	@Override
	public void mouseExited(MouseEvent mouseEvent) {
	}

	/**
	 * To act by mouse.<br/>
	 * To act by mouse.
	 */
	@SuppressWarnings("deprecation")
	protected void actByMouse(Component component) {

		if (component == MyComponenter.buttonMP0) {

			// synchronized (KEY_TO_SYN) {

			if (MyComponenter.buttonMP0.isEnabled()) {

				if (MyAide.myThrToSaveMP.isAlive()) {

					O.l("MyAide.myThrToSaveMP=" + MyAide.myThrToSaveMP + O.S32 + CLASS_THIS);
					return;

				}

				MyAide.doMinePrime();

			}

			return;

			// }

		}

		if (component == MyComponenter.buttonRP0) {

			if (MyComponenter.buttonRP0.isEnabled()) {

				if (MyAide.myThrToSaveRP.isAlive()) {

					O.l("MyAide.myThrToSaveRP=" + MyAide.myThrToSaveRP + O.S32 + CLASS_THIS);
					return;

				}

				MyAide.doMarkPrime();

			}

			return;

		}

		// O.l("sourceObj=" + sourceObj + O.S32 + CLASS_THIS);

		if (component == MyComponenter.buttonMP1 || component == MyComponenter.buttonRP1) {

			MyAide.stopNClear(component);
			return;

		}

		if (component == MyComponenter.buttonMP3) {

			if (MyDesktopPaneToConf.CHECK_BOX_TO_REPEAT_MP_RP.isSelected()) {

				O.l("do not save when to repeat" + O.S32 + CLASS_THIS);
				return;

			}

			if (MyAide.moonMP.otherThr.isAlive()) {

				O.l("do not save when MyAide.moonMP.otherThr isAlive()" + O.S32 + CLASS_THIS);
				return;

			}

			if (MyAide.myThrToSaveMP.isAlive()) {

				O.l("do not save when MyAide.myThrToSaveMP isAlive()" + O.S32 + CLASS_THIS);
				return;

			}

			MyComponenter.buttonMP3.setEnabled(false);
			MyAide.doSave(MyAide.NUM_MP_3);

			return;

		}

		if (component == MyComponenter.buttonMP4) {

			if (!MyComponenter.buttonMP3.isEnabled()) {

				MyAide.myThrToSaveMP.stop();

				MyComponenter.buttonMP3.setText(MyAide.TEXT_TO_SAVE);
				MyComponenter.buttonMP3.setEnabled(true);

			}

			return;

		}

		if (component == MyComponenter.buttonRP3) {

			if (MyDesktopPaneToConf.CHECK_BOX_TO_REPEAT_MP_RP.isSelected()) {

				O.l("do not save when to repeat" + O.S32 + CLASS_THIS);
				return;

			}

			if (Thrva.headAlive(MyAide.fanOfMarker) != null) {

				O.l("do not save when MyAide.fanOfMarker isAlive()" + O.S32 + CLASS_THIS);

				return;

			}

			if (MyAide.myThrToSaveRP.isAlive()) {

				O.l("do not save when MyAide.myThrToSaveRP isAlive()" + O.S32 + CLASS_THIS);
				return;

			}

			MyComponenter.buttonRP3.setEnabled(false);
			MyAide.doSave(MyAide.NUM_RP_3);

			return;

		}

		if (component == MyComponenter.buttonRP4) {

			if (!MyComponenter.buttonRP3.isEnabled()) {

				MyAide.myThrToSaveRP.stop();

				MyComponenter.buttonRP3.setText(MyAide.TEXT_TO_SAVE);
				MyComponenter.buttonRP3.setEnabled(true);

			}

			return;

		}

		if (component == MyComponenter.buttonTemp1) {

			MyDesktopPaneToConf.IN_FRAME.setLocation(0, 0);// fuck

			return;

		}

		if (component == MyComponenter.textFieldMP5) {

			MyComponenter.tabbedPane.setSelectedIndex(0);

			return;

		}

		if (component == MyComponenter.textFieldRP5) {

			// O.l("sourceObj=" + sourceObj + O.S32 + CLASS_THIS);
			MyComponenter.tabbedPane.setSelectedIndex(1);

			return;

		}

		if (component == MyComponenter.textFieldTemp5) {

			MyComponenter.tabbedPane.setSelectedIndex(2);

			return;

		}

		if (component == MyComponenter.textFieldConf5) {

			MyComponenter.tabbedPane.setSelectedIndex(3);

			return;

		}

		if (component == MyComponenter.textFieldRec5) {

			MyComponenter.tabbedPane.setSelectedIndex(4);

			return;

		}

	}

}
