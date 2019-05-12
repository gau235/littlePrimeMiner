package lGpl20.other.uI;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;

import lGpl20.o.O;

/**
 * @version 2019/04/20_18:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyComponenter_Z" >MyComponenter_Z
 *          .java</a>
 * 
 * @see MyComponenter
 */
public abstract class MyComponenter_Z extends MyComponenter_J {

	private static final Class<MyComponenter_Z> CLASS_THIS = MyComponenter_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	protected static TreeMap<Long, JTextField> mapOfTextField;

	protected static TreeMap<Long, JButton> mapOfButton;

	protected static TreeMap<Long, JTextArea> mapOfJTextArea;

	protected static TreeMap<Long, JProgressBar> mapOfProgressBar;

	public static JTextField textFieldMP0;
	public static JTextField textFieldMP1;
	public static JTextField textFieldMP5;

	public static JTextField textFieldRP0;
	public static JTextField textFieldRP1;
	public static JTextField textFieldRP5;

	public static JTextField textFieldTemp0;
	public static JTextField textFieldTemp1;
	public static JTextField textFieldTemp5;

	public static JTextField textFieldConf0;
	public static JTextField textFieldConf1;
	public static JTextField textFieldConf5;

	public static JTextField textFieldRec5;

	public static JButton buttonMP0;
	public static JButton buttonMP1;
	public static JButton buttonMP3;
	public static JButton buttonMP4;

	public static JButton buttonRP0;
	public static JButton buttonRP1;
	public static JButton buttonRP3;
	public static JButton buttonRP4;

	public static JButton buttonTemp0;
	public static JButton buttonTemp1;

	public static JProgressBar progressBarMP0;
	public static JProgressBar progressBarRP0;

	public static JProgressBar progressBarTemp0;

	public static JTextArea jTextAreaMP0;
	public static JTextArea jTextAreaRP0;

	public static Document docMP0;
	public static Document docRP0;

	public static JTextArea jTextAreaConf0;

	public static final TreeMap<Long, MyDesktopPaneForInFrame> MAP_OF_MY_PANEL_FOR_IN_FRAME = new TreeMap<Long, MyDesktopPaneForInFrame>();

	protected static DefaultTableModel defTableModel;

