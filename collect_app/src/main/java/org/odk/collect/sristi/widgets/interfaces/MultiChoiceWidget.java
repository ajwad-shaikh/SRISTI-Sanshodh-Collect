package org.odk.collect.sristi.widgets.interfaces;

/**
 * @author James Knight
 */
public interface MultiChoiceWidget extends Widget {
    int getChoiceCount();

    void setChoiceSelected(int choiceIndex, boolean isSelected);
}
