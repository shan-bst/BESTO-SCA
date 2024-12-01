import javax.swing.JOptionPane;
public class grade {
    public static void main (String [] args) {
    
    double attendancescore= Integer.parseInt(JOptionPane.showInputDialog("Enter Attendance Score"));
    double assignmentscore= Integer.parseInt(JOptionPane.showInputDialog("Enter Assignment Score"));
    double quizscore= Integer.parseInt(JOptionPane.showInputDialog("Enter Quiz Score"));
    double labactscore= Integer.parseInt(JOptionPane.showInputDialog("Enter Laboratory Activity Score"));
    double examscore= Integer.parseInt(JOptionPane.showInputDialog("Enter Exam Score"));

    double attendancepercentage= 0.10;
    double attendancetotal= 15;
    double assignmentpercentage= 0.15;
    double assignmenttotal= 50;
    double quizpercentage= 0.20;
    double quiztotal= 80;
    double labactpercentage= 0.25;
    double labacttotal= 100;
    double exampercentage= 0.30;
    double examtotal= 100;

    double attendancegrade= (((attendancescore/attendancetotal)*60)+40)*attendancepercentage;
    double assignmentgrade= (((assignmentscore/assignmenttotal)*60)+40)*assignmentpercentage;
    double quizgrade= (((quizscore/quiztotal)*60)+40)*quizpercentage;
    double labactgrade= (((labactscore/labacttotal)*60)+40)*labactpercentage;
    double examgrade= (((examscore/examtotal)*60)+40)*exampercentage;

    double overallgrade= (attendancegrade+assignmentgrade+quizgrade+labactgrade+examgrade);

    String Grade= "Display Grade: " + "\n" +
            "Attendance Grade: " + attendancegrade + "\n" +
            "Assignment Grade: " + assignmentgrade + "\n" +
            "Quiz Grade: " + quizgrade + "\n" +
            "Laboratory Activity Grade: " + labactgrade + "\n" +
            "Exam Grade: "  + examgrade + "\n" +
            "Over All Grade: " + overallgrade;

    JOptionPane.showMessageDialog(null, Grade);

    }
}