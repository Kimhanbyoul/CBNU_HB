import java.awt.*;
class FlowLayoutTest extends Frame
{
	FlowLayout f = new FlowLayout();
	Button btn[]= new Button[10];
	
	public FlowLayoutTest(String str)
	{
		super(str);
		setLayout(f);
		for(int i=0; i<10;i++)
		{
			btn[i]= new Button((i+1)+"�� ��ư");
			add(btn[i]);
		}
		setBounds(100,100,200,200);
		setVisible(true);
	}
}
class MenuTest1 extends Frame 
{
	public MenuTest1(String str) 
	{
		super(str);
		MenuBar mb = new MenuBar();
		Menu file = new Menu("����");
		MenuItem file_new = new MenuItem("���� �����");
		MenuItem file_open = new MenuItem("����");
		MenuItem file_save = new MenuItem("����");
		MenuItem file_newname = new MenuItem("����");

		file.add(file_new); 
		file.add(file_open);
		file.add(file_save);
		file.add(file_newname);
    
		Menu edit = new Menu("����");
		MenuItem edit_undo = new MenuItem("�������"); 
		MenuItem edit_cut = new MenuItem("�߶󳻱�");
		MenuItem edit_copy = new MenuItem("����");
		MenuItem edit_paste = new MenuItem("�ٿ��ֱ�");
		edit.add(edit_undo);
		edit.add(edit_cut);
		edit.add(edit_copy);
		edit.add(edit_paste);
		Menu view = new Menu("����");
		CheckboxMenuItem view_status = new CheckboxMenuItem("����ǥ����");
		view.add(view_status);
		
		mb.add(file);
		mb.add(edit);
		mb.add(view);
    
		setMenuBar(mb);
		setSize(200,200);
		setVisible(true);
	}
}
class TextArea2 extends Frame {
	public TextArea2(String str){
  		super(str);
		Panel p = new Panel();
		TextArea txt1 = new TextArea(10,30);
		TextField txt2 = new TextField("Hello Java",20);	
		txt1.setText("  Java World ");
  		txt1.setBackground(Color.yellow);
  		txt1.setFont(new Font("�ü�ü",Font.BOLD, 10));
  		txt1.setForeground(Color.blue);
  		txt2.setEchoChar('@');
  		txt2.setForeground(Color.red);
  		p.add(txt1); 
  		p.add(txt2);  	
		add(p);
  		setSize(200,200);
  		setVisible(true);  	
	}
}
class TextField1 extends Frame 
{
	public TextField1(String str)	
	{
		super(str);
		Panel p = new Panel();
		Label lbl1 = new Label(" �� �� ��:");  	
		Label lbl2 = new Label(" ��й�ȣ:");  	
		TextField txt1 = new TextField("ID", 20 );
		TextField txt2 = new TextField(20);
		txt2.setEchoChar('*');
		p.add(lbl1);
		p.add(txt1);
		p.add(lbl2);  
		p.add(txt2);
		add(p);
		setSize(200,200);
		setVisible(true);  	
	}
}
class ListTest extends Frame
{
	Panel p;
	List list;
	public ListTest(String str)
	{		
		super(str);
		p=new Panel();
		list=new List(2,true);
		list.add("�̴�");
		list.add("����");
		list.add("����");
		list.add("����");
		p.add(list);
		add(p);
		setSize(300,100);
		setVisible(true);
	}
}

class FlickeringLabel extends Label implements Runnable
{
	public FlickeringLabel(String text)
	{
		super(text);
		Thread th = new Thread(this);
		th.start();
	}
	
