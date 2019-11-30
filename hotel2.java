package swing;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class hotel2 {

private JFrame frame;
private JTextField t1;
private JTextField t2;
private JTextField t3;
private JTextField t4;
private JTextField tfrs;
private JTextField tfd;
private JTextField tfm;
private JTextField tf;
private JTextField ttf;
private JTextField subt;
private JTextField tottf;
private JTextField TF101;
public int cd[]= {0,10,35,90,15,20};
public float Ind[]= {1.0f,0.098f,0.23f,0.014f};
String str1,op;
float tv=0.0f;
int dt=0,eqq=0,cdq=0,cost=0,dc=0;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
hotel2 window = new hotel2 ();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public hotel2 () {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 789, 443);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JPanel panel = new JPanel();
panel.setBackground(Color.PINK);
panel.setBounds(10, 31, 329, 207);
panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
frame.getContentPane().add(panel);
panel.setLayout(null);

JLabel lblChickenBurgger = new JLabel("Chicken Burger");
lblChickenBurgger.setBounds(26, 25, 86, 14);
panel.add(lblChickenBurgger);

JLabel lblChickenBurgerMeals = new JLabel("Chicken Burger Meal");
lblChickenBurgerMeals.setBounds(26, 68, 102, 14);
panel.add(lblChickenBurgerMeals);

JLabel lblCheesBurger = new JLabel("Cheese Burger");
lblCheesBurger.setBounds(26, 108, 86, 14);
panel.add(lblCheesBurger);

JSeparator separator = new JSeparator();
separator.setBounds(21, 133, 214, 2);
panel.add(separator);

JLabel lblDrink = new JLabel("DRINK");
lblDrink.setBounds(10, 146, 46, 14);
panel.add(lblDrink);

JLabel lblQty = new JLabel("Qty");
lblQty.setBounds(171, 146, 46, 14);
panel.add(lblQty);

JComboBox drcmb = new JComboBox();
drcmb.setModel(new DefaultComboBoxModel(new String[] {"<select your drinks>", "Tea", "Coc 1/2L", "Coc 1L", "Coffe", "Fresh Lime"}));
drcmb.setBounds(66, 146, 95, 20);
panel.add(drcmb);

t1 = new JTextField();
t1.setText("0");
t1.setBounds(149, 22, 125, 20);
panel.add(t1);
t1.setColumns(10);

t2 = new JTextField();
t2.setText("0");
t2.setColumns(10);
t2.setBounds(149, 65, 125, 20);
panel.add(t2);

t3 = new JTextField();
t3.setText("0");
t3.setColumns(10);
t3.setBounds(149, 105, 125, 20);
panel.add(t3);

t4 = new JTextField();
t4.setText("0");
t4.setColumns(10);
t4.setBounds(227, 143, 86, 20);
panel.add(t4);

JRadioButton rd1 = new JRadioButton("Home Delivery");
rd1.setBounds(38, 177, 109, 23);
panel.add(rd1);

JRadioButton rd2 = new JRadioButton("Tax");
rd2.setBounds(187, 177, 109, 23);
panel.add(rd2);

JPanel panel_1 = new JPanel();
panel_1.setBackground(Color.PINK);
panel_1.setBounds(349, 29, 168, 209);
panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
frame.getContentPane().add(panel_1);
panel_1.setLayout(null);

JLabel lblNewLabel_1 = new JLabel("CURRENCY CONVERTER");
lblNewLabel_1.setBounds(31, 11, 128, 14);
panel_1.add(lblNewLabel_1);

JComboBox comboBox_1 = new JComboBox();
comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Indian_Rupee", "Chinese_Yuan", "Egyptian_Pound", "United_States_Dollar"}));
comboBox_1.setBounds(10, 71, 151, 20);
panel_1.add(comboBox_1);
comboBox_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int num1=comboBox_1.getSelectedIndex();
float total=Float.parseFloat(tottf.getText());
tfrs.setText(String.valueOf((float)total*Ind[num1]));
}
});

