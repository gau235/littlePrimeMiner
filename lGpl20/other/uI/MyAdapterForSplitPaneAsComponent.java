package lGpl20.other.uI;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.Serializable;

import javax.swing.JSplitPane;

import lGpl20.o.O;

/**
 * The Adapter for swing Component (JSplitPane).<br/>
 * <br/>
 * The Adapter for swing Component (JSplitPane).
 * 
 * @version 2017/04/12_12:15:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyAdapterForSplitPaneAsComponent" >
 *          MyAdapterForSplitPaneAsComponent.java</a>
 * 
 */
public class MyAdapterForSplitPaneAsComponent extends ComponentAdapter implements Serializable {

	private static final Class<MyAdapterForSplitPaneAsComponent> CLASS_THIS = MyAdapterForSplitPaneAsComponent.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	protected final JSplitPane SPLIT_PANE;

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public MyAdapterForSplitPaneAsComponent(JSplitPane splitPane) {

		this.SPLIT_PANE = splitPane;

	}

	@Override
	public void componentHidden(ComponentEvent componentEvent) {

		if (SPLIT_PANE.isShowing()) {

			if (O.IS_TO_DEV) {

				O.l("componentHidden" + O.S32 + CLASS_THIS);

			}

		}

	}

	@Override
	public void componentMoved(ComponentEvent componentEvent) {

		if (SPLIT_PANE.isShowing()) {

			if (O.IS_TO_DEV) {

				O.l("componentMoved" + O.S32 + CLASS_THIS);

			}

		}

	}

	@Override
	public void componentResized(ComponentEvent componentEvent) {

		if (SPLIT_PANE.isShowing()) {

			if (O.IS_TO_DEV) {

				O.l("componentResized" + O.S32 + CLASS_THIS);

			}

			// O.l("DEF_W=" + MyDesktopPaneForInFrame.DEF_W + O.S32 + CLASS_THIS);

			// O.l("SPLIT_PANE.getLastDividerLocation()=" + SPLIT_PANE.getLastDividerLocation() + O.S32
			// + CLASS_THIS);
			//
			// if (SPLIT_PANE.getLastDividerLocation() < 0) { // not expanded
			//
			// SPLIT_PANE.setDividerLocation(MyDesktopPaneForInFrame.DEF_W);
			//
			// }

			// if (SPLIT_PANE.getLastDividerLocation() > MyDesktopPaneForInFrame.DEF_W) { // not expanded
			//
			// SPLIT_PANE.setDividerLocation(MyDesktopPaneForInFrame.DEF_W);
			// O.l("SPLIT_PANE.setDividerLocation=" + MyDesktopPaneForInFrame.DEF_W + O.S32
			// + CLASS_THIS);
			//
			// }

		}

	}

	@Override
	public void componentShown(ComponentEvent componentEvent) {

		if (SPLIT_PANE.isShowing()) {

			if (O.IS_TO_DEV) {

				O.l("componentShown" + O.S32 + CLASS_THIS);

			}

		}

	}

}