	public void run()
	{
		int n=0;
		while (true)
		{
			if(n==0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if(n==0) n=1;
			else n=0;
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				return;
			}
		}
	}
}
class FlickeringLabelEx extends Frame
{
	public FlickeringLabelEx()
	{
		setTitle("FlickeringLabelEx ����");
		
		FlickeringLabel fLabel = new FlickeringLabel("����");
		Label label = new Label("�ȱ���");
		FlickeringLabel fLabel2 = new FlickeringLabel("���⵵ ����");
		Panel p = new Panel();
		p.add(fLabel);
		p.add(label);
		p.add(fLabel2);
		add(p);
		setSize(300,150);
		setVisible(true);
	}
}
class LabelTest extends Frame
{
	Panel p;
	Label label1, label2, label3;
	public LabelTest(String str)
	{
		super(str);
		p=new Panel();
		label1=new Label("�̴�");
		label2=new Label("����",Label.CENTER);
		label3=new Label("����",Label.LEFT);
		label1.setBackground(Color.red);
		label2.setBackground(Color.blue);
		label3.setBackground(Color.green);
		p.add(label1); p.add(label2); p.add(label3);
		add(p);
		setSize(300,300);
		setVisible(true);
	}
}
class ChoiceTest extends Frame
{
	Choice ch;
	public ChoiceTest(String str)
	{
		super(str);
		ch = new Choice();
		ch.addItem("�̴�");
		ch.addItem("����");
		ch.addItem("����");
		add(ch);
		setSize(300,100);
		setVisible(true);
	}
}
class Checkbox1 extends Frame
{
	public Checkbox1(String str)
	{
		super(str);
		Panel p =new Panel();
		Checkbox cbx1=new Checkbox("�̴�",true);
		Checkbox cbx2=new Checkbox("����");
		Checkbox cbx3=new Checkbox("����");
		p.add(cbx1);
		p.add(cbx2);
		p.add(cbx3);
		
		CheckboxGroup group = new CheckboxGroup();
		Checkbox cbx4=new Checkbox("�̴�",group, true);
		Checkbox cbx5=new Checkbox("����",group, false);
		Checkbox cbx6=new Checkbox("����",group, false);
		p.add(cbx4);
		p.add(cbx5);
		p.add(cbx6);
		
		add(p);
		setSize(180,300);
		setVisible(true);
	}
}
class Button1 extends Frame
{
	Button btn1, btn2, btn3;
	public Button1(String str)
	{
		super(str);
		Panel p = new Panel();
		btn1 = new Button("����");
		btn2 = new Button("����");
		btn3 = new Button("��");
		p.add(btn1); p.add(btn2); p.add(btn3);
		add(p);
		btn3.setEnabled(false);
		setSize(200,200);
		setVisible(true);
	}
}
class ModelessDialog extends Frame
{
	static final long serialVersionUID =1;
	public ModelessDialog()
	{
		super("���̾�α� �׽�Ʈ");
		Dialog d = new Dialog(this,"������� ���̾�α�");
		setBounds(0,0,400,400);
		setVisible(true);
		d.setSize(200, 200);
		d.setVisible(true);
	}
}
class PanelTest extends Frame
{
	public PanelTest(String str)
	{
		super(str);
		Panel panel1 =new Panel();
		panel1.setBackground(Color.lightGray);
		add(panel1);
		setSize(300,300);
		setVisible(true);
		
	}
}
class FrameTest extends Frame
{
	public FrameTest()
	{
		super("�� ��° �������Դϴ�.");
		setBounds(100,100,300,300);
		setVisible(true);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameTest Obj =new FrameTest();		//2
		
		//new PanelTest("�г��׽�Ʈ");			//3
		
		//new ModelessDialog();				//4
		
		//new Button1("��ư �����");			//5
		
		//new Checkbox1("üũ �ڽ� �׽�Ʈ");		//6
		
		//new ChoiceTest("�޺� �ڽ� ����");		//7
		
		//new LabelTest("���̺� �׽�Ʈ"); 		//8
		
		//new FlickeringLabelEx();			//9
		
		//new ListTest("��Ƽ ���� ����Ʈ");		//10
		
		//new TextField1("TextField �׽�Ʈ");	//11
		
		//new TextArea2("Text �׽�Ʈ"); 		//12
		
		//new MenuTest1("�޴� �׽�Ʈ 1");		//13
		
		//new FlowLayoutTest("FlowLayout �׽�Ʈ");		//14
		
		
	}

}
