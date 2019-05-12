package lGpl20.other.uI;

import java.io.Serializable;
import java.util.TreeMap;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import lGpl20.o.O;

/**
 * @version 2017/04/23_21:07:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyComponenter_A" >MyComponenter_A.
 *          java</a>
 * 
 * @see MyComponenter_C
 */
public abstract class MyComponenter_A implements Serializable {

	private static final Class<MyComponenter_A> CLASS_THIS = MyComponenter_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 裝元件的 TreeMap.<br/>
	 * The TreeMap of the component.
	 */
	protected final TreeMap<Long, JTextField> MAP_OF_TEXT_FIELD = new TreeMap<Long, JTextField>();

	/**
	 * 裝元件的 TreeMap.<br/>
	 * The TreeMap of the component.
	 */
	protected final TreeMap<Long, JButton> MAP_OF_BUTTON = new TreeMap<Long, JButton>();

	/**
	 * 裝元件的 TreeMap.<br/>
	 * The TreeMap of the component.
	 */
	protected final TreeMap<Long, JProgressBar> MAP_OF_PROGRESS_BAR = new TreeMap<Long, JProgressBar>();

	/**
	 * 裝元件的 TreeMap.<br/>
	 * The TreeMap of the component.
	 */
	protected final TreeMap<Long, JTextArea> MAP_OF_J_TEXT_AREA = new TreeMap<Long, JTextArea>();

	/**
	 * 裝元件的 TreeMap.<br/>
	 * The TreeMap of the component.
	 */
	protected final TreeMap<Long, JScrollPane> MAP_OF_SCROLL_PANE = new TreeMap<Long, JScrollPane>();

	/**
	 * 裝元件的 TreeMap.<br/>
	 * The TreeMap of the component.
	 */
	protected final TreeMap<Long, JFileChooser> MAP_OF_FILE_CHOOSER = new TreeMap<Long, JFileChooser>();

	/**
	 * 裝元件的 TreeMap.<br/>
	 * The TreeMap of the component.
	 */
	protected final TreeMap<Long, JSplitPane> MAP_OF_SPLIT_PANE = new TreeMap<Long, JSplitPane>();

	/**
	 * 裝元件的 TreeMap.<br/>
	 * The TreeMap of the component.
	 */
	protected final TreeMap<Long, JPanel> MAP_OF_PANEL = new TreeMap<Long, JPanel>();

	/**
	 * 裝元件的 TreeMap.<br/>
	 * The TreeMap of the component.
	 */
	protected final TreeMap<Long, ButtonGroup> MAP_OF_BUTTON_GROUP = new TreeMap<Long, ButtonGroup>();

	/**
	 * 裝元件的 TreeMap.<br/>
	 * The TreeMap of the component.
	 */
	protected final TreeMap<Long, JPopupMenu> MAP_OF_POPUP_MENU = new TreeMap<Long, JPopupMenu>();

}