tfrs = new JTextField();
tfrs.setEditable(false);
tfrs.setBounds(10, 120, 151, 20);
panel_1.add(tfrs);
tfrs.setColumns(10);
JButton btnConvert = new JButton("Convert");
btnConvert.setBounds(31, 164, 89, 23);
panel_1.add(btnConvert);

JPanel panel_3 = new JPanel();
panel_3.setBackground(Color.PINK);
panel_3.setBounds(10, 249, 320, 84);
panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
frame.getContentPane().add(panel_3);
panel_3.setLayout(null);

JLabel lblNewLabel_2 = new JLabel("Cost of Drinks");
lblNewLabel_2.setBounds(24, 11, 82, 14);
panel_3.add(lblNewLabel_2);

JLabel lblCostOfMeal = new JLabel("Cost of Meal");
lblCostOfMeal.setBounds(24, 34, 82, 14);
panel_3.add(lblCostOfMeal);

JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
lblCostOfDelivery.setBounds(24, 59, 82, 14);
panel_3.add(lblCostOfDelivery);

tfd = new JTextField();
tfd.setEditable(false);
tfd.setBounds(163, 8, 141, 20);
panel_3.add(tfd);
tfd.setColumns(10);

tfm = new JTextField();
tfm.setEditable(false);
tfm.setColumns(10);
tfm.setBounds(163, 31, 141, 20);
panel_3.add(tfm);

tf = new JTextField();
tf.setEditable(false);
tf.setColumns(10);
tf.setBounds(163, 56, 141, 20);
panel_3.add(tf);

JPanel panel_4 = new JPanel();
panel_4.setBackground(Color.PINK);
panel_4.setBounds(340, 249, 180, 84);
panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
frame.getContentPane().add(panel_4);
panel_4.setLayout(null);

JLabel lblTax = new JLabel("TAX");
lblTax.setBounds(10, 11, 46, 14);
panel_4.add(lblTax);

JLabel lblSubTotal = new JLabel("SUB TOTAL");
lblSubTotal.setBounds(10, 32, 66, 14);
panel_4.add(lblSubTotal);

JLabel lblTotal = new JLabel("TOTAL");
lblTotal.setBounds(10, 57, 46, 14);
panel_4.add(lblTotal);

ttf = new JTextField();
ttf.setEditable(false);
ttf.setColumns(10);
ttf.setBounds(86, 8, 86, 20);
panel_4.add(ttf);

subt = new JTextField();
subt.setEditable(false);
subt.setColumns(10);
subt.setBounds(86, 29, 86, 20);
panel_4.add(subt);

tottf = new JTextField();
tottf.setEditable(false);
tottf.setColumns(10);
tottf.setBounds(86, 54, 86, 20);
panel_4.add(tottf);

JPanel panel_5 = new JPanel();
panel_5.setBackground(Color.ORANGE);
panel_5.setBounds(10, 344, 753, 50);
panel_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
frame.getContentPane().add(panel_5);
panel_5.setLayout(null);

JButton btnTotal = new JButton("TOTAL");
btnTotal.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int cb=Integer.parseInt(t1.getText());
int cbm=Integer.parseInt(t2.getText());
int chb=Integer.parseInt(t3.getText());
int qty=Integer.parseInt(t4.getText());
int dr=drcmb.getSelectedIndex();
int tc=0;
if(rd1.isSelected())
{
dc=40;
}
if(rd2.isSelected())
{
tv=0.12f;
tc=1;
}
cdq=qty*cd[dr];
cost=(cb*48)+(cbm*80)+(chb*80);
tfd.setText(String.valueOf(cdq));
tfm.setText(String.valueOf(cost));
tf.setText(String.valueOf(dc));
float tt=(float)(cost+cdq);
subt.setText(String.valueOf(tt));
tottf.setText(String.valueOf((float)(tt+(tt*tv))+dc));