	protected static JTabbedPane tabbedPane;

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public MyComponenter_Z() {

		// 2013/06/21
		// ColorUIResource oldProgrBarSelectionBackground = (ColorUIResource) UIManager.getDefaults().get(
		// "ProgressBar.selectionBackground");
		// ColorUIResource oldProgrBarSelectionForeground = (ColorUIResource) UIManager.getDefaults().get(
		// "ProgressBar.selectionForeground");
		// 2013/06/21

		// ColorUIResource oldTabbedPaneSelected = (ColorUIResource)
		// UIManager.getDefaults().get("ProgressBar.selectionForeground");

		// UIManager.put("ComboBox.disabledForeground", new Color(0, 0, 0, 180));
		// UIManager.put("ComboBox.disabledBackground", COLOR_BACKGROUND);
		// UIManager.put("ProgressBar.selectionBackground", new Color(0, 0, 0, 190));
		// UIManager.put("ProgressBar.selectionBackground",Color.BLACK);
		UIManager.put("ProgressBar.selectionBackground", COLOR_TEXT_BACKGROUND);
		// UIManager.put("TabbedPane.selected", new Color(150, 255, 150, 190));

		mapOfTextField = MAP_OF_TEXT_FIELD;// static versus none static
		mapOfButton = MAP_OF_BUTTON;// static versus none static
		mapOfJTextArea = MAP_OF_J_TEXT_AREA;// static versus none static
		mapOfProgressBar = MAP_OF_PROGRESS_BAR;// static versus none static

		fillMapOfTextField(MyAide.NUM_MP_0, MyAide.NUM_REC_0);

		fillMapOfButton(MyAide.NUM_MP_0, MyAide.NUM_TEMP_0);

		fillMapOfProgressBar(MyAide.NUM_MP_0, MyAide.NUM_TEMP_0);

		fillMapOfJTextArea(MyAide.NUM_MP_0, MyAide.NUM_TEMP_0);

		fillMapOfMyDesktopPaneForInFrame(MyAide.NUM_MP_0, MyAide.NUM_CONF_0);

		myDesktopPaneToConf = new MyDesktopPaneToConf();
		tableToRec = new MyTableToRec();
		defTableModel = ((MyTableToRec) (tableToRec)).TABLE_MODEL;

		fillMapOfScrollPane(MyAide.NUM_MP_0, MyAide.NUM_REC_0);

		// fillMapOfFileChooser(MyAide.NUM_LP_0, MyAide.NUM_LP_0);

		fillMapOfSplitPane(MyAide.NUM_MP_0, MyAide.NUM_CONF_0);

		fillMapOfPanel(MyAide.NUM_MP_0, MyAide.NUM_CONF_0);

		tabbedPane = genTabbedPane(0);
		addAllListener();

		// 2013/06/21
		// UIManager.getDefaults().put("ProgressBar.selectionBackground", oldProgrBarSelectionBackground);
		// UIManager.getDefaults().put("ProgressBar.selectionForeground", oldProgrBarSelectionForeground);
		// 2013/06/21

		// O.l(UIManager.getDefaults().get("ProgressBar.selectionBackground") + ", " + MyComponenter.class);

		textFieldMP0 = MAP_OF_TEXT_FIELD.get(MyAide.NUM_MP_0);
		textFieldMP1 = MAP_OF_TEXT_FIELD.get(MyAide.NUM_MP_1);
		textFieldMP5 = MAP_OF_TEXT_FIELD.get(MyAide.NUM_MP_5);

		textFieldRP0 = MAP_OF_TEXT_FIELD.get(MyAide.NUM_RP_0);
		textFieldRP1 = MAP_OF_TEXT_FIELD.get(MyAide.NUM_RP_1);
		textFieldRP5 = MAP_OF_TEXT_FIELD.get(MyAide.NUM_RP_5);

		textFieldTemp0 = MAP_OF_TEXT_FIELD.get(MyAide.NUM_TEMP_0);
		textFieldTemp1 = MAP_OF_TEXT_FIELD.get(MyAide.NUM_TEMP_1);
		textFieldTemp5 = MAP_OF_TEXT_FIELD.get(MyAide.NUM_TEMP_5);

		textFieldConf5 = MAP_OF_TEXT_FIELD.get(MyAide.NUM_CONF_5);

		textFieldRec5 = MAP_OF_TEXT_FIELD.get(MyAide.NUM_REC_5);

		buttonMP0 = MAP_OF_BUTTON.get(MyAide.NUM_MP_0);
		buttonMP1 = MAP_OF_BUTTON.get(MyAide.NUM_MP_1);
		buttonMP3 = MAP_OF_BUTTON.get(MyAide.NUM_MP_3);
		buttonMP4 = MAP_OF_BUTTON.get(MyAide.NUM_MP_4);

		buttonRP0 = MAP_OF_BUTTON.get(MyAide.NUM_RP_0);
		buttonRP1 = MAP_OF_BUTTON.get(MyAide.NUM_RP_1);
		buttonRP3 = MAP_OF_BUTTON.get(MyAide.NUM_RP_3);
		buttonRP4 = MAP_OF_BUTTON.get(MyAide.NUM_RP_4);

		buttonTemp0 = MAP_OF_BUTTON.get(MyAide.NUM_TEMP_0);
		buttonTemp1 = MAP_OF_BUTTON.get(MyAide.NUM_TEMP_1);

		progressBarMP0 = MAP_OF_PROGRESS_BAR.get(MyAide.NUM_MP_0);
		progressBarRP0 = MAP_OF_PROGRESS_BAR.get(MyAide.NUM_RP_0);
		progressBarTemp0 = MAP_OF_PROGRESS_BAR.get(MyAide.NUM_TEMP_0);

		jTextAreaMP0 = MAP_OF_J_TEXT_AREA.get(MyAide.NUM_MP_0);
		jTextAreaRP0 = MAP_OF_J_TEXT_AREA.get(MyAide.NUM_RP_0);

		docMP0 = jTextAreaMP0.getDocument();// fillMapOfJTextArea(MyAide.NUM_MP_0, MyAide.NUM_LP_0);
		docRP0 = jTextAreaRP0.getDocument();// fillMapOfJTextArea(MyAide.NUM_MP_0, MyAide.NUM_LP_0);

	}

