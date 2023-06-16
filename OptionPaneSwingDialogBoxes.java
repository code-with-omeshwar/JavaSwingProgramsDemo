import javax.swing.*;

public class OptionPaneSwingDialogBoxes {
    public static void main(String[] args) {
        // JOptionPane = pop up a standard dialog box that prompts users for a value
        // or informs them of something.

        // JOptionPane.showMessageDialog(null, "This is a dialog box", "title",
        // JOptionPane.PLAIN_MESSAGE);

        // JOptionPane.showMessageDialog(null, "This is an information dialog box",
        // "title",JOptionPane.INFORMATION_MESSAGE);

        // JOptionPane.showMessageDialog(null, "This is a warning dialog box",
        // "title",JOptionPane.WARNING_MESSAGE);

        // JOptionPane.showMessageDialog(null, "This is an error dialog box",
        // "title",JOptionPane.ERROR_MESSAGE);

        // JOptionPane.showMessageDialog(null, "This is a question dialog box",
        // "title",JOptionPane.QUESTION_MESSAGE);

        // System.out.println(JOptionPane.showConfirmDialog(null, "do you code", "Code",
        // JOptionPane.YES_NO_CANCEL_OPTION));

        // String inp = JOptionPane.showInputDialog("What is your name?");
        // System.out.println(inp);

        String[] responses = { "No, you're awesome!", "Thank you!", "*blush*" };

        System.out.println(
                JOptionPane.showOptionDialog(null, "Really?", "Option Dialog", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, responses,
                        1));

    }
}
