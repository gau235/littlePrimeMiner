package lGpl20.other.uI;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JPanel;

import lGpl20.o.O;

/**
 * @version 2017/05/19_10:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyComponenter_J" >MyComponenter_J
 *          .java</a>
 * 
 * @see MyComponenter_Z
 */
public abstract class MyComponenter_J extends MyComponenter_H {

	private static final Class<MyComponenter_J> CLASS_THIS = MyComponenter_J.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * TO pack GridBagConstraints.<br/>
	 * TO pack GridBagConstraints.
	 */
	protected void packGridBagConstraints(long numAsType, JPanel panel) {

		if (numAsType == MyAide.NUM_MP_0) {

			GridBagConstraints constraint = new GridBagConstraints();

			constraint.gridx = 0; // textField0
			constraint.gridy = 0;
			constraint.gridwidth = 1;
			constraint.gridheight = 1;
			constraint.weightx = 0.40;
			constraint.weighty = 0;
			constraint.insets = new Insets(4, 2, 0, 2); // top, left, bottom, right
			constraint.fill = GridBagConstraints.BOTH;
			// constraint.anchor = GridBagConstraints.NORTH;
			panel.add(MAP_OF_TEXT_FIELD.get(numAsType), constraint);

			constraint.gridx = 1;// textField1
			constraint.gridy = 0;
			constraint.gridwidth = 1;
			constraint.gridheight = 1;
			constraint.weightx = 0.40;
			constraint.weighty = 0;
			constraint.insets = new Insets(4, 2, 0, 2); // top, left, bottom, right
			constraint.fill = GridBagConstraints.BOTH;

			panel.add(MAP_OF_TEXT_FIELD.get(numAsType + 1L), constraint);

			constraint.gridx = 2;// button0
			constraint.gridy = 0;
			constraint.gridwidth = 1;
			constraint.gridheight = 1;
			constraint.weightx = 0.10;
			constraint.weighty = 0;
			constraint.insets = new Insets(4, 2, 0, 2); // top, left, bottom, right
			constraint.fill = GridBagConstraints.BOTH;

			panel.add(MAP_OF_BUTTON.get(numAsType), constraint);

			constraint.gridx = 3;// button1
			constraint.gridy = 0;
			constraint.gridwidth = 1;
			constraint.gridheight = 1;
			constraint.weightx = 0.10;
			constraint.weighty = 0;
			constraint.insets = new Insets(4, 2, 0, 2); // top, left, bottom, right
			constraint.fill = GridBagConstraints.BOTH;

			panel.add(MAP_OF_BUTTON.get(numAsType + 1L), constraint);

			constraint.gridx = 0;// progressBar
			constraint.gridy = 1;
			constraint.gridwidth = 4;
			constraint.gridheight = 1;
			constraint.weightx = 1;
			constraint.weighty = 0;
			constraint.insets = new Insets(2, 0, 3, 0); // top padding
			constraint.fill = GridBagConstraints.BOTH;

			panel.add(MAP_OF_PROGRESS_BAR.get(numAsType), constraint);

			constraint.gridx = 0;// SplitPane
			constraint.gridy = 2;
			constraint.gridwidth = 4;
			constraint.gridheight = 1;
			constraint.weightx = 1;
			constraint.weighty = 1;// important

			constraint.insets = new Insets(0, 0, 0, 0); // top padding
			constraint.fill = GridBagConstraints.BOTH;

			panel.add(MAP_OF_SPLIT_PANE.get(numAsType), constraint);

			return;

		}

		if (numAsType == MyAide.NUM_RP_0) {

			GridBagConstraints constraint = new GridBagConstraints();

			constraint.gridx = 0; // button1
			constraint.gridy = 0;
			constraint.gridwidth = 1;
			constraint.gridheight = 1;
			constraint.weightx = 0.10;
			constraint.weighty = 0;
			constraint.insets = new Insets(4, 2, 0, 2); // top, left, bottom, right
			constraint.fill = GridBagConstraints.BOTH;

			panel.add(MAP_OF_BUTTON.get(numAsType + 1L), constraint);

			constraint.gridx = 1;// button0
			constraint.gridy = 0;
			constraint.gridwidth = 1;
			constraint.gridheight = 1;
			constraint.weightx = 0.10;
			constraint.weighty = 0;
			constraint.insets = new Insets(4, 2, 0, 2); // top, left, bottom, right
			constraint.fill = GridBagConstraints.BOTH;

			panel.add(MAP_OF_BUTTON.get(numAsType), constraint);

			constraint.gridx = 2;// textField1
			constraint.gridy = 0;
			constraint.gridwidth = 1;
			constraint.gridheight = 1;
			constraint.weightx = 0.40;
			constraint.weighty = 0;
			constraint.insets = new Insets(4, 2, 0, 2); // top, left, bottom, right
			constraint.fill = GridBagConstraints.BOTH;

			panel.add(MAP_OF_TEXT_FIELD.get(numAsType + 1L), constraint);

			constraint.gridx = 3;// textField0
			constraint.gridy = 0;
			constraint.gridwidth = 1;
			constraint.gridheight = 1;
			constraint.weightx = 0.40;
			constraint.weighty = 0;
			constraint.insets = new Insets(4, 2, 0, 2); // top, left, bottom, right
			constraint.fill = GridBagConstraints.BOTH;

			panel.add(MAP_OF_TEXT_FIELD.get(numAsType), constraint);

			constraint.gridx = 0;// progressBar
			constraint.gridy = 1;
			constraint.gridwidth = 4;
			constraint.gridheight = 1;
			constraint.weightx = 1;
			constraint.weighty = 0;
			constraint.insets = new Insets(2, 0, 3, 0); // top padding
			constraint.fill = GridBagConstraints.BOTH;

			panel.add(MAP_OF_PROGRESS_BAR.get(numAsType), constraint);

			constraint.gridx = 0;// SplitPane
			constraint.gridy = 2;
			constraint.gridwidth = 4;
			constraint.gridheight = 1;
			constraint.weightx = 1;
			constraint.weighty = 1;// important

			constraint.insets = new Insets(0, 0, 0, 0); // top padding
			constraint.fill = GridBagConstraints.BOTH;

			panel.add(MAP_OF_SPLIT_PANE.get(numAsType), constraint);

			return;

		}

		if (numAsType == MyAide.NUM_TEMP_0) {

			GridBagConstraints constraint = new GridBagConstraints();

			constraint.gridx = 0; // textField0
			constraint.gridy = 0;
			constraint.gridwidth = 1;
			constraint.gridheight = 1;
			constraint.weightx = 0.40;
			constraint.weighty = 0;
			constraint.insets = new Insets(4, 2, 0, 2); // top, left, bottom, right
			constraint.fill = GridBagConstraints.BOTH;
			// constraint.anchor = GridBagConstraints.NORTH;
			panel.add(MAP_OF_TEXT_FIELD.get(numAsType), constraint);

			constraint.gridx = 1;// textField1
			constraint.gridy = 0;
			constraint.gridwidth = 1;
			constraint.gridheight = 1;
			constraint.weightx = 0.40;
			constraint.weighty = 0;
			constraint.insets = new Insets(4, 2, 0, 2); // top, left, bottom, right
			constraint.fill = GridBagConstraints.BOTH;

			panel.add(MAP_OF_TEXT_FIELD.get(numAsType + 1L), constraint);

			constraint.gridx = 2;// button0
			constraint.gridy = 0;
			constraint.gridwidth = 1;
			constraint.gridheight = 1;
			constraint.weightx = 0.10;
			constraint.weighty = 0;
			constraint.insets = new Insets(4, 2, 0, 2); // top, left, bottom, right
			constraint.fill = GridBagConstraints.BOTH;

			panel.add(MAP_OF_BUTTON.get(numAsType), constraint);

			constraint.gridx = 3;// BUTTON1
			constraint.gridy = 0;
			constraint.gridwidth = 1;
			constraint.gridheight = 1;
			constraint.weightx = 0.10;
			constraint.weighty = 0;
			constraint.insets = new Insets(4, 2, 0, 2); // top, left, bottom, right
			constraint.fill = GridBagConstraints.BOTH;

			panel.add(MAP_OF_BUTTON.get(numAsType + 1L), constraint);

			constraint.gridx = 0;// progressBar
			constraint.gridy = 1;
			constraint.gridwidth = 4;
			constraint.gridheight = 1;
			constraint.weightx = 1;
			constraint.weighty = 0;
			constraint.insets = new Insets(2, 0, 3, 0); // top padding
			constraint.fill = GridBagConstraints.BOTH;

			panel.add(MAP_OF_PROGRESS_BAR.get(numAsType), constraint);

			constraint.gridx = 0;// SplitPane
			constraint.gridy = 2;
			constraint.gridwidth = 4;
			constraint.gridheight = 1;
			constraint.weightx = 1;
			constraint.weighty = 1;// important

			constraint.insets = new Insets(0, 0, 0, 0); // top padding
			constraint.fill = GridBagConstraints.BOTH;

			panel.add(MAP_OF_SPLIT_PANE.get(numAsType), constraint);

			return;

		}

	}

}