	/**
	 * 生成裝有 MyDesktopPaneForInFrame 元件的 Map.<br/>
	 * To generate the Map of MyDesktopPaneForInFrame.
	 */
	public TreeMap<Long, MyDesktopPaneForInFrame> fillMapOfMyDesktopPaneForInFrame(long from, long to) {

		for (long num = from; num <= to; num += MyAide.NUM_STEP) {

			MAP_OF_MY_PANEL_FOR_IN_FRAME.put(num, new MyDesktopPaneForInFrame((MyComponenter) this, num));

		}

		return MAP_OF_MY_PANEL_FOR_IN_FRAME;

	}

	public JFileChooser genFileChooser(long num) {

		return null;

	}

	public void fillMapOfFileChooser(long from, long to) {

	}

	public JSplitPane genSplitPane(long num) {

		final JSplitPane splitPane;

		if (num == MyAide.NUM_CONF_0) {

			splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
			splitPane.setBackground(COLOR_BACKGROUND);
			splitPane.setLeftComponent(MAP_OF_MY_PANEL_FOR_IN_FRAME.get(num));
			splitPane.setRightComponent(myDesktopPaneToConf);

			splitPane.setBorder(EMPTY_BORDER);
			splitPane.setDoubleBuffered(true);
			splitPane.setOneTouchExpandable(true);
			splitPane.setDividerLocation(0);

			splitPane.addComponentListener(new MyAdapterForSplitPaneAsComponent(splitPane));// important
			splitPane.setPreferredSize(new Dimension(int32Width - 6, int32Height - 80));// 90

		} else {

			splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
			splitPane.setBackground(COLOR_BACKGROUND);
			splitPane.setLeftComponent(MAP_OF_MY_PANEL_FOR_IN_FRAME.get(num));
			splitPane.setRightComponent(MAP_OF_SCROLL_PANE.get(num));

			// MAP_OF_J_TEXT_AREA.get(num + 1).setMaximumSize(new Dimension(290, 340));// important

			splitPane.setBorder(EMPTY_BORDER);
			splitPane.setDoubleBuffered(true);
			splitPane.setOneTouchExpandable(true);
			splitPane.setDividerLocation(0);

			// splitPane.setDividerSize(10);
			// javax.swing.plaf.metal.MetalSplitPaneUI
			// O.l(splitPane.getUI().);
			// O.l(splitPane.getMaximumDividerLocation());
			// O.l(UIManager.getDefaults().keySet());

			splitPane.addComponentListener(new MyAdapterForSplitPaneAsComponent(splitPane));// important
			splitPane.setPreferredSize(new Dimension(int32Width - 6, int32Height - 80));// 90

		}

		return splitPane;

	}

	public void fillMapOfSplitPane(long from, long to) {

		for (long num = from; num <= to; num += MyAide.NUM_STEP) {

			MAP_OF_SPLIT_PANE.put(num, genSplitPane(num));

		}

	}

	public JPanel genPanel(long num) {

		JPanel panel = new JPanel();
		// panel.setLayout(null);
		panel.setBorder(EMPTY_BORDER);
		panel.setBackground(COLOR_BACKGROUND);
		panel.setDoubleBuffered(true);
		// panel.setMaximumSize(new Dimension(W_SCREEN, H_SCREEN));
		// panel.setPreferredSize(new Dimension(2000 - 10, 2000 - 62));
		// panel.setBounds(0, 0, 2000, 2000 - 222);

		if (num == MyAide.NUM_CONF_0) {

			JSplitPane theSplitPane = MAP_OF_SPLIT_PANE.get(num);
			// theSplitPane.setMaximumSize(new Dimension(W_SCREEN, H_SCREEN));
			// theSplitPane.setPreferredSize(new Dimension(2000 - 10, 2000 - 62));
			// theSplitPane.setBounds( 0, 0, int32Width, int32Height - 222);
			// theSplitPane.setBounds(0, 0, int32Width - 10, int32Height - 222);
			theSplitPane.setBounds(0, 0, W_SCREEN, H_SCREEN);
			// O.l("getLeftComponent=" + theSplitPane.getLeftComponent() + O.S32 + CLASS_THIS);
			panel.setLayout(null);
			// panel.setLayout(new FlowLayout());
			panel.add(theSplitPane);

		} else if (num == MyAide.NUM_REC_0) {

			// O.l("genPanel=" + MAP_OF_SCROLL_PANE.get(num) + O.S32 + CLASS_THIS);
			panel.setLayout(null);
			// panel.setBounds(0, 0, int32Width, int32Height - 222);
			panel.add(MAP_OF_SCROLL_PANE.get(num));

		} else {

			panel.setLayout(new GridBagLayout());
			packGridBagConstraints(num, panel);

		}

		return panel;

	}

