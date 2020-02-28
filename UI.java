package uiGame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class UI {
	
	public static int[][]systemnum=new int[25][25];
	public static int systemtimes=1;
	public static JLabel str=new JLabel("�������ʼ����ʼ��Ϸ��");
	public static JButton newgame=new JButton("����Ϸ");
	
	public static void uimain() {
		Menu.mn();
		JFrame frame=new JFrame();
		frame.setSize(750, 560);
		frame.setTitle("������ �˻��Ծ�   v0.1.6.180707_alpha");
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		JMenuBar jmb=new JMenuBar();
		frame.setJMenuBar(jmb);
		//ImageIcon img=new ImageIcon("D:/Documents/training/����.png");
		//JLabel labImg=new JLabel(img);
		//labImg.setBounds(250, 30, 420, 420);
		//frame.add(labImg);
		str.setBounds(30,150,200,200);
		frame.add(str);
		newgame.setBounds(50, 350, 80, 50);
		newgame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				systemtimes=0;
				str.setText("��һ����Ϸ��ʼ��,���Ǻ���Ŷ��");
				Menu.newstart();
				newgame.setVisible(false);
			}
		});
		frame.add(newgame);
		newgame.setVisible(false);
		qipan(frame);
		JButton start=new JButton("��ʼ");
		start.setBounds(50,350,80,50);
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				systemtimes=0;
				str.setText("��Ϸ��ʼ�������Ǻ���Ŷ��");
				start.setVisible(false);
			}
		});
		frame.add(start);
		
		JMenu menu=new JMenu("����");
		JMenuItem item1=new JMenuItem("����Ϸ");
		item1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				systemtimes=0;
				str.setText("��һ����Ϸ��ʼ��,���Ǻ���Ŷ��");
				Menu.newstart();
			}
		});
		JMenuItem item2=new JMenuItem("�Ѷ�");
		item2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu.menuframe.setVisible(true);
			}
		});
		JMenuItem item3=new JMenuItem("ͳ����Ϣ");
		item3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu.menuframe.setVisible(true);
			}
		});
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		jmb.add(menu);
		
		frame.setVisible(true);
		}
	private static void qipan(JFrame frame) {
		ImageIcon bla=new ImageIcon("D:/Documents/training/����.png");
		int x=0;
		int y=-10;
		Qipan.q11.setBounds(250+x,30+y,30,30);
		Qipan.q11img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q11.setBorder(null);
		frame.add(Qipan.q11img);
		Qipan.q11.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[1+4][1+4]==0&&systemtimes==0){
		systemnum[1+4][1+4]=3;
		Qipan.q11img.setIcon(bla);
		Qipan.q11img.setVisible(true);
		Qipan.q11.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q11);
		Qipan.q12.setBounds(250+x,30+y,30,30);
		Qipan.q12img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q12.setBorder(null);
		frame.add(Qipan.q12img);
		Qipan.q12.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[1+4][2+4]==0&&systemtimes==0){
		systemnum[1+4][2+4]=3;
		Qipan.q12img.setIcon(bla);
		Qipan.q12img.setVisible(true);
		Qipan.q12.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q12);
		Qipan.q13.setBounds(250+x,30+y,30,30);
		Qipan.q13img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q13.setBorder(null);
		frame.add(Qipan.q13img);
		Qipan.q13.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[1+4][3+4]==0&&systemtimes==0){
		systemnum[1+4][3+4]=3;
		Qipan.q13img.setIcon(bla);
		Qipan.q13img.setVisible(true);
		Qipan.q13.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q13);
		Qipan.q14.setBounds(250+x,30+y,30,30);
		Qipan.q14img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q14.setBorder(null);
		frame.add(Qipan.q14img);
		Qipan.q14.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[1+4][4+4]==0&&systemtimes==0){
		systemnum[1+4][4+4]=3;
		Qipan.q14img.setIcon(bla);
		Qipan.q14img.setVisible(true);
		Qipan.q14.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q14);
		Qipan.q15.setBounds(250+x,30+y,30,30);
		Qipan.q15img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q15.setBorder(null);
		frame.add(Qipan.q15img);
		Qipan.q15.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[1+4][5+4]==0&&systemtimes==0){
		systemnum[1+4][5+4]=3;
		Qipan.q15img.setIcon(bla);
		Qipan.q15img.setVisible(true);
		Qipan.q15.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q15);
		Qipan.q16.setBounds(250+x,30+y,30,30);
		Qipan.q16img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q16.setBorder(null);
		frame.add(Qipan.q16img);
		Qipan.q16.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[1+4][6+4]==0&&systemtimes==0){
		systemnum[1+4][6+4]=3;
		Qipan.q16img.setIcon(bla);
		Qipan.q16img.setVisible(true);
		Qipan.q16.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q16);
		Qipan.q17.setBounds(250+x,30+y,30,30);
		Qipan.q17img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q17.setBorder(null);
		frame.add(Qipan.q17img);
		Qipan.q17.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[1+4][7+4]==0&&systemtimes==0){
		systemnum[1+4][7+4]=3;
		Qipan.q17img.setIcon(bla);
		Qipan.q17img.setVisible(true);
		Qipan.q17.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q17);
		Qipan.q18.setBounds(250+x,30+y,30,30);
		Qipan.q18img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q18.setBorder(null);
		frame.add(Qipan.q18img);
		Qipan.q18.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[1+4][8+4]==0&&systemtimes==0){
		systemnum[1+4][8+4]=3;
		Qipan.q18img.setIcon(bla);
		Qipan.q18img.setVisible(true);
		Qipan.q18.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q18);
		Qipan.q19.setBounds(250+x,30+y,30,30);
		Qipan.q19img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q19.setBorder(null);
		frame.add(Qipan.q19img);
		Qipan.q19.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[1+4][9+4]==0&&systemtimes==0){
		systemnum[1+4][9+4]=3;
		Qipan.q19img.setIcon(bla);
		Qipan.q19img.setVisible(true);
		Qipan.q19.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q19);
		Qipan.q110.setBounds(250+x,30+y,30,30);
		Qipan.q110img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q110.setBorder(null);
		frame.add(Qipan.q110img);
		Qipan.q110.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[1+4][10+4]==0&&systemtimes==0){
		systemnum[1+4][10+4]=3;
		Qipan.q110img.setIcon(bla);
		Qipan.q110img.setVisible(true);
		Qipan.q110.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q110);
		Qipan.q111.setBounds(250+x,30+y,30,30);
		Qipan.q111img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q111.setBorder(null);
		frame.add(Qipan.q111img);
		Qipan.q111.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[1+4][11+4]==0&&systemtimes==0){
		systemnum[1+4][11+4]=3;
		Qipan.q111img.setIcon(bla);
		Qipan.q111img.setVisible(true);
		Qipan.q111.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q111);
		Qipan.q112.setBounds(250+x,30+y,30,30);
		Qipan.q112img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q112.setBorder(null);
		frame.add(Qipan.q112img);
		Qipan.q112.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[1+4][12+4]==0&&systemtimes==0){
		systemnum[1+4][12+4]=3;
		Qipan.q112img.setIcon(bla);
		Qipan.q112img.setVisible(true);
		Qipan.q112.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q112);
		Qipan.q113.setBounds(250+x,30+y,30,30);
		Qipan.q113img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q113.setBorder(null);
		frame.add(Qipan.q113img);
		Qipan.q113.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[1+4][13+4]==0&&systemtimes==0){
		systemnum[1+4][13+4]=3;
		Qipan.q113img.setIcon(bla);
		Qipan.q113img.setVisible(true);
		Qipan.q113.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q113);
		Qipan.q114.setBounds(250+x,30+y,30,30);
		Qipan.q114img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q114.setBorder(null);
		frame.add(Qipan.q114img);
		Qipan.q114.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[1+4][14+4]==0&&systemtimes==0){
		systemnum[1+4][14+4]=3;
		Qipan.q114img.setIcon(bla);
		Qipan.q114img.setVisible(true);
		Qipan.q114.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q114);
		Qipan.q115.setBounds(250+x,30+y,30,30);
		Qipan.q115img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q115.setBorder(null);
		frame.add(Qipan.q115img);
		Qipan.q115.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[1+4][15+4]==0&&systemtimes==0){
		systemnum[1+4][15+4]=3;
		Qipan.q115img.setIcon(bla);
		Qipan.q115img.setVisible(true);
		Qipan.q115.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q115);
		x=0;
		y+=30;
		Qipan.q21.setBounds(250+x,30+y,30,30);
		Qipan.q21img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q21.setBorder(null);
		frame.add(Qipan.q21img);
		Qipan.q21.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[2+4][1+4]==0&&systemtimes==0){
		systemnum[2+4][1+4]=3;
		Qipan.q21img.setIcon(bla);
		Qipan.q21img.setVisible(true);
		Qipan.q21.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q21);
		Qipan.q22.setBounds(250+x,30+y,30,30);
		Qipan.q22img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q22.setBorder(null);
		frame.add(Qipan.q22img);
		Qipan.q22.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[2+4][2+4]==0&&systemtimes==0){
		systemnum[2+4][2+4]=3;
		Qipan.q22img.setIcon(bla);
		Qipan.q22img.setVisible(true);
		Qipan.q22.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q22);
		Qipan.q23.setBounds(250+x,30+y,30,30);
		Qipan.q23img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q23.setBorder(null);
		frame.add(Qipan.q23img);
		Qipan.q23.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[2+4][3+4]==0&&systemtimes==0){
		systemnum[2+4][3+4]=3;
		Qipan.q23img.setIcon(bla);
		Qipan.q23img.setVisible(true);
		Qipan.q23.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q23);
		Qipan.q24.setBounds(250+x,30+y,30,30);
		Qipan.q24img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q24.setBorder(null);
		frame.add(Qipan.q24img);
		Qipan.q24.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[2+4][4+4]==0&&systemtimes==0){
		systemnum[2+4][4+4]=3;
		Qipan.q24img.setIcon(bla);
		Qipan.q24img.setVisible(true);
		Qipan.q24.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q24);
		Qipan.q25.setBounds(250+x,30+y,30,30);
		Qipan.q25img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q25.setBorder(null);
		frame.add(Qipan.q25img);
		Qipan.q25.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[2+4][5+4]==0&&systemtimes==0){
		systemnum[2+4][5+4]=3;
		Qipan.q25img.setIcon(bla);
		Qipan.q25img.setVisible(true);
		Qipan.q25.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q25);
		Qipan.q26.setBounds(250+x,30+y,30,30);
		Qipan.q26img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q26.setBorder(null);
		frame.add(Qipan.q26img);
		Qipan.q26.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[2+4][6+4]==0&&systemtimes==0){
		systemnum[2+4][6+4]=3;
		Qipan.q26img.setIcon(bla);
		Qipan.q26img.setVisible(true);
		Qipan.q26.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q26);
		Qipan.q27.setBounds(250+x,30+y,30,30);
		Qipan.q27img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q27.setBorder(null);
		frame.add(Qipan.q27img);
		Qipan.q27.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[2+4][7+4]==0&&systemtimes==0){
		systemnum[2+4][7+4]=3;
		Qipan.q27img.setIcon(bla);
		Qipan.q27img.setVisible(true);
		Qipan.q27.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q27);
		Qipan.q28.setBounds(250+x,30+y,30,30);
		Qipan.q28img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q28.setBorder(null);
		frame.add(Qipan.q28img);
		Qipan.q28.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[2+4][8+4]==0&&systemtimes==0){
		systemnum[2+4][8+4]=3;
		Qipan.q28img.setIcon(bla);
		Qipan.q28img.setVisible(true);
		Qipan.q28.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q28);
		Qipan.q29.setBounds(250+x,30+y,30,30);
		Qipan.q29img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q29.setBorder(null);
		frame.add(Qipan.q29img);
		Qipan.q29.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[2+4][9+4]==0&&systemtimes==0){
		systemnum[2+4][9+4]=3;
		Qipan.q29img.setIcon(bla);
		Qipan.q29img.setVisible(true);
		Qipan.q29.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q29);
		Qipan.q210.setBounds(250+x,30+y,30,30);
		Qipan.q210img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q210.setBorder(null);
		frame.add(Qipan.q210img);
		Qipan.q210.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[2+4][10+4]==0&&systemtimes==0){
		systemnum[2+4][10+4]=3;
		Qipan.q210img.setIcon(bla);
		Qipan.q210img.setVisible(true);
		Qipan.q210.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q210);
		Qipan.q211.setBounds(250+x,30+y,30,30);
		Qipan.q211img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q211.setBorder(null);
		frame.add(Qipan.q211img);
		Qipan.q211.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[2+4][11+4]==0&&systemtimes==0){
		systemnum[2+4][11+4]=3;
		Qipan.q211img.setIcon(bla);
		Qipan.q211img.setVisible(true);
		Qipan.q211.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q211);
		Qipan.q212.setBounds(250+x,30+y,30,30);
		Qipan.q212img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q212.setBorder(null);
		frame.add(Qipan.q212img);
		Qipan.q212.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[2+4][12+4]==0&&systemtimes==0){
		systemnum[2+4][12+4]=3;
		Qipan.q212img.setIcon(bla);
		Qipan.q212img.setVisible(true);
		Qipan.q212.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q212);
		Qipan.q213.setBounds(250+x,30+y,30,30);
		Qipan.q213img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q213.setBorder(null);
		frame.add(Qipan.q213img);
		Qipan.q213.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[2+4][13+4]==0&&systemtimes==0){
		systemnum[2+4][13+4]=3;
		Qipan.q213img.setIcon(bla);
		Qipan.q213img.setVisible(true);
		Qipan.q213.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q213);
		Qipan.q214.setBounds(250+x,30+y,30,30);
		Qipan.q214img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q214.setBorder(null);
		frame.add(Qipan.q214img);
		Qipan.q214.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[2+4][14+4]==0&&systemtimes==0){
		systemnum[2+4][14+4]=3;
		Qipan.q214img.setIcon(bla);
		Qipan.q214img.setVisible(true);
		Qipan.q214.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q214);
		Qipan.q215.setBounds(250+x,30+y,30,30);
		Qipan.q215img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q215.setBorder(null);
		frame.add(Qipan.q215img);
		Qipan.q215.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[2+4][15+4]==0&&systemtimes==0){
		systemnum[2+4][15+4]=3;
		Qipan.q215img.setIcon(bla);
		Qipan.q215img.setVisible(true);
		Qipan.q215.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q215);
		x=0;
		y+=30;
		Qipan.q31.setBounds(250+x,30+y,30,30);
		Qipan.q31img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q31.setBorder(null);
		frame.add(Qipan.q31img);
		Qipan.q31.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[3+4][1+4]==0&&systemtimes==0){
		systemnum[3+4][1+4]=3;
		Qipan.q31img.setIcon(bla);
		Qipan.q31img.setVisible(true);
		Qipan.q31.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q31);
		Qipan.q32.setBounds(250+x,30+y,30,30);
		Qipan.q32img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q32.setBorder(null);
		frame.add(Qipan.q32img);
		Qipan.q32.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[3+4][2+4]==0&&systemtimes==0){
		systemnum[3+4][2+4]=3;
		Qipan.q32img.setIcon(bla);
		Qipan.q32img.setVisible(true);
		Qipan.q32.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q32);
		Qipan.q33.setBounds(250+x,30+y,30,30);
		Qipan.q33img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q33.setBorder(null);
		frame.add(Qipan.q33img);
		Qipan.q33.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[3+4][3+4]==0&&systemtimes==0){
		systemnum[3+4][3+4]=3;
		Qipan.q33img.setIcon(bla);
		Qipan.q33img.setVisible(true);
		Qipan.q33.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q33);
		Qipan.q34.setBounds(250+x,30+y,30,30);
		Qipan.q34img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q34.setBorder(null);
		frame.add(Qipan.q34img);
		Qipan.q34.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[3+4][4+4]==0&&systemtimes==0){
		systemnum[3+4][4+4]=3;
		Qipan.q34img.setIcon(bla);
		Qipan.q34img.setVisible(true);
		Qipan.q34.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q34);
		Qipan.q35.setBounds(250+x,30+y,30,30);
		Qipan.q35img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q35.setBorder(null);
		frame.add(Qipan.q35img);
		Qipan.q35.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[3+4][5+4]==0&&systemtimes==0){
		systemnum[3+4][5+4]=3;
		Qipan.q35img.setIcon(bla);
		Qipan.q35img.setVisible(true);
		Qipan.q35.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q35);
		Qipan.q36.setBounds(250+x,30+y,30,30);
		Qipan.q36img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q36.setBorder(null);
		frame.add(Qipan.q36img);
		Qipan.q36.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[3+4][6+4]==0&&systemtimes==0){
		systemnum[3+4][6+4]=3;
		Qipan.q36img.setIcon(bla);
		Qipan.q36img.setVisible(true);
		Qipan.q36.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q36);
		Qipan.q37.setBounds(250+x,30+y,30,30);
		Qipan.q37img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q37.setBorder(null);
		frame.add(Qipan.q37img);
		Qipan.q37.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[3+4][7+4]==0&&systemtimes==0){
		systemnum[3+4][7+4]=3;
		Qipan.q37img.setIcon(bla);
		Qipan.q37img.setVisible(true);
		Qipan.q37.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q37);
		Qipan.q38.setBounds(250+x,30+y,30,30);
		Qipan.q38img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q38.setBorder(null);
		frame.add(Qipan.q38img);
		Qipan.q38.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[3+4][8+4]==0&&systemtimes==0){
		systemnum[3+4][8+4]=3;
		Qipan.q38img.setIcon(bla);
		Qipan.q38img.setVisible(true);
		Qipan.q38.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q38);
		Qipan.q39.setBounds(250+x,30+y,30,30);
		Qipan.q39img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q39.setBorder(null);
		frame.add(Qipan.q39img);
		Qipan.q39.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[3+4][9+4]==0&&systemtimes==0){
		systemnum[3+4][9+4]=3;
		Qipan.q39img.setIcon(bla);
		Qipan.q39img.setVisible(true);
		Qipan.q39.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q39);
		Qipan.q310.setBounds(250+x,30+y,30,30);
		Qipan.q310img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q310.setBorder(null);
		frame.add(Qipan.q310img);
		Qipan.q310.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[3+4][10+4]==0&&systemtimes==0){
		systemnum[3+4][10+4]=3;
		Qipan.q310img.setIcon(bla);
		Qipan.q310img.setVisible(true);
		Qipan.q310.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q310);
		Qipan.q311.setBounds(250+x,30+y,30,30);
		Qipan.q311img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q311.setBorder(null);
		frame.add(Qipan.q311img);
		Qipan.q311.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[3+4][11+4]==0&&systemtimes==0){
		systemnum[3+4][11+4]=3;
		Qipan.q311img.setIcon(bla);
		Qipan.q311img.setVisible(true);
		Qipan.q311.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q311);
		Qipan.q312.setBounds(250+x,30+y,30,30);
		Qipan.q312img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q312.setBorder(null);
		frame.add(Qipan.q312img);
		Qipan.q312.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[3+4][12+4]==0&&systemtimes==0){
		systemnum[3+4][12+4]=3;
		Qipan.q312img.setIcon(bla);
		Qipan.q312img.setVisible(true);
		Qipan.q312.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q312);
		Qipan.q313.setBounds(250+x,30+y,30,30);
		Qipan.q313img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q313.setBorder(null);
		frame.add(Qipan.q313img);
		Qipan.q313.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[3+4][13+4]==0&&systemtimes==0){
		systemnum[3+4][13+4]=3;
		Qipan.q313img.setIcon(bla);
		Qipan.q313img.setVisible(true);
		Qipan.q313.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q313);
		Qipan.q314.setBounds(250+x,30+y,30,30);
		Qipan.q314img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q314.setBorder(null);
		frame.add(Qipan.q314img);
		Qipan.q314.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[3+4][14+4]==0&&systemtimes==0){
		systemnum[3+4][14+4]=3;
		Qipan.q314img.setIcon(bla);
		Qipan.q314img.setVisible(true);
		Qipan.q314.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q314);
		Qipan.q315.setBounds(250+x,30+y,30,30);
		Qipan.q315img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q315.setBorder(null);
		frame.add(Qipan.q315img);
		Qipan.q315.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[3+4][15+4]==0&&systemtimes==0){
		systemnum[3+4][15+4]=3;
		Qipan.q315img.setIcon(bla);
		Qipan.q315img.setVisible(true);
		Qipan.q315.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q315);
		x=0;
		y+=30;
		Qipan.q41.setBounds(250+x,30+y,30,30);
		Qipan.q41img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q41.setBorder(null);
		frame.add(Qipan.q41img);
		Qipan.q41.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[4+4][1+4]==0&&systemtimes==0){
		systemnum[4+4][1+4]=3;
		Qipan.q41img.setIcon(bla);
		Qipan.q41img.setVisible(true);
		Qipan.q41.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q41);
		Qipan.q42.setBounds(250+x,30+y,30,30);
		Qipan.q42img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q42.setBorder(null);
		frame.add(Qipan.q42img);
		Qipan.q42.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[4+4][2+4]==0&&systemtimes==0){
		systemnum[4+4][2+4]=3;
		Qipan.q42img.setIcon(bla);
		Qipan.q42img.setVisible(true);
		Qipan.q42.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q42);
		Qipan.q43.setBounds(250+x,30+y,30,30);
		Qipan.q43img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q43.setBorder(null);
		frame.add(Qipan.q43img);
		Qipan.q43.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[4+4][3+4]==0&&systemtimes==0){
		systemnum[4+4][3+4]=3;
		Qipan.q43img.setIcon(bla);
		Qipan.q43img.setVisible(true);
		Qipan.q43.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q43);
		Qipan.q44.setBounds(250+x,30+y,30,30);
		Qipan.q44img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q44.setBorder(null);
		frame.add(Qipan.q44img);
		Qipan.q44.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[4+4][4+4]==0&&systemtimes==0){
		systemnum[4+4][4+4]=3;
		Qipan.q44img.setIcon(bla);
		Qipan.q44img.setVisible(true);
		Qipan.q44.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q44);
		Qipan.q45.setBounds(250+x,30+y,30,30);
		Qipan.q45img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q45.setBorder(null);
		frame.add(Qipan.q45img);
		Qipan.q45.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[4+4][5+4]==0&&systemtimes==0){
		systemnum[4+4][5+4]=3;
		Qipan.q45img.setIcon(bla);
		Qipan.q45img.setVisible(true);
		Qipan.q45.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q45);
		Qipan.q46.setBounds(250+x,30+y,30,30);
		Qipan.q46img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q46.setBorder(null);
		frame.add(Qipan.q46img);
		Qipan.q46.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[4+4][6+4]==0&&systemtimes==0){
		systemnum[4+4][6+4]=3;
		Qipan.q46img.setIcon(bla);
		Qipan.q46img.setVisible(true);
		Qipan.q46.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q46);
		Qipan.q47.setBounds(250+x,30+y,30,30);
		Qipan.q47img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q47.setBorder(null);
		frame.add(Qipan.q47img);
		Qipan.q47.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[4+4][7+4]==0&&systemtimes==0){
		systemnum[4+4][7+4]=3;
		Qipan.q47img.setIcon(bla);
		Qipan.q47img.setVisible(true);
		Qipan.q47.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q47);
		Qipan.q48.setBounds(250+x,30+y,30,30);
		Qipan.q48img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q48.setBorder(null);
		frame.add(Qipan.q48img);
		Qipan.q48.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[4+4][8+4]==0&&systemtimes==0){
		systemnum[4+4][8+4]=3;
		Qipan.q48img.setIcon(bla);
		Qipan.q48img.setVisible(true);
		Qipan.q48.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q48);
		Qipan.q49.setBounds(250+x,30+y,30,30);
		Qipan.q49img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q49.setBorder(null);
		frame.add(Qipan.q49img);
		Qipan.q49.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[4+4][9+4]==0&&systemtimes==0){
		systemnum[4+4][9+4]=3;
		Qipan.q49img.setIcon(bla);
		Qipan.q49img.setVisible(true);
		Qipan.q49.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q49);
		Qipan.q410.setBounds(250+x,30+y,30,30);
		Qipan.q410img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q410.setBorder(null);
		frame.add(Qipan.q410img);
		Qipan.q410.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[4+4][10+4]==0&&systemtimes==0){
		systemnum[4+4][10+4]=3;
		Qipan.q410img.setIcon(bla);
		Qipan.q410img.setVisible(true);
		Qipan.q410.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q410);
		Qipan.q411.setBounds(250+x,30+y,30,30);
		Qipan.q411img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q411.setBorder(null);
		frame.add(Qipan.q411img);
		Qipan.q411.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[4+4][11+4]==0&&systemtimes==0){
		systemnum[4+4][11+4]=3;
		Qipan.q411img.setIcon(bla);
		Qipan.q411img.setVisible(true);
		Qipan.q411.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q411);
		Qipan.q412.setBounds(250+x,30+y,30,30);
		Qipan.q412img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q412.setBorder(null);
		frame.add(Qipan.q412img);
		Qipan.q412.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[4+4][12+4]==0&&systemtimes==0){
		systemnum[4+4][12+4]=3;
		Qipan.q412img.setIcon(bla);
		Qipan.q412img.setVisible(true);
		Qipan.q412.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q412);
		Qipan.q413.setBounds(250+x,30+y,30,30);
		Qipan.q413img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q413.setBorder(null);
		frame.add(Qipan.q413img);
		Qipan.q413.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[4+4][13+4]==0&&systemtimes==0){
		systemnum[4+4][13+4]=3;
		Qipan.q413img.setIcon(bla);
		Qipan.q413img.setVisible(true);
		Qipan.q413.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q413);
		Qipan.q414.setBounds(250+x,30+y,30,30);
		Qipan.q414img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q414.setBorder(null);
		frame.add(Qipan.q414img);
		Qipan.q414.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[4+4][14+4]==0&&systemtimes==0){
		systemnum[4+4][14+4]=3;
		Qipan.q414img.setIcon(bla);
		Qipan.q414img.setVisible(true);
		Qipan.q414.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q414);
		Qipan.q415.setBounds(250+x,30+y,30,30);
		Qipan.q415img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q415.setBorder(null);
		frame.add(Qipan.q415img);
		Qipan.q415.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[4+4][15+4]==0&&systemtimes==0){
		systemnum[4+4][15+4]=3;
		Qipan.q415img.setIcon(bla);
		Qipan.q415img.setVisible(true);
		Qipan.q415.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q415);
		x=0;
		y+=30;
		Qipan.q51.setBounds(250+x,30+y,30,30);
		Qipan.q51img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q51.setBorder(null);
		frame.add(Qipan.q51img);
		Qipan.q51.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[5+4][1+4]==0&&systemtimes==0){
		systemnum[5+4][1+4]=3;
		Qipan.q51img.setIcon(bla);
		Qipan.q51img.setVisible(true);
		Qipan.q51.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q51);
		Qipan.q52.setBounds(250+x,30+y,30,30);
		Qipan.q52img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q52.setBorder(null);
		frame.add(Qipan.q52img);
		Qipan.q52.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[5+4][2+4]==0&&systemtimes==0){
		systemnum[5+4][2+4]=3;
		Qipan.q52img.setIcon(bla);
		Qipan.q52img.setVisible(true);
		Qipan.q52.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q52);
		Qipan.q53.setBounds(250+x,30+y,30,30);
		Qipan.q53img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q53.setBorder(null);
		frame.add(Qipan.q53img);
		Qipan.q53.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[5+4][3+4]==0&&systemtimes==0){
		systemnum[5+4][3+4]=3;
		Qipan.q53img.setIcon(bla);
		Qipan.q53img.setVisible(true);
		Qipan.q53.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q53);
		Qipan.q54.setBounds(250+x,30+y,30,30);
		Qipan.q54img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q54.setBorder(null);
		frame.add(Qipan.q54img);
		Qipan.q54.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[5+4][4+4]==0&&systemtimes==0){
		systemnum[5+4][4+4]=3;
		Qipan.q54img.setIcon(bla);
		Qipan.q54img.setVisible(true);
		Qipan.q54.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q54);
		Qipan.q55.setBounds(250+x,30+y,30,30);
		Qipan.q55img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q55.setBorder(null);
		frame.add(Qipan.q55img);
		Qipan.q55.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[5+4][5+4]==0&&systemtimes==0){
		systemnum[5+4][5+4]=3;
		Qipan.q55img.setIcon(bla);
		Qipan.q55img.setVisible(true);
		Qipan.q55.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q55);
		Qipan.q56.setBounds(250+x,30+y,30,30);
		Qipan.q56img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q56.setBorder(null);
		frame.add(Qipan.q56img);
		Qipan.q56.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[5+4][6+4]==0&&systemtimes==0){
		systemnum[5+4][6+4]=3;
		Qipan.q56img.setIcon(bla);
		Qipan.q56img.setVisible(true);
		Qipan.q56.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q56);
		Qipan.q57.setBounds(250+x,30+y,30,30);
		Qipan.q57img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q57.setBorder(null);
		frame.add(Qipan.q57img);
		Qipan.q57.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[5+4][7+4]==0&&systemtimes==0){
		systemnum[5+4][7+4]=3;
		Qipan.q57img.setIcon(bla);
		Qipan.q57img.setVisible(true);
		Qipan.q57.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q57);
		Qipan.q58.setBounds(250+x,30+y,30,30);
		Qipan.q58img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q58.setBorder(null);
		frame.add(Qipan.q58img);
		Qipan.q58.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[5+4][8+4]==0&&systemtimes==0){
		systemnum[5+4][8+4]=3;
		Qipan.q58img.setIcon(bla);
		Qipan.q58img.setVisible(true);
		Qipan.q58.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q58);
		Qipan.q59.setBounds(250+x,30+y,30,30);
		Qipan.q59img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q59.setBorder(null);
		frame.add(Qipan.q59img);
		Qipan.q59.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[5+4][9+4]==0&&systemtimes==0){
		systemnum[5+4][9+4]=3;
		Qipan.q59img.setIcon(bla);
		Qipan.q59img.setVisible(true);
		Qipan.q59.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q59);
		Qipan.q510.setBounds(250+x,30+y,30,30);
		Qipan.q510img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q510.setBorder(null);
		frame.add(Qipan.q510img);
		Qipan.q510.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[5+4][10+4]==0&&systemtimes==0){
		systemnum[5+4][10+4]=3;
		Qipan.q510img.setIcon(bla);
		Qipan.q510img.setVisible(true);
		Qipan.q510.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q510);
		Qipan.q511.setBounds(250+x,30+y,30,30);
		Qipan.q511img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q511.setBorder(null);
		frame.add(Qipan.q511img);
		Qipan.q511.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[5+4][11+4]==0&&systemtimes==0){
		systemnum[5+4][11+4]=3;
		Qipan.q511img.setIcon(bla);
		Qipan.q511img.setVisible(true);
		Qipan.q511.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q511);
		Qipan.q512.setBounds(250+x,30+y,30,30);
		Qipan.q512img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q512.setBorder(null);
		frame.add(Qipan.q512img);
		Qipan.q512.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[5+4][12+4]==0&&systemtimes==0){
		systemnum[5+4][12+4]=3;
		Qipan.q512img.setIcon(bla);
		Qipan.q512img.setVisible(true);
		Qipan.q512.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q512);
		Qipan.q513.setBounds(250+x,30+y,30,30);
		Qipan.q513img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q513.setBorder(null);
		frame.add(Qipan.q513img);
		Qipan.q513.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[5+4][13+4]==0&&systemtimes==0){
		systemnum[5+4][13+4]=3;
		Qipan.q513img.setIcon(bla);
		Qipan.q513img.setVisible(true);
		Qipan.q513.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q513);
		Qipan.q514.setBounds(250+x,30+y,30,30);
		Qipan.q514img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q514.setBorder(null);
		frame.add(Qipan.q514img);
		Qipan.q514.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[5+4][14+4]==0&&systemtimes==0){
		systemnum[5+4][14+4]=3;
		Qipan.q514img.setIcon(bla);
		Qipan.q514img.setVisible(true);
		Qipan.q514.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q514);
		Qipan.q515.setBounds(250+x,30+y,30,30);
		Qipan.q515img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q515.setBorder(null);
		frame.add(Qipan.q515img);
		Qipan.q515.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[5+4][15+4]==0&&systemtimes==0){
		systemnum[5+4][15+4]=3;
		Qipan.q515img.setIcon(bla);
		Qipan.q515img.setVisible(true);
		Qipan.q515.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q515);
		x=0;
		y+=30;
		Qipan.q61.setBounds(250+x,30+y,30,30);
		Qipan.q61img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q61.setBorder(null);
		frame.add(Qipan.q61img);
		Qipan.q61.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[6+4][1+4]==0&&systemtimes==0){
		systemnum[6+4][1+4]=3;
		Qipan.q61img.setIcon(bla);
		Qipan.q61img.setVisible(true);
		Qipan.q61.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q61);
		Qipan.q62.setBounds(250+x,30+y,30,30);
		Qipan.q62img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q62.setBorder(null);
		frame.add(Qipan.q62img);
		Qipan.q62.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[6+4][2+4]==0&&systemtimes==0){
		systemnum[6+4][2+4]=3;
		Qipan.q62img.setIcon(bla);
		Qipan.q62img.setVisible(true);
		Qipan.q62.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q62);
		Qipan.q63.setBounds(250+x,30+y,30,30);
		Qipan.q63img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q63.setBorder(null);
		frame.add(Qipan.q63img);
		Qipan.q63.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[6+4][3+4]==0&&systemtimes==0){
		systemnum[6+4][3+4]=3;
		Qipan.q63img.setIcon(bla);
		Qipan.q63img.setVisible(true);
		Qipan.q63.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q63);
		Qipan.q64.setBounds(250+x,30+y,30,30);
		Qipan.q64img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q64.setBorder(null);
		frame.add(Qipan.q64img);
		Qipan.q64.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[6+4][4+4]==0&&systemtimes==0){
		systemnum[6+4][4+4]=3;
		Qipan.q64img.setIcon(bla);
		Qipan.q64img.setVisible(true);
		Qipan.q64.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q64);
		Qipan.q65.setBounds(250+x,30+y,30,30);
		Qipan.q65img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q65.setBorder(null);
		frame.add(Qipan.q65img);
		Qipan.q65.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[6+4][5+4]==0&&systemtimes==0){
		systemnum[6+4][5+4]=3;
		Qipan.q65img.setIcon(bla);
		Qipan.q65img.setVisible(true);
		Qipan.q65.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q65);
		Qipan.q66.setBounds(250+x,30+y,30,30);
		Qipan.q66img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q66.setBorder(null);
		frame.add(Qipan.q66img);
		Qipan.q66.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[6+4][6+4]==0&&systemtimes==0){
		systemnum[6+4][6+4]=3;
		Qipan.q66img.setIcon(bla);
		Qipan.q66img.setVisible(true);
		Qipan.q66.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q66);
		Qipan.q67.setBounds(250+x,30+y,30,30);
		Qipan.q67img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q67.setBorder(null);
		frame.add(Qipan.q67img);
		Qipan.q67.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[6+4][7+4]==0&&systemtimes==0){
		systemnum[6+4][7+4]=3;
		Qipan.q67img.setIcon(bla);
		Qipan.q67img.setVisible(true);
		Qipan.q67.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q67);
		Qipan.q68.setBounds(250+x,30+y,30,30);
		Qipan.q68img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q68.setBorder(null);
		frame.add(Qipan.q68img);
		Qipan.q68.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[6+4][8+4]==0&&systemtimes==0){
		systemnum[6+4][8+4]=3;
		Qipan.q68img.setIcon(bla);
		Qipan.q68img.setVisible(true);
		Qipan.q68.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q68);
		Qipan.q69.setBounds(250+x,30+y,30,30);
		Qipan.q69img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q69.setBorder(null);
		frame.add(Qipan.q69img);
		Qipan.q69.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[6+4][9+4]==0&&systemtimes==0){
		systemnum[6+4][9+4]=3;
		Qipan.q69img.setIcon(bla);
		Qipan.q69img.setVisible(true);
		Qipan.q69.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q69);
		Qipan.q610.setBounds(250+x,30+y,30,30);
		Qipan.q610img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q610.setBorder(null);
		frame.add(Qipan.q610img);
		Qipan.q610.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[6+4][10+4]==0&&systemtimes==0){
		systemnum[6+4][10+4]=3;
		Qipan.q610img.setIcon(bla);
		Qipan.q610img.setVisible(true);
		Qipan.q610.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q610);
		Qipan.q611.setBounds(250+x,30+y,30,30);
		Qipan.q611img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q611.setBorder(null);
		frame.add(Qipan.q611img);
		Qipan.q611.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[6+4][11+4]==0&&systemtimes==0){
		systemnum[6+4][11+4]=3;
		Qipan.q611img.setIcon(bla);
		Qipan.q611img.setVisible(true);
		Qipan.q611.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q611);
		Qipan.q612.setBounds(250+x,30+y,30,30);
		Qipan.q612img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q612.setBorder(null);
		frame.add(Qipan.q612img);
		Qipan.q612.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[6+4][12+4]==0&&systemtimes==0){
		systemnum[6+4][12+4]=3;
		Qipan.q612img.setIcon(bla);
		Qipan.q612img.setVisible(true);
		Qipan.q612.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q612);
		Qipan.q613.setBounds(250+x,30+y,30,30);
		Qipan.q613img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q613.setBorder(null);
		frame.add(Qipan.q613img);
		Qipan.q613.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[6+4][13+4]==0&&systemtimes==0){
		systemnum[6+4][13+4]=3;
		Qipan.q613img.setIcon(bla);
		Qipan.q613img.setVisible(true);
		Qipan.q613.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q613);
		Qipan.q614.setBounds(250+x,30+y,30,30);
		Qipan.q614img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q614.setBorder(null);
		frame.add(Qipan.q614img);
		Qipan.q614.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[6+4][14+4]==0&&systemtimes==0){
		systemnum[6+4][14+4]=3;
		Qipan.q614img.setIcon(bla);
		Qipan.q614img.setVisible(true);
		Qipan.q614.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q614);
		Qipan.q615.setBounds(250+x,30+y,30,30);
		Qipan.q615img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q615.setBorder(null);
		frame.add(Qipan.q615img);
		Qipan.q615.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[6+4][15+4]==0&&systemtimes==0){
		systemnum[6+4][15+4]=3;
		Qipan.q615img.setIcon(bla);
		Qipan.q615img.setVisible(true);
		Qipan.q615.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q615);
		x=0;
		y+=30;
		Qipan.q71.setBounds(250+x,30+y,30,30);
		Qipan.q71img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q71.setBorder(null);
		frame.add(Qipan.q71img);
		Qipan.q71.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[7+4][1+4]==0&&systemtimes==0){
		systemnum[7+4][1+4]=3;
		Qipan.q71img.setIcon(bla);
		Qipan.q71img.setVisible(true);
		Qipan.q71.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q71);
		Qipan.q72.setBounds(250+x,30+y,30,30);
		Qipan.q72img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q72.setBorder(null);
		frame.add(Qipan.q72img);
		Qipan.q72.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[7+4][2+4]==0&&systemtimes==0){
		systemnum[7+4][2+4]=3;
		Qipan.q72img.setIcon(bla);
		Qipan.q72img.setVisible(true);
		Qipan.q72.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q72);
		Qipan.q73.setBounds(250+x,30+y,30,30);
		Qipan.q73img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q73.setBorder(null);
		frame.add(Qipan.q73img);
		Qipan.q73.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[7+4][3+4]==0&&systemtimes==0){
		systemnum[7+4][3+4]=3;
		Qipan.q73img.setIcon(bla);
		Qipan.q73img.setVisible(true);
		Qipan.q73.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q73);
		Qipan.q74.setBounds(250+x,30+y,30,30);
		Qipan.q74img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q74.setBorder(null);
		frame.add(Qipan.q74img);
		Qipan.q74.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[7+4][4+4]==0&&systemtimes==0){
		systemnum[7+4][4+4]=3;
		Qipan.q74img.setIcon(bla);
		Qipan.q74img.setVisible(true);
		Qipan.q74.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q74);
		Qipan.q75.setBounds(250+x,30+y,30,30);
		Qipan.q75img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q75.setBorder(null);
		frame.add(Qipan.q75img);
		Qipan.q75.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[7+4][5+4]==0&&systemtimes==0){
		systemnum[7+4][5+4]=3;
		Qipan.q75img.setIcon(bla);
		Qipan.q75img.setVisible(true);
		Qipan.q75.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q75);
		Qipan.q76.setBounds(250+x,30+y,30,30);
		Qipan.q76img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q76.setBorder(null);
		frame.add(Qipan.q76img);
		Qipan.q76.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[7+4][6+4]==0&&systemtimes==0){
		systemnum[7+4][6+4]=3;
		Qipan.q76img.setIcon(bla);
		Qipan.q76img.setVisible(true);
		Qipan.q76.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q76);
		Qipan.q77.setBounds(250+x,30+y,30,30);
		Qipan.q77img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q77.setBorder(null);
		frame.add(Qipan.q77img);
		Qipan.q77.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[7+4][7+4]==0&&systemtimes==0){
		systemnum[7+4][7+4]=3;
		Qipan.q77img.setIcon(bla);
		Qipan.q77img.setVisible(true);
		Qipan.q77.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q77);
		Qipan.q78.setBounds(250+x,30+y,30,30);
		Qipan.q78img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q78.setBorder(null);
		frame.add(Qipan.q78img);
		Qipan.q78.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[7+4][8+4]==0&&systemtimes==0){
		systemnum[7+4][8+4]=3;
		Qipan.q78img.setIcon(bla);
		Qipan.q78img.setVisible(true);
		Qipan.q78.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q78);
		Qipan.q79.setBounds(250+x,30+y,30,30);
		Qipan.q79img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q79.setBorder(null);
		frame.add(Qipan.q79img);
		Qipan.q79.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[7+4][9+4]==0&&systemtimes==0){
		systemnum[7+4][9+4]=3;
		Qipan.q79img.setIcon(bla);
		Qipan.q79img.setVisible(true);
		Qipan.q79.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q79);
		Qipan.q710.setBounds(250+x,30+y,30,30);
		Qipan.q710img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q710.setBorder(null);
		frame.add(Qipan.q710img);
		Qipan.q710.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[7+4][10+4]==0&&systemtimes==0){
		systemnum[7+4][10+4]=3;
		Qipan.q710img.setIcon(bla);
		Qipan.q710img.setVisible(true);
		Qipan.q710.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q710);
		Qipan.q711.setBounds(250+x,30+y,30,30);
		Qipan.q711img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q711.setBorder(null);
		frame.add(Qipan.q711img);
		Qipan.q711.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[7+4][11+4]==0&&systemtimes==0){
		systemnum[7+4][11+4]=3;
		Qipan.q711img.setIcon(bla);
		Qipan.q711img.setVisible(true);
		Qipan.q711.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q711);
		Qipan.q712.setBounds(250+x,30+y,30,30);
		Qipan.q712img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q712.setBorder(null);
		frame.add(Qipan.q712img);
		Qipan.q712.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[7+4][12+4]==0&&systemtimes==0){
		systemnum[7+4][12+4]=3;
		Qipan.q712img.setIcon(bla);
		Qipan.q712img.setVisible(true);
		Qipan.q712.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q712);
		Qipan.q713.setBounds(250+x,30+y,30,30);
		Qipan.q713img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q713.setBorder(null);
		frame.add(Qipan.q713img);
		Qipan.q713.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[7+4][13+4]==0&&systemtimes==0){
		systemnum[7+4][13+4]=3;
		Qipan.q713img.setIcon(bla);
		Qipan.q713img.setVisible(true);
		Qipan.q713.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q713);
		Qipan.q714.setBounds(250+x,30+y,30,30);
		Qipan.q714img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q714.setBorder(null);
		frame.add(Qipan.q714img);
		Qipan.q714.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[7+4][14+4]==0&&systemtimes==0){
		systemnum[7+4][14+4]=3;
		Qipan.q714img.setIcon(bla);
		Qipan.q714img.setVisible(true);
		Qipan.q714.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q714);
		Qipan.q715.setBounds(250+x,30+y,30,30);
		Qipan.q715img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q715.setBorder(null);
		frame.add(Qipan.q715img);
		Qipan.q715.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[7+4][15+4]==0&&systemtimes==0){
		systemnum[7+4][15+4]=3;
		Qipan.q715img.setIcon(bla);
		Qipan.q715img.setVisible(true);
		Qipan.q715.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q715);
		x=0;
		y+=30;
		Qipan.q81.setBounds(250+x,30+y,30,30);
		Qipan.q81img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q81.setBorder(null);
		frame.add(Qipan.q81img);
		Qipan.q81.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[8+4][1+4]==0&&systemtimes==0){
		systemnum[8+4][1+4]=3;
		Qipan.q81img.setIcon(bla);
		Qipan.q81img.setVisible(true);
		Qipan.q81.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q81);
		Qipan.q82.setBounds(250+x,30+y,30,30);
		Qipan.q82img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q82.setBorder(null);
		frame.add(Qipan.q82img);
		Qipan.q82.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[8+4][2+4]==0&&systemtimes==0){
		systemnum[8+4][2+4]=3;
		Qipan.q82img.setIcon(bla);
		Qipan.q82img.setVisible(true);
		Qipan.q82.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q82);
		Qipan.q83.setBounds(250+x,30+y,30,30);
		Qipan.q83img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q83.setBorder(null);
		frame.add(Qipan.q83img);
		Qipan.q83.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[8+4][3+4]==0&&systemtimes==0){
		systemnum[8+4][3+4]=3;
		Qipan.q83img.setIcon(bla);
		Qipan.q83img.setVisible(true);
		Qipan.q83.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q83);
		Qipan.q84.setBounds(250+x,30+y,30,30);
		Qipan.q84img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q84.setBorder(null);
		frame.add(Qipan.q84img);
		Qipan.q84.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[8+4][4+4]==0&&systemtimes==0){
		systemnum[8+4][4+4]=3;
		Qipan.q84img.setIcon(bla);
		Qipan.q84img.setVisible(true);
		Qipan.q84.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q84);
		Qipan.q85.setBounds(250+x,30+y,30,30);
		Qipan.q85img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q85.setBorder(null);
		frame.add(Qipan.q85img);
		Qipan.q85.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[8+4][5+4]==0&&systemtimes==0){
		systemnum[8+4][5+4]=3;
		Qipan.q85img.setIcon(bla);
		Qipan.q85img.setVisible(true);
		Qipan.q85.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q85);
		Qipan.q86.setBounds(250+x,30+y,30,30);
		Qipan.q86img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q86.setBorder(null);
		frame.add(Qipan.q86img);
		Qipan.q86.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[8+4][6+4]==0&&systemtimes==0){
		systemnum[8+4][6+4]=3;
		Qipan.q86img.setIcon(bla);
		Qipan.q86img.setVisible(true);
		Qipan.q86.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q86);
		Qipan.q87.setBounds(250+x,30+y,30,30);
		Qipan.q87img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q87.setBorder(null);
		frame.add(Qipan.q87img);
		Qipan.q87.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[8+4][7+4]==0&&systemtimes==0){
		systemnum[8+4][7+4]=3;
		Qipan.q87img.setIcon(bla);
		Qipan.q87img.setVisible(true);
		Qipan.q87.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q87);
		Qipan.q88.setBounds(250+x,30+y,30,30);
		Qipan.q88img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q88.setBorder(null);
		frame.add(Qipan.q88img);
		Qipan.q88.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[8+4][8+4]==0&&systemtimes==0){
		systemnum[8+4][8+4]=3;
		Qipan.q88img.setIcon(bla);
		Qipan.q88img.setVisible(true);
		Qipan.q88.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q88);
		Qipan.q89.setBounds(250+x,30+y,30,30);
		Qipan.q89img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q89.setBorder(null);
		frame.add(Qipan.q89img);
		Qipan.q89.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[8+4][9+4]==0&&systemtimes==0){
		systemnum[8+4][9+4]=3;
		Qipan.q89img.setIcon(bla);
		Qipan.q89img.setVisible(true);
		Qipan.q89.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q89);
		Qipan.q810.setBounds(250+x,30+y,30,30);
		Qipan.q810img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q810.setBorder(null);
		frame.add(Qipan.q810img);
		Qipan.q810.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[8+4][10+4]==0&&systemtimes==0){
		systemnum[8+4][10+4]=3;
		Qipan.q810img.setIcon(bla);
		Qipan.q810img.setVisible(true);
		Qipan.q810.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q810);
		Qipan.q811.setBounds(250+x,30+y,30,30);
		Qipan.q811img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q811.setBorder(null);
		frame.add(Qipan.q811img);
		Qipan.q811.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[8+4][11+4]==0&&systemtimes==0){
		systemnum[8+4][11+4]=3;
		Qipan.q811img.setIcon(bla);
		Qipan.q811img.setVisible(true);
		Qipan.q811.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q811);
		Qipan.q812.setBounds(250+x,30+y,30,30);
		Qipan.q812img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q812.setBorder(null);
		frame.add(Qipan.q812img);
		Qipan.q812.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[8+4][12+4]==0&&systemtimes==0){
		systemnum[8+4][12+4]=3;
		Qipan.q812img.setIcon(bla);
		Qipan.q812img.setVisible(true);
		Qipan.q812.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q812);
		Qipan.q813.setBounds(250+x,30+y,30,30);
		Qipan.q813img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q813.setBorder(null);
		frame.add(Qipan.q813img);
		Qipan.q813.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[8+4][13+4]==0&&systemtimes==0){
		systemnum[8+4][13+4]=3;
		Qipan.q813img.setIcon(bla);
		Qipan.q813img.setVisible(true);
		Qipan.q813.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q813);
		Qipan.q814.setBounds(250+x,30+y,30,30);
		Qipan.q814img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q814.setBorder(null);
		frame.add(Qipan.q814img);
		Qipan.q814.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[8+4][14+4]==0&&systemtimes==0){
		systemnum[8+4][14+4]=3;
		Qipan.q814img.setIcon(bla);
		Qipan.q814img.setVisible(true);
		Qipan.q814.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q814);
		Qipan.q815.setBounds(250+x,30+y,30,30);
		Qipan.q815img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q815.setBorder(null);
		frame.add(Qipan.q815img);
		Qipan.q815.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[8+4][15+4]==0&&systemtimes==0){
		systemnum[8+4][15+4]=3;
		Qipan.q815img.setIcon(bla);
		Qipan.q815img.setVisible(true);
		Qipan.q815.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q815);
		x=0;
		y+=30;
		Qipan.q91.setBounds(250+x,30+y,30,30);
		Qipan.q91img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q91.setBorder(null);
		frame.add(Qipan.q91img);
		Qipan.q91.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[9+4][1+4]==0&&systemtimes==0){
		systemnum[9+4][1+4]=3;
		Qipan.q91img.setIcon(bla);
		Qipan.q91img.setVisible(true);
		Qipan.q91.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q91);
		Qipan.q92.setBounds(250+x,30+y,30,30);
		Qipan.q92img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q92.setBorder(null);
		frame.add(Qipan.q92img);
		Qipan.q92.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[9+4][2+4]==0&&systemtimes==0){
		systemnum[9+4][2+4]=3;
		Qipan.q92img.setIcon(bla);
		Qipan.q92img.setVisible(true);
		Qipan.q92.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q92);
		Qipan.q93.setBounds(250+x,30+y,30,30);
		Qipan.q93img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q93.setBorder(null);
		frame.add(Qipan.q93img);
		Qipan.q93.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[9+4][3+4]==0&&systemtimes==0){
		systemnum[9+4][3+4]=3;
		Qipan.q93img.setIcon(bla);
		Qipan.q93img.setVisible(true);
		Qipan.q93.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q93);
		Qipan.q94.setBounds(250+x,30+y,30,30);
		Qipan.q94img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q94.setBorder(null);
		frame.add(Qipan.q94img);
		Qipan.q94.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[9+4][4+4]==0&&systemtimes==0){
		systemnum[9+4][4+4]=3;
		Qipan.q94img.setIcon(bla);
		Qipan.q94img.setVisible(true);
		Qipan.q94.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q94);
		Qipan.q95.setBounds(250+x,30+y,30,30);
		Qipan.q95img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q95.setBorder(null);
		frame.add(Qipan.q95img);
		Qipan.q95.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[9+4][5+4]==0&&systemtimes==0){
		systemnum[9+4][5+4]=3;
		Qipan.q95img.setIcon(bla);
		Qipan.q95img.setVisible(true);
		Qipan.q95.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q95);
		Qipan.q96.setBounds(250+x,30+y,30,30);
		Qipan.q96img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q96.setBorder(null);
		frame.add(Qipan.q96img);
		Qipan.q96.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[9+4][6+4]==0&&systemtimes==0){
		systemnum[9+4][6+4]=3;
		Qipan.q96img.setIcon(bla);
		Qipan.q96img.setVisible(true);
		Qipan.q96.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q96);
		Qipan.q97.setBounds(250+x,30+y,30,30);
		Qipan.q97img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q97.setBorder(null);
		frame.add(Qipan.q97img);
		Qipan.q97.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[9+4][7+4]==0&&systemtimes==0){
		systemnum[9+4][7+4]=3;
		Qipan.q97img.setIcon(bla);
		Qipan.q97img.setVisible(true);
		Qipan.q97.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q97);
		Qipan.q98.setBounds(250+x,30+y,30,30);
		Qipan.q98img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q98.setBorder(null);
		frame.add(Qipan.q98img);
		Qipan.q98.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[9+4][8+4]==0&&systemtimes==0){
		systemnum[9+4][8+4]=3;
		Qipan.q98img.setIcon(bla);
		Qipan.q98img.setVisible(true);
		Qipan.q98.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q98);
		Qipan.q99.setBounds(250+x,30+y,30,30);
		Qipan.q99img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q99.setBorder(null);
		frame.add(Qipan.q99img);
		Qipan.q99.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[9+4][9+4]==0&&systemtimes==0){
		systemnum[9+4][9+4]=3;
		Qipan.q99img.setIcon(bla);
		Qipan.q99img.setVisible(true);
		Qipan.q99.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q99);
		Qipan.q910.setBounds(250+x,30+y,30,30);
		Qipan.q910img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q910.setBorder(null);
		frame.add(Qipan.q910img);
		Qipan.q910.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[9+4][10+4]==0&&systemtimes==0){
		systemnum[9+4][10+4]=3;
		Qipan.q910img.setIcon(bla);
		Qipan.q910img.setVisible(true);
		Qipan.q910.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q910);
		Qipan.q911.setBounds(250+x,30+y,30,30);
		Qipan.q911img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q911.setBorder(null);
		frame.add(Qipan.q911img);
		Qipan.q911.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[9+4][11+4]==0&&systemtimes==0){
		systemnum[9+4][11+4]=3;
		Qipan.q911img.setIcon(bla);
		Qipan.q911img.setVisible(true);
		Qipan.q911.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q911);
		Qipan.q912.setBounds(250+x,30+y,30,30);
		Qipan.q912img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q912.setBorder(null);
		frame.add(Qipan.q912img);
		Qipan.q912.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[9+4][12+4]==0&&systemtimes==0){
		systemnum[9+4][12+4]=3;
		Qipan.q912img.setIcon(bla);
		Qipan.q912img.setVisible(true);
		Qipan.q912.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q912);
		Qipan.q913.setBounds(250+x,30+y,30,30);
		Qipan.q913img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q913.setBorder(null);
		frame.add(Qipan.q913img);
		Qipan.q913.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[9+4][13+4]==0&&systemtimes==0){
		systemnum[9+4][13+4]=3;
		Qipan.q913img.setIcon(bla);
		Qipan.q913img.setVisible(true);
		Qipan.q913.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q913);
		Qipan.q914.setBounds(250+x,30+y,30,30);
		Qipan.q914img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q914.setBorder(null);
		frame.add(Qipan.q914img);
		Qipan.q914.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[9+4][14+4]==0&&systemtimes==0){
		systemnum[9+4][14+4]=3;
		Qipan.q914img.setIcon(bla);
		Qipan.q914img.setVisible(true);
		Qipan.q914.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q914);
		Qipan.q915.setBounds(250+x,30+y,30,30);
		Qipan.q915img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q915.setBorder(null);
		frame.add(Qipan.q915img);
		Qipan.q915.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[9+4][15+4]==0&&systemtimes==0){
		systemnum[9+4][15+4]=3;
		Qipan.q915img.setIcon(bla);
		Qipan.q915img.setVisible(true);
		Qipan.q915.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q915);
		x=0;
		y+=30;
		Qipan.q1001.setBounds(250+x,30+y,30,30);
		Qipan.q1001img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1001.setBorder(null);
		frame.add(Qipan.q1001img);
		Qipan.q1001.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[10+4][1+4]==0&&systemtimes==0){
		systemnum[10+4][1+4]=3;
		Qipan.q1001img.setIcon(bla);
		Qipan.q1001img.setVisible(true);
		Qipan.q1001.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1001);
		Qipan.q1002.setBounds(250+x,30+y,30,30);
		Qipan.q1002img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1002.setBorder(null);
		frame.add(Qipan.q1002img);
		Qipan.q1002.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[10+4][2+4]==0&&systemtimes==0){
		systemnum[10+4][2+4]=3;
		Qipan.q1002img.setIcon(bla);
		Qipan.q1002img.setVisible(true);
		Qipan.q1002.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1002);
		Qipan.q1003.setBounds(250+x,30+y,30,30);
		Qipan.q1003img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1003.setBorder(null);
		frame.add(Qipan.q1003img);
		Qipan.q1003.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[10+4][3+4]==0&&systemtimes==0){
		systemnum[10+4][3+4]=3;
		Qipan.q1003img.setIcon(bla);
		Qipan.q1003img.setVisible(true);
		Qipan.q1003.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1003);
		Qipan.q1004.setBounds(250+x,30+y,30,30);
		Qipan.q1004img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1004.setBorder(null);
		frame.add(Qipan.q1004img);
		Qipan.q1004.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[10+4][4+4]==0&&systemtimes==0){
		systemnum[10+4][4+4]=3;
		Qipan.q1004img.setIcon(bla);
		Qipan.q1004img.setVisible(true);
		Qipan.q1004.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1004);
		Qipan.q1005.setBounds(250+x,30+y,30,30);
		Qipan.q1005img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1005.setBorder(null);
		frame.add(Qipan.q1005img);
		Qipan.q1005.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[10+4][5+4]==0&&systemtimes==0){
		systemnum[10+4][5+4]=3;
		Qipan.q1005img.setIcon(bla);
		Qipan.q1005img.setVisible(true);
		Qipan.q1005.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1005);
		Qipan.q1006.setBounds(250+x,30+y,30,30);
		Qipan.q1006img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1006.setBorder(null);
		frame.add(Qipan.q1006img);
		Qipan.q1006.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[10+4][6+4]==0&&systemtimes==0){
		systemnum[10+4][6+4]=3;
		Qipan.q1006img.setIcon(bla);
		Qipan.q1006img.setVisible(true);
		Qipan.q1006.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1006);
		Qipan.q1007.setBounds(250+x,30+y,30,30);
		Qipan.q1007img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1007.setBorder(null);
		frame.add(Qipan.q1007img);
		Qipan.q1007.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[10+4][7+4]==0&&systemtimes==0){
		systemnum[10+4][7+4]=3;
		Qipan.q1007img.setIcon(bla);
		Qipan.q1007img.setVisible(true);
		Qipan.q1007.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1007);
		Qipan.q1008.setBounds(250+x,30+y,30,30);
		Qipan.q1008img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1008.setBorder(null);
		frame.add(Qipan.q1008img);
		Qipan.q1008.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[10+4][8+4]==0&&systemtimes==0){
		systemnum[10+4][8+4]=3;
		Qipan.q1008img.setIcon(bla);
		Qipan.q1008img.setVisible(true);
		Qipan.q1008.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1008);
		Qipan.q1009.setBounds(250+x,30+y,30,30);
		Qipan.q1009img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1009.setBorder(null);
		frame.add(Qipan.q1009img);
		Qipan.q1009.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[10+4][9+4]==0&&systemtimes==0){
		systemnum[10+4][9+4]=3;
		Qipan.q1009img.setIcon(bla);
		Qipan.q1009img.setVisible(true);
		Qipan.q1009.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1009);
		Qipan.q1010.setBounds(250+x,30+y,30,30);
		Qipan.q1010img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1010.setBorder(null);
		frame.add(Qipan.q1010img);
		Qipan.q1010.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[10+4][10+4]==0&&systemtimes==0){
		systemnum[10+4][10+4]=3;
		Qipan.q1010img.setIcon(bla);
		Qipan.q1010img.setVisible(true);
		Qipan.q1010.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1010);
		Qipan.q1011.setBounds(250+x,30+y,30,30);
		Qipan.q1011img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1011.setBorder(null);
		frame.add(Qipan.q1011img);
		Qipan.q1011.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[10+4][11+4]==0&&systemtimes==0){
		systemnum[10+4][11+4]=3;
		Qipan.q1011img.setIcon(bla);
		Qipan.q1011img.setVisible(true);
		Qipan.q1011.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1011);
		Qipan.q1012.setBounds(250+x,30+y,30,30);
		Qipan.q1012img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1012.setBorder(null);
		frame.add(Qipan.q1012img);
		Qipan.q1012.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[10+4][12+4]==0&&systemtimes==0){
		systemnum[10+4][12+4]=3;
		Qipan.q1012img.setIcon(bla);
		Qipan.q1012img.setVisible(true);
		Qipan.q1012.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1012);
		Qipan.q1013.setBounds(250+x,30+y,30,30);
		Qipan.q1013img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1013.setBorder(null);
		frame.add(Qipan.q1013img);
		Qipan.q1013.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[10+4][13+4]==0&&systemtimes==0){
		systemnum[10+4][13+4]=3;
		Qipan.q1013img.setIcon(bla);
		Qipan.q1013img.setVisible(true);
		Qipan.q1013.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1013);
		Qipan.q1014.setBounds(250+x,30+y,30,30);
		Qipan.q1014img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1014.setBorder(null);
		frame.add(Qipan.q1014img);
		Qipan.q1014.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[10+4][14+4]==0&&systemtimes==0){
		systemnum[10+4][14+4]=3;
		Qipan.q1014img.setIcon(bla);
		Qipan.q1014img.setVisible(true);
		Qipan.q1014.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1014);
		Qipan.q1015.setBounds(250+x,30+y,30,30);
		Qipan.q1015img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1015.setBorder(null);
		frame.add(Qipan.q1015img);
		Qipan.q1015.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[10+4][15+4]==0&&systemtimes==0){
		systemnum[10+4][15+4]=3;
		Qipan.q1015img.setIcon(bla);
		Qipan.q1015img.setVisible(true);
		Qipan.q1015.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1015);
		x=0;
		y+=30;
		Qipan.q1101.setBounds(250+x,30+y,30,30);
		Qipan.q1101img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1101.setBorder(null);
		frame.add(Qipan.q1101img);
		Qipan.q1101.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[11+4][1+4]==0&&systemtimes==0){
		systemnum[11+4][1+4]=3;
		Qipan.q1101img.setIcon(bla);
		Qipan.q1101img.setVisible(true);
		Qipan.q1101.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1101);
		Qipan.q1102.setBounds(250+x,30+y,30,30);
		Qipan.q1102img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1102.setBorder(null);
		frame.add(Qipan.q1102img);
		Qipan.q1102.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[11+4][2+4]==0&&systemtimes==0){
		systemnum[11+4][2+4]=3;
		Qipan.q1102img.setIcon(bla);
		Qipan.q1102img.setVisible(true);
		Qipan.q1102.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1102);
		Qipan.q1103.setBounds(250+x,30+y,30,30);
		Qipan.q1103img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1103.setBorder(null);
		frame.add(Qipan.q1103img);
		Qipan.q1103.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[11+4][3+4]==0&&systemtimes==0){
		systemnum[11+4][3+4]=3;
		Qipan.q1103img.setIcon(bla);
		Qipan.q1103img.setVisible(true);
		Qipan.q1103.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1103);
		Qipan.q1104.setBounds(250+x,30+y,30,30);
		Qipan.q1104img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1104.setBorder(null);
		frame.add(Qipan.q1104img);
		Qipan.q1104.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[11+4][4+4]==0&&systemtimes==0){
		systemnum[11+4][4+4]=3;
		Qipan.q1104img.setIcon(bla);
		Qipan.q1104img.setVisible(true);
		Qipan.q1104.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1104);
		Qipan.q1105.setBounds(250+x,30+y,30,30);
		Qipan.q1105img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1105.setBorder(null);
		frame.add(Qipan.q1105img);
		Qipan.q1105.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[11+4][5+4]==0&&systemtimes==0){
		systemnum[11+4][5+4]=3;
		Qipan.q1105img.setIcon(bla);
		Qipan.q1105img.setVisible(true);
		Qipan.q1105.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1105);
		Qipan.q1106.setBounds(250+x,30+y,30,30);
		Qipan.q1106img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1106.setBorder(null);
		frame.add(Qipan.q1106img);
		Qipan.q1106.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[11+4][6+4]==0&&systemtimes==0){
		systemnum[11+4][6+4]=3;
		Qipan.q1106img.setIcon(bla);
		Qipan.q1106img.setVisible(true);
		Qipan.q1106.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1106);
		Qipan.q1107.setBounds(250+x,30+y,30,30);
		Qipan.q1107img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1107.setBorder(null);
		frame.add(Qipan.q1107img);
		Qipan.q1107.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[11+4][7+4]==0&&systemtimes==0){
		systemnum[11+4][7+4]=3;
		Qipan.q1107img.setIcon(bla);
		Qipan.q1107img.setVisible(true);
		Qipan.q1107.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1107);
		Qipan.q1108.setBounds(250+x,30+y,30,30);
		Qipan.q1108img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1108.setBorder(null);
		frame.add(Qipan.q1108img);
		Qipan.q1108.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[11+4][8+4]==0&&systemtimes==0){
		systemnum[11+4][8+4]=3;
		Qipan.q1108img.setIcon(bla);
		Qipan.q1108img.setVisible(true);
		Qipan.q1108.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1108);
		Qipan.q1109.setBounds(250+x,30+y,30,30);
		Qipan.q1109img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1109.setBorder(null);
		frame.add(Qipan.q1109img);
		Qipan.q1109.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[11+4][9+4]==0&&systemtimes==0){
		systemnum[11+4][9+4]=3;
		Qipan.q1109img.setIcon(bla);
		Qipan.q1109img.setVisible(true);
		Qipan.q1109.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1109);
		Qipan.q1110.setBounds(250+x,30+y,30,30);
		Qipan.q1110img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1110.setBorder(null);
		frame.add(Qipan.q1110img);
		Qipan.q1110.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[11+4][10+4]==0&&systemtimes==0){
		systemnum[11+4][10+4]=3;
		Qipan.q1110img.setIcon(bla);
		Qipan.q1110img.setVisible(true);
		Qipan.q1110.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1110);
		Qipan.q1111.setBounds(250+x,30+y,30,30);
		Qipan.q1111img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1111.setBorder(null);
		frame.add(Qipan.q1111img);
		Qipan.q1111.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[11+4][11+4]==0&&systemtimes==0){
		systemnum[11+4][11+4]=3;
		Qipan.q1111img.setIcon(bla);
		Qipan.q1111img.setVisible(true);
		Qipan.q1111.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1111);
		Qipan.q1112.setBounds(250+x,30+y,30,30);
		Qipan.q1112img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1112.setBorder(null);
		frame.add(Qipan.q1112img);
		Qipan.q1112.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[11+4][12+4]==0&&systemtimes==0){
		systemnum[11+4][12+4]=3;
		Qipan.q1112img.setIcon(bla);
		Qipan.q1112img.setVisible(true);
		Qipan.q1112.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1112);
		Qipan.q1113.setBounds(250+x,30+y,30,30);
		Qipan.q1113img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1113.setBorder(null);
		frame.add(Qipan.q1113img);
		Qipan.q1113.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[11+4][13+4]==0&&systemtimes==0){
		systemnum[11+4][13+4]=3;
		Qipan.q1113img.setIcon(bla);
		Qipan.q1113img.setVisible(true);
		Qipan.q1113.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1113);
		Qipan.q1114.setBounds(250+x,30+y,30,30);
		Qipan.q1114img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1114.setBorder(null);
		frame.add(Qipan.q1114img);
		Qipan.q1114.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[11+4][14+4]==0&&systemtimes==0){
		systemnum[11+4][14+4]=3;
		Qipan.q1114img.setIcon(bla);
		Qipan.q1114img.setVisible(true);
		Qipan.q1114.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1114);
		Qipan.q1115.setBounds(250+x,30+y,30,30);
		Qipan.q1115img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1115.setBorder(null);
		frame.add(Qipan.q1115img);
		Qipan.q1115.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[11+4][15+4]==0&&systemtimes==0){
		systemnum[11+4][15+4]=3;
		Qipan.q1115img.setIcon(bla);
		Qipan.q1115img.setVisible(true);
		Qipan.q1115.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1115);
		x=0;
		y+=30;
		Qipan.q1201.setBounds(250+x,30+y,30,30);
		Qipan.q1201img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1201.setBorder(null);
		frame.add(Qipan.q1201img);
		Qipan.q1201.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[12+4][1+4]==0&&systemtimes==0){
		systemnum[12+4][1+4]=3;
		Qipan.q1201img.setIcon(bla);
		Qipan.q1201img.setVisible(true);
		Qipan.q1201.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1201);
		Qipan.q1202.setBounds(250+x,30+y,30,30);
		Qipan.q1202img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1202.setBorder(null);
		frame.add(Qipan.q1202img);
		Qipan.q1202.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[12+4][2+4]==0&&systemtimes==0){
		systemnum[12+4][2+4]=3;
		Qipan.q1202img.setIcon(bla);
		Qipan.q1202img.setVisible(true);
		Qipan.q1202.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1202);
		Qipan.q1203.setBounds(250+x,30+y,30,30);
		Qipan.q1203img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1203.setBorder(null);
		frame.add(Qipan.q1203img);
		Qipan.q1203.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[12+4][3+4]==0&&systemtimes==0){
		systemnum[12+4][3+4]=3;
		Qipan.q1203img.setIcon(bla);
		Qipan.q1203img.setVisible(true);
		Qipan.q1203.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1203);
		Qipan.q1204.setBounds(250+x,30+y,30,30);
		Qipan.q1204img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1204.setBorder(null);
		frame.add(Qipan.q1204img);
		Qipan.q1204.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[12+4][4+4]==0&&systemtimes==0){
		systemnum[12+4][4+4]=3;
		Qipan.q1204img.setIcon(bla);
		Qipan.q1204img.setVisible(true);
		Qipan.q1204.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1204);
		Qipan.q1205.setBounds(250+x,30+y,30,30);
		Qipan.q1205img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1205.setBorder(null);
		frame.add(Qipan.q1205img);
		Qipan.q1205.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[12+4][5+4]==0&&systemtimes==0){
		systemnum[12+4][5+4]=3;
		Qipan.q1205img.setIcon(bla);
		Qipan.q1205img.setVisible(true);
		Qipan.q1205.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1205);
		Qipan.q1206.setBounds(250+x,30+y,30,30);
		Qipan.q1206img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1206.setBorder(null);
		frame.add(Qipan.q1206img);
		Qipan.q1206.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[12+4][6+4]==0&&systemtimes==0){
		systemnum[12+4][6+4]=3;
		Qipan.q1206img.setIcon(bla);
		Qipan.q1206img.setVisible(true);
		Qipan.q1206.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1206);
		Qipan.q1207.setBounds(250+x,30+y,30,30);
		Qipan.q1207img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1207.setBorder(null);
		frame.add(Qipan.q1207img);
		Qipan.q1207.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[12+4][7+4]==0&&systemtimes==0){
		systemnum[12+4][7+4]=3;
		Qipan.q1207img.setIcon(bla);
		Qipan.q1207img.setVisible(true);
		Qipan.q1207.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1207);
		Qipan.q1208.setBounds(250+x,30+y,30,30);
		Qipan.q1208img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1208.setBorder(null);
		frame.add(Qipan.q1208img);
		Qipan.q1208.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[12+4][8+4]==0&&systemtimes==0){
		systemnum[12+4][8+4]=3;
		Qipan.q1208img.setIcon(bla);
		Qipan.q1208img.setVisible(true);
		Qipan.q1208.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1208);
		Qipan.q1209.setBounds(250+x,30+y,30,30);
		Qipan.q1209img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1209.setBorder(null);
		frame.add(Qipan.q1209img);
		Qipan.q1209.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[12+4][9+4]==0&&systemtimes==0){
		systemnum[12+4][9+4]=3;
		Qipan.q1209img.setIcon(bla);
		Qipan.q1209img.setVisible(true);
		Qipan.q1209.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1209);
		Qipan.q1210.setBounds(250+x,30+y,30,30);
		Qipan.q1210img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1210.setBorder(null);
		frame.add(Qipan.q1210img);
		Qipan.q1210.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[12+4][10+4]==0&&systemtimes==0){
		systemnum[12+4][10+4]=3;
		Qipan.q1210img.setIcon(bla);
		Qipan.q1210img.setVisible(true);
		Qipan.q1210.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1210);
		Qipan.q1211.setBounds(250+x,30+y,30,30);
		Qipan.q1211img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1211.setBorder(null);
		frame.add(Qipan.q1211img);
		Qipan.q1211.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[12+4][11+4]==0&&systemtimes==0){
		systemnum[12+4][11+4]=3;
		Qipan.q1211img.setIcon(bla);
		Qipan.q1211img.setVisible(true);
		Qipan.q1211.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1211);
		Qipan.q1212.setBounds(250+x,30+y,30,30);
		Qipan.q1212img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1212.setBorder(null);
		frame.add(Qipan.q1212img);
		Qipan.q1212.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[12+4][12+4]==0&&systemtimes==0){
		systemnum[12+4][12+4]=3;
		Qipan.q1212img.setIcon(bla);
		Qipan.q1212img.setVisible(true);
		Qipan.q1212.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1212);
		Qipan.q1213.setBounds(250+x,30+y,30,30);
		Qipan.q1213img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1213.setBorder(null);
		frame.add(Qipan.q1213img);
		Qipan.q1213.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[12+4][13+4]==0&&systemtimes==0){
		systemnum[12+4][13+4]=3;
		Qipan.q1213img.setIcon(bla);
		Qipan.q1213img.setVisible(true);
		Qipan.q1213.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1213);
		Qipan.q1214.setBounds(250+x,30+y,30,30);
		Qipan.q1214img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1214.setBorder(null);
		frame.add(Qipan.q1214img);
		Qipan.q1214.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[12+4][14+4]==0&&systemtimes==0){
		systemnum[12+4][14+4]=3;
		Qipan.q1214img.setIcon(bla);
		Qipan.q1214img.setVisible(true);
		Qipan.q1214.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1214);
		Qipan.q1215.setBounds(250+x,30+y,30,30);
		Qipan.q1215img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1215.setBorder(null);
		frame.add(Qipan.q1215img);
		Qipan.q1215.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[12+4][15+4]==0&&systemtimes==0){
		systemnum[12+4][15+4]=3;
		Qipan.q1215img.setIcon(bla);
		Qipan.q1215img.setVisible(true);
		Qipan.q1215.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1215);
		x=0;
		y+=30;
		Qipan.q1301.setBounds(250+x,30+y,30,30);
		Qipan.q1301img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1301.setBorder(null);
		frame.add(Qipan.q1301img);
		Qipan.q1301.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[13+4][1+4]==0&&systemtimes==0){
		systemnum[13+4][1+4]=3;
		Qipan.q1301img.setIcon(bla);
		Qipan.q1301img.setVisible(true);
		Qipan.q1301.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1301);
		Qipan.q1302.setBounds(250+x,30+y,30,30);
		Qipan.q1302img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1302.setBorder(null);
		frame.add(Qipan.q1302img);
		Qipan.q1302.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[13+4][2+4]==0&&systemtimes==0){
		systemnum[13+4][2+4]=3;
		Qipan.q1302img.setIcon(bla);
		Qipan.q1302img.setVisible(true);
		Qipan.q1302.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1302);
		Qipan.q1303.setBounds(250+x,30+y,30,30);
		Qipan.q1303img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1303.setBorder(null);
		frame.add(Qipan.q1303img);
		Qipan.q1303.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[13+4][3+4]==0&&systemtimes==0){
		systemnum[13+4][3+4]=3;
		Qipan.q1303img.setIcon(bla);
		Qipan.q1303img.setVisible(true);
		Qipan.q1303.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1303);
		Qipan.q1304.setBounds(250+x,30+y,30,30);
		Qipan.q1304img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1304.setBorder(null);
		frame.add(Qipan.q1304img);
		Qipan.q1304.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[13+4][4+4]==0&&systemtimes==0){
		systemnum[13+4][4+4]=3;
		Qipan.q1304img.setIcon(bla);
		Qipan.q1304img.setVisible(true);
		Qipan.q1304.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1304);
		Qipan.q1305.setBounds(250+x,30+y,30,30);
		Qipan.q1305img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1305.setBorder(null);
		frame.add(Qipan.q1305img);
		Qipan.q1305.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[13+4][5+4]==0&&systemtimes==0){
		systemnum[13+4][5+4]=3;
		Qipan.q1305img.setIcon(bla);
		Qipan.q1305img.setVisible(true);
		Qipan.q1305.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1305);
		Qipan.q1306.setBounds(250+x,30+y,30,30);
		Qipan.q1306img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1306.setBorder(null);
		frame.add(Qipan.q1306img);
		Qipan.q1306.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[13+4][6+4]==0&&systemtimes==0){
		systemnum[13+4][6+4]=3;
		Qipan.q1306img.setIcon(bla);
		Qipan.q1306img.setVisible(true);
		Qipan.q1306.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1306);
		Qipan.q1307.setBounds(250+x,30+y,30,30);
		Qipan.q1307img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1307.setBorder(null);
		frame.add(Qipan.q1307img);
		Qipan.q1307.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[13+4][7+4]==0&&systemtimes==0){
		systemnum[13+4][7+4]=3;
		Qipan.q1307img.setIcon(bla);
		Qipan.q1307img.setVisible(true);
		Qipan.q1307.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1307);
		Qipan.q1308.setBounds(250+x,30+y,30,30);
		Qipan.q1308img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1308.setBorder(null);
		frame.add(Qipan.q1308img);
		Qipan.q1308.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[13+4][8+4]==0&&systemtimes==0){
		systemnum[13+4][8+4]=3;
		Qipan.q1308img.setIcon(bla);
		Qipan.q1308img.setVisible(true);
		Qipan.q1308.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1308);
		Qipan.q1309.setBounds(250+x,30+y,30,30);
		Qipan.q1309img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1309.setBorder(null);
		frame.add(Qipan.q1309img);
		Qipan.q1309.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[13+4][9+4]==0&&systemtimes==0){
		systemnum[13+4][9+4]=3;
		Qipan.q1309img.setIcon(bla);
		Qipan.q1309img.setVisible(true);
		Qipan.q1309.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1309);
		Qipan.q1310.setBounds(250+x,30+y,30,30);
		Qipan.q1310img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1310.setBorder(null);
		frame.add(Qipan.q1310img);
		Qipan.q1310.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[13+4][10+4]==0&&systemtimes==0){
		systemnum[13+4][10+4]=3;
		Qipan.q1310img.setIcon(bla);
		Qipan.q1310img.setVisible(true);
		Qipan.q1310.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1310);
		Qipan.q1311.setBounds(250+x,30+y,30,30);
		Qipan.q1311img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1311.setBorder(null);
		frame.add(Qipan.q1311img);
		Qipan.q1311.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[13+4][11+4]==0&&systemtimes==0){
		systemnum[13+4][11+4]=3;
		Qipan.q1311img.setIcon(bla);
		Qipan.q1311img.setVisible(true);
		Qipan.q1311.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1311);
		Qipan.q1312.setBounds(250+x,30+y,30,30);
		Qipan.q1312img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1312.setBorder(null);
		frame.add(Qipan.q1312img);
		Qipan.q1312.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[13+4][12+4]==0&&systemtimes==0){
		systemnum[13+4][12+4]=3;
		Qipan.q1312img.setIcon(bla);
		Qipan.q1312img.setVisible(true);
		Qipan.q1312.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1312);
		Qipan.q1313.setBounds(250+x,30+y,30,30);
		Qipan.q1313img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1313.setBorder(null);
		frame.add(Qipan.q1313img);
		Qipan.q1313.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[13+4][13+4]==0&&systemtimes==0){
		systemnum[13+4][13+4]=3;
		Qipan.q1313img.setIcon(bla);
		Qipan.q1313img.setVisible(true);
		Qipan.q1313.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1313);
		Qipan.q1314.setBounds(250+x,30+y,30,30);
		Qipan.q1314img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1314.setBorder(null);
		frame.add(Qipan.q1314img);
		Qipan.q1314.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[13+4][14+4]==0&&systemtimes==0){
		systemnum[13+4][14+4]=3;
		Qipan.q1314img.setIcon(bla);
		Qipan.q1314img.setVisible(true);
		Qipan.q1314.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1314);
		Qipan.q1315.setBounds(250+x,30+y,30,30);
		Qipan.q1315img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1315.setBorder(null);
		frame.add(Qipan.q1315img);
		Qipan.q1315.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[13+4][15+4]==0&&systemtimes==0){
		systemnum[13+4][15+4]=3;
		Qipan.q1315img.setIcon(bla);
		Qipan.q1315img.setVisible(true);
		Qipan.q1315.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1315);
		x=0;
		y+=30;
		Qipan.q1401.setBounds(250+x,30+y,30,30);
		Qipan.q1401img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1401.setBorder(null);
		frame.add(Qipan.q1401img);
		Qipan.q1401.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[14+4][1+4]==0&&systemtimes==0){
		systemnum[14+4][1+4]=3;
		Qipan.q1401img.setIcon(bla);
		Qipan.q1401img.setVisible(true);
		Qipan.q1401.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1401);
		Qipan.q1402.setBounds(250+x,30+y,30,30);
		Qipan.q1402img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1402.setBorder(null);
		frame.add(Qipan.q1402img);
		Qipan.q1402.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[14+4][2+4]==0&&systemtimes==0){
		systemnum[14+4][2+4]=3;
		Qipan.q1402img.setIcon(bla);
		Qipan.q1402img.setVisible(true);
		Qipan.q1402.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1402);
		Qipan.q1403.setBounds(250+x,30+y,30,30);
		Qipan.q1403img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1403.setBorder(null);
		frame.add(Qipan.q1403img);
		Qipan.q1403.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[14+4][3+4]==0&&systemtimes==0){
		systemnum[14+4][3+4]=3;
		Qipan.q1403img.setIcon(bla);
		Qipan.q1403img.setVisible(true);
		Qipan.q1403.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1403);
		Qipan.q1404.setBounds(250+x,30+y,30,30);
		Qipan.q1404img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1404.setBorder(null);
		frame.add(Qipan.q1404img);
		Qipan.q1404.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[14+4][4+4]==0&&systemtimes==0){
		systemnum[14+4][4+4]=3;
		Qipan.q1404img.setIcon(bla);
		Qipan.q1404img.setVisible(true);
		Qipan.q1404.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1404);
		Qipan.q1405.setBounds(250+x,30+y,30,30);
		Qipan.q1405img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1405.setBorder(null);
		frame.add(Qipan.q1405img);
		Qipan.q1405.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[14+4][5+4]==0&&systemtimes==0){
		systemnum[14+4][5+4]=3;
		Qipan.q1405img.setIcon(bla);
		Qipan.q1405img.setVisible(true);
		Qipan.q1405.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1405);
		Qipan.q1406.setBounds(250+x,30+y,30,30);
		Qipan.q1406img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1406.setBorder(null);
		frame.add(Qipan.q1406img);
		Qipan.q1406.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[14+4][6+4]==0&&systemtimes==0){
		systemnum[14+4][6+4]=3;
		Qipan.q1406img.setIcon(bla);
		Qipan.q1406img.setVisible(true);
		Qipan.q1406.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1406);
		Qipan.q1407.setBounds(250+x,30+y,30,30);
		Qipan.q1407img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1407.setBorder(null);
		frame.add(Qipan.q1407img);
		Qipan.q1407.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[14+4][7+4]==0&&systemtimes==0){
		systemnum[14+4][7+4]=3;
		Qipan.q1407img.setIcon(bla);
		Qipan.q1407img.setVisible(true);
		Qipan.q1407.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1407);
		Qipan.q1408.setBounds(250+x,30+y,30,30);
		Qipan.q1408img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1408.setBorder(null);
		frame.add(Qipan.q1408img);
		Qipan.q1408.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[14+4][8+4]==0&&systemtimes==0){
		systemnum[14+4][8+4]=3;
		Qipan.q1408img.setIcon(bla);
		Qipan.q1408img.setVisible(true);
		Qipan.q1408.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1408);
		Qipan.q1409.setBounds(250+x,30+y,30,30);
		Qipan.q1409img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1409.setBorder(null);
		frame.add(Qipan.q1409img);
		Qipan.q1409.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[14+4][9+4]==0&&systemtimes==0){
		systemnum[14+4][9+4]=3;
		Qipan.q1409img.setIcon(bla);
		Qipan.q1409img.setVisible(true);
		Qipan.q1409.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1409);
		Qipan.q1410.setBounds(250+x,30+y,30,30);
		Qipan.q1410img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1410.setBorder(null);
		frame.add(Qipan.q1410img);
		Qipan.q1410.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[14+4][10+4]==0&&systemtimes==0){
		systemnum[14+4][10+4]=3;
		Qipan.q1410img.setIcon(bla);
		Qipan.q1410img.setVisible(true);
		Qipan.q1410.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1410);
		Qipan.q1411.setBounds(250+x,30+y,30,30);
		Qipan.q1411img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1411.setBorder(null);
		frame.add(Qipan.q1411img);
		Qipan.q1411.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[14+4][11+4]==0&&systemtimes==0){
		systemnum[14+4][11+4]=3;
		Qipan.q1411img.setIcon(bla);
		Qipan.q1411img.setVisible(true);
		Qipan.q1411.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1411);
		Qipan.q1412.setBounds(250+x,30+y,30,30);
		Qipan.q1412img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1412.setBorder(null);
		frame.add(Qipan.q1412img);
		Qipan.q1412.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[14+4][12+4]==0&&systemtimes==0){
		systemnum[14+4][12+4]=3;
		Qipan.q1412img.setIcon(bla);
		Qipan.q1412img.setVisible(true);
		Qipan.q1412.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1412);
		Qipan.q1413.setBounds(250+x,30+y,30,30);
		Qipan.q1413img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1413.setBorder(null);
		frame.add(Qipan.q1413img);
		Qipan.q1413.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[14+4][13+4]==0&&systemtimes==0){
		systemnum[14+4][13+4]=3;
		Qipan.q1413img.setIcon(bla);
		Qipan.q1413img.setVisible(true);
		Qipan.q1413.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1413);
		Qipan.q1414.setBounds(250+x,30+y,30,30);
		Qipan.q1414img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1414.setBorder(null);
		frame.add(Qipan.q1414img);
		Qipan.q1414.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[14+4][14+4]==0&&systemtimes==0){
		systemnum[14+4][14+4]=3;
		Qipan.q1414img.setIcon(bla);
		Qipan.q1414img.setVisible(true);
		Qipan.q1414.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1414);
		Qipan.q1415.setBounds(250+x,30+y,30,30);
		Qipan.q1415img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1415.setBorder(null);
		frame.add(Qipan.q1415img);
		Qipan.q1415.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[14+4][15+4]==0&&systemtimes==0){
		systemnum[14+4][15+4]=3;
		Qipan.q1415img.setIcon(bla);
		Qipan.q1415img.setVisible(true);
		Qipan.q1415.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1415);
		x=0;
		y+=30;
		Qipan.q1501.setBounds(250+x,30+y,30,30);
		Qipan.q1501img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1501.setBorder(null);
		frame.add(Qipan.q1501img);
		Qipan.q1501.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[15+4][1+4]==0&&systemtimes==0){
		systemnum[15+4][1+4]=3;
		Qipan.q1501img.setIcon(bla);
		Qipan.q1501img.setVisible(true);
		Qipan.q1501.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1501);
		Qipan.q1502.setBounds(250+x,30+y,30,30);
		Qipan.q1502img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1502.setBorder(null);
		frame.add(Qipan.q1502img);
		Qipan.q1502.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[15+4][2+4]==0&&systemtimes==0){
		systemnum[15+4][2+4]=3;
		Qipan.q1502img.setIcon(bla);
		Qipan.q1502img.setVisible(true);
		Qipan.q1502.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1502);
		Qipan.q1503.setBounds(250+x,30+y,30,30);
		Qipan.q1503img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1503.setBorder(null);
		frame.add(Qipan.q1503img);
		Qipan.q1503.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[15+4][3+4]==0&&systemtimes==0){
		systemnum[15+4][3+4]=3;
		Qipan.q1503img.setIcon(bla);
		Qipan.q1503img.setVisible(true);
		Qipan.q1503.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1503);
		Qipan.q1504.setBounds(250+x,30+y,30,30);
		Qipan.q1504img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1504.setBorder(null);
		frame.add(Qipan.q1504img);
		Qipan.q1504.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[15+4][4+4]==0&&systemtimes==0){
		systemnum[15+4][4+4]=3;
		Qipan.q1504img.setIcon(bla);
		Qipan.q1504img.setVisible(true);
		Qipan.q1504.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1504);
		Qipan.q1505.setBounds(250+x,30+y,30,30);
		Qipan.q1505img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1505.setBorder(null);
		frame.add(Qipan.q1505img);
		Qipan.q1505.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[15+4][5+4]==0&&systemtimes==0){
		systemnum[15+4][5+4]=3;
		Qipan.q1505img.setIcon(bla);
		Qipan.q1505img.setVisible(true);
		Qipan.q1505.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1505);
		Qipan.q1506.setBounds(250+x,30+y,30,30);
		Qipan.q1506img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1506.setBorder(null);
		frame.add(Qipan.q1506img);
		Qipan.q1506.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[15+4][6+4]==0&&systemtimes==0){
		systemnum[15+4][6+4]=3;
		Qipan.q1506img.setIcon(bla);
		Qipan.q1506img.setVisible(true);
		Qipan.q1506.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1506);
		Qipan.q1507.setBounds(250+x,30+y,30,30);
		Qipan.q1507img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1507.setBorder(null);
		frame.add(Qipan.q1507img);
		Qipan.q1507.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[15+4][7+4]==0&&systemtimes==0){
		systemnum[15+4][7+4]=3;
		Qipan.q1507img.setIcon(bla);
		Qipan.q1507img.setVisible(true);
		Qipan.q1507.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1507);
		Qipan.q1508.setBounds(250+x,30+y,30,30);
		Qipan.q1508img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1508.setBorder(null);
		frame.add(Qipan.q1508img);
		Qipan.q1508.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[15+4][8+4]==0&&systemtimes==0){
		systemnum[15+4][8+4]=3;
		Qipan.q1508img.setIcon(bla);
		Qipan.q1508img.setVisible(true);
		Qipan.q1508.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1508);
		Qipan.q1509.setBounds(250+x,30+y,30,30);
		Qipan.q1509img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1509.setBorder(null);
		frame.add(Qipan.q1509img);
		Qipan.q1509.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[15+4][9+4]==0&&systemtimes==0){
		systemnum[15+4][9+4]=3;
		Qipan.q1509img.setIcon(bla);
		Qipan.q1509img.setVisible(true);
		Qipan.q1509.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1509);
		Qipan.q1510.setBounds(250+x,30+y,30,30);
		Qipan.q1510img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1510.setBorder(null);
		frame.add(Qipan.q1510img);
		Qipan.q1510.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[15+4][10+4]==0&&systemtimes==0){
		systemnum[15+4][10+4]=3;
		Qipan.q1510img.setIcon(bla);
		Qipan.q1510img.setVisible(true);
		Qipan.q1510.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1510);
		Qipan.q1511.setBounds(250+x,30+y,30,30);
		Qipan.q1511img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1511.setBorder(null);
		frame.add(Qipan.q1511img);
		Qipan.q1511.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[15+4][11+4]==0&&systemtimes==0){
		systemnum[15+4][11+4]=3;
		Qipan.q1511img.setIcon(bla);
		Qipan.q1511img.setVisible(true);
		Qipan.q1511.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1511);
		Qipan.q1512.setBounds(250+x,30+y,30,30);
		Qipan.q1512img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1512.setBorder(null);
		frame.add(Qipan.q1512img);
		Qipan.q1512.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[15+4][12+4]==0&&systemtimes==0){
		systemnum[15+4][12+4]=3;
		Qipan.q1512img.setIcon(bla);
		Qipan.q1512img.setVisible(true);
		Qipan.q1512.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1512);
		Qipan.q1513.setBounds(250+x,30+y,30,30);
		Qipan.q1513img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1513.setBorder(null);
		frame.add(Qipan.q1513img);
		Qipan.q1513.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[15+4][13+4]==0&&systemtimes==0){
		systemnum[15+4][13+4]=3;
		Qipan.q1513img.setIcon(bla);
		Qipan.q1513img.setVisible(true);
		Qipan.q1513.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1513);
		Qipan.q1514.setBounds(250+x,30+y,30,30);
		Qipan.q1514img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1514.setBorder(null);
		frame.add(Qipan.q1514img);
		Qipan.q1514.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[15+4][14+4]==0&&systemtimes==0){
		systemnum[15+4][14+4]=3;
		Qipan.q1514img.setIcon(bla);
		Qipan.q1514img.setVisible(true);
		Qipan.q1514.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1514);
		Qipan.q1515.setBounds(250+x,30+y,30,30);
		Qipan.q1515img.setBounds(250+x,30+y,30,30);
		x+=30;
		Qipan.q1515.setBorder(null);
		frame.add(Qipan.q1515img);
		Qipan.q1515.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		if(systemnum[15+4][15+4]==0&&systemtimes==0){
		systemnum[15+4][15+4]=3;
		Qipan.q1515img.setIcon(bla);
		Qipan.q1515img.setVisible(true);
		Qipan.q1515.setVisible(false);
		systemtimes=1;
		AI.think(frame);
		}
		}
		});
		frame.add(Qipan.q1515);

	}

}