if(tc==1)
{
ttf.setText(String.valueOf(tt*.12));
}
else
{
ttf.setText("0");
}

}
});
JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
tabbedPane.setBounds(526, 33, 237, 300);
frame.getContentPane().add(tabbedPane);
btnTotal.setBounds(107, 16, 65, 23);
panel_5.add(btnTotal);

JPanel panel_6 = new JPanel();
panel_6.setBackground(Color.CYAN);
tabbedPane.addTab("RECEIPT", null, panel_6, null);
panel_6.setLayout(null);

JTextArea TA = new JTextArea();
TA.setBounds(10, 11, 212, 250);
panel_6.add(TA);

JButton btnRecepit = new JButton("RECEIPT");
btnRecepit.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
float total=cdq+cost;
total=total+(total*tv)+dc;
TA.setText("       HOTEL Lee\n"
+ "--------------------------\n"
+ "Cost of Drinks         "+cdq+"  \n"
+ "Cost of Meals          "+cost+"  \n"
+ "Delivery Charge        "+dc+"  \n"
+ "Tax                    "+(float)((float)((cost+cdq)*tv))+"  \n"
+ "Grand Total            "+total);
}
});
btnRecepit.setBounds(230, 16, 87, 23);
panel_5.add(btnRecepit);

JButton btnReset = new JButton("Reset");
btnReset.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
tfd.setText("0");
tfm.setText("0");
tf.setText("0");
ttf.setText("0");
subt.setText("0");
tottf.setText("0");
t1.setText("0");
t3.setText("0");
t2.setText("0");
t4.setText("0");
tfrs.setText("0");
TA.setText("");
}
});
btnReset.setBounds(364, 16, 74, 23);
panel_5.add(btnReset);

JButton btnExit = new JButton("Exit");
btnExit.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
});
btnExit.setBounds(484, 16, 59, 23);
panel_5.add(btnExit);

JLabel lblNewLabel = new JLabel("HOTAL MANAGEMENT SYSTEM");
lblNewLabel.setBounds(232, 11, 244, 14);
lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
frame.getContentPane().add(lblNewLabel);



JPanel panel_2 = new JPanel();
panel_2.setBackground(Color.CYAN);
tabbedPane.addTab("Calculator", null, panel_2, null);
panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
panel_2.setLayout(null);

TF101 = new JTextField();
TF101.setBackground(Color.WHITE);
TF101.setEditable(false);
TF101.setBounds(10, 11, 206, 64);
panel_2.add(TF101);
TF101.setColumns(10);

JButton btnNewButton = new JButton("B");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
}
});
btnNewButton.setBounds(10, 86, 51, 23);
panel_2.add(btnNewButton);

JButton btnC = new JButton("C");
btnC.setForeground(Color.BLACK);
btnC.setBackground(new Color(204, 204, 204));
btnC.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
TF101.setText("");
dt=0;
}
});
btnC.setBounds(64, 86, 51, 23);
panel_2.add(btnC);

JButton button_1 = new JButton("...");
button_1.setBounds(116, 86, 48, 23);
panel_2.add(button_1);

JButton add = new JButton("+");
add.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
str1=TF101.getText();
TF101.setText("");
dt=0;
op=add.getText();
}
});
add.setBounds(165, 86, 51, 23);
panel_2.add(add);

JButton bt7 = new JButton("7");
bt7.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(eqq==1)
{
TF101.setText("");
dt=0;
}
TF101.setText(TF101.getText().concat(bt7.getText()));
}
});
bt7.setBounds(10, 120, 51, 23);
panel_2.add(bt7);

JButton bt8 = new JButton("8");
bt8.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(eqq==1)
{
TF101.setText("");
dt=0;
}
TF101.setText(TF101.getText().concat(bt8.getText()));
}
});
bt8.setBounds(64, 120, 51, 23);
panel_2.add(bt8);