	public void fillMapOfPanel(long from, long to) {

		for (long num = from; num <= to; num += MyAide.NUM_STEP) {

			MAP_OF_PANEL.put(num, genPanel(num));

		}

	}

	public JTabbedPane genTabbedPane(long num) {

		tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM, JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBorder(EMPTY_BORDER);
		// tabbedPane.setBounds(new Rectangle(0, 0, int32Width, int32Height));// important
		tabbedPane.setPreferredSize(new Dimension(int32Width, int32Height));
		tabbedPane.setBackground(COLOR_BACKGROUND);
		// tabbedPane.setLayout(new FlowLayout());

		int tabIndex = 0;
		long index = MyAide.NUM_MP_0;

		tabbedPane.addTab(O.Z, MAP_OF_PANEL.get(index));
		tabbedPane.setTabComponentAt(tabIndex++, MAP_OF_TEXT_FIELD.get(MyAide.NUM_MP_5));
		// ((JPanel)tabbedPane.getComponentAt(0)).setBorder(EMPTY_BORDER);
		index += MyAide.NUM_STEP;

		tabbedPane.addTab(O.Z, MAP_OF_PANEL.get(index));
		tabbedPane.setTabComponentAt(tabIndex++, MAP_OF_TEXT_FIELD.get(MyAide.NUM_RP_5));
		index += MyAide.NUM_STEP;

		tabbedPane.addTab(O.Z, MAP_OF_PANEL.get(index));// LPrime
		tabbedPane.setTabComponentAt(tabIndex++, MAP_OF_TEXT_FIELD.get(MyAide.NUM_TEMP_5));
		index += MyAide.NUM_STEP;

		tabbedPane.addTab(O.Z, MAP_OF_PANEL.get(index));// conf
		tabbedPane.setTabComponentAt(tabIndex++, MAP_OF_TEXT_FIELD.get(MyAide.NUM_CONF_5));
		index += MyAide.NUM_STEP;

		// tabbedPane.addTab(O.S_E, MAP_OF_PANEL.get(index));// rec
		tabbedPane.addTab(O.Z, MAP_OF_SCROLL_PANE.get(index));// rec
		tabbedPane.setTabComponentAt(tabIndex++, MAP_OF_TEXT_FIELD.get(MyAide.NUM_REC_5));
		index += MyAide.NUM_STEP;

		tabbedPane.setSelectedIndex(0);// fuck

		return tabbedPane;

	}

	/**
	 * To add all listeners.<br/>
	 * To add all listeners.
	 */
	protected void addAllListener() {

		MyListenerOfHotKey myListenerOfHotKey = new MyListenerOfHotKey((MyComponenter) this);
		MyListenerOfMouse myListenerOfMouse = new MyListenerOfMouse((MyComponenter) this);

		for (long i = MyAide.NUM_MP_0, to = MyAide.NUM_REC_5; i <= to; i++) {

			JTextField textField = MAP_OF_TEXT_FIELD.get(i);
			JButton button = MAP_OF_BUTTON.get(i);

			if (textField != null /* && i != MyAid.NUM_TEMP_0 */) {

				// O.l("addAllListener=" + (i == MyAid.NUM_MINE_PRIME_5) + O.S32 + CLASS_THIS);

				if (i % MyAide.NUM_STEP == 2) {

					// O.l("i=" + i + O.S32 + MyAid.NUM_MINE_PRIME_2 + O.S32 + CLASS_THIS);
					// textField.addMouseListener(new MyPopupMenuWListenerToConf(i, textField));

				} else {

					textField.addKeyListener(myListenerOfHotKey);
					textField.addMouseListener(myListenerOfMouse);

				}

			}

			if (button != null /* && i != MyAid.NUM_TEMP_0 */) {

				if (i == MyAide.NUM_MP_0) {

					button.addMouseListener(new MyPopupMenuWListenerForCpuQty(button));

				}

				button.addKeyListener(myListenerOfHotKey);
				button.addMouseListener(myListenerOfMouse);

			}

			// if (jTextArea != null && i < MyAid.NUM_TEMP_0) {
			//
			// jTextArea.addKeyListener(listener);
			// jTextArea.addMouseListener(listener);
			//
			// }

		}

		tabbedPane.addKeyListener(myListenerOfHotKey);
		// tableToRec.addKeyListener(listener);

	}

}