JButton bt9 = new JButton("9");
bt9.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(eqq==1)
{
TF101.setText("");
dt=0;
}
TF101.setText(TF101.getText().concat(bt9.getText()));
}
});
bt9.setBounds(116, 120, 48, 23);
panel_2.add(bt9);

JButton sub = new JButton("-");
sub.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
str1=TF101.getText();
TF101.setText("");
dt=0;
op=sub.getText();
}
});
sub.setBounds(165, 120, 49, 23);
panel_2.add(sub);

JButton bt4 = new JButton("4");
bt4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(eqq==1)
{
TF101.setText("");
dt=0;
}
TF101.setText(TF101.getText().concat(bt4.getText()));
}
});
bt4.setBounds(10, 154, 51, 23);
panel_2.add(bt4);

JButton bt5 = new JButton("5");
bt5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(eqq==1)
{
TF101.setText("");
dt=0;
}
TF101.setText(TF101.getText().concat(bt5.getText()));
}
});
bt5.setBounds(64, 154, 51, 23);
panel_2.add(bt5);

JButton bt6 = new JButton("6");
bt6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(eqq==1)
{
TF101.setText("");
dt=0;
}
TF101.setText(TF101.getText().concat(bt6.getText()));
}
});
bt6.setBounds(113, 154, 51, 23);
panel_2.add(bt6);

JButton mul = new JButton("*");
mul.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
str1=TF101.getText();
TF101.setText("");
dt=0;
op=mul.getText();
}
});
mul.setBounds(165, 154, 51, 23);
panel_2.add(mul);

JButton bt1 = new JButton("1");
bt1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(eqq==1)
{
TF101.setText("");
dt=0;
}
TF101.setText(TF101.getText().concat(bt1.getText()));

}
});
bt1.setBounds(10, 188, 51, 23);
panel_2.add(bt1);

JButton bt2 = new JButton("2");
bt2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(eqq==1)
{
TF101.setText("");
dt=0;
}
TF101.setText(TF101.getText().concat(bt2.getText()));
}
});
bt2.setBounds(64, 188, 51, 23);
panel_2.add(bt2);

JButton bt3 = new JButton("3");
bt3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(eqq==1)
{
TF101.setText("");
dt=0;
}
TF101.setText(TF101.getText().concat(bt3.getText()));
}
});
bt3.setBounds(113, 188, 51, 23);
panel_2.add(bt3);

JButton div = new JButton("/");
div.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
str1=TF101.getText();
TF101.setText("");
dt=0;
op=div.getText();
}
});
div.setBounds(165, 188, 51, 23);
panel_2.add(div);

JButton bt0 = new JButton("0");
bt0.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(eqq==1)
{
TF101.setText("");
dt=0;
}
TF101.setText(TF101.getText().concat(bt0.getText()));
}
});
bt0.setBounds(10, 221, 51, 23);
panel_2.add(bt0);

JButton dot = new JButton(".");
dot.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(eqq==1)
{
TF101.setText("");
dt=0;
}
if(dt==0)
{
TF101.setText(TF101.getText().concat(dot.getText()));
dt=1;
}
}
});
dot.setBounds(64, 221, 51, 23);
panel_2.add(dot);

JButton button_17 = new JButton("...");
button_17.setBounds(116, 222, 48, 23);
panel_2.add(button_17);

JButton eq = new JButton("=");
eq.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
float val1=Float.parseFloat(TF101.getText());
float val2=Float.parseFloat(str1);
float res=0.0f;
eqq=1;
switch(op)
{
case "+":
res=val1+val2;
break;
case "-":
res=val1-val2;
break;
case "*":
res=val1*val2;
break;
case "/":
res=val1/val2;
break;
}
TF101.setText(String.valueOf(res));
}
});
eq.setBounds(165, 222, 51, 23);
panel_2.add(eq);


}
}